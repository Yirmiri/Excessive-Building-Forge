package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.worldgen.feature.EBConfiguredFeatures;
import net.yirmiri.excessive_building.worldgen.feature.EBPlacedFeatures;
import net.yirmiri.excessive_building.compat.terrablender.EBBiomes;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EBWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
         .add(Registries.CONFIGURED_FEATURE, EBConfiguredFeatures::bootstrap).add(Registries.PLACED_FEATURE, EBPlacedFeatures::bootstrap).add(Registries.BIOME, EBBiomes::boostrap);

    public EBWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(ExcessiveBuilding.MOD_ID));
    }
}
