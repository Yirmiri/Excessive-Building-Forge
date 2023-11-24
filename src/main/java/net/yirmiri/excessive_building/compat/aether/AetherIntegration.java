package net.yirmiri.excessive_building.compat.aether;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.block.EBBlocks;

public class AetherIntegration extends EBBlocks {

    public static final RegistryObject<Block> SKYROOT_MOSAIC = EBBlocks.registerBlock("skyroot_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.OAK_MOSAIC.get())));

    public static final RegistryObject<Block> SKYROOT_MOSAIC_STAIRS = EBBlocks.registerBlock("skyroot_mosaic_stairs",
            () -> new StairBlock(() -> AetherIntegration.SKYROOT_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.OAK_MOSAIC.get())));

    public static final RegistryObject<Block> SKYROOT_MOSAIC_SLAB = EBBlocks.registerBlock("skyroot_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.OAK_MOSAIC.get())));

    public static final RegistryObject<Block> CHISELED_SKYROOT = EBBlocks.registerBlock("chiseled_skyroot",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.OAK_MOSAIC.get())));

    public static final RegistryObject<Block> ZANITE_BRICKS = EBBlocks.registerBlock("zanite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.IRON_BRICKS.get())));

    public static final RegistryObject<Block> ZANITE_BRICK_STAIRS = EBBlocks.registerBlock("zanite_brick_stairs",
            () -> new StairBlock(() -> AetherIntegration.ZANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.IRON_BRICKS.get())));

    public static final RegistryObject<Block> ZANITE_BRICK_SLAB = EBBlocks.registerBlock("zanite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.IRON_BRICKS.get())));

    public static final RegistryObject<Block> ENCHANTED_GRAVITITE_BRICKS = EBBlocks.registerBlock("enchanted_gravitite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.DIAMOND_BRICKS.get())));

    public static final RegistryObject<Block> ENCHANTED_GRAVITITE_BRICK_STAIRS = EBBlocks.registerBlock("enchanted_gravitite_brick_stairs",
            () -> new StairBlock(() -> AetherIntegration.ENCHANTED_GRAVITITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.DIAMOND_BRICKS.get())));

    public static final RegistryObject<Block> ENCHANTED_GRAVITITE_BRICK_SLAB = EBBlocks.registerBlock("enchanted_gravitite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.DIAMOND_BRICKS.get())));

    public static final RegistryObject<Block> AMBROSIUM_BRICKS = EBBlocks.registerBlock("ambrosium_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.IRON_BRICKS.get())));

    public static final RegistryObject<Block> AMBROSIUM_BRICK_STAIRS = EBBlocks.registerBlock("ambrosium_brick_stairs",
            () -> new StairBlock(() -> AetherIntegration.AMBROSIUM_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.IRON_BRICKS.get())));

    public static final RegistryObject<Block> AMBROSIUM_BRICK_SLAB = EBBlocks.registerBlock("ambrosium_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.IRON_BRICKS.get())));


    public static void register() {
    }
}