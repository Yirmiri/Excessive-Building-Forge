package net.yirmiri.excessive_building.compat.terrablender;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.compat.EBCompatRegistries;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.Regions;

import java.util.function.Consumer;

public class EBOverworldRegion extends Region {
    public EBOverworldRegion(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.TAIGA, EBBiomes.MAPLE_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.SNOWY_TAIGA, EBBiomes.SNOWY_MAPLE_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.BIRCH_FOREST, EBBiomes.GOLDEN_BIRCH_FOREST);
        });
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        if (EBCompatRegistries.terrablender) {
            if (EBConfig.ENABLE_BIOMES.get()) {
                Regions.register(new EBOverworldRegion(new ResourceLocation(ExcessiveBuilding.MOD_ID, "overworld"), 4));
            }
        }
    }

    public static void register() {
    }
}
