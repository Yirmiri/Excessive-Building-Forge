package net.yirmiri.excessive_building.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.compat.EBCompatRegistries;
import net.yirmiri.excessive_building.compat.FDCompat;
import net.yirmiri.excessive_building.compat.SMCompat;
import net.yirmiri.excessive_building.register.EBBlocks;
import net.yirmiri.excessive_building.register.EBItemGroups;
import net.yirmiri.excessive_building.register.EBItems;

public class EBCreativeModeTabs {

    @SubscribeEvent
    public static void buildCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility parentAndSearch = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;

        if (event.getTabKey() == (CreativeModeTabs.BUILDING_BLOCKS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putAfter(new ItemStack(Items.OAK_LOG), new ItemStack(EBBlocks.HOLLOW_OAK_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_OAK_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_OAK_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.OAK_PLANKS), new ItemStack(EBBlocks.OAK_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OAK_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_OAK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.OAK_STAIRS), new ItemStack(EBBlocks.OAK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.OAK_STAIRS), new ItemStack(EBBlocks.OAK_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OAK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.OAK_SLAB), new ItemStack(EBBlocks.OAK_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.OAK_BUTTON), new ItemStack(Blocks.LADDER), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_LOG), new ItemStack(EBBlocks.HOLLOW_SPRUCE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_SPRUCE_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_SPRUCE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_PLANKS), new ItemStack(EBBlocks.SPRUCE_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SPRUCE_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_SPRUCE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_STAIRS), new ItemStack(EBBlocks.SPRUCE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_STAIRS), new ItemStack(EBBlocks.SPRUCE_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SPRUCE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_SLAB), new ItemStack(EBBlocks.SPRUCE_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_BUTTON), new ItemStack(EBBlocks.SPRUCE_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.BIRCH_LOG), new ItemStack(EBBlocks.HOLLOW_BIRCH_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_BIRCH_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_BIRCH_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_PLANKS), new ItemStack(EBBlocks.BIRCH_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BIRCH_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_BIRCH.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_STAIRS), new ItemStack(EBBlocks.BIRCH_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_STAIRS), new ItemStack(EBBlocks.BIRCH_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BIRCH_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_SLAB), new ItemStack(EBBlocks.BIRCH_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_BUTTON), new ItemStack(EBBlocks.BIRCH_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_LOG), new ItemStack(EBBlocks.HOLLOW_JUNGLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_JUNGLE_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_JUNGLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_PLANKS), new ItemStack(EBBlocks.JUNGLE_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.JUNGLE_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_JUNGLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_STAIRS), new ItemStack(EBBlocks.JUNGLE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_STAIRS), new ItemStack(EBBlocks.JUNGLE_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.JUNGLE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_SLAB), new ItemStack(EBBlocks.JUNGLE_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_BUTTON), new ItemStack(EBBlocks.JUNGLE_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.ACACIA_LOG), new ItemStack(EBBlocks.HOLLOW_ACACIA_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_ACACIA_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_ACACIA_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.ACACIA_PLANKS), new ItemStack(EBBlocks.ACACIA_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACACIA_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_ACACIA.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.ACACIA_STAIRS), new ItemStack(EBBlocks.ACACIA_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.ACACIA_STAIRS), new ItemStack(EBBlocks.ACACIA_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACACIA_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.ACACIA_SLAB), new ItemStack(EBBlocks.ACACIA_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.ACACIA_BUTTON), new ItemStack(EBBlocks.ACACIA_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_LOG), new ItemStack(EBBlocks.HOLLOW_DARK_OAK_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_DARK_OAK_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_DARK_OAK_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_PLANKS), new ItemStack(EBBlocks.DARK_OAK_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DARK_OAK_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_DARK_OAK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_STAIRS), new ItemStack(EBBlocks.DARK_OAK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_STAIRS), new ItemStack(EBBlocks.DARK_OAK_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DARK_OAK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_SLAB), new ItemStack(EBBlocks.DARK_OAK_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_BUTTON), new ItemStack(EBBlocks.DARK_OAK_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_LOG), new ItemStack(EBBlocks.HOLLOW_MANGROVE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_MANGROVE_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_MANGROVE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_PLANKS), new ItemStack(EBBlocks.MANGROVE_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MANGROVE_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_MANGROVE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_STAIRS), new ItemStack(EBBlocks.MANGROVE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_STAIRS), new ItemStack(EBBlocks.MANGROVE_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MANGROVE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_SLAB), new ItemStack(EBBlocks.MANGROVE_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_BUTTON), new ItemStack(EBBlocks.MANGROVE_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.CHERRY_LOG), new ItemStack(EBBlocks.HOLLOW_CHERRY_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_CHERRY_LOG), new ItemStack(EBBlocks.HOLLOW_STRIPPED_CHERRY_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_PLANKS), new ItemStack(EBBlocks.CHERRY_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHERRY_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_CHERRY.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_STAIRS), new ItemStack(EBBlocks.CHERRY_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_STAIRS), new ItemStack(EBBlocks.CHERRY_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHERRY_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_SLAB), new ItemStack(EBBlocks.CHERRY_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_BUTTON), new ItemStack(EBBlocks.CHERRY_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.BAMBOO_MOSAIC), new ItemStack(EBBlocks.CHISELED_BAMBOO.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BAMBOO_STAIRS), new ItemStack(EBBlocks.BAMBOO_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BAMBOO_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BAMBOO_BUTTON), new ItemStack(EBBlocks.BAMBOO_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BAMBOO_LADDER.get()), new ItemStack(EBBlocks.MAPLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_LOG.get()), new ItemStack(EBBlocks.HOLLOW_MAPLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HOLLOW_MAPLE_LOG.get()), new ItemStack(EBBlocks.MAPLE_WOOD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_WOOD.get()), new ItemStack(EBBlocks.STRIPPED_MAPLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STRIPPED_MAPLE_LOG.get()), new ItemStack(EBBlocks.HOLLOW_STRIPPED_MAPLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HOLLOW_STRIPPED_MAPLE_LOG.get()), new ItemStack(EBBlocks.STRIPPED_MAPLE_WOOD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STRIPPED_MAPLE_WOOD.get()), new ItemStack(EBBlocks.MAPLE_PLANKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_PLANKS.get()), new ItemStack(EBBlocks.MAPLE_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_MAPLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_MAPLE.get()), new ItemStack(EBBlocks.MAPLE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_STAIRS.get()), new ItemStack(EBBlocks.MAPLE_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_MOSAIC_STAIRS.get()), new ItemStack(EBBlocks.MAPLE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MAPLE_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_MOSAIC_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MAPLE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_SLAB.get()), new ItemStack(EBBlocks.MAPLE_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_MOSAIC_SLAB.get()), new ItemStack(EBBlocks.MAPLE_FENCE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_FENCE.get()), new ItemStack(EBBlocks.MAPLE_FENCE_GATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_FENCE_GATE.get()), new ItemStack(EBBlocks.MAPLE_DOOR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_DOOR.get()), new ItemStack(EBBlocks.MAPLE_TRAPDOOR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_TRAPDOOR.get()), new ItemStack(EBBlocks.MAPLE_PRESSURE_PLATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_PRESSURE_PLATE.get()), new ItemStack(EBBlocks.MAPLE_BUTTON.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_BUTTON.get()), new ItemStack(EBBlocks.MAPLE_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_LADDER.get()), new ItemStack(EBBlocks.WILLOW_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_LOG.get()), new ItemStack(EBBlocks.HOLLOW_WILLOW_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HOLLOW_WILLOW_LOG.get()), new ItemStack(EBBlocks.WILLOW_WOOD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_WOOD.get()), new ItemStack(EBBlocks.STRIPPED_WILLOW_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STRIPPED_WILLOW_LOG.get()), new ItemStack(EBBlocks.HOLLOW_STRIPPED_WILLOW_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HOLLOW_STRIPPED_WILLOW_LOG.get()), new ItemStack(EBBlocks.STRIPPED_WILLOW_WOOD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STRIPPED_WILLOW_WOOD.get()), new ItemStack(EBBlocks.WILLOW_PLANKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_PLANKS.get()), new ItemStack(EBBlocks.WILLOW_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_WILLOW.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_WILLOW.get()), new ItemStack(EBBlocks.WILLOW_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_STAIRS.get()), new ItemStack(EBBlocks.WILLOW_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_MOSAIC_STAIRS.get()), new ItemStack(EBBlocks.WILLOW_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.WILLOW_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_MOSAIC_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.WILLOW_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_SLAB.get()), new ItemStack(EBBlocks.WILLOW_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_MOSAIC_SLAB.get()), new ItemStack(EBBlocks.WILLOW_FENCE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_FENCE.get()), new ItemStack(EBBlocks.WILLOW_FENCE_GATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_FENCE_GATE.get()), new ItemStack(EBBlocks.WILLOW_DOOR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_DOOR.get()), new ItemStack(EBBlocks.WILLOW_TRAPDOOR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_TRAPDOOR.get()), new ItemStack(EBBlocks.WILLOW_PRESSURE_PLATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_PRESSURE_PLATE.get()), new ItemStack(EBBlocks.WILLOW_BUTTON.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_BUTTON.get()), new ItemStack(EBBlocks.WILLOW_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_LADDER.get()), new ItemStack(EBBlocks.ANCIENT_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_LOG.get()), new ItemStack(EBBlocks.HOLLOW_ANCIENT_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HOLLOW_ANCIENT_LOG.get()), new ItemStack(EBBlocks.ANCIENT_WOOD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_WOOD.get()), new ItemStack(EBBlocks.STRIPPED_ANCIENT_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STRIPPED_ANCIENT_LOG.get()), new ItemStack(EBBlocks.HOLLOW_STRIPPED_ANCIENT_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HOLLOW_STRIPPED_ANCIENT_LOG.get()), new ItemStack(EBBlocks.STRIPPED_ANCIENT_WOOD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STRIPPED_ANCIENT_WOOD.get()), new ItemStack(EBBlocks.ANCIENT_PLANKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_PLANKS.get()), new ItemStack(EBBlocks.ANCIENT_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_ANCIENT.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_ANCIENT.get()), new ItemStack(EBBlocks.ANCIENT_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_STAIRS.get()), new ItemStack(EBBlocks.ANCIENT_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_MOSAIC_STAIRS.get()), new ItemStack(EBBlocks.ANCIENT_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.ANCIENT_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_SLAB.get()), new ItemStack(EBBlocks.ANCIENT_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_MOSAIC_SLAB.get()), new ItemStack(EBBlocks.ANCIENT_FENCE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_FENCE.get()), new ItemStack(EBBlocks.ANCIENT_FENCE_GATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_FENCE_GATE.get()), new ItemStack(EBBlocks.ANCIENT_DOOR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_DOOR.get()), new ItemStack(EBBlocks.ANCIENT_TRAPDOOR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_TRAPDOOR.get()), new ItemStack(EBBlocks.ANCIENT_PRESSURE_PLATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_PRESSURE_PLATE.get()), new ItemStack(EBBlocks.ANCIENT_BUTTON.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_BUTTON.get()), new ItemStack(EBBlocks.ANCIENT_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_STEM), new ItemStack(EBBlocks.HOLLOW_CRIMSON_STEM.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_CRIMSON_STEM), new ItemStack(EBBlocks.HOLLOW_STRIPPED_CRIMSON_STEM.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_PLANKS), new ItemStack(EBBlocks.CRIMSON_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_CRIMSON.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_STAIRS), new ItemStack(EBBlocks.CRIMSON_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_STAIRS), new ItemStack(EBBlocks.CRIMSON_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_SLAB), new ItemStack(EBBlocks.CRIMSON_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_BUTTON), new ItemStack(EBBlocks.CRIMSON_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.WARPED_STEM), new ItemStack(EBBlocks.HOLLOW_WARPED_STEM.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STRIPPED_WARPED_STEM), new ItemStack(EBBlocks.HOLLOW_STRIPPED_WARPED_STEM.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_PLANKS), new ItemStack(EBBlocks.WARPED_MOSAIC.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSAIC.get()), new ItemStack(EBBlocks.CHISELED_WARPED.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_STAIRS), new ItemStack(EBBlocks.WARPED_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_STAIRS), new ItemStack(EBBlocks.WARPED_MOSAIC_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_SLAB), new ItemStack(EBBlocks.WARPED_MOSAIC_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_BUTTON), new ItemStack(EBBlocks.WARPED_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.STONE_STAIRS), new ItemStack(EBBlocks.STONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.STONE_SLAB), new ItemStack(EBBlocks.POLISHED_STONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE.get()), new ItemStack(EBBlocks.POLISHED_STONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_STONE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_STONE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_WALL.get()), new ItemStack(EBBlocks.POLISHED_STONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_POLISHED_STONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_POLISHED_STONE_BRICKS.get()), new ItemStack(EBBlocks.POLISHED_STONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_STONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_STONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.POLISHED_STONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_STONE_BRICK_WALL.get()), new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.MOSSY_POLISHED_STONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.COBBLESTONE_STAIRS), new ItemStack(EBBlocks.COBBLESTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.COBBLESTONE_WALL), new ItemStack(EBBlocks.COBBLESTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLESTONE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get()), new ItemStack(EBBlocks.COBBLESTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLESTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.COBBLESTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLESTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.COBBLESTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.MOSSY_COBBLESTONE_STAIRS), new ItemStack(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MOSSY_COBBLESTONE_WALL), new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICKS.get()), new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.SMOOTH_STONE_SLAB), new ItemStack(EBBlocks.SMOOTH_STONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_WALL.get()), new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_PILLAR.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_WALL.get()), new ItemStack(EBBlocks.SMOOTH_STONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_TILES.get()), new ItemStack(EBBlocks.SMOOTH_STONE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_TILE_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_STONE_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_TILE_SLAB.get()), new ItemStack(EBBlocks.SMOOTH_STONE_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.STONE_BRICK_STAIRS), new ItemStack(EBBlocks.STONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.MOSSY_STONE_BRICK_STAIRS), new ItemStack(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.GRANITE_STAIRS), new ItemStack(EBBlocks.GRANITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.GRANITE_WALL), new ItemStack(EBBlocks.COBBLED_GRANITE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_GRANITE.get()), new ItemStack(EBBlocks.COBBLED_GRANITE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_GRANITE_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_GRANITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_GRANITE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_GRANITE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_GRANITE_SLAB.get()), new ItemStack(EBBlocks.COBBLED_GRANITE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.POLISHED_GRANITE_STAIRS), new ItemStack(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.POLISHED_GRANITE_SLAB), new ItemStack(EBBlocks.POLISHED_GRANITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_GRANITE_BRICKS.get()), new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_SLAB.get()), new ItemStack(EBBlocks.POLISHED_GRANITE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.DIORITE_STAIRS), new ItemStack(EBBlocks.DIORITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DIORITE_WALL), new ItemStack(EBBlocks.COBBLED_DIORITE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DIORITE.get()), new ItemStack(EBBlocks.COBBLED_DIORITE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DIORITE_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_DIORITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DIORITE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_DIORITE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DIORITE_SLAB.get()), new ItemStack(EBBlocks.COBBLED_DIORITE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.POLISHED_DIORITE_STAIRS), new ItemStack(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.POLISHED_DIORITE_SLAB), new ItemStack(EBBlocks.POLISHED_DIORITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_DIORITE_BRICKS.get()), new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_SLAB.get()), new ItemStack(EBBlocks.POLISHED_DIORITE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.ANDESITE_STAIRS), new ItemStack(EBBlocks.ANDESITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.ANDESITE_WALL), new ItemStack(EBBlocks.COBBLED_ANDESITE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_ANDESITE.get()), new ItemStack(EBBlocks.COBBLED_ANDESITE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_ANDESITE_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_ANDESITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_ANDESITE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_ANDESITE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_ANDESITE_SLAB.get()), new ItemStack(EBBlocks.COBBLED_ANDESITE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.POLISHED_ANDESITE_STAIRS), new ItemStack(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.POLISHED_ANDESITE_SLAB), new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICKS.get()), new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_SLAB.get()), new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICK_WALL.get()), new ItemStack(Blocks.CALCITE), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.CALCITE), new ItemStack(EBBlocks.POLISHED_CALCITE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_CALCITE.get()), new ItemStack(EBBlocks.POLISHED_CALCITE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_CALCITE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_CALCITE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_CALCITE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_CALCITE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_CALCITE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_CALCITE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_CALCITE_WALL.get()), new ItemStack(EBBlocks.CALCITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_CALCITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_CALCITE_BRICKS.get()), new ItemStack(EBBlocks.CALCITE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.CALCITE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.CALCITE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_BRICK_SLAB.get()), new ItemStack(EBBlocks.CALCITE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_BRICK_WALL.get()), new ItemStack(EBBlocks.CALCITE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_TILES.get()), new ItemStack(EBBlocks.CRACKED_CALCITE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_CALCITE_TILES.get()), new ItemStack(EBBlocks.CALCITE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_TILE_STAIRS.get()), new ItemStack(EBBlocks.CALCITE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.CALCITE_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_TILE_SLAB.get()), new ItemStack(EBBlocks.CALCITE_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CALCITE_TILE_WALL.get()), new ItemStack(Blocks.TUFF), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.TUFF), new ItemStack(EBBlocks.TUFF_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_STAIRS.get()), new ItemStack(EBBlocks.TUFF_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.TUFF_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_SLAB.get()), new ItemStack(EBBlocks.TUFF_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_WALL.get()), new ItemStack(EBBlocks.POLISHED_TUFF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_TUFF.get()), new ItemStack(EBBlocks.CHISELED_POLISHED_TUFF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_POLISHED_TUFF.get()), new ItemStack(EBBlocks.POLISHED_TUFF_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_TUFF_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_TUFF_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_TUFF_SLAB.get()), new ItemStack(EBBlocks.POLISHED_TUFF_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_TUFF_WALL.get()), new ItemStack(EBBlocks.TUFF_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_BRICKS.get()), new ItemStack(EBBlocks.CHISELED_TUFF_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_TUFF_BRICKS.get()), new ItemStack(EBBlocks.TUFF_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_BRICK_STAIRS.get()), new ItemStack(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.TUFF_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_BRICK_SLAB.get()), new ItemStack(EBBlocks.TUFF_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_BRICK_WALL.get()), new ItemStack(EBBlocks.TUFF_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_TILES.get()), new ItemStack(EBBlocks.TUFF_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_TILE_STAIRS.get()), new ItemStack(EBBlocks.TUFF_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.TUFF_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_TILE_SLAB.get()), new ItemStack(EBBlocks.TUFF_TILE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_TILE_WALL.get()), new ItemStack(EBBlocks.TUFF_BRICK_PILLAR.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.COBBLED_DEEPSLATE_STAIRS), new ItemStack(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.COBBLED_DEEPSLATE_WALL), new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS.get()), new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB.get()), new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL.get()), new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS.get()), new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB.get()), new ItemStack(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.POLISHED_DEEPSLATE_STAIRS), new ItemStack(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.DEEPSLATE_BRICK_STAIRS), new ItemStack(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.DEEPSLATE_BRICK_WALL), new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICKS.get()), new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get()), new ItemStack(EBBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.DEEPSLATE_TILE_STAIRS), new ItemStack(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.REINFORCED_DEEPSLATE), new ItemStack(EBBlocks.MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE.get()), new ItemStack(EBBlocks.MARBLE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_STAIRS.get()), new ItemStack(EBBlocks.MARBLE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MARBLE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_SLAB.get()), new ItemStack(EBBlocks.MARBLE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_WALL.get()), new ItemStack(EBBlocks.POLISHED_MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARBLE.get()), new ItemStack(EBBlocks.POLISHED_MARBLE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARBLE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_MARBLE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARBLE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_MARBLE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARBLE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_MARBLE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARBLE_WALL.get()), new ItemStack(EBBlocks.MARBLE_PILLAR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_PILLAR.get()), new ItemStack(EBBlocks.MARBLE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_BRICKS.get()), new ItemStack(EBBlocks.MARBLE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MARBLE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MARBLE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_BRICK_SLAB.get()), new ItemStack(EBBlocks.MARBLE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_BRICK_WALL.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_STAIRS.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_SLAB.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_WALL.get()), new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE.get()), new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_MARQUINA_MARBLE_WALL.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_PILLAR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_PILLAR.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICKS.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_SLAB.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_BRICK_WALL.get()), new ItemStack(EBBlocks.MARBLE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_TILES.get()), new ItemStack(EBBlocks.MARBLE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_TILE_STAIRS.get()), new ItemStack(EBBlocks.MARBLE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MARBLE_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_TILE_SLAB.get()), new ItemStack(EBBlocks.MARBLE_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_TILE_WALL.get()), new ItemStack(EBBlocks.CHISELED_POLISHED_MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_POLISHED_MARBLE.get()), new ItemStack(EBBlocks.CHISELED_POLISHED_MARBLE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_POLISHED_MARBLE_SLAB.get()), new ItemStack(EBBlocks.CHISELED_MARBLE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_MARBLE_BRICKS.get()), new ItemStack(EBBlocks.CHISELED_MARBLE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_MARBLE_BRICK_SLAB.get()), new ItemStack(EBBlocks.CHISELED_MARBLE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_MARBLE_TILES.get()), new ItemStack(EBBlocks.CHISELED_MARBLE_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.BRICKS), new ItemStack(EBBlocks.CRACKED_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_BRICKS.get()), new ItemStack(EBBlocks.HERRINGBONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.HERRINGBONE_BRICKS.get()), new ItemStack(EBBlocks.BASKETWEAVE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BRICK_STAIRS), new ItemStack(EBBlocks.BASKETWEAVE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BASKETWEAVE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BASKETWEAVE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BRICK_SLAB), new ItemStack(EBBlocks.BASKETWEAVE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.BRICK_WALL), new ItemStack(EBBlocks.BASKETWEAVE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BASKETWEAVE_BRICK_WALL.get()), new ItemStack(EBBlocks.SMOOTH_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_SMOOTH_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_SMOOTH_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_HERRINGBONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_HERRINGBONE_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BRICK_SLAB.get()), new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_SLAB.get()), new ItemStack(EBBlocks.SMOOTH_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BRICK_WALL.get()), new ItemStack(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.MUD_BRICK_STAIRS), new ItemStack(EBBlocks.MUD_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.MUD_BRICK_WALL), new ItemStack(EBBlocks.MUD_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MUD_TILES.get()), new ItemStack(EBBlocks.MUD_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MUD_TILE_STAIRS.get()), new ItemStack(EBBlocks.MUD_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MUD_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MUD_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MUD_TILE_SLAB.get()), new ItemStack(Blocks.SNOW_BLOCK), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.SNOW_BLOCK), new ItemStack(EBBlocks.SNOW_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SNOW_BRICKS.get()), new ItemStack(EBBlocks.SNOW_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SNOW_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SNOW_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SNOW_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SNOW_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.SANDSTONE_STAIRS), new ItemStack(EBBlocks.SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.SMOOTH_SANDSTONE_STAIRS), new ItemStack(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.CUT_SANDSTONE_SLAB), new ItemStack(EBBlocks.POLISHED_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SANDSTONE.get()), new ItemStack(EBBlocks.POLISHED_SANDSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SANDSTONE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_SANDSTONE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SANDSTONE_SLAB.get()), new ItemStack(EBBlocks.SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.SANDSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SANDSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.SANDSTONE_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.SANDSTONE_PILLAR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_PILLAR.get()), new ItemStack(EBBlocks.DECORATED_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DECORATED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.ENGRAVED_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ENGRAVED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.CHISELED_SANDSTONE_BRICKS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.SANDSTONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_TILES.get()), new ItemStack(EBBlocks.SANDSTONE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_TILE_STAIRS.get()), new ItemStack(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SANDSTONE_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.RED_SANDSTONE_STAIRS), new ItemStack(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.SMOOTH_RED_SANDSTONE_STAIRS), new ItemStack(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.CUT_RED_SANDSTONE_SLAB), new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE.get()), new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_RED_SANDSTONE_SLAB.get()), new ItemStack(EBBlocks.RED_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.RED_SANDSTONE_PILLAR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_PILLAR.get()), new ItemStack(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.RED_SANDSTONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_TILES.get()), new ItemStack(EBBlocks.RED_SANDSTONE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_TILE_STAIRS.get()), new ItemStack(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.RED_SANDSTONE_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_TILE_SLAB.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_STAIRS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_SLAB.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_WALL.get()), new ItemStack(EBBlocks.CHISELED_SOUL_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_SOUL_SANDSTONE.get()), new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE.get()), new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get()), new ItemStack(EBBlocks.CUT_SOUL_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CUT_SOUL_SANDSTONE.get()), new ItemStack(EBBlocks.CUT_SOUL_SANDSTONE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CUT_SOUL_SANDSTONE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE.get()), new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_PILLAR.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_PILLAR.get()), new ItemStack(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_TILES.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.PRISMARINE_STAIRS), new ItemStack(EBBlocks.PRISMARINE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.PRISMARINE_BRICK_STAIRS), new ItemStack(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.DARK_PRISMARINE_STAIRS), new ItemStack(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.NETHER_BRICK_STAIRS), new ItemStack(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.NETHER_BRICK_FENCE), new ItemStack(EBBlocks.NETHER_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHER_TILES.get()), new ItemStack(EBBlocks.NETHER_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHER_TILE_STAIRS.get()), new ItemStack(EBBlocks.NETHER_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHER_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.NETHER_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHER_TILE_SLAB.get()), new ItemStack(EBBlocks.NETHER_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.RED_NETHER_BRICK_STAIRS), new ItemStack(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.RED_NETHER_BRICK_WALL), new ItemStack(EBBlocks.RED_NETHER_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_NETHER_TILES.get()), new ItemStack(EBBlocks.RED_NETHER_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_NETHER_TILE_STAIRS.get()), new ItemStack(EBBlocks.RED_NETHER_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_NETHER_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.RED_NETHER_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_NETHER_TILE_SLAB.get()), new ItemStack(EBBlocks.RED_NETHER_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_NETHER_TILE_WALL.get()), new ItemStack(EBBlocks.BLUE_NETHER_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_BRICKS.get()), new ItemStack(EBBlocks.BLUE_NETHER_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_BRICK_STAIRS.get()), new ItemStack(EBBlocks.BLUE_NETHER_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BLUE_NETHER_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_BRICK_SLAB.get()), new ItemStack(EBBlocks.BLUE_NETHER_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_BRICK_WALL.get()), new ItemStack(EBBlocks.BLUE_NETHER_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_TILES.get()), new ItemStack(EBBlocks.BLUE_NETHER_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_TILE_STAIRS.get()), new ItemStack(EBBlocks.BLUE_NETHER_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BLUE_NETHER_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_NETHER_TILE_SLAB.get()), new ItemStack(EBBlocks.BLUE_NETHER_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.BLACKSTONE_STAIRS), new ItemStack(EBBlocks.BLACKSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BLACKSTONE_WALL), new ItemStack(EBBlocks.BLACKSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_BLACKSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_BLACKSTONE_BRICKS.get()), new ItemStack(EBBlocks.BLACKSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BLACKSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.BLACKSTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICKS.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICKS.get()), new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.POLISHED_BLACKSTONE_STAIRS), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICK_WALL), new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS.get()), new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), new ItemStack(EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES.get()), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BLACKSTONE_TILE_WALL.get()), new ItemStack(EBBlocks.BRIMSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BRIMSTONE.get()), new ItemStack(EBBlocks.BRIMSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BRIMSTONE_STAIRS.get()), new ItemStack(EBBlocks.BRIMSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BRIMSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.BRIMSTONE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BRIMSTONE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_WALL.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_PILLAR.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_PILLAR.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_SLAB.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_BRICK_WALL.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILES.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_SLAB.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.END_STONE_BRICK_STAIRS), new ItemStack(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.PURPUR_STAIRS), new ItemStack(EBBlocks.PURPUR_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.PURPUR_SLAB), new ItemStack(Blocks.OBSIDIAN), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.OBSIDIAN), new ItemStack(EBBlocks.OBSIDIAN_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_OBSIDIAN_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_OBSIDIAN_BRICKS.get()), new ItemStack(EBBlocks.OBSIDIAN_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_BRICK_STAIRS.get()), new ItemStack(EBBlocks.OBSIDIAN_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.OBSIDIAN_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_BRICK_SLAB.get()), new ItemStack(EBBlocks.OBSIDIAN_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_TILES.get()), new ItemStack(EBBlocks.OBSIDIAN_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_TILE_STAIRS.get()), new ItemStack(EBBlocks.OBSIDIAN_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.OBSIDIAN_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.OBSIDIAN_TILE_SLAB.get()), new ItemStack(EBBlocks.ASPHALT.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ASPHALT.get()), new ItemStack(EBBlocks.ASPHALT_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ASPHALT_STAIRS.get()), new ItemStack(EBBlocks.ASPHALT_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ASPHALT_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.ASPHALT_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.ASPHALT_SLAB.get()), new ItemStack(EBBlocks.SWIFT_ASPHALT.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SWIFT_ASPHALT.get()), new ItemStack(EBBlocks.SWIFT_ASPHALT_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SWIFT_ASPHALT_STAIRS.get()), new ItemStack(EBBlocks.SWIFT_ASPHALT_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SWIFT_ASPHALT_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.SWIFT_ASPHALT_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.IRON_BLOCK), new ItemStack(EBBlocks.IRON_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.IRON_BRICKS.get()), new ItemStack(EBBlocks.IRON_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.IRON_BRICK_STAIRS.get()), new ItemStack(EBBlocks.IRON_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.IRON_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.IRON_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.IRON_BRICK_SLAB.get()), new ItemStack(EBBlocks.IRON_GRATE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(EBBlocks.GOLDEN_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GOLDEN_BRICKS.get()), new ItemStack(EBBlocks.GOLDEN_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GOLDEN_BRICK_STAIRS.get()), new ItemStack(EBBlocks.GOLDEN_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GOLDEN_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.GOLDEN_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GOLDEN_BRICK_SLAB.get()), new ItemStack(EBBlocks.GOLD_GRATE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.EMERALD_BLOCK), new ItemStack(EBBlocks.EMERALD_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.EMERALD_BRICKS.get()), new ItemStack(EBBlocks.EMERALD_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.EMERALD_BRICK_STAIRS.get()), new ItemStack(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.EMERALD_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.LAPIS_BLOCK), new ItemStack(EBBlocks.LAPIS_LAZULI_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LAPIS_LAZULI_BRICKS.get()), new ItemStack(EBBlocks.LAPIS_LAZULI_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LAPIS_LAZULI_BRICK_STAIRS.get()), new ItemStack(EBBlocks.LAPIS_LAZULI_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LAPIS_LAZULI_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.LAPIS_LAZULI_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(EBBlocks.DIAMOND_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DIAMOND_BRICKS.get()), new ItemStack(EBBlocks.DIAMOND_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DIAMOND_BRICK_STAIRS.get()), new ItemStack(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.DIAMOND_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.NETHERITE_BLOCK), new ItemStack(EBBlocks.NETHERITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHERITE_BRICKS.get()), new ItemStack(EBBlocks.NETHERITE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHERITE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.NETHERITE_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.QUARTZ_STAIRS), new ItemStack(EBBlocks.QUARTZ_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.QUARTZ_BRICKS), new ItemStack(EBBlocks.QUARTZ_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_BRICK_STAIRS.get()), new ItemStack(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.QUARTZ_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_BRICK_SLAB.get()), new ItemStack(EBBlocks.QUARTZ_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_TILES.get()), new ItemStack(EBBlocks.QUARTZ_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_TILE_STAIRS.get()), new ItemStack(EBBlocks.QUARTZ_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.QUARTZ_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.SMOOTH_QUARTZ_STAIRS), new ItemStack(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.AMETHYST_BLOCK), new ItemStack(EBBlocks.AMETHYST_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_AMETHYST_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_AMETHYST_BRICKS.get()), new ItemStack(EBBlocks.AMETHYST_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_BRICK_STAIRS.get()), new ItemStack(EBBlocks.AMETHYST_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.AMETHYST_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_BRICK_SLAB.get()), new ItemStack(EBBlocks.AMETHYST_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_BRICK_WALL.get()), new ItemStack(EBBlocks.AMETHYST_TILES.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_TILES.get()), new ItemStack(EBBlocks.CRACKED_AMETHYST_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_AMETHYST_TILES.get()), new ItemStack(EBBlocks.AMETHYST_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_TILE_STAIRS.get()), new ItemStack(EBBlocks.AMETHYST_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.AMETHYST_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_TILE_SLAB.get()), new ItemStack(EBBlocks.AMETHYST_TILE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_TILE_WALL.get()), new ItemStack(EBBlocks.AMETHYST_LAMP.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_LAMP.get()), new ItemStack(EBBlocks.FIERY_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BLOCK.get()), new ItemStack(EBBlocks.FIERY_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_FIERY_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_FIERY_BRICKS.get()), new ItemStack(EBBlocks.FIERY_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BRICK_STAIRS.get()), new ItemStack(EBBlocks.FIERY_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.FIERY_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BRICK_SLAB.get()), new ItemStack(EBBlocks.FIERY_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BRICK_WALL.get()), new ItemStack(EBBlocks.FIERY_TILES.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_TILES.get()), new ItemStack(EBBlocks.CRACKED_FIERY_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_FIERY_TILES.get()), new ItemStack(EBBlocks.FIERY_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_TILE_STAIRS.get()), new ItemStack(EBBlocks.FIERY_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.FIERY_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_TILE_SLAB.get()), new ItemStack(EBBlocks.FIERY_TILE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_TILE_WALL.get()), new ItemStack(EBBlocks.FIERY_LAMP.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_LAMP.get()), new ItemStack(EBBlocks.KYANITE_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BLOCK.get()), new ItemStack(EBBlocks.KYANITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_KYANITE_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_KYANITE_BRICKS.get()), new ItemStack(EBBlocks.KYANITE_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BRICK_STAIRS.get()), new ItemStack(EBBlocks.KYANITE_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.KYANITE_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BRICK_SLAB.get()), new ItemStack(EBBlocks.KYANITE_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BRICK_WALL.get()), new ItemStack(EBBlocks.KYANITE_TILES.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_TILES.get()), new ItemStack(EBBlocks.CRACKED_KYANITE_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_KYANITE_TILES.get()), new ItemStack(EBBlocks.KYANITE_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_TILE_STAIRS.get()), new ItemStack(EBBlocks.KYANITE_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.KYANITE_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_TILE_SLAB.get()), new ItemStack(EBBlocks.KYANITE_TILE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_TILE_WALL.get()), new ItemStack(EBBlocks.KYANITE_LAMP.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_LAMP.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_PRISMARINE_CRYSTAL_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_PRISMARINE_CRYSTAL_BRICKS.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_STAIRS.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_SLAB.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BRICK_WALL.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), new ItemStack(EBBlocks.CRACKED_PRISMARINE_CRYSTAL_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_PRISMARINE_CRYSTAL_TILES.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_STAIRS.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_SLAB.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_WALL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_TILE_WALL.get()), new ItemStack(EBBlocks.MIRALEN_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BLOCK.get()), new ItemStack(EBBlocks.MIRALEN_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BRICKS.get()), new ItemStack(EBBlocks.CRACKED_MIRALEN_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_MIRALEN_BRICKS.get()), new ItemStack(EBBlocks.MIRALEN_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MIRALEN_BRICK_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BRICK_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MIRALEN_BRICK_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BRICK_SLAB.get()), new ItemStack(EBBlocks.MIRALEN_BRICK_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BRICK_WALL.get()), new ItemStack(EBBlocks.MIRALEN_TILES.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_TILES.get()), new ItemStack(EBBlocks.CRACKED_MIRALEN_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRACKED_MIRALEN_TILES.get()), new ItemStack(EBBlocks.MIRALEN_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_TILE_STAIRS.get()), new ItemStack(EBBlocks.MIRALEN_TILE_VERTICAL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_TILE_VERTICAL_STAIRS.get()), new ItemStack(EBBlocks.MIRALEN_TILE_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_TILE_SLAB.get()), new ItemStack(EBBlocks.MIRALEN_TILE_WALL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_TILE_WALL.get()), new ItemStack(EBBlocks.MIRALEN_LAMP.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), new ItemStack(EBBlocks.CHISELED_COPPER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHISELED_COPPER.get()), new ItemStack(EBBlocks.EXPOSED_CHISELED_COPPER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.EXPOSED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.WEATHERED_CHISELED_COPPER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WEATHERED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.OXIDIZED_CHISELED_COPPER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.OXIDIZED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.COPPER_GRATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.COPPER_GRATE.get()), new ItemStack(EBBlocks.EXPOSED_COPPER_GRATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.EXPOSED_COPPER_GRATE.get()), new ItemStack(EBBlocks.WEATHERED_COPPER_GRATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WEATHERED_COPPER_GRATE.get()), new ItemStack(EBBlocks.OXIDIZED_COPPER_GRATE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.OXIDIZED_COPPER_GRATE.get()), new ItemStack(EBBlocks.WAXED_CHISELED_COPPER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.WAXED_EXPOSED_CHISELED_COPPER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_EXPOSED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.WAXED_WEATHERED_CHISELED_COPPER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_WEATHERED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get()), new ItemStack(EBBlocks.WAXED_COPPER_GRATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_COPPER_GRATE.get()), new ItemStack(EBBlocks.WAXED_EXPOSED_COPPER_GRATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_EXPOSED_COPPER_GRATE.get()), new ItemStack(EBBlocks.WAXED_WEATHERED_COPPER_GRATE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_WEATHERED_COPPER_GRATE.get()), new ItemStack(EBBlocks.WAXED_OXIDIZED_COPPER_GRATE.get()), parentAndSearch);
        }

        if (event.getTabKey() == (CreativeModeTabs.COLORED_BLOCKS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putAfter(new ItemStack(Blocks.WHITE_WOOL), new ItemStack(EBBlocks.WHITE_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_WOOL_STAIRS.get()), new ItemStack(EBBlocks.WHITE_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.LIGHT_GRAY_WOOL), new ItemStack(EBBlocks.LIGHT_GRAY_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_WOOL_STAIRS.get()), new ItemStack(EBBlocks.LIGHT_GRAY_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.GRAY_WOOL), new ItemStack(EBBlocks.GRAY_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_WOOL_STAIRS.get()), new ItemStack(EBBlocks.GRAY_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.BLACK_WOOL), new ItemStack(EBBlocks.BLACK_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_WOOL_STAIRS.get()), new ItemStack(EBBlocks.BLACK_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.BROWN_WOOL), new ItemStack(EBBlocks.BROWN_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_WOOL_STAIRS.get()), new ItemStack(EBBlocks.BROWN_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.RED_WOOL), new ItemStack(EBBlocks.RED_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_WOOL_STAIRS.get()), new ItemStack(EBBlocks.RED_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.ORANGE_WOOL), new ItemStack(EBBlocks.ORANGE_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_WOOL_STAIRS.get()), new ItemStack(EBBlocks.ORANGE_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.YELLOW_WOOL), new ItemStack(EBBlocks.YELLOW_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_WOOL_STAIRS.get()), new ItemStack(EBBlocks.YELLOW_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.LIME_WOOL), new ItemStack(EBBlocks.LIME_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_WOOL_STAIRS.get()), new ItemStack(EBBlocks.LIME_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.GREEN_WOOL), new ItemStack(EBBlocks.GREEN_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_WOOL_STAIRS.get()), new ItemStack(EBBlocks.GREEN_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.CYAN_WOOL), new ItemStack(EBBlocks.CYAN_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_WOOL_STAIRS.get()), new ItemStack(EBBlocks.CYAN_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.LIGHT_BLUE_WOOL), new ItemStack(EBBlocks.LIGHT_BLUE_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_WOOL_STAIRS.get()), new ItemStack(EBBlocks.LIGHT_BLUE_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.BLUE_WOOL), new ItemStack(EBBlocks.BLUE_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_WOOL_STAIRS.get()), new ItemStack(EBBlocks.BLUE_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.PURPLE_WOOL), new ItemStack(EBBlocks.PURPLE_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_WOOL_STAIRS.get()), new ItemStack(EBBlocks.PURPLE_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.MAGENTA_WOOL), new ItemStack(EBBlocks.MAGENTA_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_WOOL_STAIRS.get()), new ItemStack(EBBlocks.MAGENTA_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.PINK_WOOL), new ItemStack(EBBlocks.PINK_WOOL_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_WOOL_STAIRS.get()), new ItemStack(EBBlocks.PINK_WOOL_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_WOOL_SLAB.get()), new ItemStack(EBBlocks.KNITTED_WHITE_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_WHITE_WOOL.get()), new ItemStack(EBBlocks.KNITTED_WHITE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_WHITE_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_WHITE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_WHITE_SLAB.get()), new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()), new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_SLAB.get()), new ItemStack(EBBlocks.KNITTED_GRAY_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_GRAY_WOOL.get()), new ItemStack(EBBlocks.KNITTED_GRAY_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_GRAY_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_GRAY_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_GRAY_SLAB.get()), new ItemStack(EBBlocks.KNITTED_BLACK_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BLACK_WOOL.get()), new ItemStack(EBBlocks.KNITTED_BLACK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BLACK_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_BLACK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BLACK_SLAB.get()), new ItemStack(EBBlocks.KNITTED_BROWN_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BROWN_WOOL.get()), new ItemStack(EBBlocks.KNITTED_BROWN_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BROWN_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_BROWN_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BROWN_SLAB.get()), new ItemStack(EBBlocks.KNITTED_RED_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_RED_WOOL.get()), new ItemStack(EBBlocks.KNITTED_RED_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_RED_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_RED_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_RED_SLAB.get()), new ItemStack(EBBlocks.KNITTED_ORANGE_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_ORANGE_WOOL.get()), new ItemStack(EBBlocks.KNITTED_ORANGE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_ORANGE_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_ORANGE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_ORANGE_SLAB.get()), new ItemStack(EBBlocks.KNITTED_YELLOW_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_YELLOW_WOOL.get()), new ItemStack(EBBlocks.KNITTED_YELLOW_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_YELLOW_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_YELLOW_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_YELLOW_SLAB.get()), new ItemStack(EBBlocks.KNITTED_LIME_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIME_WOOL.get()), new ItemStack(EBBlocks.KNITTED_LIME_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIME_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_LIME_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIME_SLAB.get()), new ItemStack(EBBlocks.KNITTED_GREEN_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_GREEN_WOOL.get()), new ItemStack(EBBlocks.KNITTED_GREEN_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_GREEN_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_GREEN_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_GREEN_SLAB.get()), new ItemStack(EBBlocks.KNITTED_CYAN_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_CYAN_WOOL.get()), new ItemStack(EBBlocks.KNITTED_CYAN_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_CYAN_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_CYAN_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_CYAN_SLAB.get()), new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()), new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_SLAB.get()), new ItemStack(EBBlocks.KNITTED_BLUE_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BLUE_WOOL.get()), new ItemStack(EBBlocks.KNITTED_BLUE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BLUE_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_BLUE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_BLUE_SLAB.get()), new ItemStack(EBBlocks.KNITTED_PURPLE_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_PURPLE_WOOL.get()), new ItemStack(EBBlocks.KNITTED_PURPLE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_PURPLE_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_PURPLE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_PURPLE_SLAB.get()), new ItemStack(EBBlocks.KNITTED_MAGENTA_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_MAGENTA_WOOL.get()), new ItemStack(EBBlocks.KNITTED_MAGENTA_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_MAGENTA_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_MAGENTA_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_MAGENTA_SLAB.get()), new ItemStack(EBBlocks.KNITTED_PINK_WOOL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_PINK_WOOL.get()), new ItemStack(EBBlocks.KNITTED_PINK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KNITTED_PINK_STAIRS.get()), new ItemStack(EBBlocks.KNITTED_PINK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.WHITE_CARPET), new ItemStack(EBBlocks.KNITTED_WHITE_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.LIGHT_GRAY_CARPET), new ItemStack(EBBlocks.KNITTED_LIGHT_GRAY_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.GRAY_CARPET), new ItemStack(EBBlocks.KNITTED_GRAY_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BLACK_CARPET), new ItemStack(EBBlocks.KNITTED_BLACK_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BROWN_CARPET), new ItemStack(EBBlocks.KNITTED_BROWN_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.RED_CARPET), new ItemStack(EBBlocks.KNITTED_RED_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.ORANGE_CARPET), new ItemStack(EBBlocks.KNITTED_ORANGE_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.YELLOW_CARPET), new ItemStack(EBBlocks.KNITTED_YELLOW_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.LIME_CARPET), new ItemStack(EBBlocks.KNITTED_LIME_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.GREEN_CARPET), new ItemStack(EBBlocks.KNITTED_GREEN_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.CYAN_CARPET), new ItemStack(EBBlocks.KNITTED_CYAN_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.LIGHT_BLUE_CARPET), new ItemStack(EBBlocks.KNITTED_LIGHT_BLUE_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BLUE_CARPET), new ItemStack(EBBlocks.KNITTED_BLUE_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.PURPLE_CARPET), new ItemStack(EBBlocks.KNITTED_PURPLE_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.MAGENTA_CARPET), new ItemStack(EBBlocks.KNITTED_MAGENTA_CARPET.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.PINK_CARPET), new ItemStack(EBBlocks.KNITTED_PINK_CARPET.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.PINK_TERRACOTTA), new ItemStack(EBBlocks.TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_BRICK_SLAB.get()), new ItemStack(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.RED_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.RED_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.RED_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.LIME_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.PINK_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_TERRACOTTA_BRICK_SLAB.get()), new ItemStack(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_BRICK_SLAB.get()), new ItemStack(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()), new ItemStack(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS.get()), new ItemStack(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_SLAB.get()), new ItemStack(EBBlocks.TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_TILE_SLAB.get()), new ItemStack(EBBlocks.WHITE_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.WHITE_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.WHITE_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.WHITE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.GRAY_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.GRAY_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.GRAY_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.GRAY_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.BLACK_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.BLACK_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.BLACK_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACK_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.BROWN_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.BROWN_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.BROWN_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BROWN_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.RED_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.RED_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.RED_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.ORANGE_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.ORANGE_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.ORANGE_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.YELLOW_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.YELLOW_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.YELLOW_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.LIME_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.LIME_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.LIME_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.LIME_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.GREEN_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.GREEN_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.GREEN_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.GREEN_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.CYAN_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.CYAN_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.CYAN_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.BLUE_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.BLUE_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.BLUE_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.BLUE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.PURPLE_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.PURPLE_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.PURPLE_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PURPLE_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MAGENTA_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.PINK_TERRACOTTA_TILES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_TERRACOTTA_TILES.get()), new ItemStack(EBBlocks.PINK_TERRACOTTA_TILE_STAIRS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PINK_TERRACOTTA_TILE_STAIRS.get()), new ItemStack(EBBlocks.PINK_TERRACOTTA_TILE_SLAB.get()), parentAndSearch);
        }

        if (event.getTabKey() == (CreativeModeTabs.NATURAL_BLOCKS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putAfter(new ItemStack(Blocks.GRASS_BLOCK), new ItemStack(EBBlocks.GRASS_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.DIRT), new ItemStack(EBBlocks.DIRT_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.COARSE_DIRT), new ItemStack(EBBlocks.COARSE_DIRT_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.ROOTED_DIRT), new ItemStack(EBBlocks.ROOTED_DIRT_SLAB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.TUFF), new ItemStack(EBBlocks.MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.MAGMA_BLOCK), new ItemStack(EBBlocks.SOUL_MAGMA_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.SOUL_SAND), new ItemStack(EBBlocks.SOUL_SANDSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BLACKSTONE), new ItemStack(EBBlocks.BRIMSTONE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.DEEPSLATE_GOLD_ORE), new ItemStack(EBBlocks.QUARTZ_ORE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_ORE.get()), new ItemStack(EBBlocks.DEEPSLATE_QUARTZ_ORE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.AMETHYST_CLUSTER), new ItemStack(EBBlocks.FIERY_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_BLOCK.get()), new ItemStack(EBBlocks.BUDDING_FIERY_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BUDDING_FIERY_BLOCK.get()), new ItemStack(EBBlocks.SMALL_FIERY_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMALL_FIERY_BUD.get()), new ItemStack(EBBlocks.MEDIUM_FIERY_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MEDIUM_FIERY_BUD.get()), new ItemStack(EBBlocks.LARGE_FIERY_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LARGE_FIERY_BUD.get()), new ItemStack(EBBlocks.FIERY_CLUSTER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_CLUSTER.get()), new ItemStack(EBBlocks.KYANITE_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_BLOCK.get()), new ItemStack(EBBlocks.BUDDING_KYANITE_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BUDDING_KYANITE_BLOCK.get()), new ItemStack(EBBlocks.SMALL_KYANITE_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMALL_KYANITE_BUD.get()), new ItemStack(EBBlocks.MEDIUM_KYANITE_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MEDIUM_KYANITE_BUD.get()), new ItemStack(EBBlocks.LARGE_KYANITE_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LARGE_KYANITE_BUD.get()), new ItemStack(EBBlocks.KYANITE_CLUSTER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_CLUSTER.get()), new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()), new ItemStack(EBBlocks.MIRALEN_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_BLOCK.get()), new ItemStack(EBBlocks.BUDDING_MIRALEN_BLOCK.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BUDDING_MIRALEN_BLOCK.get()), new ItemStack(EBBlocks.SMALL_MIRALEN_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMALL_MIRALEN_BUD.get()), new ItemStack(EBBlocks.MEDIUM_MIRALEN_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MEDIUM_MIRALEN_BUD.get()), new ItemStack(EBBlocks.LARGE_MIRALEN_BUD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.LARGE_MIRALEN_BUD.get()), new ItemStack(EBBlocks.MIRALEN_CLUSTER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.CHERRY_LOG), new ItemStack(EBBlocks.MAPLE_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_LOG.get()), new ItemStack(EBBlocks.WILLOW_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_LOG.get()), new ItemStack(EBBlocks.ANCIENT_LOG.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BIRCH_LEAVES), new ItemStack(EBBlocks.GOLDEN_BIRCH_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.CHERRY_LEAVES), new ItemStack(EBBlocks.RED_MAPLE_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_MAPLE_LEAVES.get()), new ItemStack(EBBlocks.ORANGE_MAPLE_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_MAPLE_LEAVES.get()), new ItemStack(EBBlocks.YELLOW_MAPLE_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_MAPLE_LEAVES.get()), new ItemStack(EBBlocks.WILLOW_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_LEAVES.get()), new ItemStack(EBBlocks.ANCIENT_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_LEAVES.get()), new ItemStack(EBBlocks.UNLIT_ANCIENT_LEAVES.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.BIRCH_SAPLING), new ItemStack(EBBlocks.GOLDEN_BIRCH_SAPLING.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.CHERRY_SAPLING), new ItemStack(EBBlocks.RED_MAPLE_SAPLING.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_MAPLE_SAPLING.get()), new ItemStack(EBBlocks.ORANGE_MAPLE_SAPLING.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_MAPLE_SAPLING.get()), new ItemStack(EBBlocks.YELLOW_MAPLE_SAPLING.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_MAPLE_SAPLING.get()), new ItemStack(EBBlocks.ACORN.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACORN.get()), new ItemStack(EBBlocks.WILLOW_SAPLING.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_SAPLING.get()), new ItemStack(EBBlocks.ANCIENT_SAPLING.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.DANDELION), new ItemStack(EBBlocks.ROSE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ROSE.get()), new ItemStack(EBBlocks.CYAN_ROSE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CYAN_ROSE.get()), new ItemStack(EBBlocks.WHITE_ROSE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.LILY_OF_THE_VALLEY), new ItemStack(EBBlocks.MARIGOLD.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.PINK_PETALS), new ItemStack(EBBlocks.ROSE_BUNDLE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.VINE), new ItemStack(EBBlocks.ANCIENT_VINE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.GLOW_LICHEN), new ItemStack(EBBlocks.RED_MAPLE_LEAVES_PILE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_MAPLE_LEAVES_PILE.get()), new ItemStack(EBBlocks.ORANGE_MAPLE_LEAVES_PILE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ORANGE_MAPLE_LEAVES_PILE.get()), new ItemStack(EBBlocks.YELLOW_MAPLE_LEAVES_PILE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.YELLOW_MAPLE_LEAVES_PILE.get()), new ItemStack(EBItems.ALGAE.get()), parentAndSearch);
        }

        if (event.getTabKey() == (CreativeModeTabs.FUNCTIONAL_BLOCKS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putBefore(new ItemStack(Blocks.SEA_LANTERN), new ItemStack(EBBlocks.STONE_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.STONE_LAMP.get()), new ItemStack(EBBlocks.DEEPSLATE_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DEEPSLATE_LAMP.get()), new ItemStack(EBBlocks.BLACKSTONE_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_LAMP.get()), new ItemStack(EBBlocks.BLACKSTONE_WINDOW.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BLACKSTONE_WINDOW.get()), new ItemStack(EBBlocks.BRIMSTONE_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BRIMSTONE_LAMP.get()), new ItemStack(EBBlocks.BRIMSTONE_WINDOW.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BRIMSTONE_WINDOW.get()), new ItemStack(EBBlocks.AMETHYST_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_LAMP.get()), new ItemStack(EBBlocks.FIERY_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_LAMP.get()), new ItemStack(EBBlocks.KYANITE_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.SEA_LANTERN), new ItemStack(EBBlocks.MIRALEN_LAMP.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_LAMP.get()), new ItemStack(EBBlocks.COPPER_BULB.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.COPPER_BULB.get()), new ItemStack(EBBlocks.EXPOSED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.EXPOSED_COPPER_BULB.get()), new ItemStack(EBBlocks.WEATHERED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WEATHERED_COPPER_BULB.get()), new ItemStack(EBBlocks.OXIDIZED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.OXIDIZED_COPPER_BULB.get()), new ItemStack(EBBlocks.WAXED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_COPPER_BULB.get()), new ItemStack(EBBlocks.WAXED_EXPOSED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_EXPOSED_COPPER_BULB.get()), new ItemStack(EBBlocks.WAXED_WEATHERED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WAXED_WEATHERED_COPPER_BULB.get()), new ItemStack(EBBlocks.WAXED_OXIDIZED_COPPER_BULB.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Blocks.MAGMA_BLOCK), new ItemStack(EBBlocks.SOUL_MAGMA_BLOCK.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.CRAFTING_TABLE), new ItemStack(EBBlocks.SPRUCE_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SPRUCE_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.BIRCH_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BIRCH_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.JUNGLE_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.JUNGLE_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.ACACIA_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACACIA_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.DARK_OAK_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DARK_OAK_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.MANGROVE_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MANGROVE_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.CHERRY_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHERRY_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.BAMBOO_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BAMBOO_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.MAPLE_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.WILLOW_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.ANCIENT_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.CRIMSON_CRAFTING_TABLE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_CRAFTING_TABLE.get()), new ItemStack(EBBlocks.WARPED_CRAFTING_TABLE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.DECORATED_POT), new ItemStack(EBBlocks.TERRACOTTA_POT.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TERRACOTTA_POT.get()), new ItemStack(EBBlocks.MARBLE_POT.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_POT.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_POT.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_POT.get()), new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SMOOTH_STONE_BRICK_PEDESTAL.get()), new ItemStack(EBBlocks.TUFF_BRICK_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.TUFF_BRICK_PEDESTAL.get()), new ItemStack(EBBlocks.MARBLE_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARBLE_PEDESTAL.get()), new ItemStack(EBBlocks.MARQUINA_MARBLE_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MARQUINA_MARBLE_PEDESTAL.get()), new ItemStack(EBBlocks.SANDSTONE_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SANDSTONE_PEDESTAL.get()), new ItemStack(EBBlocks.RED_SANDSTONE_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.RED_SANDSTONE_PEDESTAL.get()), new ItemStack(EBBlocks.SOUL_SANDSTONE_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SOUL_SANDSTONE_PEDESTAL.get()), new ItemStack(EBBlocks.POLISHED_BRIMSTONE_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.POLISHED_BRIMSTONE_PEDESTAL.get()), new ItemStack(EBBlocks.QUARTZ_PEDESTAL.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.QUARTZ_PEDESTAL.get()), new ItemStack(EBBlocks.PURPUR_PEDESTAL.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.LADDER), new ItemStack(EBBlocks.SPRUCE_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SPRUCE_LADDER.get()), new ItemStack(EBBlocks.BIRCH_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BIRCH_LADDER.get()), new ItemStack(EBBlocks.JUNGLE_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.JUNGLE_LADDER.get()), new ItemStack(EBBlocks.ACACIA_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACACIA_LADDER.get()), new ItemStack(EBBlocks.DARK_OAK_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DARK_OAK_LADDER.get()), new ItemStack(EBBlocks.MANGROVE_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MANGROVE_LADDER.get()), new ItemStack(EBBlocks.CHERRY_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHERRY_LADDER.get()), new ItemStack(EBBlocks.BAMBOO_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BAMBOO_LADDER.get()), new ItemStack(EBBlocks.MAPLE_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_LADDER.get()), new ItemStack(EBBlocks.WILLOW_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_LADDER.get()), new ItemStack(EBBlocks.ANCIENT_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_LADDER.get()), new ItemStack(EBBlocks.CRIMSON_LADDER.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_LADDER.get()), new ItemStack(EBBlocks.WARPED_LADDER.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.BOOKSHELF), new ItemStack(EBBlocks.SPRUCE_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SPRUCE_BOOKSHELF.get()), new ItemStack(EBBlocks.BIRCH_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BIRCH_BOOKSHELF.get()), new ItemStack(EBBlocks.JUNGLE_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.JUNGLE_BOOKSHELF.get()), new ItemStack(EBBlocks.ACACIA_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACACIA_BOOKSHELF.get()), new ItemStack(EBBlocks.DARK_OAK_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DARK_OAK_BOOKSHELF.get()), new ItemStack(EBBlocks.MANGROVE_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MANGROVE_BOOKSHELF.get()), new ItemStack(EBBlocks.CHERRY_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHERRY_BOOKSHELF.get()), new ItemStack(EBBlocks.BAMBOO_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BAMBOO_BOOKSHELF.get()), new ItemStack(EBBlocks.MAPLE_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_BOOKSHELF.get()), new ItemStack(EBBlocks.WILLOW_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_BOOKSHELF.get()), new ItemStack(EBBlocks.ANCIENT_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_BOOKSHELF.get()), new ItemStack(EBBlocks.CRIMSON_BOOKSHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_BOOKSHELF.get()), new ItemStack(EBBlocks.WARPED_BOOKSHELF.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.WARPED_BOOKSHELF.get()), new ItemStack(EBBlocks.DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.SPRUCE_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.SPRUCE_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.BIRCH_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BIRCH_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.JUNGLE_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.JUNGLE_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.ACACIA_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ACACIA_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.DARK_OAK_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.DARK_OAK_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.MANGROVE_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MANGROVE_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.CHERRY_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CHERRY_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.BAMBOO_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.BAMBOO_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.MAPLE_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.MAPLE_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.WILLOW_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.WILLOW_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.ANCIENT_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.ANCIENT_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.CRIMSON_DECORATIVE_SHELF.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.CRIMSON_DECORATIVE_SHELF.get()), new ItemStack(EBBlocks.WARPED_DECORATIVE_SHELF.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Blocks.TINTED_GLASS), new ItemStack(EBBlocks.AMETHYST_GLASS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_GLASS.get()), new ItemStack(EBBlocks.FIERY_GLASS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_GLASS.get()), new ItemStack(EBBlocks.KYANITE_GLASS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_GLASS.get()), new ItemStack(EBBlocks.PRISMARINE_GLASS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_GLASS.get()), new ItemStack(EBBlocks.MIRALEN_GLASS.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(EBBlocks.MIRALEN_GLASS.get()), new ItemStack(EBBlocks.AMETHYST_GLASS_PANE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.AMETHYST_GLASS_PANE.get()), new ItemStack(EBBlocks.FIERY_GLASS_PANE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.FIERY_GLASS_PANE.get()), new ItemStack(EBBlocks.KYANITE_GLASS_PANE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.KYANITE_GLASS_PANE.get()), new ItemStack(EBBlocks.PRISMARINE_GLASS_PANE.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBBlocks.PRISMARINE_GLASS_PANE.get()), new ItemStack(EBBlocks.MIRALEN_GLASS_PANE.get()), parentAndSearch);

            event.getEntries().putAfter(new ItemStack(Items.BAMBOO_HANGING_SIGN), new ItemStack(EBItems.MAPLE_SIGN.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.MAPLE_SIGN.get()), new ItemStack(EBItems.MAPLE_HANGING_SIGN.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.MAPLE_HANGING_SIGN.get()), new ItemStack(EBItems.WILLOW_SIGN.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.WILLOW_SIGN.get()), new ItemStack(EBItems.WILLOW_HANGING_SIGN.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.WILLOW_HANGING_SIGN.get()), new ItemStack(EBItems.ANCIENT_SIGN.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.ANCIENT_SIGN.get()), new ItemStack(EBItems.ANCIENT_HANGING_SIGN.get()), parentAndSearch);
        }

        if (event.getTabKey() == (CreativeModeTabs.REDSTONE_BLOCKS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putBefore(new ItemStack(Blocks.CHISELED_BOOKSHELF), new ItemStack(EBBlocks.DECORATIVE_SHELF.get()), parentAndSearch);
        }

        if (event.getTabKey() == (CreativeModeTabs.FOOD_AND_DRINKS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putAfter(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), new ItemStack(EBItems.ANCIENT_FRUIT.get()), parentAndSearch);
        }

        if (event.getTabKey() == (CreativeModeTabs.INGREDIENTS) && EBConfig.ENABLE_EB_CREATIVE_TAB.get()) {
            event.getEntries().putAfter(new ItemStack(Items.AMETHYST_SHARD), new ItemStack(EBItems.FIERY_SHARDS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.FIERY_SHARDS.get()), new ItemStack(EBItems.KYANITE_SHARDS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(EBItems.KYANITE_SHARDS.get()), new ItemStack(EBItems.MIRALEN_SHARDS.get()), parentAndSearch);
            event.getEntries().putAfter(new ItemStack(Items.GLOBE_BANNER_PATTERN), new ItemStack(EBItems.EXCESSIVE_BANNER_PATTERN.get()), parentAndSearch);
        }

        if (event.getTab() == EBItemGroups.EXCESSIVE_BUILDING.get() && EBConfig.ENABLE_CUSTOM_TAB.get()) {
            event.accept(EBBlocks.HOLLOW_OAK_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_OAK_LOG);
            event.accept(EBBlocks.CHISELED_OAK);
            event.accept(EBBlocks.OAK_MOSAIC);
            event.accept(EBBlocks.OAK_MOSAIC_STAIRS);
            event.accept(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.OAK_MOSAIC_SLAB);
            event.accept(EBBlocks.HOLLOW_SPRUCE_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_SPRUCE_LOG);
            event.accept(EBBlocks.CHISELED_SPRUCE);
            event.accept(EBBlocks.SPRUCE_MOSAIC);
            event.accept(EBBlocks.SPRUCE_MOSAIC_STAIRS);
            event.accept(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.SPRUCE_MOSAIC_SLAB);
            event.accept(EBBlocks.SPRUCE_LADDER);
            event.accept(EBBlocks.HOLLOW_BIRCH_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_BIRCH_LOG);
            event.accept(EBBlocks.CHISELED_BIRCH);
            event.accept(EBBlocks.BIRCH_MOSAIC);
            event.accept(EBBlocks.BIRCH_MOSAIC_STAIRS);
            event.accept(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.BIRCH_MOSAIC_SLAB);
            event.accept(EBBlocks.BIRCH_LADDER);
            event.accept(EBBlocks.HOLLOW_JUNGLE_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_JUNGLE_LOG);
            event.accept(EBBlocks.CHISELED_JUNGLE);
            event.accept(EBBlocks.JUNGLE_MOSAIC);
            event.accept(EBBlocks.JUNGLE_MOSAIC_STAIRS);
            event.accept(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.JUNGLE_MOSAIC_SLAB);
            event.accept(EBBlocks.JUNGLE_LADDER);
            event.accept(EBBlocks.HOLLOW_ACACIA_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_ACACIA_LOG);
            event.accept(EBBlocks.CHISELED_ACACIA);
            event.accept(EBBlocks.ACACIA_MOSAIC);
            event.accept(EBBlocks.ACACIA_MOSAIC_STAIRS);
            event.accept(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.ACACIA_MOSAIC_SLAB);
            event.accept(EBBlocks.ACACIA_LADDER);
            event.accept(EBBlocks.HOLLOW_DARK_OAK_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_DARK_OAK_LOG);
            event.accept(EBBlocks.CHISELED_DARK_OAK);
            event.accept(EBBlocks.DARK_OAK_MOSAIC);
            event.accept(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
            event.accept(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.DARK_OAK_MOSAIC_SLAB);
            event.accept(EBBlocks.DARK_OAK_LADDER);
            event.accept(EBBlocks.HOLLOW_MANGROVE_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_MANGROVE_LOG);
            event.accept(EBBlocks.CHISELED_MANGROVE);
            event.accept(EBBlocks.MANGROVE_MOSAIC);
            event.accept(EBBlocks.MANGROVE_MOSAIC_STAIRS);
            event.accept(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.MANGROVE_MOSAIC_SLAB);
            event.accept(EBBlocks.MANGROVE_LADDER);
            event.accept(EBBlocks.HOLLOW_CHERRY_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_CHERRY_LOG);
            event.accept(EBBlocks.CHISELED_CHERRY);
            event.accept(EBBlocks.CHERRY_MOSAIC);
            event.accept(EBBlocks.CHERRY_MOSAIC_STAIRS);
            event.accept(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.CHERRY_MOSAIC_SLAB);
            event.accept(EBBlocks.CHERRY_LADDER);
            event.accept(EBBlocks.MAPLE_LOG);
            event.accept(EBBlocks.HOLLOW_MAPLE_LOG);
            event.accept(EBBlocks.MAPLE_WOOD);
            event.accept(EBBlocks.STRIPPED_MAPLE_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_MAPLE_LOG);
            event.accept(EBBlocks.STRIPPED_MAPLE_WOOD);
            event.accept(EBBlocks.MAPLE_PLANKS);
            event.accept(EBBlocks.MAPLE_STAIRS);
            event.accept(EBBlocks.MAPLE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MAPLE_SLAB);
            event.accept(EBBlocks.CHISELED_MAPLE);
            event.accept(EBBlocks.MAPLE_MOSAIC);
            event.accept(EBBlocks.MAPLE_MOSAIC_STAIRS);
            event.accept(EBBlocks.MAPLE_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.MAPLE_MOSAIC_SLAB);
            event.accept(EBBlocks.MAPLE_FENCE);
            event.accept(EBBlocks.MAPLE_FENCE_GATE);
            event.accept(EBBlocks.MAPLE_DOOR);
            event.accept(EBBlocks.MAPLE_TRAPDOOR);
            event.accept(EBBlocks.MAPLE_LADDER);
            event.accept(EBBlocks.MAPLE_PRESSURE_PLATE);
            event.accept(EBBlocks.MAPLE_BUTTON);
            event.accept(EBBlocks.MAPLE_SIGN);
            event.accept(EBBlocks.MAPLE_HANGING_SIGN);
            event.accept(EBBlocks.WILLOW_LOG);
            event.accept(EBBlocks.HOLLOW_WILLOW_LOG);
            event.accept(EBBlocks.WILLOW_WOOD);
            event.accept(EBBlocks.STRIPPED_WILLOW_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_WILLOW_LOG);
            event.accept(EBBlocks.STRIPPED_WILLOW_WOOD);
            event.accept(EBBlocks.WILLOW_PLANKS);
            event.accept(EBBlocks.WILLOW_STAIRS);
            event.accept(EBBlocks.WILLOW_VERTICAL_STAIRS);
            event.accept(EBBlocks.WILLOW_SLAB);
            event.accept(EBBlocks.CHISELED_WILLOW);
            event.accept(EBBlocks.WILLOW_MOSAIC);
            event.accept(EBBlocks.WILLOW_MOSAIC_STAIRS);
            event.accept(EBBlocks.WILLOW_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.WILLOW_MOSAIC_SLAB);
            event.accept(EBBlocks.WILLOW_FENCE);
            event.accept(EBBlocks.WILLOW_FENCE_GATE);
            event.accept(EBBlocks.WILLOW_DOOR);
            event.accept(EBBlocks.WILLOW_TRAPDOOR);
            event.accept(EBBlocks.WILLOW_LADDER);
            event.accept(EBBlocks.WILLOW_PRESSURE_PLATE);
            event.accept(EBBlocks.WILLOW_BUTTON);
            event.accept(EBBlocks.WILLOW_SIGN);
            event.accept(EBBlocks.WILLOW_HANGING_SIGN);
            event.accept(EBBlocks.ANCIENT_LOG);
            event.accept(EBBlocks.HOLLOW_ANCIENT_LOG);
            event.accept(EBBlocks.ANCIENT_WOOD);
            event.accept(EBBlocks.STRIPPED_ANCIENT_LOG);
            event.accept(EBBlocks.HOLLOW_STRIPPED_ANCIENT_LOG);
            event.accept(EBBlocks.STRIPPED_ANCIENT_WOOD);
            event.accept(EBBlocks.ANCIENT_PLANKS);
            event.accept(EBBlocks.ANCIENT_STAIRS);
            event.accept(EBBlocks.ANCIENT_VERTICAL_STAIRS);
            event.accept(EBBlocks.ANCIENT_SLAB);
            event.accept(EBBlocks.CHISELED_ANCIENT);
            event.accept(EBBlocks.ANCIENT_MOSAIC);
            event.accept(EBBlocks.ANCIENT_MOSAIC_STAIRS);
            event.accept(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.ANCIENT_MOSAIC_SLAB);
            event.accept(EBBlocks.ANCIENT_FENCE);
            event.accept(EBBlocks.ANCIENT_FENCE_GATE);
            event.accept(EBBlocks.ANCIENT_DOOR);
            event.accept(EBBlocks.ANCIENT_TRAPDOOR);
            event.accept(EBBlocks.ANCIENT_LADDER);
            event.accept(EBBlocks.ANCIENT_PRESSURE_PLATE);
            event.accept(EBBlocks.ANCIENT_BUTTON);
            event.accept(EBBlocks.ANCIENT_SIGN);
            event.accept(EBBlocks.ANCIENT_HANGING_SIGN);
            event.accept(EBBlocks.CHISELED_BAMBOO);
            event.accept(EBBlocks.BAMBOO_LADDER);
            event.accept(EBBlocks.HOLLOW_CRIMSON_STEM);
            event.accept(EBBlocks.HOLLOW_STRIPPED_CRIMSON_STEM);
            event.accept(EBBlocks.CHISELED_CRIMSON);
            event.accept(EBBlocks.CRIMSON_MOSAIC);
            event.accept(EBBlocks.CRIMSON_MOSAIC_STAIRS);
            event.accept(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.CRIMSON_MOSAIC_SLAB);
            event.accept(EBBlocks.CRIMSON_LADDER);
            event.accept(EBBlocks.HOLLOW_WARPED_STEM);
            event.accept(EBBlocks.HOLLOW_STRIPPED_WARPED_STEM);
            event.accept(EBBlocks.CHISELED_WARPED);
            event.accept(EBBlocks.WARPED_MOSAIC);
            event.accept(EBBlocks.WARPED_MOSAIC_STAIRS);
            event.accept(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.WARPED_MOSAIC_SLAB);
            event.accept(EBBlocks.WARPED_LADDER);
            event.accept(EBBlocks.POLISHED_STONE);
            event.accept(EBBlocks.POLISHED_STONE_STAIRS);
            event.accept(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_STONE_SLAB);
            event.accept(EBBlocks.POLISHED_STONE_WALL);
            event.accept(EBBlocks.POLISHED_STONE_BRICKS);
            event.accept(EBBlocks.CRACKED_POLISHED_STONE_BRICKS);
            event.accept(EBBlocks.POLISHED_STONE_BRICK_STAIRS);
            event.accept(EBBlocks.POLISHED_STONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_STONE_BRICK_SLAB);
            event.accept(EBBlocks.POLISHED_STONE_BRICK_WALL);
            event.accept(EBBlocks.MOSSY_POLISHED_STONE_BRICKS);
            event.accept(EBBlocks.MOSSY_POLISHED_STONE_BRICK_STAIRS);
            event.accept(EBBlocks.MOSSY_POLISHED_STONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MOSSY_POLISHED_STONE_BRICK_SLAB);
            event.accept(EBBlocks.MOSSY_POLISHED_STONE_BRICK_WALL);
            event.accept(EBBlocks.COBBLESTONE_BRICKS);
            event.accept(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
            event.accept(EBBlocks.COBBLESTONE_BRICK_STAIRS);
            event.accept(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLESTONE_BRICK_SLAB);
            event.accept(EBBlocks.COBBLESTONE_BRICK_WALL);
            event.accept(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
            event.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
            event.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
            event.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);
            event.accept(EBBlocks.SMOOTH_STONE_BRICKS);
            event.accept(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS);
            event.accept(EBBlocks.SMOOTH_STONE_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_STONE_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_STONE_BRICK_WALL);
            event.accept(EBBlocks.SMOOTH_STONE_TILES);
            event.accept(EBBlocks.SMOOTH_STONE_TILE_STAIRS);
            event.accept(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_STONE_TILE_SLAB);
            event.accept(EBBlocks.SMOOTH_STONE_TILE_WALL);
            event.accept(EBBlocks.SMOOTH_STONE_BRICK_PILLAR);
            event.accept(EBBlocks.COBBLED_GRANITE);
            event.accept(EBBlocks.COBBLED_GRANITE_STAIRS);
            event.accept(EBBlocks.COBBLED_GRANITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLED_GRANITE_SLAB);
            event.accept(EBBlocks.COBBLED_GRANITE_WALL);
            event.accept(EBBlocks.POLISHED_GRANITE_BRICKS);
            event.accept(EBBlocks.POLISHED_GRANITE_BRICK_STAIRS);
            event.accept(EBBlocks.POLISHED_GRANITE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_GRANITE_BRICK_SLAB);
            event.accept(EBBlocks.POLISHED_GRANITE_BRICK_WALL);
            event.accept(EBBlocks.COBBLED_DIORITE);
            event.accept(EBBlocks.COBBLED_DIORITE_STAIRS);
            event.accept(EBBlocks.COBBLED_DIORITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLED_DIORITE_SLAB);
            event.accept(EBBlocks.COBBLED_DIORITE_WALL);
            event.accept(EBBlocks.POLISHED_DIORITE_BRICKS);
            event.accept(EBBlocks.POLISHED_DIORITE_BRICK_STAIRS);
            event.accept(EBBlocks.POLISHED_DIORITE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_DIORITE_BRICK_SLAB);
            event.accept(EBBlocks.POLISHED_DIORITE_BRICK_WALL);
            event.accept(EBBlocks.COBBLED_ANDESITE);
            event.accept(EBBlocks.COBBLED_ANDESITE_STAIRS);
            event.accept(EBBlocks.COBBLED_ANDESITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLED_ANDESITE_SLAB);
            event.accept(EBBlocks.COBBLED_ANDESITE_WALL);
            event.accept(EBBlocks.POLISHED_ANDESITE_BRICKS);
            event.accept(EBBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
            event.accept(EBBlocks.POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_ANDESITE_BRICK_SLAB);
            event.accept(EBBlocks.POLISHED_ANDESITE_BRICK_WALL);
            event.accept(EBBlocks.POLISHED_CALCITE);
            event.accept(EBBlocks.POLISHED_CALCITE_STAIRS);
            event.accept(EBBlocks.POLISHED_CALCITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_CALCITE_SLAB);
            event.accept(EBBlocks.POLISHED_CALCITE_WALL);
            event.accept(EBBlocks.CALCITE_BRICKS);
            event.accept(EBBlocks.CRACKED_CALCITE_BRICKS);
            event.accept(EBBlocks.CALCITE_BRICK_STAIRS);
            event.accept(EBBlocks.CALCITE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.CALCITE_BRICK_SLAB);
            event.accept(EBBlocks.CALCITE_BRICK_WALL);
            event.accept(EBBlocks.CALCITE_TILES);
            event.accept(EBBlocks.CRACKED_CALCITE_TILES);
            event.accept(EBBlocks.CALCITE_TILE_STAIRS);
            event.accept(EBBlocks.CALCITE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.CALCITE_TILE_SLAB);
            event.accept(EBBlocks.CALCITE_TILE_WALL);
            event.accept(EBBlocks.TUFF_STAIRS);
            event.accept(EBBlocks.TUFF_VERTICAL_STAIRS);
            event.accept(EBBlocks.TUFF_SLAB);
            event.accept(EBBlocks.TUFF_WALL);
            event.accept(EBBlocks.POLISHED_TUFF);
            event.accept(EBBlocks.CHISELED_POLISHED_TUFF);
            event.accept(EBBlocks.POLISHED_TUFF_STAIRS);
            event.accept(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_TUFF_SLAB);
            event.accept(EBBlocks.POLISHED_TUFF_WALL);
            event.accept(EBBlocks.TUFF_BRICKS);
            event.accept(EBBlocks.CHISELED_TUFF_BRICKS);
            event.accept(EBBlocks.TUFF_BRICK_STAIRS);
            event.accept(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.TUFF_BRICK_SLAB);
            event.accept(EBBlocks.TUFF_BRICK_WALL);
            event.accept(EBBlocks.TUFF_TILES);
            event.accept(EBBlocks.TUFF_TILE_STAIRS);
            event.accept(EBBlocks.TUFF_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.TUFF_TILE_SLAB);
            event.accept(EBBlocks.TUFF_TILE_WALL);
            event.accept(EBBlocks.TUFF_BRICK_PILLAR);
            event.accept(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
            event.accept(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
            event.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
            event.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
            event.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);
            event.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS);
            event.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS);
            event.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB);
            event.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_WALL);
            event.accept(EBBlocks.MOSSY_DEEPSLATE_BRICKS);
            event.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
            event.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
            event.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
            event.accept(EBBlocks.MARBLE);
            event.accept(EBBlocks.MARBLE_STAIRS);
            event.accept(EBBlocks.MARBLE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MARBLE_SLAB);
            event.accept(EBBlocks.MARBLE_WALL);
            event.accept(EBBlocks.POLISHED_MARBLE);
            event.accept(EBBlocks.POLISHED_MARBLE_STAIRS);
            event.accept(EBBlocks.POLISHED_MARBLE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_MARBLE_SLAB);
            event.accept(EBBlocks.POLISHED_MARBLE_WALL);
            event.accept(EBBlocks.MARBLE_PILLAR);
            event.accept(EBBlocks.MARBLE_BRICKS);
            event.accept(EBBlocks.MARBLE_BRICK_STAIRS);
            event.accept(EBBlocks.MARBLE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MARBLE_BRICK_SLAB);
            event.accept(EBBlocks.MARBLE_BRICK_WALL);
            event.accept(EBBlocks.MARQUINA_MARBLE);
            event.accept(EBBlocks.MARQUINA_MARBLE_STAIRS);
            event.accept(EBBlocks.MARQUINA_MARBLE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MARQUINA_MARBLE_SLAB);
            event.accept(EBBlocks.MARQUINA_MARBLE_WALL);
            event.accept(EBBlocks.POLISHED_MARQUINA_MARBLE);
            event.accept(EBBlocks.POLISHED_MARQUINA_MARBLE_STAIRS);
            event.accept(EBBlocks.POLISHED_MARQUINA_MARBLE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_MARQUINA_MARBLE_SLAB);
            event.accept(EBBlocks.POLISHED_MARQUINA_MARBLE_WALL);
            event.accept(EBBlocks.MARQUINA_MARBLE_PILLAR);
            event.accept(EBBlocks.MARQUINA_MARBLE_BRICKS);
            event.accept(EBBlocks.MARQUINA_MARBLE_BRICK_STAIRS);
            event.accept(EBBlocks.MARQUINA_MARBLE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MARQUINA_MARBLE_BRICK_SLAB);
            event.accept(EBBlocks.MARQUINA_MARBLE_BRICK_WALL);
            event.accept(EBBlocks.MARBLE_TILES);
            event.accept(EBBlocks.MARBLE_TILE_STAIRS);
            event.accept(EBBlocks.MARBLE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MARBLE_TILE_SLAB);
            event.accept(EBBlocks.MARBLE_TILE_WALL);
            event.accept(EBBlocks.CHISELED_POLISHED_MARBLE);
            event.accept(EBBlocks.CHISELED_POLISHED_MARBLE_SLAB);
            event.accept(EBBlocks.CHISELED_MARBLE_BRICKS);
            event.accept(EBBlocks.CHISELED_MARBLE_BRICK_SLAB);
            event.accept(EBBlocks.CHISELED_MARBLE_TILES);
            event.accept(EBBlocks.CHISELED_MARBLE_TILE_SLAB);
            event.accept(EBBlocks.CRACKED_BRICKS);
            event.accept(EBBlocks.HERRINGBONE_BRICKS);
            event.accept(EBBlocks.BASKETWEAVE_BRICKS);
            event.accept(EBBlocks.BASKETWEAVE_BRICK_STAIRS);
            event.accept(EBBlocks.BASKETWEAVE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.BASKETWEAVE_BRICK_SLAB);
            event.accept(EBBlocks.BASKETWEAVE_BRICK_WALL);
            event.accept(EBBlocks.SMOOTH_BRICKS);
            event.accept(EBBlocks.CRACKED_SMOOTH_BRICKS);
            event.accept(EBBlocks.SMOOTH_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_BRICK_WALL);
            event.accept(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);
            event.accept(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS);
            event.accept(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_WALL);
            event.accept(EBBlocks.MUD_TILES);
            event.accept(EBBlocks.MUD_TILE_STAIRS);
            event.accept(EBBlocks.MUD_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MUD_TILE_SLAB);
            event.accept(EBBlocks.SNOW_BRICKS);
            event.accept(EBBlocks.SNOW_BRICK_STAIRS);
            event.accept(EBBlocks.SNOW_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SNOW_BRICK_SLAB);
            event.accept(EBBlocks.POLISHED_SANDSTONE);
            event.accept(EBBlocks.POLISHED_SANDSTONE_STAIRS);
            event.accept(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_SANDSTONE_SLAB);
            event.accept(EBBlocks.SANDSTONE_BRICKS);
            event.accept(EBBlocks.SANDSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SANDSTONE_BRICK_SLAB);
            event.accept(EBBlocks.SANDSTONE_BRICK_WALL);
            event.accept(EBBlocks.SANDSTONE_TILES);
            event.accept(EBBlocks.SANDSTONE_TILE_STAIRS);
            event.accept(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SANDSTONE_TILE_SLAB);
            event.accept(EBBlocks.SANDSTONE_PILLAR);
            event.accept(EBBlocks.DECORATED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.ENGRAVED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.CHISELED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.POLISHED_RED_SANDSTONE);
            event.accept(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
            event.accept(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_RED_SANDSTONE_SLAB);
            event.accept(EBBlocks.RED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.RED_SANDSTONE_BRICK_SLAB);
            event.accept(EBBlocks.RED_SANDSTONE_BRICK_WALL);
            event.accept(EBBlocks.RED_SANDSTONE_TILES);
            event.accept(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
            event.accept(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.RED_SANDSTONE_TILE_SLAB);
            event.accept(EBBlocks.RED_SANDSTONE_PILLAR);
            event.accept(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS);
            event.accept(EBBlocks.SOUL_SANDSTONE);
            event.accept(EBBlocks.SOUL_SANDSTONE_STAIRS);
            event.accept(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SOUL_SANDSTONE_SLAB);
            event.accept(EBBlocks.SOUL_SANDSTONE_WALL);
            event.accept(EBBlocks.POLISHED_SOUL_SANDSTONE);
            event.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
            event.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB);
            event.accept(EBBlocks.SOUL_SANDSTONE_BRICKS);
            event.accept(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB);
            event.accept(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
            event.accept(EBBlocks.SOUL_SANDSTONE_TILES);
            event.accept(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
            event.accept(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SOUL_SANDSTONE_TILE_SLAB);
            event.accept(EBBlocks.SOUL_SANDSTONE_PILLAR);
            event.accept(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS);
            event.accept(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS);
            event.accept(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS);
            event.accept(EBBlocks.CHISELED_SOUL_SANDSTONE);
            event.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE);
            event.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
            event.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
            event.accept(EBBlocks.CUT_SOUL_SANDSTONE);
            event.accept(EBBlocks.CUT_SOUL_SANDSTONE_SLAB);
            event.accept(EBBlocks.BRIMSTONE);
            event.accept(EBBlocks.BRIMSTONE_STAIRS);
            event.accept(EBBlocks.BRIMSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.BRIMSTONE_SLAB);
            event.accept(EBBlocks.POLISHED_BRIMSTONE);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_PILLAR);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_SLAB);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_WALL);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_BRICKS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_BRICK_SLAB);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_BRICK_WALL);
            event.accept(EBBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_TILES);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_TILE_STAIRS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_TILE_SLAB);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_TILE_WALL);
            event.accept(EBBlocks.NETHER_TILES);
            event.accept(EBBlocks.NETHER_TILE_STAIRS);
            event.accept(EBBlocks.NETHER_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.NETHER_TILE_SLAB);
            event.accept(EBBlocks.NETHER_TILE_WALL);
            event.accept(EBBlocks.RED_NETHER_TILES);
            event.accept(EBBlocks.RED_NETHER_TILE_STAIRS);
            event.accept(EBBlocks.RED_NETHER_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.RED_NETHER_TILE_SLAB);
            event.accept(EBBlocks.RED_NETHER_TILE_WALL);
            event.accept(EBBlocks.BLUE_NETHER_BRICKS);
            event.accept(EBBlocks.BLUE_NETHER_BRICK_STAIRS);
            event.accept(EBBlocks.BLUE_NETHER_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.BLUE_NETHER_BRICK_SLAB);
            event.accept(EBBlocks.BLUE_NETHER_BRICK_WALL);
            event.accept(EBBlocks.BLUE_NETHER_TILES);
            event.accept(EBBlocks.BLUE_NETHER_TILE_STAIRS);
            event.accept(EBBlocks.BLUE_NETHER_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.BLUE_NETHER_TILE_SLAB);
            event.accept(EBBlocks.BLUE_NETHER_TILE_WALL);
            event.accept(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS);
            event.accept(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
            event.accept(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);
            event.accept(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS);
            event.accept(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
            event.accept(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_TILES);
            event.accept(EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_TILE_WALL);
            event.accept(EBBlocks.BLACKSTONE_BRICKS);
            event.accept(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
            event.accept(EBBlocks.BLACKSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.BLACKSTONE_BRICK_SLAB);
            event.accept(EBBlocks.BLACKSTONE_BRICK_WALL);
            event.accept(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICKS);
            event.accept(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB);
            event.accept(EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL);
            event.accept(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICKS);
            event.accept(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS);
            event.accept(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_SLAB);
            event.accept(EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICK_WALL);
            event.accept(EBBlocks.OBSIDIAN_BRICKS);
            event.accept(EBBlocks.CRACKED_OBSIDIAN_BRICKS);
            event.accept(EBBlocks.OBSIDIAN_BRICK_STAIRS);
            event.accept(EBBlocks.OBSIDIAN_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.OBSIDIAN_BRICK_SLAB);
            event.accept(EBBlocks.OBSIDIAN_TILES);
            event.accept(EBBlocks.OBSIDIAN_TILE_STAIRS);
            event.accept(EBBlocks.OBSIDIAN_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.OBSIDIAN_TILE_SLAB);
            event.accept(EBBlocks.ASPHALT);
            event.accept(EBBlocks.ASPHALT_STAIRS);
            event.accept(EBBlocks.ASPHALT_SLAB);
            event.accept(EBBlocks.ASPHALT_VERTICAL_STAIRS);
            event.accept(EBBlocks.SWIFT_ASPHALT);
            event.accept(EBBlocks.SWIFT_ASPHALT_STAIRS);
            event.accept(EBBlocks.SWIFT_ASPHALT_SLAB);
            event.accept(EBBlocks.SWIFT_ASPHALT_VERTICAL_STAIRS);
            event.accept(EBBlocks.IRON_BRICKS);
            event.accept(EBBlocks.IRON_BRICK_STAIRS);
            event.accept(EBBlocks.IRON_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.IRON_BRICK_SLAB);
            event.accept(EBBlocks.IRON_GRATE);
            event.accept(EBBlocks.GOLDEN_BRICKS);
            event.accept(EBBlocks.GOLDEN_BRICK_STAIRS);
            event.accept(EBBlocks.GOLDEN_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.GOLDEN_BRICK_SLAB);
            event.accept(EBBlocks.GOLD_GRATE);
            event.accept(EBBlocks.EMERALD_BRICKS);
            event.accept(EBBlocks.EMERALD_BRICK_STAIRS);
            event.accept(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.EMERALD_BRICK_SLAB);
            event.accept(EBBlocks.LAPIS_LAZULI_BRICKS);
            event.accept(EBBlocks.LAPIS_LAZULI_BRICK_STAIRS);
            event.accept(EBBlocks.LAPIS_LAZULI_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.LAPIS_LAZULI_BRICK_SLAB);
            event.accept(EBBlocks.DIAMOND_BRICKS);
            event.accept(EBBlocks.DIAMOND_BRICK_STAIRS);
            event.accept(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.DIAMOND_BRICK_SLAB);
            event.accept(EBBlocks.NETHERITE_BRICKS);
            event.accept(EBBlocks.NETHERITE_BRICK_STAIRS);
            event.accept(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.NETHERITE_BRICK_SLAB);
            event.accept(EBBlocks.GRASS_SLAB);
            event.accept(EBBlocks.DIRT_SLAB);
            event.accept(EBBlocks.COARSE_DIRT_SLAB);
            event.accept(EBBlocks.ROOTED_DIRT_SLAB);
            event.accept(EBBlocks.ROSE);
            event.accept(EBBlocks.CYAN_ROSE);
            event.accept(EBBlocks.WHITE_ROSE);
            event.accept(EBBlocks.MARIGOLD);
            event.accept(EBBlocks.ROSE_BUNDLE);
            event.accept(EBBlocks.ACORN);
            event.accept(EBBlocks.RED_MAPLE_SAPLING);
            event.accept(EBBlocks.ORANGE_MAPLE_SAPLING);
            event.accept(EBBlocks.YELLOW_MAPLE_SAPLING);
            event.accept(EBBlocks.GOLDEN_BIRCH_SAPLING);
            event.accept(EBBlocks.WILLOW_SAPLING);
            event.accept(EBBlocks.ANCIENT_SAPLING);
            event.accept(EBBlocks.RED_MAPLE_LEAVES);
            event.accept(EBBlocks.ORANGE_MAPLE_LEAVES);
            event.accept(EBBlocks.YELLOW_MAPLE_LEAVES);
            event.accept(EBBlocks.GOLDEN_BIRCH_LEAVES);
            event.accept(EBBlocks.WILLOW_LEAVES);
            event.accept(EBBlocks.ANCIENT_LEAVES);
            event.accept(EBBlocks.UNLIT_ANCIENT_LEAVES);
            event.accept(EBItems.ALGAE);
            event.accept(EBBlocks.ANCIENT_VINE);
            event.accept(EBBlocks.RED_MAPLE_LEAVES_PILE);
            event.accept(EBBlocks.ORANGE_MAPLE_LEAVES_PILE);
            event.accept(EBBlocks.YELLOW_MAPLE_LEAVES_PILE);
            event.accept(EBItems.ANCIENT_FRUIT);
            event.accept(EBBlocks.QUARTZ_ORE);
            event.accept(EBBlocks.DEEPSLATE_QUARTZ_ORE);
            event.accept(EBBlocks.QUARTZ_BRICK_STAIRS);
            event.accept(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.QUARTZ_BRICK_SLAB);
            event.accept(EBBlocks.QUARTZ_TILES);
            event.accept(EBBlocks.QUARTZ_TILE_STAIRS);
            event.accept(EBBlocks.QUARTZ_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.QUARTZ_TILE_SLAB);
            event.accept(EBBlocks.KNITTED_WHITE_WOOL);
            event.accept(EBBlocks.KNITTED_WHITE_STAIRS);
            event.accept(EBBlocks.KNITTED_WHITE_SLAB);
            event.accept(EBBlocks.KNITTED_WHITE_CARPET);
            event.accept(EBBlocks.KNITTED_LIGHT_GRAY_WOOL);
            event.accept(EBBlocks.KNITTED_LIGHT_GRAY_STAIRS);
            event.accept(EBBlocks.KNITTED_LIGHT_GRAY_SLAB);
            event.accept(EBBlocks.KNITTED_LIGHT_GRAY_CARPET);
            event.accept(EBBlocks.KNITTED_GRAY_WOOL);
            event.accept(EBBlocks.KNITTED_GRAY_STAIRS);
            event.accept(EBBlocks.KNITTED_GRAY_SLAB);
            event.accept(EBBlocks.KNITTED_GRAY_CARPET);
            event.accept(EBBlocks.KNITTED_BLACK_WOOL);
            event.accept(EBBlocks.KNITTED_BLACK_STAIRS);
            event.accept(EBBlocks.KNITTED_BLACK_SLAB);
            event.accept(EBBlocks.KNITTED_BLACK_CARPET);
            event.accept(EBBlocks.KNITTED_BROWN_WOOL);
            event.accept(EBBlocks.KNITTED_BROWN_STAIRS);
            event.accept(EBBlocks.KNITTED_BROWN_SLAB);
            event.accept(EBBlocks.KNITTED_BROWN_CARPET);
            event.accept(EBBlocks.KNITTED_RED_WOOL);
            event.accept(EBBlocks.KNITTED_RED_STAIRS);
            event.accept(EBBlocks.KNITTED_RED_SLAB);
            event.accept(EBBlocks.KNITTED_RED_CARPET);
            event.accept(EBBlocks.KNITTED_ORANGE_WOOL);
            event.accept(EBBlocks.KNITTED_ORANGE_STAIRS);
            event.accept(EBBlocks.KNITTED_ORANGE_SLAB);
            event.accept(EBBlocks.KNITTED_ORANGE_CARPET);
            event.accept(EBBlocks.KNITTED_YELLOW_WOOL);
            event.accept(EBBlocks.KNITTED_YELLOW_STAIRS);
            event.accept(EBBlocks.KNITTED_YELLOW_SLAB);
            event.accept(EBBlocks.KNITTED_YELLOW_CARPET);
            event.accept(EBBlocks.KNITTED_LIME_WOOL);
            event.accept(EBBlocks.KNITTED_LIME_STAIRS);
            event.accept(EBBlocks.KNITTED_LIME_SLAB);
            event.accept(EBBlocks.KNITTED_LIME_CARPET);
            event.accept(EBBlocks.KNITTED_GREEN_WOOL);
            event.accept(EBBlocks.KNITTED_GREEN_STAIRS);
            event.accept(EBBlocks.KNITTED_GREEN_SLAB);
            event.accept(EBBlocks.KNITTED_GREEN_CARPET);
            event.accept(EBBlocks.KNITTED_CYAN_WOOL);
            event.accept(EBBlocks.KNITTED_CYAN_STAIRS);
            event.accept(EBBlocks.KNITTED_CYAN_SLAB);
            event.accept(EBBlocks.KNITTED_CYAN_CARPET);
            event.accept(EBBlocks.KNITTED_LIGHT_BLUE_WOOL);
            event.accept(EBBlocks.KNITTED_LIGHT_BLUE_STAIRS);
            event.accept(EBBlocks.KNITTED_LIGHT_BLUE_SLAB);
            event.accept(EBBlocks.KNITTED_LIGHT_BLUE_CARPET);
            event.accept(EBBlocks.KNITTED_BLUE_WOOL);
            event.accept(EBBlocks.KNITTED_BLUE_STAIRS);
            event.accept(EBBlocks.KNITTED_BLUE_SLAB);
            event.accept(EBBlocks.KNITTED_BLUE_CARPET);
            event.accept(EBBlocks.KNITTED_PURPLE_WOOL);
            event.accept(EBBlocks.KNITTED_PURPLE_STAIRS);
            event.accept(EBBlocks.KNITTED_PURPLE_SLAB);
            event.accept(EBBlocks.KNITTED_PURPLE_CARPET);
            event.accept(EBBlocks.KNITTED_MAGENTA_WOOL);
            event.accept(EBBlocks.KNITTED_MAGENTA_STAIRS);
            event.accept(EBBlocks.KNITTED_MAGENTA_SLAB);
            event.accept(EBBlocks.KNITTED_MAGENTA_CARPET);
            event.accept(EBBlocks.KNITTED_PINK_WOOL);
            event.accept(EBBlocks.KNITTED_PINK_STAIRS);
            event.accept(EBBlocks.KNITTED_PINK_SLAB);
            event.accept(EBBlocks.KNITTED_PINK_CARPET);
            event.accept(EBBlocks.WHITE_WOOL_STAIRS);
            event.accept(EBBlocks.WHITE_WOOL_SLAB);
            event.accept(EBBlocks.LIGHT_GRAY_WOOL_STAIRS);
            event.accept(EBBlocks.LIGHT_GRAY_WOOL_SLAB);
            event.accept(EBBlocks.GRAY_WOOL_STAIRS);
            event.accept(EBBlocks.GRAY_WOOL_SLAB);
            event.accept(EBBlocks.BLACK_WOOL_STAIRS);
            event.accept(EBBlocks.BLACK_WOOL_SLAB);
            event.accept(EBBlocks.BROWN_WOOL_STAIRS);
            event.accept(EBBlocks.BROWN_WOOL_SLAB);
            event.accept(EBBlocks.RED_WOOL_STAIRS);
            event.accept(EBBlocks.RED_WOOL_SLAB);
            event.accept(EBBlocks.ORANGE_WOOL_STAIRS);
            event.accept(EBBlocks.ORANGE_WOOL_SLAB);
            event.accept(EBBlocks.YELLOW_WOOL_STAIRS);
            event.accept(EBBlocks.YELLOW_WOOL_SLAB);
            event.accept(EBBlocks.LIME_WOOL_STAIRS);
            event.accept(EBBlocks.LIME_WOOL_SLAB);
            event.accept(EBBlocks.GREEN_WOOL_STAIRS);
            event.accept(EBBlocks.GREEN_WOOL_SLAB);
            event.accept(EBBlocks.CYAN_WOOL_STAIRS);
            event.accept(EBBlocks.CYAN_WOOL_SLAB);
            event.accept(EBBlocks.LIGHT_BLUE_WOOL_STAIRS);
            event.accept(EBBlocks.LIGHT_BLUE_WOOL_SLAB);
            event.accept(EBBlocks.BLUE_WOOL_STAIRS);
            event.accept(EBBlocks.BLUE_WOOL_SLAB);
            event.accept(EBBlocks.PURPLE_WOOL_STAIRS);
            event.accept(EBBlocks.PURPLE_WOOL_SLAB);
            event.accept(EBBlocks.MAGENTA_WOOL_STAIRS);
            event.accept(EBBlocks.MAGENTA_WOOL_SLAB);
            event.accept(EBBlocks.PINK_WOOL_STAIRS);
            event.accept(EBBlocks.PINK_WOOL_SLAB);
            event.accept(EBBlocks.TERRACOTTA_BRICKS);
            event.accept(EBBlocks.TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.WHITE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.GRAY_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.BLACK_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.BROWN_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.RED_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.RED_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.RED_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.ORANGE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.YELLOW_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.LIME_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.LIME_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.GREEN_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.CYAN_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.BLUE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.PURPLE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.MAGENTA_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.PINK_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.PINK_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS);
            event.accept(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS);
            event.accept(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_SLAB);
            event.accept(EBBlocks.TERRACOTTA_TILES);
            event.accept(EBBlocks.TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.WHITE_TERRACOTTA_TILES);
            event.accept(EBBlocks.WHITE_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.WHITE_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILES);
            event.accept(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.GRAY_TERRACOTTA_TILES);
            event.accept(EBBlocks.GRAY_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.GRAY_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.BLACK_TERRACOTTA_TILES);
            event.accept(EBBlocks.BLACK_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.BLACK_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.BROWN_TERRACOTTA_TILES);
            event.accept(EBBlocks.BROWN_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.BROWN_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.RED_TERRACOTTA_TILES);
            event.accept(EBBlocks.RED_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.RED_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.ORANGE_TERRACOTTA_TILES);
            event.accept(EBBlocks.ORANGE_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.ORANGE_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.YELLOW_TERRACOTTA_TILES);
            event.accept(EBBlocks.YELLOW_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.YELLOW_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.LIME_TERRACOTTA_TILES);
            event.accept(EBBlocks.LIME_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.LIME_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.GREEN_TERRACOTTA_TILES);
            event.accept(EBBlocks.GREEN_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.GREEN_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.CYAN_TERRACOTTA_TILES);
            event.accept(EBBlocks.CYAN_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.CYAN_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES);
            event.accept(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.BLUE_TERRACOTTA_TILES);
            event.accept(EBBlocks.BLUE_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.BLUE_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.PURPLE_TERRACOTTA_TILES);
            event.accept(EBBlocks.PURPLE_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.PURPLE_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.MAGENTA_TERRACOTTA_TILES);
            event.accept(EBBlocks.MAGENTA_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.MAGENTA_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.PINK_TERRACOTTA_TILES);
            event.accept(EBBlocks.PINK_TERRACOTTA_TILE_STAIRS);
            event.accept(EBBlocks.PINK_TERRACOTTA_TILE_SLAB);
            event.accept(EBBlocks.STONE_LAMP);
            event.accept(EBBlocks.DEEPSLATE_LAMP);
            event.accept(EBBlocks.BLACKSTONE_LAMP);
            event.accept(EBBlocks.BLACKSTONE_WINDOW);
            event.accept(EBBlocks.BRIMSTONE_LAMP);
            event.accept(EBBlocks.BRIMSTONE_WINDOW);
            event.accept(EBBlocks.SMOOTH_STONE_BRICK_PEDESTAL);
            event.accept(EBBlocks.TUFF_BRICK_PEDESTAL);
            event.accept(EBBlocks.MARBLE_PEDESTAL);
            event.accept(EBBlocks.MARQUINA_MARBLE_PEDESTAL);
            event.accept(EBBlocks.SANDSTONE_PEDESTAL);
            event.accept(EBBlocks.RED_SANDSTONE_PEDESTAL);
            event.accept(EBBlocks.SOUL_SANDSTONE_PEDESTAL);
            event.accept(EBBlocks.POLISHED_BRIMSTONE_PEDESTAL);
            event.accept(EBBlocks.QUARTZ_PEDESTAL);
            event.accept(EBBlocks.PURPUR_PEDESTAL);
            event.accept(EBBlocks.SOUL_MAGMA_BLOCK);
            event.accept(EBBlocks.FIERY_BLOCK);
            event.accept(EBBlocks.BUDDING_FIERY_BLOCK);
            event.accept(EBBlocks.FIERY_BRICKS);
            event.accept(EBBlocks.CRACKED_FIERY_BRICKS);
            event.accept(EBBlocks.FIERY_BRICK_STAIRS);
            event.accept(EBBlocks.FIERY_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.FIERY_BRICK_SLAB);
            event.accept(EBBlocks.FIERY_BRICK_WALL);
            event.accept(EBBlocks.FIERY_TILES);
            event.accept(EBBlocks.CRACKED_FIERY_TILES);
            event.accept(EBBlocks.FIERY_TILE_STAIRS);
            event.accept(EBBlocks.FIERY_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.FIERY_TILE_SLAB);
            event.accept(EBBlocks.FIERY_TILE_WALL);
            event.accept(EBBlocks.FIERY_LAMP);
            event.accept(EBBlocks.FIERY_GLASS);
            event.accept(EBBlocks.FIERY_GLASS_PANE);
            event.accept(EBBlocks.FIERY_CLUSTER);
            event.accept(EBBlocks.LARGE_FIERY_BUD);
            event.accept(EBBlocks.MEDIUM_FIERY_BUD);
            event.accept(EBBlocks.SMALL_FIERY_BUD);
            event.accept(EBItems.FIERY_SHARDS);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_BLOCK);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_BRICKS);
            event.accept(EBBlocks.CRACKED_PRISMARINE_CRYSTAL_BRICKS);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_BRICK_STAIRS);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_BRICK_SLAB);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_BRICK_WALL);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_TILES);
            event.accept(EBBlocks.CRACKED_PRISMARINE_CRYSTAL_TILES);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_TILE_STAIRS);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_TILE_SLAB);
            event.accept(EBBlocks.PRISMARINE_CRYSTAL_TILE_WALL);
            event.accept(EBBlocks.PRISMARINE_GLASS);
            event.accept(EBBlocks.PRISMARINE_GLASS_PANE);
            event.accept(EBBlocks.KYANITE_BLOCK);
            event.accept(EBBlocks.BUDDING_KYANITE_BLOCK);
            event.accept(EBBlocks.KYANITE_BRICKS);
            event.accept(EBBlocks.CRACKED_KYANITE_BRICKS);
            event.accept(EBBlocks.KYANITE_BRICK_STAIRS);
            event.accept(EBBlocks.KYANITE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.KYANITE_BRICK_SLAB);
            event.accept(EBBlocks.KYANITE_BRICK_WALL);
            event.accept(EBBlocks.KYANITE_TILES);
            event.accept(EBBlocks.CRACKED_KYANITE_TILES);
            event.accept(EBBlocks.KYANITE_TILE_STAIRS);
            event.accept(EBBlocks.KYANITE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.KYANITE_TILE_SLAB);
            event.accept(EBBlocks.KYANITE_TILE_WALL);
            event.accept(EBBlocks.KYANITE_LAMP);
            event.accept(EBBlocks.KYANITE_GLASS);
            event.accept(EBBlocks.KYANITE_GLASS_PANE);
            event.accept(EBBlocks.KYANITE_CLUSTER);
            event.accept(EBBlocks.LARGE_KYANITE_BUD);
            event.accept(EBBlocks.MEDIUM_KYANITE_BUD);
            event.accept(EBBlocks.SMALL_KYANITE_BUD);
            event.accept(EBItems.KYANITE_SHARDS);
            event.accept(EBBlocks.AMETHYST_BRICKS);
            event.accept(EBBlocks.CRACKED_AMETHYST_BRICKS);
            event.accept(EBBlocks.AMETHYST_BRICK_STAIRS);
            event.accept(EBBlocks.AMETHYST_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.AMETHYST_BRICK_SLAB);
            event.accept(EBBlocks.AMETHYST_BRICK_WALL);
            event.accept(EBBlocks.AMETHYST_TILES);
            event.accept(EBBlocks.CRACKED_AMETHYST_TILES);
            event.accept(EBBlocks.AMETHYST_TILE_STAIRS);
            event.accept(EBBlocks.AMETHYST_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.AMETHYST_TILE_SLAB);
            event.accept(EBBlocks.AMETHYST_TILE_WALL);
            event.accept(EBBlocks.AMETHYST_LAMP);
            event.accept(EBBlocks.AMETHYST_GLASS);
            event.accept(EBBlocks.AMETHYST_GLASS_PANE);
            event.accept(EBBlocks.MIRALEN_BLOCK);
            event.accept(EBBlocks.BUDDING_MIRALEN_BLOCK);
            event.accept(EBBlocks.MIRALEN_BRICKS);
            event.accept(EBBlocks.CRACKED_MIRALEN_BRICKS);
            event.accept(EBBlocks.MIRALEN_BRICK_STAIRS);
            event.accept(EBBlocks.MIRALEN_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MIRALEN_BRICK_SLAB);
            event.accept(EBBlocks.MIRALEN_BRICK_WALL);
            event.accept(EBBlocks.MIRALEN_TILES);
            event.accept(EBBlocks.CRACKED_MIRALEN_TILES);
            event.accept(EBBlocks.MIRALEN_TILE_STAIRS);
            event.accept(EBBlocks.MIRALEN_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MIRALEN_TILE_SLAB);
            event.accept(EBBlocks.MIRALEN_TILE_WALL);
            event.accept(EBBlocks.MIRALEN_LAMP);
            event.accept(EBBlocks.MIRALEN_GLASS);
            event.accept(EBBlocks.MIRALEN_GLASS_PANE);
            event.accept(EBBlocks.MIRALEN_CLUSTER);
            event.accept(EBBlocks.LARGE_MIRALEN_BUD);
            event.accept(EBBlocks.MEDIUM_MIRALEN_BUD);
            event.accept(EBBlocks.SMALL_MIRALEN_BUD);
            event.accept(EBItems.MIRALEN_SHARDS);
            event.accept(EBBlocks.CHISELED_COPPER);
            event.accept(EBBlocks.EXPOSED_CHISELED_COPPER);
            event.accept(EBBlocks.WEATHERED_CHISELED_COPPER);
            event.accept(EBBlocks.OXIDIZED_CHISELED_COPPER);
            event.accept(EBBlocks.WAXED_CHISELED_COPPER);
            event.accept(EBBlocks.WAXED_EXPOSED_CHISELED_COPPER);
            event.accept(EBBlocks.WAXED_WEATHERED_CHISELED_COPPER);
            event.accept(EBBlocks.WAXED_OXIDIZED_CHISELED_COPPER);
            event.accept(EBBlocks.COPPER_GRATE);
            event.accept(EBBlocks.EXPOSED_COPPER_GRATE);
            event.accept(EBBlocks.WEATHERED_COPPER_GRATE);
            event.accept(EBBlocks.OXIDIZED_COPPER_GRATE);
            event.accept(EBBlocks.WAXED_COPPER_GRATE);
            event.accept(EBBlocks.WAXED_EXPOSED_COPPER_GRATE);
            event.accept(EBBlocks.WAXED_WEATHERED_COPPER_GRATE);
            event.accept(EBBlocks.WAXED_OXIDIZED_COPPER_GRATE);
            event.accept(EBBlocks.COPPER_BULB);
            event.accept(EBBlocks.EXPOSED_COPPER_BULB);
            event.accept(EBBlocks.WEATHERED_COPPER_BULB);
            event.accept(EBBlocks.OXIDIZED_COPPER_BULB);
            event.accept(EBBlocks.WAXED_COPPER_BULB);
            event.accept(EBBlocks.WAXED_EXPOSED_COPPER_BULB);
            event.accept(EBBlocks.WAXED_WEATHERED_COPPER_BULB);
            event.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BULB);
            event.accept(EBBlocks.TERRACOTTA_POT);
            event.accept(EBBlocks.MARBLE_POT);
            event.accept(EBBlocks.MARQUINA_MARBLE_POT);
            event.accept(EBBlocks.SPRUCE_BOOKSHELF);
            event.accept(EBBlocks.BIRCH_BOOKSHELF);
            event.accept(EBBlocks.JUNGLE_BOOKSHELF);
            event.accept(EBBlocks.ACACIA_BOOKSHELF);
            event.accept(EBBlocks.DARK_OAK_BOOKSHELF);
            event.accept(EBBlocks.MANGROVE_BOOKSHELF);
            event.accept(EBBlocks.CHERRY_BOOKSHELF);
            event.accept(EBBlocks.BAMBOO_BOOKSHELF);
            event.accept(EBBlocks.MAPLE_BOOKSHELF);
            event.accept(EBBlocks.WILLOW_BOOKSHELF);
            event.accept(EBBlocks.ANCIENT_BOOKSHELF);
            event.accept(EBBlocks.CRIMSON_BOOKSHELF);
            event.accept(EBBlocks.WARPED_BOOKSHELF);
            event.accept(EBBlocks.DECORATIVE_SHELF);
            event.accept(EBBlocks.SPRUCE_DECORATIVE_SHELF);
            event.accept(EBBlocks.BIRCH_DECORATIVE_SHELF);
            event.accept(EBBlocks.JUNGLE_DECORATIVE_SHELF);
            event.accept(EBBlocks.ACACIA_DECORATIVE_SHELF);
            event.accept(EBBlocks.DARK_OAK_DECORATIVE_SHELF);
            event.accept(EBBlocks.MANGROVE_DECORATIVE_SHELF);
            event.accept(EBBlocks.CHERRY_DECORATIVE_SHELF);
            event.accept(EBBlocks.BAMBOO_DECORATIVE_SHELF);
            event.accept(EBBlocks.MAPLE_DECORATIVE_SHELF);
            event.accept(EBBlocks.WILLOW_DECORATIVE_SHELF);
            event.accept(EBBlocks.ANCIENT_DECORATIVE_SHELF);
            event.accept(EBBlocks.CRIMSON_DECORATIVE_SHELF);
            event.accept(EBBlocks.WARPED_DECORATIVE_SHELF);
            event.accept(EBBlocks.SPRUCE_CRAFTING_TABLE);
            event.accept(EBBlocks.BIRCH_CRAFTING_TABLE);
            event.accept(EBBlocks.JUNGLE_CRAFTING_TABLE);
            event.accept(EBBlocks.ACACIA_CRAFTING_TABLE);
            event.accept(EBBlocks.DARK_OAK_CRAFTING_TABLE);
            event.accept(EBBlocks.MANGROVE_CRAFTING_TABLE);
            event.accept(EBBlocks.BAMBOO_CRAFTING_TABLE);
            event.accept(EBBlocks.CHERRY_CRAFTING_TABLE);
            event.accept(EBBlocks.MAPLE_CRAFTING_TABLE);
            event.accept(EBBlocks.WILLOW_CRAFTING_TABLE);
            event.accept(EBBlocks.ANCIENT_CRAFTING_TABLE);
            event.accept(EBBlocks.CRIMSON_CRAFTING_TABLE);
            event.accept(EBBlocks.WARPED_CRAFTING_TABLE);
            event.accept(EBItems.EXCESSIVE_BANNER_PATTERN);
            event.accept(EBBlocks.OAK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SPRUCE_VERTICAL_STAIRS);
            event.accept(EBBlocks.BIRCH_VERTICAL_STAIRS);
            event.accept(EBBlocks.JUNGLE_VERTICAL_STAIRS);
            event.accept(EBBlocks.ACACIA_VERTICAL_STAIRS);
            event.accept(EBBlocks.DARK_OAK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MANGROVE_VERTICAL_STAIRS);
            event.accept(EBBlocks.CHERRY_VERTICAL_STAIRS);
            event.accept(EBBlocks.BAMBOO_VERTICAL_STAIRS);
            event.accept(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
            event.accept(EBBlocks.CRIMSON_VERTICAL_STAIRS);
            event.accept(EBBlocks.WARPED_VERTICAL_STAIRS);
            event.accept(EBBlocks.STONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLESTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.STONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.GRANITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.DIORITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.ANDESITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS);
            event.accept(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS);
            event.accept(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS);
            event.accept(EBBlocks.BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.MUD_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.PRISMARINE_VERTICAL_STAIRS);
            event.accept(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS);
            event.accept(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.BLACKSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS);
            event.accept(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS);
            event.accept(EBBlocks.PURPUR_VERTICAL_STAIRS);
            event.accept(EBBlocks.QUARTZ_VERTICAL_STAIRS);
            event.accept(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS);
        }

        if (event.getTab() == EBItemGroups.EXCESSIVE_BUILDING.get() && EBConfig.ENABLE_EB_CREATIVE_TAB.get() && (EBCompatRegistries.sullysMod)) {
            event.accept(SMCompat.JADE_LAMP);
            event.accept(SMCompat.JADE_GLASS);
            event.accept(SMCompat.JADE_GLASS_PANE);
            event.accept(SMCompat.POLISHED_JADE_PEDESTAL);
            event.accept(SMCompat.SMOOTHED_ROUGH_JADE_VERTICAL_STAIRS);
            event.accept(SMCompat.ROUGH_JADE_BRICK_VERTICAL_STAIRS);
            event.accept(SMCompat.ROUGH_JADE_TILE_VERTICAL_STAIRS);
            event.accept(SMCompat.POLISHED_JADE_BRICK_VERTICAL_STAIRS);
            event.accept(SMCompat.POLISHED_JADE_TILE_VERTICAL_STAIRS);
            event.accept(SMCompat.POLISHED_SMALL_JADE_BRICK_VERTICAL_STAIRS);
            event.accept(SMCompat.POLISHED_JADE_SHINGLE_VERTICAL_STAIRS);
        }

        if (event.getTab() == EBItemGroups.EXCESSIVE_BUILDING.get() && EBConfig.ENABLE_EB_CREATIVE_TAB.get() && (EBCompatRegistries.farmersDelight)) {
            event.getEntries().putAfter(new ItemStack(EBItems.ANCIENT_FRUIT.get()), new ItemStack(FDCompat.ANCIENT_CIDER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}