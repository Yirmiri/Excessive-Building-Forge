package net.yirmiri.excessive_building.compat;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;

public class EBCompatRegistries {
    public static final boolean sullysMod;
    public static final boolean farmersDelight;

    static {
        ModList mods = ModList.get();
        sullysMod = mods.isLoaded("sullysmod");
        farmersDelight = mods.isLoaded("farmersdelight");
    }

    public static void register(IEventBus eventBus) {
        if (sullysMod) SullysModCompat.register(eventBus);
        if (farmersDelight) FarmersDelightCompat.register(eventBus);
    }
}