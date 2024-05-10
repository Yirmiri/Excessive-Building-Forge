package net.yirmiri.excessive_building.compat;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.yirmiri.excessive_building.compat.terrablender.EBBiomes;
import net.yirmiri.excessive_building.compat.terrablender.EBOverworldRegion;

public class EBCompatRegistries {
    public static final boolean sullysMod;
    public static final boolean farmersDelight;
    public static final boolean terrablender;

    static {
        ModList mods = ModList.get();
        sullysMod = mods.isLoaded("sullysmod");
        farmersDelight = mods.isLoaded("farmersdelight");
        terrablender = mods.isLoaded("terrablender");
    }

    public static void register(IEventBus eventBus) {
        if (sullysMod) SMCompat.register();
        if (farmersDelight) FDCompat.register();

        //TERRABLENDER
        if (terrablender) EBBiomes.register();
        if (terrablender) EBOverworldRegion.register();
    }
}