package net.yirmiri.excessive_building.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExcessiveBuilding.MOD_ID);

    public static final RegistryObject<Item> FIERY_SHARDS = ITEMS.register("fiery_shards",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYANITE_SHARDS = ITEMS.register("kyanite_shards",
            () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
