package net.yirmiri.excessive_building.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExcessiveBuilding.MODID);

    public static final RegistryObject<Item> FIERY_SHARDS = ITEMS.register("fiery_shards", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_SHARDS = ITEMS.register("kyanite_shards", () -> new Item(new Item.Properties()));
/*
    public static final RegistryObject<Item> ANCIENT_SIGN = ITEMS.register("ancient_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));

    public static final RegistryObject<Item> ANCIENT_HANGING_SIGN = ITEMS.register("ancient_hanging_sign",
            () -> new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
 */

    public static final RegistryObject<Item> ANCIENT_FRUIT = ITEMS.register("ancient_fruit",
            () -> new Item(new Item.Properties().food(EBFoods.ANCIENT_FRUIT)));

    public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
    }
}
