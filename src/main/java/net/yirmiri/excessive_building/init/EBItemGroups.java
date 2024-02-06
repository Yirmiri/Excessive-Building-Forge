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

    public static RegistryObject<CreativeModeTab> EXCESSIVE_BUILDING = CREATIVE_MODE_TABS.register("z_excessive_building_tab", () ->
            CreativeModeTab.builder().withSearchBar().icon(() -> new ItemStack(EBBlocks.LOGO_BLOCK.get())).title(Component.translatable("excessive_building_tab")).build());

    public static RegistryObject<CreativeModeTab> EB_WOODEN_BLOCKS = CREATIVE_MODE_TABS.register("a_eb_wooden_blocks_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(EBBlocks.OAK_MOSAIC.get())).title(Component.translatable("eb_wooden_blocks_tab")).build());

    public static RegistryObject<CreativeModeTab> EB_STONE_BLOCKS = CREATIVE_MODE_TABS.register("b_eb_stone_blocks_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(EBBlocks.COBBLESTONE_BRICKS.get())).title(Component.translatable("eb_stone_blocks_tab")).build());

    public static RegistryObject<CreativeModeTab> EB_COLORED_BLOCKS = CREATIVE_MODE_TABS.register("c_eb_colored_blocks_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(EBBlocks.KNITTED_RED_WOOL.get())).title(Component.translatable("eb_colored_blocks_tab")).build());

    public static RegistryObject<CreativeModeTab> EB_NATURAL_BLOCKS = CREATIVE_MODE_TABS.register("d_eb_natural_blocks_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(EBBlocks.ROSE_BUNDLE.get())).title(Component.translatable("eb_natural_blocks_tab")).build());

    public static RegistryObject<CreativeModeTab> EB_FUNCTIONAL_BLOCKS = CREATIVE_MODE_TABS.register("e_eb_functional_blocks_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(EBBlocks.AMETHYST_LAMP.get())).title(Component.translatable("eb_functional_blocks_tab")).build());

    public static RegistryObject<CreativeModeTab> EB_MISC_TAB = CREATIVE_MODE_TABS.register("f_eb_misc_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(EBItems.FIERY_SHARDS.get())).title(Component.translatable("eb_misc_tab")).build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }
}