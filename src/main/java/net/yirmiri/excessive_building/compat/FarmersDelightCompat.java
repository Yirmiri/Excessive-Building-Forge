package net.yirmiri.excessive_building.compat;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.init.EBBlocks;
import net.yirmiri.excessive_building.init.EBFoods;
import net.yirmiri.excessive_building.init.EBItems;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.item.DrinkableItem;

public class FarmersDelightCompat {

    public static final RegistryObject<Block> ANCIENT_CABINET = EBBlocks.registerBlock("ancient_cabinet",
            () -> new CabinetBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())));

    public static final RegistryObject<Item> ANCIENT_CIDER = EBItems.ITEMS.register("ancient_cider",
            () -> new DrinkableItem(new Item.Properties().food(EBFoods.ANCIENT_CIDER)));


    public static void register(IEventBus eventBus) {
    }
}
