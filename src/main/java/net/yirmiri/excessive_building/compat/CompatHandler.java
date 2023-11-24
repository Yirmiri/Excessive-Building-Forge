package net.yirmiri.excessive_building.compat;

import net.minecraftforge.fml.ModList;
import net.yirmiri.excessive_building.compat.aether.AetherIntegration;

public class CompatHandler {

    public static final boolean aether;

    static {
        ModList mods = ModList.get();
        aether = mods.isLoaded("aether");
    }

    public static void register() {
        //Aether
        if (aether) AetherIntegration.register();
    }
}
