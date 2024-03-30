package net.yirmiri.excessive_building.worldgen.feature;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBBlocks;

import java.util.List;

public class EBPlacedFeatures {
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_PLACED = createKey("quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> SOUL_MAGMA_PLACED = createKey("soul_magma_placed");
    public static final ResourceKey<PlacedFeature> FIERY_GEODE_PLACED = createKey("fiery_geode_placed");
    public static final ResourceKey<PlacedFeature> KYANITE_GEODE_PLACED = createKey("kyanite_geode_placed");
    public static final ResourceKey<PlacedFeature> ALGAE_PLACED = createKey("algae_placed");
    public static final ResourceKey<PlacedFeature> ROSE_PLACED = createKey("rose_placed");
    public static final ResourceKey<PlacedFeature> CYAN_ROSE_PLACED = createKey("cyan_rose_placed");
    public static final ResourceKey<PlacedFeature> WHITE_ROSE_PLACED = createKey("white_rose_placed");
    public static final ResourceKey<PlacedFeature> WILLOW_TREE_PLACED = createKey("willow_tree_placed");
    public static final ResourceKey<PlacedFeature> RED_MAPLE_TREE_PLACED = createKey("red_maple_tree_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_MAPLE_TREE_PLACED = createKey("orange_maple_tree_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_MAPLE_TREE_PLACED = createKey("yellow_maple_tree_placed");
    public static final ResourceKey<PlacedFeature> MARIGOLD_PLACED = createKey("marigold_placed");
    public static final ResourceKey<PlacedFeature> RED_MAPLE_PILE_PLACED = createKey("red_maple_pile_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_MAPLE_PILE_PLACED = createKey("orange_maple_pile_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_MAPLE_PILE_PLACED = createKey("yellow_maple_pile_placed");
    public static final ResourceKey<PlacedFeature> COMMON_PUMPKIN_PATCH_PLACED = createKey("common_pumpkin_patch_placed");
    public static final ResourceKey<PlacedFeature> BRIMSTONE_PLACED = createKey("brimstone_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_BIRCH_TREE_PLACED = createKey("golden_birch_tree_placed");
    public static final ResourceKey<PlacedFeature> MIRALEN_GEODE_PLACED = createKey("miralen_geode_placed");
    public static final ResourceKey<PlacedFeature> ALGAE_SMALL_PLACED = createKey("algae_small_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_PLACED = createKey("marble_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, QUARTZ_ORE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.QUARTZ_ORE),
                EBOrePlacement.commonOrePlacement(8, //veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));

        register(context, SOUL_MAGMA_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.SOUL_MAGMA),
                EBOrePlacement.commonOrePlacement(9, //veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(48))));

        register(context, FIERY_GEODE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.FIERY_GEODE),
                List.of(RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(48)), BiomeFilter.biome()));

        register(context, KYANITE_GEODE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.KYANITE_GEODE),
                List.of(RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(80), VerticalAnchor.absolute(128)), BiomeFilter.biome()));

        register(context, ROSE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.ROSE),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, CYAN_ROSE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.CYAN_ROSE),
                RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, WHITE_ROSE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.WHITE_ROSE),
                RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, WILLOW_TREE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.WILLOW_TREE), //placed, % chance for extra, extra
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.25f, 1), EBBlocks.WILLOW_SAPLING.get()));

        register(context, RED_MAPLE_TREE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.RED_MAPLE_TREE), //placed, % chance for extra, extra
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.25f, 1), EBBlocks.RED_MAPLE_SAPLING.get()));

        register(context, ORANGE_MAPLE_TREE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.ORANGE_MAPLE_TREE), //placed, % chance for extra, extra
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.25f, 1), EBBlocks.ORANGE_MAPLE_SAPLING.get()));

        register(context, YELLOW_MAPLE_TREE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.YELLOW_MAPLE_TREE), //placed, % chance for extra, extra
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.25f, 1), EBBlocks.YELLOW_MAPLE_SAPLING.get()));

        register(context, MARIGOLD_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.MARIGOLD),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, RED_MAPLE_PILE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.RED_MAPLE_PILE),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, ORANGE_MAPLE_PILE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.ORANGE_MAPLE_PILE),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, YELLOW_MAPLE_PILE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.YELLOW_MAPLE_PILE),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, COMMON_PUMPKIN_PATCH_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.COMMON_PUMPKIN_PATCH),
                RarityFilter.onAverageOnceEvery(800), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, BRIMSTONE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.BRIMSTONE),
                EBOrePlacement.commonOrePlacement(2, //veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(72))));

        register(context, GOLDEN_BIRCH_TREE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.GOLDEN_BIRCH_TREE), //placed, % chance for extra, extra
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(16, 0.2f, 1), EBBlocks.GOLDEN_BIRCH_SAPLING.get()));

        register(context, MIRALEN_GEODE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.MIRALEN_GEODE),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-40), VerticalAnchor.absolute(60)), BiomeFilter.biome()));

        register(context, ALGAE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.ALGAE),
                List.of(CountPlacement.of(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, ALGAE_SMALL_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.ALGAE),
                List.of(CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, MARBLE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.MARBLE),
                EBOrePlacement.commonOrePlacement(5, //veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(128))));

    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ExcessiveBuilding.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}