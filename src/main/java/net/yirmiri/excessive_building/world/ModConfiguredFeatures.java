package net.yirmiri.excessive_building.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.yirmiri.excessive_building.block.EBBlocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_KEY = registerKey("quartz_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIERY_CRYSTAL_BLOCK_KEY = registerKey("fiery_crystal_block_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIMSTONE_KEY = registerKey("brimstone_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_MAGMA_KEY = registerKey("soul_magma_key");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest basaltReplaceables = new BlockMatchTest(Blocks.BASALT);
        RuleTest soulReplaceables = new TagMatchTest(BlockTags.SOUL_FIRE_BASE_BLOCKS);

        List<OreConfiguration.TargetBlockState> overworldQuartzOres = List.of(OreConfiguration.target(stoneReplaceables, EBBlocks.QUARTZ_ORE.get().defaultBlockState()));

        register(context, QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                EBBlocks.QUARTZ_ORE.get().defaultBlockState(), 8));

        register(context, FIERY_CRYSTAL_BLOCK_KEY, Feature.ORE, new OreConfiguration(basaltReplaceables,
                EBBlocks.FIERY_CRYSTAL_BLOCK.get().defaultBlockState(), 10));

        register(context, BRIMSTONE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                EBBlocks.BRIMSTONE.get().defaultBlockState(), 64));

        register(context, SOUL_MAGMA_KEY, Feature.ORE, new OreConfiguration(soulReplaceables,
                EBBlocks.SOUL_MAGMA_BLOCK.get().defaultBlockState(), 16));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ExcessiveBuilding.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
