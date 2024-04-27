package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EBConfig {
    public static ForgeConfigSpec COMMON;
    public static final String CONTENT = "content";
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_SNIFFER_DROPS;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_VILLAGER_TRADES;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_WANDERING_TRADES;
    public static ForgeConfigSpec.IntValue DECORATIVE_ENCHANT_BONUS;
    public static ForgeConfigSpec.BooleanValue ENABLE_REACHING_POTIONS;
    public static ForgeConfigSpec.BooleanValue ENABLE_BIOMES;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.comment("Content Toggles").push(CONTENT);
        ENABLE_EB_SNIFFER_DROPS = COMMON_BUILDER
                .comment("Should sniffers be able to dig up new unique items?")
                .define("enableSnifferDrops", true);
        ENABLE_EB_VILLAGER_TRADES = COMMON_BUILDER
                .comment("Should villagers have new unique offers?")
                .define("enableEBVillagerTrades", true);
        ENABLE_EB_WANDERING_TRADES = COMMON_BUILDER
                .comment("Should wandering traders have new unique offers?")
                .define("enableEBWanderingTrades", true);
        DECORATIVE_ENCHANT_BONUS = COMMON_BUILDER
                .comment("Enchantment power potion decorative shelves should grant? (Range: 0 ~ 30 || Default: 2")
                .defineInRange("decorativeEnchantBonus", 2, 0, 30);
        ENABLE_REACHING_POTIONS = COMMON_BUILDER
                .comment("Should reaching potions be craftable?")
                .define("enableReachingPotions", true);
        ENABLE_BIOMES = COMMON_BUILDER
                .comment("Should Excessive Building's new biomes generate? (Requires Terrablender)")
                .define("enableEBBiomes", true);

        COMMON = COMMON_BUILDER.build();
    }
}