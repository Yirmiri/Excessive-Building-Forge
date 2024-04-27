package net.yirmiri.excessive_building.compat;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.register.EBItems;
import net.yirmiri.excessive_building.util.EBProperties;
import vectorwing.farmersdelight.common.item.DrinkableItem;

public class FDCompat {

    //FOODS
    public static final RegistryObject<Item> ANCIENT_CIDER = EBItems.ITEMS.register("ancient_cider", () -> new DrinkableItem(new Item.Properties().food(EBProperties.Foods.ANCIENT_CIDER)));

    public static void register(IEventBus eventBus) {
    }
}
