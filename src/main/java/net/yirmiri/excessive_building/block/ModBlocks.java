package net.yirmiri.excessive_building.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.block.custom.ModCraftingTableBlock;
import net.yirmiri.excessive_building.block.custom.SpeedBlock;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.custom.VerticalStairBlock;
import net.yirmiri.excessive_building.item.ModItems;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExcessiveBuilding.MOD_ID);


            public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic",
                    () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

            public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
                    () -> new StairBlock(() -> ModBlocks.OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

            public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

            public static final RegistryObject<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
                    () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

            public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
                    () -> new StairBlock(() -> ModBlocks.SPRUCE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

            public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.BIRCH_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.JUNGLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.ACACIA_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.DARK_OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.MANGROVE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.CRIMSON_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> WARPED_MOSAIC = registerBlock("warped_mosaic",
                () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
                () -> new StairBlock(() -> ModBlocks.WARPED_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

        public static final RegistryObject<Block> WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                        .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICKS = registerBlock("cobbled_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_STAIRS = registerBlock("cobbled_deepslate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_SLAB = registerBlock("cobbled_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_WALL = registerBlock("cobbled_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICKS = registerBlock("blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_STAIRS = registerBlock("blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_SLAB = registerBlock("blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_WALL = registerBlock("blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EMPTY_SHELF = registerBlock("empty_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> EMPTY_POTION_SHELF = registerBlock("empty_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WATER_POTION_SHELF = registerBlock("water_potion_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> POTION_SHELF = registerBlock("potion_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ALCHEMIST_SHELF = registerBlock("alchemist_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GOLDEN_BRICKS = registerBlock("golden_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_BRICK_STAIRS = registerBlock("golden_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GOLDEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_BRICK_SLAB = registerBlock("golden_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = registerBlock("mossy_cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = registerBlock("mossy_cobblestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_SLAB = registerBlock("mossy_cobblestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_WALL = registerBlock("mossy_cobblestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICKS = registerBlock("mossy_cobbled_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_cobbled_deepslate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_cobbled_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_WALL = registerBlock("mossy_cobbled_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.CHERRY_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE = registerBlock("soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = registerBlock("soul_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_SLAB = registerBlock("soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_WALL = registerBlock("soul_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICKS = registerBlock("soul_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_STAIRS = registerBlock("soul_sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_SLAB = registerBlock("soul_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_WALL = registerBlock("soul_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE = registerBlock("cut_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_SLAB = registerBlock("cut_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = registerBlock("chiseled_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE = registerBlock("smooth_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = registerBlock("smooth_soul_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_SOUL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_SLAB = registerBlock("smooth_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE = registerBlock("brimstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_STAIRS = registerBlock("brimstone_stairs",
            () -> new StairBlock(() -> ModBlocks.BRIMSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_SLAB = registerBlock("brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE = registerBlock("polished_brimstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_STAIRS = registerBlock("polished_brimstone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BRIMSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_SLAB = registerBlock("polished_brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_WALL = registerBlock("polished_brimstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICKS = registerBlock("polished_brimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_STAIRS = registerBlock("polished_brimstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BRIMSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_SLAB = registerBlock("polished_brimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_WALL = registerBlock("polished_brimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICKS = registerBlock("cracked_polished_brimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_STAIRS = registerBlock("cracked_polished_brimstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_SLAB = registerBlock("cracked_polished_brimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_WALL = registerBlock("cracked_polished_brimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILES = registerBlock("polished_brimstone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_STAIRS = registerBlock("polished_brimstone_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BRIMSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_SLAB = registerBlock("polished_brimstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_WALL = registerBlock("polished_brimstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_LANTERN = registerBlock("brimstone_lantern",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> BRIMSTONE_WINDOW = registerBlock("brimstone_window",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> FIERY_CRYSTAL_BLOCK = registerBlock("fiery_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(3f).explosionResistance(3f).sound(SoundType.AMETHYST).lightLevel(state -> 7).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CONSTRUCTION_TABLE = registerBlock("construction_table",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new SpeedBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(2f).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_OAK = registerBlock("chiseled_oak",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_SPRUCE = registerBlock("chiseled_spruce",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_BIRCH = registerBlock("chiseled_birch",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_JUNGLE = registerBlock("chiseled_jungle",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_ACACIA = registerBlock("chiseled_acacia",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_DARK_OAK = registerBlock("chiseled_dark_oak",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_MANGROVE = registerBlock("chiseled_mangrove",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHISELED_CHERRY = registerBlock("chiseled_cherry",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> CHISELED_BAMBOO = registerBlock("chiseled_bamboo",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> CHISELED_CRIMSON = registerBlock("chiseled_crimson",
            () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> CHISELED_WARPED = registerBlock("chiseled_warped",
            () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(50f).explosionResistance(1200f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OBSIDIAN_TILES = registerBlock("obsidian_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(50f).explosionResistance(1200f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LOGO_BLOCK = registerBlock("logo_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).explosionResistance(1f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(0.5f).explosionResistance(0.5f).sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE = registerBlock("cobbled_granite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE = registerBlock("cobbled_diorite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_ANDESITE_WALL = registerBlock("cobbled_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICKS = registerBlock("crimson_mossy_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS = registerBlock("crimson_mossy_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB = registerBlock("crimson_mossy_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL = registerBlock("crimson_mossy_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICKS = registerBlock("warped_mossy_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS = registerBlock("warped_mossy_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WARPED_MOSSY_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_SLAB = registerBlock("warped_mossy_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_WALL = registerBlock("warped_mossy_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("crimson_mossy_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("crimson_mossy_polished_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("crimson_mossy_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("crimson_mossy_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("warped_mossy_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("warped_mossy_polished_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("warped_mossy_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("warped_mossy_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICKS = registerBlock("smooth_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_STAIRS = registerBlock("smooth_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_SLAB = registerBlock("smooth_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_WALL = registerBlock("smooth_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICKS = registerBlock("lapis_lazuli_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_STAIRS = registerBlock("lapis_lazuli_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LAPIS_LAZULI_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_SLAB = registerBlock("lapis_lazuli_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OAK_CRAFTING_TABLE = registerBlock("oak_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_STAIRS = registerBlock("smooth_stone_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_SLAB = registerBlock("smooth_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_WALL = registerBlock("smooth_stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OAK_VERTICAL_STAIRS = registerBlock("oak_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_VERTICAL_STAIRS = registerBlock("spruce_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_VERTICAL_STAIRS = registerBlock("birch_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_VERTICAL_STAIRS = registerBlock("jungle_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_VERTICAL_STAIRS = registerBlock("acacia_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_VERTICAL_STAIRS = registerBlock("dark_oak_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_VERTICAL_STAIRS = registerBlock("mangrove_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHERRY_VERTICAL_STAIRS = registerBlock("cherry_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> BAMBOO_VERTICAL_STAIRS = registerBlock("bamboo_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> BAMBOO_MOSAIC_VERTICAL_STAIRS = registerBlock("bamboo_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> CRIMSON_VERTICAL_STAIRS = registerBlock("crimson_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_VERTICAL_STAIRS = registerBlock("warped_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> STONE_VERTICAL_STAIRS = registerBlock("stone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLESTONE_VERTICAL_STAIRS = registerBlock("cobblestone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL_STAIRS = registerBlock("mossy_cobblestone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STONE_BRICK_VERTICAL_STAIRS = registerBlock("stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_STONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_TILE_VERTICAL_STAIRS = registerBlock("deepslate_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_VERTICAL_STAIRS = registerBlock("polished_deepslate_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_VERTICAL_STAIRS = registerBlock("cobbled_deepslate_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_VERTICAL_STAIRS = registerBlock("blackstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL_STAIRS = registerBlock("polished_blackstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRICK_VERTICAL_STAIRS = registerBlock("brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> QUARTZ_VERTICAL_STAIRS = registerBlock("quartz_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL_STAIRS = registerBlock("smooth_quartz_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_VERTICAL_STAIRS = registerBlock("sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL_STAIRS = registerBlock("red_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).explosionResistance(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_red_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_VERTICAL_STAIRS = registerBlock("prismarine_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL_STAIRS = registerBlock("dark_prismarine_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_BRICK_VERTICAL_STAIRS = registerBlock("prismarine_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_BRICK_VERTICAL_STAIRS = registerBlock("nether_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_NETHER_BRICK_VERTICAL_STAIRS = registerBlock("red_nether_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ANDESITE_VERTICAL_STAIRS = registerBlock("andesite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRANITE_VERTICAL_STAIRS = registerBlock("granite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIORITE_VERTICAL_STAIRS = registerBlock("diorite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL_STAIRS = registerBlock("polished_andesite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL_STAIRS = registerBlock("polished_diorite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL_STAIRS = registerBlock("polished_granite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPUR_VERTICAL_STAIRS = registerBlock("purpur_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MUD_BRICK_VERTICAL_STAIRS = registerBlock("mud_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(3f).sound(SoundType.MUD_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STONE_BRICK_VERTICAL_STAIRS = registerBlock("end_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).explosionResistance(9f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("oak_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_MOSAIC_VERTICAL_STAIRS = registerBlock("spruce_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_MOSAIC_VERTICAL_STAIRS = registerBlock("birch_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_MOSAIC_VERTICAL_STAIRS = registerBlock("jungle_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_MOSAIC_VERTICAL_STAIRS = registerBlock("acacia_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("dark_oak_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_MOSAIC_VERTICAL_STAIRS = registerBlock("mangrove_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHERRY_MOSAIC_VERTICAL_STAIRS = registerBlock("cherry_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> CRIMSON_MOSAIC_VERTICAL_STAIRS = registerBlock("crimson_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_MOSAIC_VERTICAL_STAIRS = registerBlock("warped_mosaic_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2f).explosionResistance(3f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> COBBLESTONE_BRICK_VERTICAL_STAIRS = registerBlock("cobblestone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BRICK_VERTICAL_STAIRS = registerBlock("smooth_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_cobblestone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_cobbled_deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).explosionResistance(6f).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("crimson_mossy_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("warped_mossy_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("crimson_mossy_polished_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("warped_mossy_polished_blackstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_BRICK_VERTICAL_STAIRS = registerBlock("golden_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_VERTICAL_STAIRS = registerBlock("lapis_lazuli_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).explosionResistance(3f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIMSTONE_VERTICAL_STAIRS = registerBlock("brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.BRIMSTONE.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_VERTICAL_STAIRS = registerBlock("polished_brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.POLISHED_BRIMSTONE.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_brimstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.POLISHED_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_brimstone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.POLISHED_BRIMSTONE_TILES.get())));

    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("cracked_polished_brimstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SOUL_SANDSTONE_VERTICAL_STAIRS = registerBlock("soul_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SOUL_SANDSTONE.get())));

    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("soul_sandstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SOUL_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("sandstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("red_sandstone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.RED_SANDSTONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_soul_sandstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SMOOTH_SOUL_SANDSTONE.get())));

    public static final RegistryObject<Block> BLUE_NETHER_BRICK_VERTICAL_STAIRS = registerBlock("blue_nether_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.BLUE_NETHER_BRICKS.get())));

    public static final RegistryObject<Block> COBBLED_DIORITE_VERTICAL_STAIRS = registerBlock("cobbled_diorite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_DIORITE.get())));

    public static final RegistryObject<Block> COBBLED_ANDESITE_VERTICAL_STAIRS = registerBlock("cobbled_andesite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_ANDESITE.get())));

    public static final RegistryObject<Block> COBBLED_GRANITE_VERTICAL_STAIRS = registerBlock("cobbled_granite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_GRANITE.get())));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_granite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.POLISHED_GRANITE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_andesite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.POLISHED_ANDESITE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_diorite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.POLISHED_DIORITE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_VERTICAL_STAIRS = registerBlock("smooth_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_TILE_VERTICAL_STAIRS = registerBlock("smooth_stone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SMOOTH_STONE_TILES.get())));

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_deepslate_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())));

    public static final RegistryObject<Block> NETHER_TILES = registerBlock("nether_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_TILE_STAIRS = registerBlock("nether_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> NETHER_TILE_SLAB = registerBlock("nether_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> NETHER_TILE_WALL = registerBlock("nether_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> NETHER_TILE_VERTICAL_STAIRS = registerBlock("nether_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILES = registerBlock("red_nether_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_NETHER_TILE_STAIRS = registerBlock("red_nether_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILE_SLAB = registerBlock("red_nether_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILE_WALL = registerBlock("red_nether_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> RED_NETHER_TILE_VERTICAL_STAIRS = registerBlock("red_nether_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILES = registerBlock("blue_nether_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).explosionResistance(6f).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_STAIRS = registerBlock("blue_nether_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_SLAB = registerBlock("blue_nether_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_WALL = registerBlock("blue_nether_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> BLUE_NETHER_TILE_VERTICAL_STAIRS = registerBlock("blue_nether_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_TILES.get())));

    public static final RegistryObject<Block> SULPHURIC_BRIMSTONE = registerBlock("sulphuric_brimstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).explosionResistance(6f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SULPHURIC_BRIMSTONE_STAIRS = registerBlock("sulphuric_brimstone_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.SULPHURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> SULPHURIC_BRIMSTONE_SLAB = registerBlock("sulphuric_brimstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.SULPHURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> SULPHURIC_BRIMSTONE_VERTICAL_STAIRS = registerBlock("sulphuric_brimstone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(ModBlocks.SULPHURIC_BRIMSTONE.get())));

    public static final RegistryObject<Block> COLORED_BIRCH_CRAFTING_TABLE = registerBlock("colored_birch_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_SPRUCE_CRAFTING_TABLE = registerBlock("colored_spruce_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_JUNGLE_CRAFTING_TABLE = registerBlock("colored_jungle_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_ACACIA_CRAFTING_TABLE = registerBlock("colored_acacia_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_DARK_OAK_CRAFTING_TABLE = registerBlock("colored_dark_oak_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_MANGROVE_CRAFTING_TABLE = registerBlock("colored_mangrove_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COLORED_CHERRY_CRAFTING_TABLE = registerBlock("colored_cherry_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> COLORED_CRIMSON_CRAFTING_TABLE = registerBlock("colored_crimson_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> COLORED_WARPED_CRAFTING_TABLE = registerBlock("colored_warped_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.NETHER_WOOD)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registryBlockItem(name, toReturn);
                return toReturn;
            }

            private static <T extends Block> void registryBlockItem(String name, RegistryObject<T> block) {
                ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
            }

            public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
            }
}
