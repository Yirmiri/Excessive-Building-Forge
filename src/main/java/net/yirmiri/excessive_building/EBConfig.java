package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EBConfig {
    public static ForgeConfigSpec COMMON;
    public static final String CONTENT = "content";
    public static ForgeConfigSpec.BooleanValue ENABLE_DUG_ANCIENT_SAPLINGS;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_VILLAGER_TRADES;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_WANDERING_TRADES;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.comment("Content Toggles").push(CONTENT);
        ENABLE_DUG_ANCIENT_SAPLINGS = COMMON_BUILDER.comment("Should sniffers be able to dig up ancient saplings? (disabling this removes access to all ancient content)").define("enableDugAncientSaplings", true);
        ENABLE_EB_VILLAGER_TRADES = COMMON_BUILDER.comment("Should villagers have the ability to sell and buy new stuff from Excessive Building?").define("enableEBVillagerTrades", true);
        ENABLE_EB_WANDERING_TRADES = COMMON_BUILDER.comment("Should wandering traders have the ability to sell and buy new stuff from Excessive Building?").define("enableEBWanderingTrades", true);

        COMMON = COMMON_BUILDER.build();
    }
}