package net.yirmiri.excessive_building.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.init.EBBlocks;

import java.util.List;
import java.util.OptionalInt;

public class EBConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_ORE = registerKey("quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_MAGMA = registerKey("soul_magma");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIERY_GEODE = registerKey("fiery_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KYANITE_GEODE = registerKey("kyanite_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_TREE = registerKey("ancient_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALGAE = registerKey("algae");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE = registerKey("rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_ROSE = registerKey("cyan_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_ROSE = registerKey("white_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_TREE = registerKey("willow_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MAPLE_TREE = registerKey("red_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_MAPLE_TREE = registerKey("orange_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_MAPLE_TREE = registerKey("yellow_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARIGOLD = registerKey("marigold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MAPLE_PILE = registerKey("red_maple_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_MAPLE_PILE = registerKey("orange_maple_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_MAPLE_PILE = registerKey("yellow_maple_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COMMON_PUMPKIN_PATCH = registerKey("common_pumpkin_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIMSTONE = registerKey("brimstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_BIRCH_TREE = registerKey("golden_birch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_BIRCH_TREE_BEES_01 = registerKey("golden_birch_tree_bees_01");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest soulReplaceables = new TagMatchTest(BlockTags.SOUL_FIRE_BASE_BLOCKS);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        BeehiveDecorator beehivedecorator = new BeehiveDecorator(0.002F);
        BeehiveDecorator beehivedecorator1 = new BeehiveDecorator(0.01F);
        BeehiveDecorator beehivedecorator2 = new BeehiveDecorator(0.02F);
        BeehiveDecorator beehivedecorator3 = new BeehiveDecorator(0.05F);
        BeehiveDecorator beehivedecorator4 = new BeehiveDecorator(0.1F);
        BeehiveDecorator beehivedecorator5 = new BeehiveDecorator(1.0F);

        List<OreConfiguration.TargetBlockState> overworldQuartzOres = List.of
                (OreConfiguration.target(stoneReplaceables, EBBlocks.QUARTZ_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, EBBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()));

        register(context, QUARTZ_ORE, Feature.ORE, new OreConfiguration(overworldQuartzOres, 8)); //vein size

        register(context, SOUL_MAGMA, Feature.ORE, new OreConfiguration(soulReplaceables,
                EBBlocks.SOUL_MAGMA_BLOCK.get().defaultBlockState(), 16)); //vein size

        register(context, FIERY_GEODE, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(EBBlocks.FIERY_BLOCK.get()), BlockStateProvider.simple(EBBlocks.BUDDING_FIERY_BLOCK.get()),
                BlockStateProvider.simple(EBBlocks.BRIMSTONE.get()), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                        List.of(EBBlocks.SMALL_FIERY_BUD.get().defaultBlockState(), EBBlocks.MEDIUM_FIERY_BUD.get().defaultBlockState(),
                                EBBlocks.LARGE_FIERY_BUD.get().defaultBlockState(), EBBlocks.FIERY_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6),
                UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

        register(context, KYANITE_GEODE, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(EBBlocks.KYANITE_BLOCK.get()), BlockStateProvider.simple(EBBlocks.BUDDING_KYANITE_BLOCK.get()),
                BlockStateProvider.simple(EBBlocks.BRIMSTONE.get()), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                        List.of(EBBlocks.SMALL_KYANITE_BUD.get().defaultBlockState(), EBBlocks.MEDIUM_KYANITE_BUD.get().defaultBlockState(),
                                EBBlocks.LARGE_KYANITE_BUD.get().defaultBlockState(), EBBlocks.KYANITE_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6),
                UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));


        register(context, ANCIENT_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(EBBlocks.ANCIENT_LOG.get()),
                new CherryTrunkPlacer(7, 1, 0,
                new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1)
                .add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()),
                UniformInt.of(2, 4), UniformInt.of(-4, -3), UniformInt.of(-1, 0)),
                BlockStateProvider.simple(EBBlocks.ANCIENT_LEAVES.get()), new CherryFoliagePlacer(ConstantInt.of(4),
                ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, ALGAE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(24, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.ALGAE_BLOCK.get())))));

        register(context, ROSE, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.ROSE.get())))));

        register(context, CYAN_ROSE, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.CYAN_ROSE.get())))));

        register(context, WHITE_ROSE, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.WHITE_ROSE.get())))));

        register(context, WILLOW_TREE, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(EBBlocks.WILLOW_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))).decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).build());

        register(context, RED_MAPLE_TREE, Feature.TREE, createFancyRed().build());
        register(context, ORANGE_MAPLE_TREE, Feature.TREE, createFancyOrange().build());
        register(context, YELLOW_MAPLE_TREE, Feature.TREE, createFancyYellow().build());

        register(context, MARIGOLD, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.MARIGOLD.get())))));

        register(context, RED_MAPLE_PILE, Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.RED_MAPLE_LEAVES_PILE.get())))));

        register(context, ORANGE_MAPLE_PILE, Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.ORANGE_MAPLE_LEAVES_PILE.get())))));

        register(context, YELLOW_MAPLE_PILE, Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(EBBlocks.YELLOW_MAPLE_LEAVES_PILE.get())))));

        register(context, COMMON_PUMPKIN_PATCH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.PUMPKIN)), List.of(Blocks.GRASS_BLOCK)));

        register(context, BRIMSTONE, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                EBBlocks.BRIMSTONE.get().defaultBlockState(), 64)); //vein size

        register(context, GOLDEN_BIRCH_TREE, Feature.TREE, createGoldenBirch().build());
        register(context, GOLDEN_BIRCH_TREE_BEES_01, Feature.TREE, createGoldenBirch().decorators(List.of(beehivedecorator4)).build());

    }

    private static TreeConfiguration.TreeConfigurationBuilder createFancyRed() {
        return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(EBBlocks.MAPLE_LOG.get()), new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(EBBlocks.RED_MAPLE_LEAVES.get()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createFancyOrange() {
        return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(EBBlocks.MAPLE_LOG.get()), new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(EBBlocks.ORANGE_MAPLE_LEAVES.get()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createFancyYellow() {
        return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(EBBlocks.MAPLE_LOG.get()), new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(EBBlocks.YELLOW_MAPLE_LEAVES.get()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createGoldenBirch() {
        return createStraightBlobTree(Blocks.BIRCH_LOG, EBBlocks.GOLDEN_BIRCH_LEAVES.get(), 5, 2, 10, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block block, Block block1, int i, int i1, int i2, int i3) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(block), new StraightTrunkPlacer(i, i1, i2), BlockStateProvider.simple(block1), new BlobFoliagePlacer(ConstantInt.of(i3), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ExcessiveBuilding.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                            ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
