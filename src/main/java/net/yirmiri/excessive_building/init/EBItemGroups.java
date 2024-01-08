package net.yirmiri.excessive_building.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExcessiveBuilding.MODID);

        public static RegistryObject<CreativeModeTab> EXCESSIVE_BUILDING = CREATIVE_MODE_TABS.register("excessive_building_tab", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(EBBlocks.LOGO_BLOCK.get())).title(Component.translatable("excessive_building_tab")).build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }
}