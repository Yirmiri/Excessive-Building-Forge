package net.yirmiri.excessive_building.compat;

import com.uraneptus.sullysmod.core.other.SMProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.block.PedestalBlock;
import net.yirmiri.excessive_building.block.VerticalStairBlock;
import net.yirmiri.excessive_building.register.EBBlocks;

public class SullysModCompat {

    public static final RegistryObject<Block> POLISHED_JADE_PEDESTAL = EBBlocks.registerBlock("polished_jade_pedestal",
            () -> new PedestalBlock(SMProperties.Blocks.POLISHED_JADE_BLOCKS));

    public static final RegistryObject<Block> JADE_LAMP = EBBlocks.registerBlock("jade_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_LAMP.get())));

    public static final RegistryObject<Block> JADE_GLASS = EBBlocks.registerBlock("jade_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_GLASS.get())));

    public static final RegistryObject<Block> JADE_GLASS_PANE = EBBlocks.registerBlock("jade_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_GLASS_PANE.get())));

    public static final RegistryObject<Block> ROUGH_JADE_BRICK_VERTICAL_STAIRS = EBBlocks.registerBlock("rough_jade_brick_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.ROUGH_JADE_BLOCKS));

    public static final RegistryObject<Block> SMOOTHED_ROUGH_JADE_VERTICAL_STAIRS = EBBlocks.registerBlock("smoothed_rough_jade_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.ROUGH_JADE_BLOCKS));

    public static final RegistryObject<Block> ROUGH_JADE_TILE_VERTICAL_STAIRS = EBBlocks.registerBlock("rough_jade_tile_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.ROUGH_JADE_BLOCKS));

    public static final RegistryObject<Block> POLISHED_JADE_BRICK_VERTICAL_STAIRS = EBBlocks.registerBlock("polished_jade_brick_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.POLISHED_JADE_BLOCKS));

    public static final RegistryObject<Block> POLISHED_SMALL_JADE_BRICK_VERTICAL_STAIRS = EBBlocks.registerBlock("polished_small_jade_brick_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.POLISHED_JADE_BLOCKS));

    public static final RegistryObject<Block> POLISHED_JADE_TILE_VERTICAL_STAIRS = EBBlocks.registerBlock("polished_jade_tile_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.POLISHED_JADE_BLOCKS));

    public static final RegistryObject<Block> POLISHED_JADE_SHINGLE_VERTICAL_STAIRS = EBBlocks.registerBlock("polished_jade_shingle_vertical_stairs",
            () -> new VerticalStairBlock(SMProperties.Blocks.POLISHED_JADE_BLOCKS));


    public static void register(IEventBus eventBus) {
    }
}
