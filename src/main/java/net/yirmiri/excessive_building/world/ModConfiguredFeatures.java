package net.yirmiri.excessive_building.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.yirmiri.excessive_building.block.ModBlocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIERY_CRYSTAL_BLOCK_KEY = registerKey("fiery_crystal_block");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIMSTONE_KEY = registerKey("brimstone");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest basaltReplaceables = new BlockMatchTest(Blocks.BASALT);

        register(context, FIERY_CRYSTAL_BLOCK_KEY, Feature.ORE, new OreConfiguration(basaltReplaceables,
                ModBlocks.FIERY_CRYSTAL_BLOCK.get().defaultBlockState(), 10));
        register(context, BRIMSTONE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.BRIMSTONE.get().defaultBlockState(), 64));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ExcessiveBuilding.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
