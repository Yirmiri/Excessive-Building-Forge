package net.yirmiri.excessive_building.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.*;
import net.yirmiri.excessive_building.block.EBCeilingHangingSignBlock;
import net.yirmiri.excessive_building.block.EBStandingSignBlock;
import net.yirmiri.excessive_building.block.EBWallHangingSignBlock;
import net.yirmiri.excessive_building.block.EBWallSignBlock;
import net.yirmiri.excessive_building.block.flammable.*;
import net.yirmiri.excessive_building.worldgen.feature.tree.*;

import java.util.function.Supplier;

public class EBBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExcessiveBuilding.MODID);

        public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.SPRUCE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.BIRCH_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.JUNGLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.ACACIA_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.DARK_OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
                () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
                () -> new FlammableStairBlock(EBBlocks.MANGROVE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

        public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
                () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

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
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> EMPTY_POTION_SHELF = registerBlock("empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WATER_POTION_SHELF = registerBlock("water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> POTION_SHELF = registerBlock("potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ALCHEMIST_SHELF = registerBlock("alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20));

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
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.CHERRY_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava(), 20, 5));

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

    public static final RegistryObject<Block> BRIMSTONE_LAMP = registerBlock("brimstone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> BRIMSTONE_WINDOW = registerBlock("brimstone_window",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> FIERY_BLOCK = registerBlock("fiery_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)
                    .strength(3f).explosionResistance(3f).sound(SoundType.AMETHYST).lightLevel(state -> 7).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CONSTRUCTION_TABLE = registerBlock("construction_table",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).explosionResistance(2f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_OAK = registerBlock("chiseled_oak",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_SPRUCE = registerBlock("chiseled_spruce",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_BIRCH = registerBlock("chiseled_birch",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_JUNGLE = registerBlock("chiseled_jungle",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_ACACIA = registerBlock("chiseled_acacia",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_DARK_OAK = registerBlock("chiseled_dark_oak",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_MANGROVE = registerBlock("chiseled_mangrove",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_CHERRY = registerBlock("chiseled_cherry",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_BAMBOO = registerBlock("chiseled_bamboo",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD).ignitedByLava(), 20, 5));

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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK) //block is only used for advancement & creative inventory icons
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
            () -> new SodSlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

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
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> SPRUCE_VERTICAL_STAIRS = registerBlock("spruce_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> BIRCH_VERTICAL_STAIRS = registerBlock("birch_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> JUNGLE_VERTICAL_STAIRS = registerBlock("jungle_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ACACIA_VERTICAL_STAIRS = registerBlock("acacia_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> DARK_OAK_VERTICAL_STAIRS = registerBlock("dark_oak_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MANGROVE_VERTICAL_STAIRS = registerBlock("mangrove_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHERRY_VERTICAL_STAIRS = registerBlock("cherry_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> BAMBOO_VERTICAL_STAIRS = registerBlock("bamboo_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> BAMBOO_MOSAIC_VERTICAL_STAIRS = registerBlock("bamboo_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD).ignitedByLava(), 20, 5));

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
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> SPRUCE_MOSAIC_VERTICAL_STAIRS = registerBlock("spruce_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> BIRCH_MOSAIC_VERTICAL_STAIRS = registerBlock("birch_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> JUNGLE_MOSAIC_VERTICAL_STAIRS = registerBlock("jungle_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ACACIA_MOSAIC_VERTICAL_STAIRS = registerBlock("acacia_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> DARK_OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("dark_oak_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MANGROVE_MOSAIC_VERTICAL_STAIRS = registerBlock("mangrove_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHERRY_MOSAIC_VERTICAL_STAIRS = registerBlock("cherry_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD).ignitedByLava(), 20, 5));

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

    public static final RegistryObject<Block> AMETHYST_LAMP = registerBlock("amethyst_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> FIERY_LAMP = registerBlock("fiery_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 11)));

    public static final RegistryObject<Block> RAINBOW_STAINED_GLASS = registerBlock("rainbow_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_STAINED_GLASS_PANE = registerBlock("rainbow_stained_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_WOOL = registerBlock("rainbow_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> RAINBOW_CARPET = registerBlock("rainbow_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CARPET), 20, 60));

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

    public static final RegistryObject<Block> KYANITE_CLUSTER = registerBlock("kyanite_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> KYANITE_BLOCK = registerBlock("kyanite_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BLOCK = registerBlock("prismarine_crystal_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> CHISELED_COPPER = registerBlock("chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = registerBlock("exposed_chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));

    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = registerBlock("weathered_chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));

    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = registerBlock("oxidized_chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));

    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = registerBlock("waxed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));

    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = registerBlock("waxed_exposed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));

    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = registerBlock("waxed_weathered_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = registerBlock("waxed_oxidized_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));

    public static final RegistryObject<Block> COPPER_GRATE = registerBlock("copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = registerBlock("exposed_copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = registerBlock("weathered_copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = registerBlock("oxidized_copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_COPPER_GRATE = registerBlock("waxed_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = registerBlock("waxed_exposed_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = registerBlock("waxed_weathered_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = registerBlock("waxed_oxidized_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> GOLD_GRATE = registerBlock("gold_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> IRON_GRATE = registerBlock("iron_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

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
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = registerBlock("exposed_copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel(litBlockEmission -> 11)));

    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = registerBlock("weathered_copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel(litBlockEmission -> 8)));

    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = registerBlock("oxidized_copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel(litBlockEmission -> 3)));

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
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> NETHER_BRICKSHELF = registerBlock("nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD).ignitedByLava(), 30, 20)); //i was gonna leave a comment here making fun for some shitty flammable code but i managed to clean it up, thank god (update like a week later; i managed to clean up the shitty clean up of my shitty code)

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

    public static final RegistryObject<Block> STONE_LAMP = registerBlock("stone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> DEEPSLATE_LAMP = registerBlock("deepslate_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).requiresCorrectToolForDrops().lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> BLACKSTONE_LAMP = registerBlock("blackstone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE_LAMP.get())));

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
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.CHERRY_WOOD), 20, 5));

    public static final RegistryObject<Block> ANCIENT_STAIRS = registerBlock("ancient_stairs",
            () -> new FlammableStairBlock(EBBlocks.ANCIENT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_SLAB = registerBlock("ancient_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_VERTICAL_STAIRS = registerBlock("ancient_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_ANCIENT = registerBlock("chiseled_ancient",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC = registerBlock("ancient_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_STAIRS = registerBlock("ancient_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.ANCIENT_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_SLAB = registerBlock("ancient_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_VERTICAL_STAIRS = registerBlock("ancient_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_FENCE = registerBlock("ancient_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_FENCE_GATE = registerBlock("ancient_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()), SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN, SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> ANCIENT_DOOR = registerBlock("ancient_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).ignitedByLava().noOcclusion(), EBBlockTypes.ANCIENT_BLOCKSET));

    public static final RegistryObject<Block> ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).noOcclusion().ignitedByLava(), EBBlockTypes.ANCIENT_BLOCKSET));

    public static final RegistryObject<Block> ANCIENT_BUTTON = registerBlock("ancient_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).noCollission().noOcclusion()
            .strength(0.5f).explosionResistance(0.5f), EBBlockTypes.ANCIENT_BLOCKSET, 30, true));

    public static final RegistryObject<Block> ANCIENT_PRESSURE_PLATE = registerBlock("ancient_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).noCollission().noOcclusion()
            .sound(SoundType.CHERRY_WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), EBBlockTypes.ANCIENT_BLOCKSET));

    public static final RegistryObject<Block> ANCIENT_LOG = registerBlock("ancient_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> ANCIENT_WOOD = registerBlock("ancient_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get()), 5, 5));

    public static final RegistryObject<Block> ANCIENT_CRAFTING_TABLE = registerBlock("ancient_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> COLORED_ANCIENT_CRAFTING_TABLE = registerBlock("colored_ancient_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> ANCIENT_SAPLING = registerBlock("ancient_sapling",
            () -> new SaplingBlock(new AncientTreeGrower(), BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING).lightLevel(state -> 6)));

    public static final RegistryObject<Block> POTTED_ANCIENT_SAPLING = BLOCKS.register("potted_ancient_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ANCIENT_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_CHERRY_SAPLING).lightLevel(state -> 6)));

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
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> BAMBOO_LADDER = registerBlock("bamboo_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> ANCIENT_LADDER = registerBlock("ancient_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> CRIMSON_LADDER = registerBlock("crimson_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_LADDER = registerBlock("warped_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> ANCIENT_LEAVES = registerBlock("ancient_leaves",
            () -> new AncientLeavesBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).lightLevel(state -> 9)));

    public static final RegistryObject<Block> UNLIT_ANCIENT_LEAVES = registerBlock("unlit_ancient_leaves",
            () -> new AncientLeavesBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));

    public static final RegistryObject<Block> ALGAE_BLOCK = registerBlock("algae_block", () -> new
            AlgaeBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).explosionResistance(0f).sound(SoundType.AZALEA_LEAVES).instabreak().replaceable().noCollission()));

    public static final RegistryObject<Block> TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.RED_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_BRICKS = registerBlock("rainbow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_BRICK_STAIRS = registerBlock("rainbow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_BRICK_SLAB = registerBlock("rainbow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> GRASS_SLAB = registerBlock("grass_slab",
            () -> new GrassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
            () -> new RootedDirtSlabBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)));

    public static final RegistryObject<Block> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            () -> new SodSlabBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)));

    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> NETHERRACK_VERTICAL_STAIRS = registerBlock("netherrack_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> END_STONE_VERTICAL_STAIRS = registerBlock("end_stone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    public static final RegistryObject<Block> SMOOTH_BASALT_VERTICAL_STAIRS = registerBlock("smooth_basalt_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> KYANITE_LAMP = registerBlock("kyanite_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_AMETHYST_BRICKS = registerBlock("cracked_amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            () -> new StairBlock(EBBlocks.AMETHYST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_BRICK_VERTICAL_STAIRS = registerBlock("amethyst_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILES = registerBlock("amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_AMETHYST_TILES = registerBlock("cracked_amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILE_STAIRS = registerBlock("amethyst_tile_stairs",
            () -> new StairBlock(EBBlocks.AMETHYST_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILE_SLAB = registerBlock("amethyst_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILE_WALL = registerBlock("amethyst_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_TILE_VERTICAL_STAIRS = registerBlock("amethyst_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICKS = registerBlock("fiery_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_FIERY_BRICKS = registerBlock("cracked_fiery_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICK_STAIRS = registerBlock("fiery_brick_stairs",
            () -> new StairBlock(EBBlocks.FIERY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICK_SLAB = registerBlock("fiery_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICK_WALL = registerBlock("fiery_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FIERY_BRICK_VERTICAL_STAIRS = registerBlock("fiery_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILES = registerBlock("fiery_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_FIERY_TILES = registerBlock("cracked_fiery_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILE_STAIRS = registerBlock("fiery_tile_stairs",
            () -> new StairBlock(EBBlocks.FIERY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILE_SLAB = registerBlock("fiery_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILE_WALL = registerBlock("fiery_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FIERY_TILE_VERTICAL_STAIRS = registerBlock("fiery_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICKS = registerBlock("kyanite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_KYANITE_BRICKS = registerBlock("cracked_kyanite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICK_STAIRS = registerBlock("kyanite_brick_stairs",
            () -> new StairBlock(EBBlocks.KYANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICK_SLAB = registerBlock("kyanite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICK_WALL = registerBlock("kyanite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> KYANITE_BRICK_VERTICAL_STAIRS = registerBlock("kyanite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILES = registerBlock("kyanite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_KYANITE_TILES = registerBlock("cracked_kyanite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILE_STAIRS = registerBlock("kyanite_tile_stairs",
            () -> new StairBlock(EBBlocks.KYANITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILE_SLAB = registerBlock("kyanite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILE_WALL = registerBlock("kyanite_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> KYANITE_TILE_VERTICAL_STAIRS = registerBlock("kyanite_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICKS = registerBlock("prismarine_crystal_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_PRISMARINE_CRYSTAL_BRICKS = registerBlock("cracked_prismarine_crystal_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_STAIRS = registerBlock("prismarine_crystal_brick_stairs",
            () -> new StairBlock(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_SLAB = registerBlock("prismarine_crystal_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_WALL = registerBlock("prismarine_crystal_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_VERTICAL_STAIRS = registerBlock("prismarine_crystal_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILES = registerBlock("prismarine_crystal_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_PRISMARINE_CRYSTAL_TILES = registerBlock("cracked_prismarine_crystal_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_STAIRS = registerBlock("prismarine_crystal_tile_stairs",
            () -> new StairBlock(EBBlocks.PRISMARINE_CRYSTAL_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_SLAB = registerBlock("prismarine_crystal_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_WALL = registerBlock("prismarine_crystal_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_VERTICAL_STAIRS = registerBlock("prismarine_crystal_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_GLASS = registerBlock("kyanite_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> KYANITE_GLASS_PANE = registerBlock("kyanite_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> CHISELED_SMOOTH_STONE_BRICKS = registerBlock("chiseled_smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> ANCIENT_SIGN = BLOCKS.register("ancient_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_WALL_SIGN = BLOCKS.register("ancient_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_HANGING_SIGN = BLOCKS.register("ancient_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_WALL_HANGING_SIGN = BLOCKS.register("ancient_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> EMERALD_BRICKS = registerBlock("emerald_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICK_STAIRS = registerBlock("emerald_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.EMERALD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICK_SLAB = registerBlock("emerald_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICK_VERTICAL_STAIRS = registerBlock("emerald_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> SMOOTH_TERRACOTTA_BRICKS = registerBlock("smooth_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLACK_TERRACOTTA_BRICKS = registerBlock("smooth_black_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_black_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_black_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GRAY_TERRACOTTA_BRICKS = registerBlock("smooth_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("smooth_light_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_light_gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_light_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BROWN_TERRACOTTA_BRICKS = registerBlock("smooth_brown_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_brown_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_brown_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_WHITE_TERRACOTTA_BRICKS = registerBlock("smooth_white_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_white_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_white_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RED_TERRACOTTA_BRICKS = registerBlock("smooth_red_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RED_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_red_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RED_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_red_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_ORANGE_TERRACOTTA_BRICKS = registerBlock("smooth_orange_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_orange_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_orange_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_YELLOW_TERRACOTTA_BRICKS = registerBlock("smooth_yellow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_yellow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_yellow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIME_TERRACOTTA_BRICKS = registerBlock("smooth_lime_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_lime_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIME_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_lime_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GREEN_TERRACOTTA_BRICKS = registerBlock("smooth_green_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_green_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_green_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_CYAN_TERRACOTTA_BRICKS = registerBlock("smooth_cyan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_cyan_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_cyan_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("smooth_light_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_light_blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_light_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLUE_TERRACOTTA_BRICKS = registerBlock("smooth_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PURPLE_TERRACOTTA_BRICKS = registerBlock("smooth_purple_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_purple_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_purple_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_MAGENTA_TERRACOTTA_BRICKS = registerBlock("smooth_magenta_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_magenta_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_magenta_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PINK_TERRACOTTA_BRICKS = registerBlock("smooth_pink_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_pink_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PINK_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_pink_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RAINBOW_TERRACOTTA_BRICKS = registerBlock("smooth_rainbow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RAINBOW_TERRACOTTA_BRICK_STAIRS = registerBlock("smooth_rainbow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RAINBOW_TERRACOTTA_BRICK_SLAB = registerBlock("smooth_rainbow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> BUDDING_FIERY_BLOCK = registerBlock("budding_fiery_block",
            () -> new BuddingFieryBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BLOCK.get()).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().randomTicks()));

    public static final RegistryObject<Block> BUDDING_KYANITE_BLOCK = registerBlock("budding_kyanite_block",
            () -> new BuddingKyaniteBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BLOCK.get()).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().randomTicks()));

    public static final RegistryObject<Block> SMALL_FIERY_BUD = registerBlock("small_fiery_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));

    public static final RegistryObject<Block> MEDIUM_FIERY_BUD = registerBlock("medium_fiery_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));

    public static final RegistryObject<Block> LARGE_FIERY_BUD = registerBlock("large_fiery_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));

    public static final RegistryObject<Block> SMALL_KYANITE_BUD = registerBlock("small_kyanite_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));

    public static final RegistryObject<Block> MEDIUM_KYANITE_BUD = registerBlock("medium_kyanite_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));

    public static final RegistryObject<Block> LARGE_KYANITE_BUD = registerBlock("large_kyanite_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));

    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_EMPTY_SHELF = registerBlock("spruce_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_EMPTY_POTION_SHELF = registerBlock("spruce_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_WATER_POTION_SHELF = registerBlock("spruce_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_POTION_SHELF = registerBlock("spruce_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_ALCHEMIST_SHELF = registerBlock("spruce_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_BRICKSHELF = registerBlock("spruce_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> SPRUCE_NETHER_BRICKSHELF = registerBlock("spruce_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_EMPTY_SHELF = registerBlock("birch_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_EMPTY_POTION_SHELF = registerBlock("birch_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_WATER_POTION_SHELF = registerBlock("birch_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_POTION_SHELF = registerBlock("birch_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_ALCHEMIST_SHELF = registerBlock("birch_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_BRICKSHELF = registerBlock("birch_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BIRCH_NETHER_BRICKSHELF = registerBlock("birch_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_EMPTY_SHELF = registerBlock("acacia_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_EMPTY_POTION_SHELF = registerBlock("acacia_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_WATER_POTION_SHELF = registerBlock("acacia_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_POTION_SHELF = registerBlock("acacia_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_ALCHEMIST_SHELF = registerBlock("acacia_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_BRICKSHELF = registerBlock("acacia_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ACACIA_NETHER_BRICKSHELF = registerBlock("acacia_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_BOOKSHELF = registerBlock("ancient_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_EMPTY_SHELF = registerBlock("ancient_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_EMPTY_POTION_SHELF = registerBlock("ancient_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_WATER_POTION_SHELF = registerBlock("ancient_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_POTION_SHELF = registerBlock("ancient_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_ALCHEMIST_SHELF = registerBlock("ancient_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_BRICKSHELF = registerBlock("ancient_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> ANCIENT_NETHER_BRICKSHELF = registerBlock("ancient_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_EMPTY_SHELF = registerBlock("jungle_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_EMPTY_POTION_SHELF = registerBlock("jungle_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_WATER_POTION_SHELF = registerBlock("jungle_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_POTION_SHELF = registerBlock("jungle_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_ALCHEMIST_SHELF = registerBlock("jungle_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_BRICKSHELF = registerBlock("jungle_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> JUNGLE_NETHER_BRICKSHELF = registerBlock("jungle_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_EMPTY_SHELF = registerBlock("dark_oak_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_EMPTY_POTION_SHELF = registerBlock("dark_oak_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_WATER_POTION_SHELF = registerBlock("dark_oak_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_POTION_SHELF = registerBlock("dark_oak_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_ALCHEMIST_SHELF = registerBlock("dark_oak_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_BRICKSHELF = registerBlock("dark_oak_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> DARK_OAK_NETHER_BRICKSHELF = registerBlock("dark_oak_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_EMPTY_SHELF = registerBlock("mangrove_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_EMPTY_POTION_SHELF = registerBlock("mangrove_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_WATER_POTION_SHELF = registerBlock("mangrove_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_POTION_SHELF = registerBlock("mangrove_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_ALCHEMIST_SHELF = registerBlock("mangrove_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_BRICKSHELF = registerBlock("mangrove_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MANGROVE_NETHER_BRICKSHELF = registerBlock("mangrove_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_EMPTY_SHELF = registerBlock("cherry_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_EMPTY_POTION_SHELF = registerBlock("cherry_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_WATER_POTION_SHELF = registerBlock("cherry_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_POTION_SHELF = registerBlock("cherry_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_ALCHEMIST_SHELF = registerBlock("cherry_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_BRICKSHELF = registerBlock("cherry_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CHERRY_NETHER_BRICKSHELF = registerBlock("cherry_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_EMPTY_SHELF = registerBlock("crimson_empty_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_EMPTY_POTION_SHELF = registerBlock("crimson_empty_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_WATER_POTION_SHELF = registerBlock("crimson_water_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_POTION_SHELF = registerBlock("crimson_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_ALCHEMIST_SHELF = registerBlock("crimson_alchemist_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_BRICKSHELF = registerBlock("crimson_brickshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_NETHER_BRICKSHELF = registerBlock("crimson_nether_brickshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_EMPTY_SHELF = registerBlock("warped_empty_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_EMPTY_POTION_SHELF = registerBlock("warped_empty_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_WATER_POTION_SHELF = registerBlock("warped_water_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_POTION_SHELF = registerBlock("warped_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_ALCHEMIST_SHELF = registerBlock("warped_alchemist_shelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_BRICKSHELF = registerBlock("warped_brickshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_NETHER_BRICKSHELF = registerBlock("warped_nether_brickshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> ROSE = registerBlock("rose",
            () -> new FlowerBlock(MobEffects.REGENERATION, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> WHITE_ROSE = registerBlock("white_rose",
            () -> new FlowerBlock(MobEffects.GLOWING, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_WHITE_ROSE = BLOCKS.register("potted_white_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.WHITE_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> CYAN_ROSE = registerBlock("cyan_rose",
            () -> new FlowerBlock(MobEffects.POISON, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_CYAN_ROSE = BLOCKS.register("potted_cyan_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.CYAN_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_PILLAR = registerBlock("smooth_stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_PEDESTAL = registerBlock("polished_brimstone_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_PILLAR.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_PEDESTAL = registerBlock("smooth_stone_brick_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_BRICK_PILLAR.get())));

    public static final RegistryObject<Block> QUARTZ_PEDESTAL = registerBlock("quartz_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)));

    public static final RegistryObject<Block> PURPUR_PEDESTAL = registerBlock("purpur_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR)));

    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 20, 5));

    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new FlammableStairBlock(EBBlocks.WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_VERTICAL_STAIRS = registerBlock("willow_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_WILLOW = registerBlock("chiseled_willow",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC = registerBlock("willow_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC_STAIRS = registerBlock("willow_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.WILLOW_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC_SLAB = registerBlock("willow_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC_VERTICAL_STAIRS = registerBlock("willow_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).sound(SoundType.WOOD).ignitedByLava().noOcclusion(), EBBlockTypes.WILLOW_BLOCKSET));

    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).sound(SoundType.WOOD).noOcclusion().ignitedByLava(), EBBlockTypes.WILLOW_BLOCKSET));

    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).sound(SoundType.WOOD).noCollission().noOcclusion()
                    .strength(0.5f).explosionResistance(0.5f), EBBlockTypes.WILLOW_BLOCKSET, 30, true));

    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).noCollission().noOcclusion()
                    .sound(SoundType.WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), EBBlockTypes.WILLOW_BLOCKSET));

    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_LOG.get()), 5, 5));

    public static final RegistryObject<Block> WILLOW_CRAFTING_TABLE = registerBlock("willow_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_WILLOW_CRAFTING_TABLE = registerBlock("colored_willow_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_WILLOW_SAPLING = BLOCKS.register("potted_willow_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.WILLOW_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> WILLOW_LADDER = registerBlock("willow_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> WILLOW_BOOKSHELF = registerBlock("willow_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_EMPTY_SHELF = registerBlock("willow_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_EMPTY_POTION_SHELF = registerBlock("willow_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_WATER_POTION_SHELF = registerBlock("willow_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_POTION_SHELF = registerBlock("willow_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_ALCHEMIST_SHELF = registerBlock("willow_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_BRICKSHELF = registerBlock("willow_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_NETHER_BRICKSHELF = registerBlock("willow_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> WILLOW_SIGN = BLOCKS.register("willow_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_WALL_SIGN = BLOCKS.register("willow_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_HANGING_SIGN = BLOCKS.register("willow_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_WALL_HANGING_SIGN = BLOCKS.register("willow_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> ROSE_BUNDLE = registerBlock("rose_bundle",
            () -> new FlowerBlock(MobEffects.REGENERATION, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_ROSE_BUNDLE = BLOCKS.register("potted_rose_bundle",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ROSE_BUNDLE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 20, 5));

    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new FlammableStairBlock(EBBlocks.MAPLE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_VERTICAL_STAIRS = registerBlock("maple_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_MAPLE = registerBlock("chiseled_maple",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC = registerBlock("maple_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC_STAIRS = registerBlock("maple_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.MAPLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC_SLAB = registerBlock("maple_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC_VERTICAL_STAIRS = registerBlock("maple_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).sound(SoundType.WOOD).ignitedByLava().noOcclusion(), EBBlockTypes.MAPLE_BLOCKSET));

    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).sound(SoundType.WOOD).noOcclusion().ignitedByLava(), EBBlockTypes.MAPLE_BLOCKSET));

    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).sound(SoundType.WOOD).noCollission().noOcclusion()
                    .strength(0.5f).explosionResistance(0.5f), EBBlockTypes.MAPLE_BLOCKSET, 30, true));

    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).noCollission().noOcclusion()
                    .sound(SoundType.WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), EBBlockTypes.MAPLE_BLOCKSET));

    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_LOG.get()), 5, 5));

    public static final RegistryObject<Block> MAPLE_CRAFTING_TABLE = registerBlock("maple_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_MAPLE_CRAFTING_TABLE = registerBlock("colored_maple_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MAPLE_LADDER = registerBlock("maple_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> MAPLE_BOOKSHELF = registerBlock("maple_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_EMPTY_SHELF = registerBlock("maple_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_EMPTY_POTION_SHELF = registerBlock("maple_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_WATER_POTION_SHELF = registerBlock("maple_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_POTION_SHELF = registerBlock("maple_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_ALCHEMIST_SHELF = registerBlock("maple_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_BRICKSHELF = registerBlock("maple_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_NETHER_BRICKSHELF = registerBlock("maple_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_HANGING_SIGN = BLOCKS.register("maple_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_WALL_HANGING_SIGN = BLOCKS.register("maple_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MARIGOLD = registerBlock("marigold",
            () -> new FlowerBlock(MobEffects.LUCK, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_MARIGOLD = BLOCKS.register("potted_marigold",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.MARIGOLD, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            () -> new SaplingBlock(new RedMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_RED_MAPLE_SAPLING = BLOCKS.register("potted_red_maple_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.RED_MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> ORANGE_MAPLE_SAPLING = registerBlock("orange_maple_sapling",
            () -> new SaplingBlock(new OrangeMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_ORANGE_MAPLE_SAPLING = BLOCKS.register("potted_orange_maple_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ORANGE_MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> YELLOW_MAPLE_SAPLING = registerBlock("yellow_maple_sapling",
            () -> new SaplingBlock(new YellowMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_YELLOW_MAPLE_SAPLING = BLOCKS.register("potted_yellow_maple_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.YELLOW_MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            () -> new AncientLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_RED)));

    public static final RegistryObject<Block> ORANGE_MAPLE_LEAVES = registerBlock("orange_maple_leaves",
            () -> new OrangeMapleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_ORANGE)));

    public static final RegistryObject<Block> YELLOW_MAPLE_LEAVES = registerBlock("yellow_maple_leaves",
            () -> new YellowMapleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_YELLOW)));

    public static final RegistryObject<Block> RED_MAPLE_LEAVES_PILE = registerBlock("red_maple_leaves_pile",
            () -> new LeavesPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().mapColor(MapColor.COLOR_RED)));

    public static final RegistryObject<Block> ORANGE_MAPLE_LEAVES_PILE = registerBlock("orange_maple_leaves_pile",
            () -> new LeavesPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().mapColor(MapColor.COLOR_ORANGE)));

    public static final RegistryObject<Block> YELLOW_MAPLE_LEAVES_PILE = registerBlock("yellow_maple_leaves_pile",
            () -> new LeavesPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().mapColor(MapColor.COLOR_YELLOW)));

    public static final RegistryObject<Block> HOLLOW_OAK_LOG = registerBlock("hollow_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_OAK_LOG = registerBlock("hollow_stripped_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_SPRUCE_LOG = registerBlock("hollow_spruce_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_SPRUCE_LOG = registerBlock("hollow_stripped_spruce_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_BIRCH_LOG = registerBlock("hollow_birch_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_BIRCH_LOG = registerBlock("hollow_stripped_birch_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_JUNGLE_LOG = registerBlock("hollow_jungle_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_JUNGLE_LOG = registerBlock("hollow_stripped_jungle_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_ACACIA_LOG = registerBlock("hollow_acacia_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_ACACIA_LOG = registerBlock("hollow_stripped_acacia_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_DARK_OAK_LOG = registerBlock("hollow_dark_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_DARK_OAK_LOG = registerBlock("hollow_stripped_dark_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_MANGROVE_LOG = registerBlock("hollow_mangrove_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_MANGROVE_LOG = registerBlock("hollow_stripped_mangrove_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_CHERRY_LOG = registerBlock("hollow_cherry_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_CHERRY_LOG = registerBlock("hollow_stripped_cherry_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_ANCIENT_LOG = registerBlock("hollow_ancient_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_ANCIENT_LOG = registerBlock("hollow_stripped_ancient_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_MAPLE_LOG = registerBlock("hollow_maple_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_MAPLE_LOG = registerBlock("hollow_stripped_maple_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_WILLOW_LOG = registerBlock("hollow_willow_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_WILLOW_LOG = registerBlock("hollow_stripped_willow_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_CRIMSON_STEM = registerBlock("hollow_crimson_stem",
            () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_CRIMSON_STEM = registerBlock("hollow_stripped_crimson_stem",
            () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> HOLLOW_WARPED_STEM = registerBlock("hollow_warped_stem",
            () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_WARPED_STEM = registerBlock("hollow_stripped_warped_stem",
            () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> TUFF_BRICK_PILLAR = registerBlock("tuff_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_BRICKS.get())));

    public static final RegistryObject<Block> TUFF_BRICK_PEDESTAL = registerBlock("tuff_brick_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_BRICK_PILLAR.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICKS = registerBlock("mossy_polished_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_STAIRS = registerBlock("mossy_polished_stone_brick_stairs",
            () -> new StairBlock(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_SLAB = registerBlock("mossy_polished_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_WALL = registerBlock("mossy_polished_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_polished_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> IRON_BAR_DOOR = registerBlock("iron_bar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.METAL).noOcclusion(), BlockSetType.GOLD));

    public static final RegistryObject<Block> IRON_BAR_TRAPDOOR = registerBlock("iron_bar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.METAL).noOcclusion(), BlockSetType.GOLD));

    public static final RegistryObject<Block> KNITTED_RED_WOOL = registerBlock("knitted_red_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_RED_CARPET = registerBlock("knitted_red_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CARPET), 20, 60));

    public static final RegistryObject<Block> KNITTED_RED_STAIRS = registerBlock("knitted_red_stairs",
            () -> new FlammableStairBlock(EBBlocks.KNITTED_RED_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_RED_SLAB = registerBlock("knitted_red_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            () -> new FlammableStairBlock(Blocks.RED_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            () -> new FlammableStairBlock(Blocks.ORANGE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));

    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));

    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            () -> new FlammableStairBlock(Blocks.YELLOW_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));

    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));

    public static final RegistryObject<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            () -> new FlammableStairBlock(Blocks.LIME_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));

    public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));

    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            () -> new FlammableStairBlock(Blocks.GREEN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));

    public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));

    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            () -> new FlammableStairBlock(Blocks.CYAN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));

    public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            () -> new FlammableStairBlock(Blocks.LIGHT_BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            () -> new FlammableStairBlock(Blocks.BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            () -> new FlammableStairBlock(Blocks.PURPLE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));

    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));

    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            () -> new FlammableStairBlock(Blocks.MAGENTA_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));

    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));

    public static final RegistryObject<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            () -> new FlammableStairBlock(Blocks.PINK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));

    public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));

    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            () -> new FlammableStairBlock(Blocks.GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));

    public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            () -> new FlammableStairBlock(Blocks.LIGHT_GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));

    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            () -> new FlammableStairBlock(Blocks.BROWN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));

    public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));

    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            () -> new FlammableStairBlock(Blocks.WHITE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));

    public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));

    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            () -> new FlammableStairBlock(Blocks.BLACK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));

    public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_BLACK_WOOL = registerBlock("knitted_black_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_BLACK_CARPET = registerBlock("knitted_black_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_CARPET), 20, 60));

    public static final RegistryObject<Block> KNITTED_BLACK_STAIRS = registerBlock("knitted_black_stairs",
            () -> new FlammableStairBlock(EBBlocks.KNITTED_RED_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_BLACK_SLAB = registerBlock("knitted_black_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_PURPLE_WOOL = registerBlock("knitted_purple_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_PURPLE_CARPET = registerBlock("knitted_purple_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_CARPET), 20, 60));

    public static final RegistryObject<Block> KNITTED_PURPLE_STAIRS = registerBlock("knitted_purple_stairs",
            () -> new FlammableStairBlock(EBBlocks.KNITTED_RED_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_PURPLE_SLAB = registerBlock("knitted_purple_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_BLUE_WOOL = registerBlock("knitted_blue_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_BLUE_CARPET = registerBlock("knitted_blue_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_CARPET), 20, 60));

    public static final RegistryObject<Block> KNITTED_BLUE_STAIRS = registerBlock("knitted_blue_stairs",
            () -> new FlammableStairBlock(EBBlocks.KNITTED_BLUE_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_BLUE_SLAB = registerBlock("knitted_blue_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_CYAN_WOOL = registerBlock("knitted_cyan_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_CYAN_CARPET = registerBlock("knitted_cyan_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_CARPET), 20, 60));

    public static final RegistryObject<Block> KNITTED_CYAN_STAIRS = registerBlock("knitted_cyan_stairs",
            () -> new FlammableStairBlock(EBBlocks.KNITTED_CYAN_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));

    public static final RegistryObject<Block> KNITTED_CYAN_SLAB = registerBlock("knitted_cyan_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));

    public static final RegistryObject<Block> MIRALEN_BLOCK = registerBlock("miralen_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> BUDDING_MIRALEN_BLOCK = registerBlock("budding_miralen_block",
            () -> new BuddingMiralenBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BLOCK.get()).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().randomTicks()));

    public static final RegistryObject<Block> SMALL_MIRALEN_BUD = registerBlock("small_miralen_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));

    public static final RegistryObject<Block> MEDIUM_MIRALEN_BUD = registerBlock("medium_miralen_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));

    public static final RegistryObject<Block> LARGE_MIRALEN_BUD = registerBlock("large_miralen_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));

    public static final RegistryObject<Block> MIRALEN_CLUSTER = registerBlock("miralen_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> MIRALEN_GLASS = registerBlock("miralen_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> MIRALEN_GLASS_PANE = registerBlock("miralen_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> MIRALEN_BRICKS = registerBlock("miralen_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_MIRALEN_BRICKS = registerBlock("cracked_miralen_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_BRICK_STAIRS = registerBlock("miralen_brick_stairs",
            () -> new StairBlock(EBBlocks.MIRALEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_BRICK_SLAB = registerBlock("miralen_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_BRICK_WALL = registerBlock("miralen_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MIRALEN_BRICK_VERTICAL_STAIRS = registerBlock("miralen_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_TILES = registerBlock("miralen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_MIRALEN_TILES = registerBlock("cracked_miralen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_TILE_STAIRS = registerBlock("miralen_tile_stairs",
            () -> new StairBlock(EBBlocks.MIRALEN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_TILE_SLAB = registerBlock("miralen_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_TILE_WALL = registerBlock("miralen_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MIRALEN_TILE_VERTICAL_STAIRS = registerBlock("miralen_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BRICKS.get())));

    public static final RegistryObject<Block> MIRALEN_LAMP = registerBlock("miralen_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> GOLDEN_BIRCH_LEAVES = registerBlock("golden_birch_leaves",
            () -> new YellowMapleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).mapColor(MapColor.COLOR_YELLOW)));

    public static final RegistryObject<Block> GOLDEN_BIRCH_SAPLING = registerBlock("golden_birch_sapling",
            () -> new SaplingBlock(new GoldenBirchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING)));

    public static final RegistryObject<Block> POTTED_GOLDEN_BIRCH_SAPLING = BLOCKS.register("potted_golden_birch_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.GOLDEN_BIRCH_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_BIRCH_SAPLING)));

    public static final RegistryObject<Block> ACORN = registerBlock("acorn",
            () -> new SaplingBlock(new AcornTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> REACHING_LANTERN = registerBlock("reaching_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel(state -> 8)));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_VERTICAL_STAIRS = registerBlock("polished_sulfuric_brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_sulfuric_brimstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_sulfuric_brimstone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE_TILES.get())));

    public static final RegistryObject<Block> SULFURIC_BRIMSTONE_LAMP = registerBlock("sulfuric_brimstone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> SULFURIC_BRIMSTONE_WINDOW = registerBlock("sulfuric_brimstone_window",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_PILLAR = registerBlock("polished_sulfuric_brimstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_SULFURIC_BRIMSTONE_PEDESTAL = registerBlock("polished_sulfuric_brimstone_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> ANCIENT_VINE = registerBlock("ancient_vine",
            () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE).lightLevel(state -> 4)));

    public static final RegistryObject<Block> POTTED_ACORN = BLOCKS.register("potted_acorn",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ACORN, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_EMPTY_SHELF = registerBlock("bamboo_empty_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_EMPTY_POTION_SHELF = registerBlock("bamboo_empty_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_WATER_POTION_SHELF = registerBlock("bamboo_water_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_POTION_SHELF = registerBlock("bamboo_potion_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_ALCHEMIST_SHELF = registerBlock("bamboo_alchemist_shelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_BRICKSHELF = registerBlock("bamboo_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));

    public static final RegistryObject<Block> BAMBOO_NETHER_BRICKSHELF = registerBlock("bamboo_nether_brickshelf",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).ignitedByLava(), 30, 20));


    public static <B extends Block>RegistryObject<B> registerBlock(String name, Supplier<B> block) {
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
