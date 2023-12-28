package net.yirmiri.excessive_building.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.blocktypes.*;
import net.yirmiri.excessive_building.block.blocktypes.flammable.*;
import net.yirmiri.excessive_building.item.EBItems;
import net.yirmiri.excessive_building.worldgen.tree.AncientTreeGrower;

import java.util.function.Supplier;

public class EBBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExcessiveBuilding.MODID);

            public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic",
                    () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

            public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
                    () -> new FlammableStairBlock(EBBlocks.OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

            public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
                    () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

            public static final RegistryObject<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
                    () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

            public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
                    () -> new FlammableStairBlock(EBBlocks.SPRUCE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

            public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
                    () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.BIRCH_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.JUNGLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.ACACIA_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.DARK_OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.MANGROVE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

        public static final RegistryObject<Block> CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
                () -> new StairBlock(() -> EBBlocks.CRIMSON_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> WARPED_MOSAIC = registerBlock("warped_mosaic",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
                () -> new StairBlock(() -> EBBlocks.WARPED_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICKS = registerBlock("cobbled_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_STAIRS = registerBlock("cobbled_deepslate_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_SLAB = registerBlock("cobbled_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_WALL = registerBlock("cobbled_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICKS = registerBlock("blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_STAIRS = registerBlock("blackstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_SLAB = registerBlock("blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_WALL = registerBlock("blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EMPTY_SHELF = registerBlock("empty_shelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> EMPTY_POTION_SHELF = registerBlock("empty_potion_shelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> WATER_POTION_SHELF = registerBlock("water_potion_shelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> POTION_SHELF = registerBlock("potion_shelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> ALCHEMIST_SHELF = registerBlock("alchemist_shelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> GOLDEN_BRICKS = registerBlock("golden_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_BRICK_STAIRS = registerBlock("golden_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.GOLDEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_BRICK_SLAB = registerBlock("golden_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = registerBlock("mossy_cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = registerBlock("mossy_cobblestone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.MOSSY_COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_SLAB = registerBlock("mossy_cobblestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_WALL = registerBlock("mossy_cobblestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICKS = registerBlock("mossy_cobbled_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_cobbled_deepslate_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_cobbled_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_WALL = registerBlock("mossy_cobbled_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.CHERRY_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE = registerBlock("soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = registerBlock("soul_sandstone_stairs",
            () -> new StairBlock(() -> EBBlocks.SOUL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_SLAB = registerBlock("soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_WALL = registerBlock("soul_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICKS = registerBlock("soul_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_STAIRS = registerBlock("soul_sandstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.SOUL_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_SLAB = registerBlock("soul_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_WALL = registerBlock("soul_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE = registerBlock("cut_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_SLAB = registerBlock("cut_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = registerBlock("chiseled_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE = registerBlock("smooth_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = registerBlock("smooth_soul_sandstone_stairs",
            () -> new StairBlock(() -> EBBlocks.SMOOTH_SOUL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_SLAB = registerBlock("smooth_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.BLUE_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE = registerBlock("brimstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_STAIRS = registerBlock("brimstone_stairs",
            () -> new StairBlock(() -> EBBlocks.BRIMSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_SLAB = registerBlock("brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE = registerBlock("polished_brimstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_STAIRS = registerBlock("polished_brimstone_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_BRIMSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_SLAB = registerBlock("polished_brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_WALL = registerBlock("polished_brimstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICKS = registerBlock("polished_brimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_STAIRS = registerBlock("polished_brimstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_BRIMSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_SLAB = registerBlock("polished_brimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_WALL = registerBlock("polished_brimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICKS = registerBlock("cracked_polished_brimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_STAIRS = registerBlock("cracked_polished_brimstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_SLAB = registerBlock("cracked_polished_brimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_WALL = registerBlock("cracked_polished_brimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILES = registerBlock("polished_brimstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_STAIRS = registerBlock("polished_brimstone_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_BRIMSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_SLAB = registerBlock("polished_brimstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_WALL = registerBlock("polished_brimstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_LANTERN = registerBlock("brimstone_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> BRIMSTONE_WINDOW = registerBlock("brimstone_window",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> FIERY_BLOCK = registerBlock("fiery_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)
                    .strength(3f).explosionResistance(3f).sound(SoundType.AMETHYST).lightLevel(state -> 7).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CONSTRUCTION_TABLE = registerBlock("construction_table",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(2f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_OAK = registerBlock("chiseled_oak",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_SPRUCE = registerBlock("chiseled_spruce",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_BIRCH = registerBlock("chiseled_birch",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_JUNGLE = registerBlock("chiseled_jungle",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_ACACIA = registerBlock("chiseled_acacia",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_DARK_OAK = registerBlock("chiseled_dark_oak",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_MANGROVE = registerBlock("chiseled_mangrove",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_CHERRY = registerBlock("chiseled_cherry",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_BAMBOO = registerBlock("chiseled_bamboo",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_CRIMSON = registerBlock("chiseled_crimson",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> CHISELED_WARPED = registerBlock("chiseled_warped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)
                    .strength(50f).explosionResistance(1200f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OBSIDIAN_TILES = registerBlock("obsidian_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)
                    .strength(50f).explosionResistance(1200f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LOGO_BLOCK = registerBlock("logo_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(1f).explosionResistance(1f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(0.5f).explosionResistance(0.5f).sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE = registerBlock("cobbled_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE = registerBlock("cobbled_diorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            () -> new StairBlock(() -> EBBlocks.COBBLED_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_WALL = registerBlock("cobbled_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            () -> new StairBlock(() -> EBBlocks.COBBLED_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            () -> new StairBlock(() -> EBBlocks.COBBLED_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICKS = registerBlock("crimson_mossy_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS = registerBlock("crimson_mossy_blackstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB = registerBlock("crimson_mossy_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL = registerBlock("crimson_mossy_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICKS = registerBlock("warped_mossy_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS = registerBlock("warped_mossy_blackstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_SLAB = registerBlock("warped_mossy_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_WALL = registerBlock("warped_mossy_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("crimson_mossy_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("crimson_mossy_polished_blackstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("crimson_mossy_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("crimson_mossy_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("warped_mossy_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("warped_mossy_polished_blackstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("warped_mossy_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("warped_mossy_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICKS = registerBlock("smooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_STAIRS = registerBlock("smooth_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.SMOOTH_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_SLAB = registerBlock("smooth_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_WALL = registerBlock("smooth_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICKS = registerBlock("lapis_lazuli_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_STAIRS = registerBlock("lapis_lazuli_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.LAPIS_LAZULI_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_SLAB = registerBlock("lapis_lazuli_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OAK_CRAFTING_TABLE = registerBlock("oak_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_STAIRS = registerBlock("smooth_stone_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.SMOOTH_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_SLAB = registerBlock("smooth_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_WALL = registerBlock("smooth_stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OAK_VERTICAL_STAIRS = registerBlock("oak_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> SPRUCE_VERTICAL_STAIRS = registerBlock("spruce_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> BIRCH_VERTICAL_STAIRS = registerBlock("birch_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> JUNGLE_VERTICAL_STAIRS = registerBlock("jungle_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> ACACIA_VERTICAL_STAIRS = registerBlock("acacia_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> DARK_OAK_VERTICAL_STAIRS = registerBlock("dark_oak_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> MANGROVE_VERTICAL_STAIRS = registerBlock("mangrove_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHERRY_VERTICAL_STAIRS = registerBlock("cherry_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> BAMBOO_VERTICAL_STAIRS = registerBlock("bamboo_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> BAMBOO_MOSAIC_VERTICAL_STAIRS = registerBlock("bamboo_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CRIMSON_VERTICAL_STAIRS = registerBlock("crimson_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_VERTICAL_STAIRS = registerBlock("warped_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> STONE_VERTICAL_STAIRS = registerBlock("stone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_VERTICAL_STAIRS = registerBlock("cobblestone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL_STAIRS = registerBlock("mossy_cobblestone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STONE_BRICK_VERTICAL_STAIRS = registerBlock("stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_STONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_TILE_VERTICAL_STAIRS = registerBlock("deepslate_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_VERTICAL_STAIRS = registerBlock("polished_deepslate_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_VERTICAL_STAIRS = registerBlock("cobbled_deepslate_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_VERTICAL_STAIRS = registerBlock("blackstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL_STAIRS = registerBlock("polished_blackstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRICK_VERTICAL_STAIRS = registerBlock("brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> QUARTZ_VERTICAL_STAIRS = registerBlock("quartz_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL_STAIRS = registerBlock("smooth_quartz_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_VERTICAL_STAIRS = registerBlock("sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL_STAIRS = registerBlock("red_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_red_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_VERTICAL_STAIRS = registerBlock("prismarine_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL_STAIRS = registerBlock("dark_prismarine_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_BRICK_VERTICAL_STAIRS = registerBlock("prismarine_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_BRICK_VERTICAL_STAIRS = registerBlock("nether_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_NETHER_BRICK_VERTICAL_STAIRS = registerBlock("red_nether_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ANDESITE_VERTICAL_STAIRS = registerBlock("andesite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRANITE_VERTICAL_STAIRS = registerBlock("granite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIORITE_VERTICAL_STAIRS = registerBlock("diorite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL_STAIRS = registerBlock("polished_andesite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL_STAIRS = registerBlock("polished_diorite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL_STAIRS = registerBlock("polished_granite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPUR_VERTICAL_STAIRS = registerBlock("purpur_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MUD_BRICK_VERTICAL_STAIRS = registerBlock("mud_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)
                    .strength(1.5f).explosionResistance(3f).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STONE_BRICK_VERTICAL_STAIRS = registerBlock("end_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)
                    .strength(3f).explosionResistance(9f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("oak_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> SPRUCE_MOSAIC_VERTICAL_STAIRS = registerBlock("spruce_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> BIRCH_MOSAIC_VERTICAL_STAIRS = registerBlock("birch_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> JUNGLE_MOSAIC_VERTICAL_STAIRS = registerBlock("jungle_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> ACACIA_MOSAIC_VERTICAL_STAIRS = registerBlock("acacia_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> DARK_OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("dark_oak_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> MANGROVE_MOSAIC_VERTICAL_STAIRS = registerBlock("mangrove_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CHERRY_MOSAIC_VERTICAL_STAIRS = registerBlock("cherry_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final RegistryObject<Block> CRIMSON_MOSAIC_VERTICAL_STAIRS = registerBlock("crimson_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_MOSAIC_VERTICAL_STAIRS = registerBlock("warped_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_VERTICAL_STAIRS = registerBlock("cobblestone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_VERTICAL_STAIRS = registerBlock("smooth_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_cobblestone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_cobbled_deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("crimson_mossy_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("warped_mossy_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("crimson_mossy_polished_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("warped_mossy_polished_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_BRICK_VERTICAL_STAIRS = registerBlock("golden_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_VERTICAL_STAIRS = registerBlock("lapis_lazuli_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_VERTICAL_STAIRS = registerBlock("brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_VERTICAL_STAIRS = registerBlock("polished_brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_brimstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_brimstone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_TILES.get())));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("cracked_polished_brimstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SOUL_SANDSTONE_VERTICAL_STAIRS = registerBlock("soul_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SOUL_SANDSTONE.get())));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("soul_sandstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SOUL_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("sandstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("red_sandstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.RED_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_soul_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_SOUL_SANDSTONE.get())));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_VERTICAL_STAIRS = registerBlock("blue_nether_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.BLUE_NETHER_BRICKS.get())));

    public static final RegistryObject<Block> COBBLED_DIORITE_VERTICAL_STAIRS = registerBlock("cobbled_diorite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE.get())));

    public static final RegistryObject<Block> COBBLED_ANDESITE_VERTICAL_STAIRS = registerBlock("cobbled_andesite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE.get())));

    public static final RegistryObject<Block> COBBLED_GRANITE_VERTICAL_STAIRS = registerBlock("cobbled_granite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE.get())));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_granite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_GRANITE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_andesite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_ANDESITE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_diorite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_DIORITE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_VERTICAL_STAIRS = registerBlock("smooth_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_VERTICAL_STAIRS = registerBlock("smooth_stone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_DEEPSLATE_BRICKS.get())));

    public static final RegistryObject<Block> NETHER_TILES = registerBlock("nether_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_TILE_STAIRS = registerBlock("nether_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> NETHER_TILE_SLAB = registerBlock("nether_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> NETHER_TILE_WALL = registerBlock("nether_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> NETHER_TILE_VERTICAL_STAIRS = registerBlock("nether_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILES = registerBlock("red_nether_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_NETHER_TILE_STAIRS = registerBlock("red_nether_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.RED_NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILE_SLAB = registerBlock("red_nether_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILE_WALL = registerBlock("red_nether_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILE_VERTICAL_STAIRS = registerBlock("red_nether_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILES = registerBlock("blue_nether_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BLUE_NETHER_BRICKS.get())
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_STAIRS = registerBlock("blue_nether_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.BLUE_NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_SLAB = registerBlock("blue_nether_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_WALL = registerBlock("blue_nether_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_VERTICAL_STAIRS = registerBlock("blue_nether_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> COLORED_BIRCH_CRAFTING_TABLE = registerBlock("colored_birch_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_SPRUCE_CRAFTING_TABLE = registerBlock("colored_spruce_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_JUNGLE_CRAFTING_TABLE = registerBlock("colored_jungle_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_ACACIA_CRAFTING_TABLE = registerBlock("colored_acacia_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_DARK_OAK_CRAFTING_TABLE = registerBlock("colored_dark_oak_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_MANGROVE_CRAFTING_TABLE = registerBlock("colored_mangrove_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_CHERRY_CRAFTING_TABLE = registerBlock("colored_cherry_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> COLORED_CRIMSON_CRAFTING_TABLE = registerBlock("colored_crimson_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> COLORED_WARPED_CRAFTING_TABLE = registerBlock("colored_warped_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> FIERY_GLASS = registerBlock("fiery_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> AMETHYST_GLASS = registerBlock("amethyst_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> PRISMARINE_GLASS = registerBlock("prismarine_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> FIERY_GLASS_PANE = registerBlock("fiery_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> AMETHYST_GLASS_PANE = registerBlock("amethyst_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> PRISMARINE_GLASS_PANE = registerBlock("prismarine_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> OBSIDIAN_TILE_STAIRS = registerBlock("obsidian_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.OBSIDIAN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_TILES.get())));

    public static final RegistryObject<Block> OBSIDIAN_TILE_SLAB = registerBlock("obsidian_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_TILES.get())));

    public static final RegistryObject<Block> OBSIDIAN_TILE_VERTICAL_STAIRS = registerBlock("obsidian_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_TILES.get())));

    public static final RegistryObject<Block> OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));

    public static final RegistryObject<Block> OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));

    public static final RegistryObject<Block> OBSIDIAN_BRICK_VERTICAL_STAIRS = registerBlock("obsidian_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));

    public static final RegistryObject<Block> IRON_BRICKS = registerBlock("iron_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(5f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRON_BRICK_STAIRS = registerBlock("iron_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.IRON_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> IRON_BRICK_SLAB = registerBlock("iron_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> IRON_BRICK_VERTICAL_STAIRS = registerBlock("iron_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> DIAMOND_BRICKS = registerBlock("diamond_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .strength(5f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIAMOND_BRICK_STAIRS = registerBlock("diamond_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.DIAMOND_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> DIAMOND_BRICK_SLAB = registerBlock("diamond_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> DIAMOND_BRICK_VERTICAL_STAIRS = registerBlock("diamond_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> CHISELED_SANDSTONE_BRICKS = registerBlock("chiseled_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.SANDSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_BRICKS = registerBlock("chiseled_red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.RED_SANDSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE_BRICKS = registerBlock("chiseled_soul_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.SOUL_SANDSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));

    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));

    public static final RegistryObject<Block> QUARTZ_BRICK_VERTICAL_STAIRS = registerBlock("quartz_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));

    public static final RegistryObject<Block> QUARTZ_ORE = registerBlock("quartz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = registerBlock("soul_magma_block",
            () -> new MagmaBlock(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_COBBLESTONE_BRICKS = registerBlock("cracked_cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLESTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_COBBLED_DEEPSLATE_BRICKS = registerBlock("cracked_cobbled_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DEEPSLATE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_BLACKSTONE_BRICKS = registerBlock("cracked_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BLACKSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TERRACOTTA_TILES = registerBlock("terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TERRACOTTA_TILE_STAIRS = registerBlock("terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_TILE_SLAB = registerBlock("terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_TILES = registerBlock("black_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_TILE_STAIRS = registerBlock("black_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.BLACK_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_TILE_SLAB = registerBlock("black_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_TILES = registerBlock("gray_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_TILE_STAIRS = registerBlock("gray_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.GRAY_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_TILE_SLAB = registerBlock("gray_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TILES = registerBlock("light_gray_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = registerBlock("light_gray_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TILE_SLAB = registerBlock("light_gray_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_TILES = registerBlock("brown_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_TILE_STAIRS = registerBlock("brown_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.BROWN_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_TILE_SLAB = registerBlock("brown_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_TILES = registerBlock("white_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_TILE_STAIRS = registerBlock("white_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.WHITE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_TILE_SLAB = registerBlock("white_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_TILES = registerBlock("red_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_TERRACOTTA_TILE_STAIRS = registerBlock("red_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.RED_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_TILE_SLAB = registerBlock("red_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TILES = registerBlock("orange_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TILE_STAIRS = registerBlock("orange_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.ORANGE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TILE_SLAB = registerBlock("orange_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TILES = registerBlock("yellow_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TILE_STAIRS = registerBlock("yellow_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.YELLOW_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TILE_SLAB = registerBlock("yellow_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_TILES = registerBlock("lime_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIME_TERRACOTTA_TILE_STAIRS = registerBlock("lime_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.LIME_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_TILE_SLAB = registerBlock("lime_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_TILES = registerBlock("green_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_TILE_STAIRS = registerBlock("green_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.GREEN_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_TILE_SLAB = registerBlock("green_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_TILES = registerBlock("cyan_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_TILE_STAIRS = registerBlock("cyan_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.CYAN_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_TILE_SLAB = registerBlock("cyan_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TILES = registerBlock("light_blue_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = registerBlock("light_blue_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TILE_SLAB = registerBlock("light_blue_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_TILES = registerBlock("blue_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_TILE_STAIRS = registerBlock("blue_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.BLUE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_TILE_SLAB = registerBlock("blue_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TILES = registerBlock("purple_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TILE_STAIRS = registerBlock("purple_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.PURPLE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TILE_SLAB = registerBlock("purple_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TILES = registerBlock("magenta_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TILE_STAIRS = registerBlock("magenta_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.MAGENTA_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TILE_SLAB = registerBlock("magenta_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_TILES = registerBlock("pink_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_TERRACOTTA_TILE_STAIRS = registerBlock("pink_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.PINK_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_TILE_SLAB = registerBlock("pink_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> QUARTZ_TILES = registerBlock("quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs",
            () -> new StairBlock(EBBlocks.QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));

    public static final RegistryObject<Block> QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));

    public static final RegistryObject<Block> SULFURIC_BRIMSTONE = registerBlock("sulfuric_brimstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SULFURIC_BRIMSTONE_STAIRS = registerBlock("sulfuric_brimstone_stairs",
            () -> new StairBlock(() -> EBBlocks.SULFURIC_BRIMSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.SULFURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> SULFURIC_BRIMSTONE_SLAB = registerBlock("sulfuric_brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.SULFURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> SULFURIC_BRIMSTONE_VERTICAL_STAIRS = registerBlock("sulfuric_brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SULFURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_BRICKS = registerBlock("polished_sulfuric_brimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_BRICK_STAIRS = registerBlock("polished_sulfuric_brimstone_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_SULFURIC_BRIMSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_BRICK_SLAB = registerBlock("polished_sulfuric_brimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_BRICK_WALL = registerBlock("polished_sulfuric_brimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_TILES = registerBlock("polished_sulfuric_brimstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_TILE_STAIRS = registerBlock("polished_sulfuric_brimstone_tile_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_SULFURIC_BRIMSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_TILE_SLAB = registerBlock("polished_sulfuric_brimstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_TILE_WALL = registerBlock("polished_sulfuric_brimstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE = registerBlock("polished_sulfuric_brimstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_STAIRS = registerBlock("polished_sulfuric_brimstone_stairs",
            () -> new StairBlock(() -> EBBlocks.POLISHED_SULFURIC_BRIMSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_SLAB = registerBlock("polished_sulfuric_brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_WALL = registerBlock("polished_sulfuric_brimstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            () -> new StairBlock(EBBlocks.CALCITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairBlock(EBBlocks.DRIPSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs",
            () -> new StairBlock(EBBlocks.DRIPSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> COBBLED_ANDESITE_BRICKS = registerBlock("cobbled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_BRICK_STAIRS = registerBlock("cobbled_andesite_brick_stairs",
            () -> new StairBlock(EBBlocks.COBBLED_ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE.get())));

    public static final RegistryObject<Block> COBBLED_ANDESITE_BRICK_SLAB = registerBlock("cobbled_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE.get())));

    public static final RegistryObject<Block> COBBLED_DIORITE_BRICKS = registerBlock("cobbled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_BRICK_STAIRS = registerBlock("cobbled_diorite_brick_stairs",
            () -> new StairBlock(EBBlocks.COBBLED_DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE.get())));

    public static final RegistryObject<Block> COBBLED_DIORITE_BRICK_SLAB = registerBlock("cobbled_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE.get())));

    public static final RegistryObject<Block> COBBLED_GRANITE_BRICKS = registerBlock("cobbled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_BRICK_STAIRS = registerBlock("cobbled_granite_brick_stairs",
            () -> new StairBlock(EBBlocks.COBBLED_GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE.get())));

    public static final RegistryObject<Block> COBBLED_GRANITE_BRICK_SLAB = registerBlock("cobbled_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE.get())));

    public static final RegistryObject<Block> CRACKED_COBBLED_ANDESITE_BRICKS = registerBlock("cracked_cobbled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_COBBLED_DIORITE_BRICKS = registerBlock("cracked_cobbled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_COBBLED_GRANITE_BRICKS = registerBlock("cracked_cobbled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS = registerBlock("cracked_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_TILES = registerBlock("rainbow_terracotta_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_TILE_STAIRS = registerBlock("rainbow_terracotta_tile_stairs",
            () -> new StairBlock(EBBlocks.RAINBOW_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_TILE_SLAB = registerBlock("rainbow_terracotta_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> NETHERITE_BRICKS = registerBlock("netherite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHERITE_BRICK_STAIRS = registerBlock("netherite_brick_stairs",
            () -> new StairBlock(EBBlocks.NETHERITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> NETHERITE_BRICK_SLAB = registerBlock("netherite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(EBBlocks.SNOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)));

    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)));

    public static final RegistryObject<Block> MUD_TILES = registerBlock("mud_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MUD_TILE_STAIRS = registerBlock("mud_tile_stairs",
            () -> new StairBlock(EBBlocks.MUD_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> MUD_TILE_SLAB = registerBlock("mud_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> CRACKED_SMOOTH_BRICKS = registerBlock("cracked_smooth_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_PILLAR = registerBlock("polished_brimstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_LANTERN = registerBlock("amethyst_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> FIERY_LANTERN = registerBlock("fiery_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 11)));

    public static final RegistryObject<Block> RAINBOW_STAINED_GLASS = registerBlock("rainbow_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_STAINED_GLASS_PANE = registerBlock("rainbow_stained_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_WOOL = registerBlock("rainbow_wool",
            () -> new FlammableWoolBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static final RegistryObject<Block> RAINBOW_CARPET = registerBlock("rainbow_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CARPET)));

    public static final RegistryObject<Block> COBBLED_GRANITE_BRICK_WALL = registerBlock("cobbled_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_BRICK_WALL = registerBlock("cobbled_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_BRICK_WALL = registerBlock("cobbled_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.CALCITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_TILES = registerBlock("calcite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            () -> new StairBlock(EBBlocks.CALCITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.CALCITE_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.DRIPSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.DRIPSTONE_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_BRICK_VERTICAL_STAIRS = registerBlock("calcite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_VERTICAL_STAIRS = registerBlock("calcite_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> DRIPSTONE_BRICK_VERTICAL_STAIRS = registerBlock("dripstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DRIPSTONE_TILE_VERTICAL_STAIRS = registerBlock("dripstone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> SNOW_BRICK_VERTICAL_STAIRS = registerBlock("snow_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SNOW_BRICKS.get())));

    public static final RegistryObject<Block> MUD_TILE_VERTICAL_STAIRS = registerBlock("mud_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> NETHERITE_BRICK_VERTICAL_STAIRS = registerBlock("netherite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> QUARTZ_TILE_VERTICAL_STAIRS = registerBlock("quartz_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.QUARTZ_TILES.get())));

    public static final RegistryObject<Block> COBBLED_GRANITE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_granite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE_BRICKS.get())));

    public static final RegistryObject<Block> COBBLED_DIORITE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_diorite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE_BRICKS.get())));

    public static final RegistryObject<Block> COBBLED_ANDESITE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_andesite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_CLUSTER = registerBlock("fiery_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).lightLevel(state -> 12)));

    // public static final RegistryObject<Block> LARGE_FIERY_BUD = registerBlock("large_fiery_bud",
            // () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()));

    // public static final RegistryObject<Block> MEDIUM_FIERY_BUD = registerBlock("medium_fiery_bud",
            // () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()));

    // public static final RegistryObject<Block> SMALL_FIERY_BUD = registerBlock("small_fiery_bud",
            // () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> KYANITE_CLUSTER = registerBlock("kyanite_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> KYANITE_BLOCK = registerBlock("kyanite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BLOCK = registerBlock("prismarine_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> CHISELED_COPPER = registerBlock("chiseled_copper",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = registerBlock("exposed_chiseled_copper",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));

    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = registerBlock("weathered_chiseled_copper",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));

    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = registerBlock("oxidized_chiseled_copper",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));

    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = registerBlock("waxed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));

    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = registerBlock("waxed_exposed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));

    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = registerBlock("waxed_weathered_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = registerBlock("waxed_oxidized_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));

    public static final RegistryObject<Block> COPPER_GRATE = registerBlock("copper_grate",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = registerBlock("exposed_copper_grate",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = registerBlock("weathered_copper_grate",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = registerBlock("oxidized_copper_grate",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_COPPER_GRATE = registerBlock("waxed_copper_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = registerBlock("waxed_exposed_copper_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = registerBlock("waxed_weathered_copper_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = registerBlock("waxed_oxidized_copper_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> GOLD_GRATE = registerBlock("gold_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> IRON_GRATE = registerBlock("iron_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(EBBlocks.QUARTZ_ORE.get()).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_TUFF.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_TUFF_VERTICAL_STAIRS = registerBlock("polished_tuff_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_BRICKS = registerBlock("tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_POLISHED_TUFF = registerBlock("chiseled_polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
            () -> new StairBlock(EBBlocks.TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_BRICK_VERTICAL_STAIRS = registerBlock("tuff_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILES = registerBlock("tuff_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_TILE_STAIRS = registerBlock("tuff_tile_stairs",
            () -> new StairBlock(EBBlocks.TUFF_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_TILE_VERTICAL_STAIRS = registerBlock("tuff_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs",
            () -> new StairBlock(Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_VERTICAL_STAIRS = registerBlock("tuff_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> COPPER_BULB = registerBlock("copper_bulb",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = registerBlock("exposed_copper_bulb",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel(litBlockEmission -> 11)));

    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = registerBlock("weathered_copper_bulb",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel(litBlockEmission -> 8)));

    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = registerBlock("oxidized_copper_bulb",
            () -> new EBWeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel(litBlockEmission -> 3)));

    public static final RegistryObject<Block> WAXED_COPPER_BULB = registerBlock("waxed_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BULB = registerBlock("waxed_exposed_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).lightLevel(litBlockEmission -> 11)));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BULB = registerBlock("waxed_weathered_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).lightLevel(litBlockEmission -> 8)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BULB = registerBlock("waxed_oxidized_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).lightLevel(litBlockEmission -> 3)));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_BLACKSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_blackstone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE_BRICKS = registerBlock("polished_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_STAIRS = registerBlock("polished_stone_brick_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_SLAB = registerBlock("polished_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_WALL = registerBlock("polished_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_POLISHED_STONE_BRICKS = registerBlock("cracked_polished_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_VERTICAL_STAIRS = registerBlock("polished_stone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_CALCITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.CALCITE_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_CALCITE_VERTICAL_STAIRS = registerBlock("polished_calcite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CRACKED_CALCITE_TILES = registerBlock("cracked_calcite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRICKSHELF = registerBlock("brickshelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> NETHER_BRICKSHELF = registerBlock("nether_brickshelf",
            () -> new FlammableShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava())); //i was gonna leave a comment here making fun for some shitty flammable code i had but i managed to clean it up for all of the wood type blocks and lose like 300 lines of code- thank god

    public static final RegistryObject<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BASKETWEAVE_BRICKS = registerBlock("basketweave_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_STAIRS = registerBlock("basketweave_brick_stairs",
            () -> new StairBlock(EBBlocks.BASKETWEAVE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_SLAB = registerBlock("basketweave_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_WALL = registerBlock("basketweave_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_VERTICAL_STAIRS = registerBlock("basketweave_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> HERRINGBONE_BRICKS = registerBlock("herringbone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICKS = registerBlock("smooth_basketweave_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_STAIRS = registerBlock("smooth_basketweave_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_SLAB = registerBlock("smooth_basketweave_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_WALL = registerBlock("smooth_basketweave_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS = registerBlock("smooth_basketweave_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> SMOOTH_HERRINGBONE_BRICKS = registerBlock("smooth_herringbone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STONE_LANTERN = registerBlock("stone_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> DEEPSLATE_LANTERN = registerBlock("deepslate_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).requiresCorrectToolForDrops().lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> BLACKSTONE_LANTERN = registerBlock("blackstone_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE_LANTERN.get())));

    public static final RegistryObject<Block> BLACKSTONE_WINDOW = registerBlock("blackstone_window",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE_WINDOW.get())));

    public static final RegistryObject<Block> SWIFT_ASPHALT = registerBlock("swift_asphalt",
            () -> new SpeedBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SWIFT_ASPHALT_STAIRS = registerBlock("swift_asphalt_stairs",
            () -> new SpeedStairBlock(EBBlocks.SWIFT_ASPHALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    public static final RegistryObject<Block> SWIFT_ASPHALT_SLAB = registerBlock("swift_asphalt_slab",
            () -> new SpeedSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    public static final RegistryObject<Block> SWIFT_ASPHALT_VERTICAL_STAIRS = registerBlock("swift_asphalt_vertical_stairs",
            () -> new SpeedVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    public static final RegistryObject<Block> ASPHALT_STAIRS = registerBlock("asphalt_stairs",
            () -> new StairBlock(EBBlocks.ASPHALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    public static final RegistryObject<Block> ASPHALT_SLAB = registerBlock("asphalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    public static final RegistryObject<Block> ASPHALT_VERTICAL_STAIRS = registerBlock("asphalt_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    public static final RegistryObject<Block> ANCIENT_PLANKS = registerBlock("ancient_planks",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> ANCIENT_STAIRS = registerBlock("ancient_stairs",
            () -> new FlammableStairBlock(EBBlocks.ANCIENT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_SLAB = registerBlock("ancient_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_VERTICAL_STAIRS = registerBlock("ancient_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> CHISELED_ANCIENT = registerBlock("chiseled_ancient",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_MOSAIC = registerBlock("ancient_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_STAIRS = registerBlock("ancient_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.ANCIENT_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_SLAB = registerBlock("ancient_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_VERTICAL_STAIRS = registerBlock("ancient_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_FENCE = registerBlock("ancient_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava()));

    public static final RegistryObject<Block> ANCIENT_FENCE_GATE = registerBlock("ancient_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()), SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN, SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> ANCIENT_DOOR = registerBlock("ancient_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).ignitedByLava().noOcclusion(), BlockSetType.CHERRY));

    public static final RegistryObject<Block> ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).noOcclusion().ignitedByLava(), BlockSetType.CHERRY));

    public static final RegistryObject<Block> ANCIENT_BUTTON = registerBlock("ancient_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).noCollission().noOcclusion()
            .strength(0.5f).explosionResistance(0.5f), BlockSetType.CRIMSON, 30, true));

    public static final RegistryObject<Block> ANCIENT_PRESSURE_PLATE = registerBlock("ancient_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).noCollission().noOcclusion()
            .sound(SoundType.CHERRY_WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), BlockSetType.CHERRY));

    public static final RegistryObject<Block> ANCIENT_LOG = registerBlock("ancient_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> ANCIENT_WOOD = registerBlock("ancient_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get())));

    public static final RegistryObject<Block> STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get())));

    public static final RegistryObject<Block> STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get())));
/*
    public static final RegistryObject<Block> ANCIENT_SIGN = BLOCKS.register("ancient_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN), EBWoodTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_WALL_SIGN = BLOCKS.register("ancient_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN), EBWoodTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_HANGING_SIGN = BLOCKS.register("ancient_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN), EBWoodTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_WALL_HANGING_SIGN = BLOCKS.register("ancient_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN), EBWoodTypes.ANCIENT));
 */
    public static final RegistryObject<Block> ANCIENT_CRAFTING_TABLE = registerBlock("ancient_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> COLORED_ANCIENT_CRAFTING_TABLE = registerBlock("colored_ancient_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> ANCIENT_LEAVES = registerBlock("ancient_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));

    public static final RegistryObject<Block> ANCIENT_SAPLING = registerBlock("ancient_sapling",
            () -> new SaplingBlock(new AncientTreeGrower(), BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING)));

    public static final RegistryObject<Block> POTTED_ANCIENT_SAPLING = BLOCKS.register("potted_ancient_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ANCIENT_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_CHERRY_SAPLING)));

    public static final RegistryObject<Block> SPRUCE_LADDER = registerBlock("spruce_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> BIRCH_LADDER = registerBlock("birch_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> JUNGLE_LADDER = registerBlock("jungle_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> ACACIA_LADDER = registerBlock("acacia_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> MANGROVE_LADDER = registerBlock("mangrove_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> CHERRY_LADDER = registerBlock("cherry_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> BAMBOO_LADDER = registerBlock("bamboo_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> ANCIENT_LADDER = registerBlock("ancient_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> CRIMSON_LADDER = registerBlock("crimson_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> WARPED_LADDER = registerBlock("warped_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> POLISHED_BASALT = registerBlock("polished_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BASALT.get())));

    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BASALT.get())));

    public static final RegistryObject<Block> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BASALT.get())));

    public static final RegistryObject<Block> POLISHED_BASALT_VERTICAL_STAIRS = registerBlock("polished_basalt_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BASALT.get())));

    protected static <B extends Block>RegistryObject<B> registerBlock(String name, Supplier<B> block) {
                RegistryObject<B> toReturn = BLOCKS.register(name, block);
                registryBlockItem(name, toReturn);
                return toReturn;
            }

            private static <B extends Block> void registryBlockItem(String name, RegistryObject<B> block) {
                EBItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
            }

            public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
            }
}
