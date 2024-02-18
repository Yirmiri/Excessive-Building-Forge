package net.yirmiri.excessive_building.compat;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.yirmiri.excessive_building.compat.hearthandhome.HearthAndHomeCompat;
import net.yirmiri.excessive_building.compat.sullysmod.SullysModCompat;

public class EBCompatRegistries {
    public static final boolean sullysMod;
    public static final boolean hearthAndHome;

    static {
        ModList mods = ModList.get();
        sullysMod = mods.isLoaded("sullysmod");
        hearthAndHome = mods.isLoaded("hearth_and_home");
    }

    public static void register(IEventBus eventBus) {
        if (sullysMod) SullysModCompat.register(eventBus);
        if (hearthAndHome) HearthAndHomeCompat.register(eventBus);
    }
}
