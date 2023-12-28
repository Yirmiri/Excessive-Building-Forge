package net.yirmiri.excessive_building.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.List;

public class EBPlacedFeatures {
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_PLACED = createKey("quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> SOUL_MAGMA_PLACED = createKey("soul_magma_placed");
    public static final ResourceKey<PlacedFeature> FIERY_GEODE_PLACED = createKey("fiery_geode_placed");
    public static final ResourceKey<PlacedFeature> KYANITE_GEODE_PLACED = createKey("kyanite_geode_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, QUARTZ_ORE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.QUARTZ_ORE),
                EBOrePlacement.commonOrePlacement(8, //veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));

        register(context, SOUL_MAGMA_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.SOUL_MAGMA),
                EBOrePlacement.commonOrePlacement(9, //veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(48))));

        register(context, FIERY_GEODE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.FIERY_GEODE),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(48)),
                        BiomeFilter.biome()));

        register(context, KYANITE_GEODE_PLACED, configuredFeatures.getOrThrow(EBConfiguredFeatures.KYANITE_GEODE),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(80), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome()));
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