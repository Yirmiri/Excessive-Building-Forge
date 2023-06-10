package net.yirmiri.excessive_building.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yirmiri.excessive_building.block.ModBlocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {

        public static CreativeModeTab EXCESSIVE_BUILDING;

        @SubscribeEvent
        public static void registerCreativeModTabs(CreativeModeTabEvent.Register event) {
                EXCESSIVE_BUILDING = event.registerCreativeModeTab(new ResourceLocation(ExcessiveBuilding.MOD_ID, "excessive_building_tab"),
                        builder -> builder.icon(() -> new ItemStack(ModBlocks.LOGO_BLOCK.get()))
                                .title(Component.translatable("itemGroup.excessive_building_tab")).build());
    }
}