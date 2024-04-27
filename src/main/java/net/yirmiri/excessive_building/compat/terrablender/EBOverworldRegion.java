package net.yirmiri.excessive_building.compat.terrablender;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraftforge.eventbus.api.IEventBus;
import terrablender.api.Region;
import terrablender.api.RegionType;

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

    public static void register(IEventBus eventBus) {
    }
}
