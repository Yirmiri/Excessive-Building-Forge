package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EBConfig {
    public static ForgeConfigSpec COMMON;
    public static final String CONTENT = "content";
    public static final String BALANCING = "balancing";
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_CREATIVE_TAB;
    public static ForgeConfigSpec.BooleanValue ENABLE_CUSTOM_TAB;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_LOOT_MODIFIERS;
    public static ForgeConfigSpec.BooleanValue ENABLE_BIOMES;
    public static ForgeConfigSpec.BooleanValue ALLOW_SWIFT_ASPHALT;
    public static ForgeConfigSpec.BooleanValue ALLOW_REDSTONE_BUBBLE_COLUMNS;
    public static ForgeConfigSpec.BooleanValue DECORATIVE_VARIANT_POWER;
    public static ForgeConfigSpec.IntValue DECORATIVE_ENCHANT_BONUS;
    public static ForgeConfigSpec.BooleanValue ENABLE_REACHING_POTIONS;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_VILLAGER_TRADES;
    public static ForgeConfigSpec.BooleanValue ENABLE_EB_WANDERING_TRADES;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.comment("Content Toggles").push(CONTENT);
        ENABLE_EB_CREATIVE_TAB = COMMON_BUILDER
                .comment("Should Excessive Building's items be placed in vanilla's tabs? (default: true)")
                .define("enableEBTabs", true);
        ENABLE_CUSTOM_TAB = COMMON_BUILDER
                .comment("Should there be a custom creative tab for Excessive Building? (default: true)")
                .define("enableCustomTab", true);
        ENABLE_EB_LOOT_MODIFIERS = COMMON_BUILDER
                .comment("Should sniffers be able to dig up new unique items? (default: true)")
                .define("enableSnifferDrops", true);
        ENABLE_BIOMES = COMMON_BUILDER
                .comment("Should Excessive Building's new biomes generate if Terrablender is installed (default: true)")
                .define("enableEBBiomes", true);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Balance Toggles").push(BALANCING);
        ALLOW_SWIFT_ASPHALT = COMMON_BUILDER
                .comment("Should players be able to apply a speed paste to asphalt? (default: true)?")
                .define("allow_swift_asphalt", true);
        ALLOW_REDSTONE_BUBBLE_COLUMNS = COMMON_BUILDER
                .comment("Should soul magma act as both upwards and downwards bubble columns? (default: true)?")
                .define("allow_redstone_bubble_columns", true);
        DECORATIVE_VARIANT_POWER = COMMON_BUILDER
                .comment("Should all decorative shelves grant an enchantment bonus or only potion shelves (default: false)?")
                .define("decorativeVariantPower", false);
        DECORATIVE_ENCHANT_BONUS = COMMON_BUILDER
                .comment("Level of enchantment power decorative shelves should grant? (default: 1)")
                .defineInRange("decorativeEnchantBonus", 1, 0, 30);
        ENABLE_REACHING_POTIONS = COMMON_BUILDER
                .comment("Should reaching potions be craftable? (default: true)")
                .define("enableReachingPotions", true);
        ENABLE_EB_VILLAGER_TRADES = COMMON_BUILDER
                .comment("Should villagers have new unique offers? (default: true)")
                .define("enableEBVillagerTrades", true);
        ENABLE_EB_WANDERING_TRADES = COMMON_BUILDER
                .comment("Should wandering traders have new unique offers? (default: true)")
                .define("enableEBWanderingTrades", true);
        COMMON_BUILDER.pop();

        COMMON = COMMON_BUILDER.build();
    }
}