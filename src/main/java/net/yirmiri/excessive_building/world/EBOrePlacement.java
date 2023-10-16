package net.yirmiri.excessive_building.world;

import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class EBOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, PlacementModifier modifier)
    { return List.of(placementModifier, InSquarePlacement.spread(), modifier, BiomeFilter.biome()); }

    public static List<PlacementModifier> commonOrePlacement(int i, PlacementModifier orePlacement)
    { return orePlacement(CountPlacement.of(i), orePlacement); }
}
