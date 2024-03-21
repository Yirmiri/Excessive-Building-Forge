package net.yirmiri.excessive_building.register;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.datagen.EBBannerTagProvider;
import net.yirmiri.excessive_building.other.EBProperties;

public class EBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExcessiveBuilding.MODID);

    //SHARDS
    public static final RegistryObject<Item> FIERY_SHARDS = ITEMS.register("fiery_shards", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYANITE_SHARDS = ITEMS.register("kyanite_shards", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIRALEN_SHARDS = ITEMS.register("miralen_shards", () -> new Item(new Item.Properties()));

    //SIGNS
    public static final RegistryObject<Item> ANCIENT_SIGN = ITEMS.register("ancient_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));
    public static final RegistryObject<Item> ANCIENT_HANGING_SIGN = ITEMS.register("ancient_hanging_sign", () -> new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.WILLOW_SIGN.get(), EBBlocks.WILLOW_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = ITEMS.register("willow_hanging_sign", () -> new HangingSignItem(EBBlocks.WILLOW_HANGING_SIGN.get(), EBBlocks.WILLOW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MAPLE_SIGN = ITEMS.register("maple_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.MAPLE_SIGN.get(), EBBlocks.MAPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = ITEMS.register("maple_hanging_sign", () -> new HangingSignItem(EBBlocks.MAPLE_HANGING_SIGN.get(), EBBlocks.MAPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //MISC
    public static final RegistryObject<Item> ANCIENT_FRUIT = ITEMS.register("ancient_fruit", () -> new Item(new Item.Properties().food(EBProperties.ANCIENT_FRUIT)));
    public static final RegistryObject<Item> ALGAE = ITEMS.register("algae", () -> new PlaceOnWaterBlockItem(EBBlocks.ALGAE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXCESSIVE_BANNER_PATTERN = ITEMS.register("excessive_banner_pattern", () -> new BannerPatternItem(EBBannerTagProvider.EXCESSIVE_BANNER_PATTERN, (new Item.Properties().stacksTo(1))));


    public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
    }
}
