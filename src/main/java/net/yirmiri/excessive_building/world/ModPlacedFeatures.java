package net.yirmiri.excessive_building.world;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_PLACED_KEY = createKey("quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> BRIMSTONE_PLACED_KEY = createKey("brimstone_placed");
    public static final ResourceKey<PlacedFeature> FIERY_CRYSTAL_BLOCK_PLACED_KEY = createKey("fiery_crystal_block_placed");
    public static final ResourceKey<PlacedFeature> SOUL_MAGMA_PLACED_KEY = createKey("soul_magma_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(48))));

        register(context, BRIMSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRIMSTONE_KEY),
                ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        register(context, FIERY_CRYSTAL_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FIERY_CRYSTAL_BLOCK_KEY),
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(12), VerticalAnchor.absolute(48))));

        register(context, SOUL_MAGMA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SOUL_MAGMA_KEY),
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(40))));
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ExcessiveBuilding.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}