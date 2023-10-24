package net.yirmiri.excessive_building.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.EBBlocks;

import java.util.List;

public class EBConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_KEY = registerKey("quartz_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_MAGMA_KEY = registerKey("soul_magma_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIERY_GEODE_KEY = registerKey("fiery_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KYANITE_GEODE_KEY = registerKey("kyanite_geode_key");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest soulReplaceables = new TagMatchTest(BlockTags.SOUL_FIRE_BASE_BLOCKS);

        List<OreConfiguration.TargetBlockState> overworldQuartzOres = List.of
                (OreConfiguration.target(stoneReplaceables, EBBlocks.QUARTZ_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, EBBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()));

        register(context, QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, 8)); //vein size

        register(context, SOUL_MAGMA_KEY, Feature.ORE, new OreConfiguration(soulReplaceables,
                EBBlocks.SOUL_MAGMA_BLOCK.get().defaultBlockState(), 16)); //vein size

        register(context, FIERY_GEODE_KEY, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(EBBlocks.FIERY_BLOCK.get()), BlockStateProvider.simple(EBBlocks.FIERY_BLOCK.get()),
                BlockStateProvider.simple(EBBlocks.BRIMSTONE.get()), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(EBBlocks.FIERY_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6),
                UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

        register(context, KYANITE_GEODE_KEY, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(EBBlocks.KYANITE_BLOCK.get()), BlockStateProvider.simple(EBBlocks.KYANITE_BLOCK.get()),
                        BlockStateProvider.simple(EBBlocks.BRIMSTONE.get()), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                        List.of(EBBlocks.KYANITE_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6),
                        UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ExcessiveBuilding.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
