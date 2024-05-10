package net.yirmiri.excessive_building.register;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.*;
import net.yirmiri.excessive_building.block.flammable.*;
import net.yirmiri.excessive_building.util.EBBlockTypes;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.worldgen.feature.tree.*;

import java.util.function.Supplier;

public class EBBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExcessiveBuilding.MODID);
//TODO: FINISH ORGANIZING REGISTRIES OR ELSE ILL GO FUCKING INSANE
    //WOOD
    public static final RegistryObject<Block> OAK_MOSAIC = register("oak_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.OAK_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> OAK_MOSAIC_SLAB = register("oak_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> SPRUCE_MOSAIC = register("spruce_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = register("spruce_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.SPRUCE_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = register("spruce_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> BIRCH_MOSAIC = register("birch_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = register("birch_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.BIRCH_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = register("birch_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> JUNGLE_MOSAIC = register("jungle_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = register("jungle_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.JUNGLE_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = register("jungle_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> ACACIA_MOSAIC = register("acacia_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = register("acacia_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.ACACIA_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = register("acacia_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC = register("dark_oak_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = register("dark_oak_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.DARK_OAK_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = register("dark_oak_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> MANGROVE_MOSAIC = register("mangrove_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = register("mangrove_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.MANGROVE_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.GENERIC_WOOD), 20, 5));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = register("mangrove_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHERRY_MOSAIC = register("cherry_mosaic", () -> new FlammableBlock(EBProperties.BlockProperties.CHERRY_WOOD, 20, 5));
    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = register("cherry_mosaic_stairs", () -> new FlammableStairBlock(EBBlocks.CHERRY_MOSAIC.get().defaultBlockState(), EBProperties.BlockProperties.CHERRY_WOOD, 20, 5));
    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = register("cherry_mosaic_slab", () -> new FlammableSlabBlock(EBProperties.BlockProperties.CHERRY_WOOD, 20, 5));
    public static final RegistryObject<Block> CRIMSON_MOSAIC = register("crimson_mosaic", () -> new Block(EBProperties.BlockProperties.CRIMSON_WOOD));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_STAIRS = register("crimson_mosaic_stairs", () -> new StairBlock(() -> EBBlocks.CRIMSON_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.CRIMSON_WOOD)));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_SLAB = register("crimson_mosaic_slab", () -> new SlabBlock(EBProperties.BlockProperties.CRIMSON_WOOD));
    public static final RegistryObject<Block> WARPED_MOSAIC = register("warped_mosaic", () -> new Block(EBProperties.BlockProperties.WARPED_WOOD));
    public static final RegistryObject<Block> WARPED_MOSAIC_STAIRS = register("warped_mosaic_stairs", () -> new StairBlock(() -> EBBlocks.WARPED_MOSAIC.get().defaultBlockState(), (EBProperties.BlockProperties.WARPED_WOOD)));
    public static final RegistryObject<Block> WARPED_MOSAIC_SLAB = register("warped_mosaic_slab", () -> new SlabBlock(EBProperties.BlockProperties.WARPED_WOOD));
    public static final RegistryObject<Block> CHISELED_OAK = register("chiseled_oak", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_SPRUCE = register("chiseled_spruce", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_BIRCH = register("chiseled_birch", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_JUNGLE = register("chiseled_jungle", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_ACACIA = register("chiseled_acacia", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_DARK_OAK = register("chiseled_dark_oak", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_MANGROVE = register("chiseled_mangrove", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_CHERRY = register("chiseled_cherry", () -> new FlammableBlock(EBProperties.BlockProperties.CHERRY_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_BAMBOO = register("chiseled_bamboo", () -> new FlammableBlock(EBProperties.BlockProperties.BAMBOO_WOOD, 20, 5));
    public static final RegistryObject<Block> CHISELED_CRIMSON = register("chiseled_crimson", () -> new Block(EBProperties.BlockProperties.CRIMSON_WOOD));
    public static final RegistryObject<Block> CHISELED_WARPED = register("chiseled_warped", () -> new Block(EBProperties.BlockProperties.WARPED_WOOD));

    //COBBLED STONE
    public static final RegistryObject<Block> COBBLESTONE_BRICKS = register("cobblestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", () -> new StairBlock(() -> EBBlocks.COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICKS = register("cobbled_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_STAIRS = register("cobbled_deepslate_brick_stairs", () -> new StairBlock(() -> EBBlocks.COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_SLAB = register("cobbled_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_WALL = register("cobbled_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> BLACKSTONE_BRICKS = register("blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> BLACKSTONE_BRICK_STAIRS = register("blackstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> BLACKSTONE_BRICK_SLAB = register("blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> BLACKSTONE_BRICK_WALL = register("blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", () -> new StairBlock(() -> EBBlocks.MOSSY_COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICKS = register("mossy_cobbled_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS = register("mossy_cobbled_deepslate_brick_stairs", () -> new StairBlock(() -> EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB = register("mossy_cobbled_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_WALL = register("mossy_cobbled_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICKS = register("crimson_mossy_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS = register("crimson_mossy_blackstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.CRIMSON_MOSSY_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB = register("crimson_mossy_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL = register("crimson_mossy_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICKS = register("warped_mossy_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS = register("warped_mossy_blackstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.WARPED_MOSSY_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_SLAB = register("warped_mossy_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_WALL = register("warped_mossy_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLESTONE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_COBBLED_DEEPSLATE_BRICKS = register("cracked_cobbled_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DEEPSLATE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_BLACKSTONE_BRICKS = register("cracked_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BLACKSTONE_BRICKS.get())));

    //STONE BRICKS
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICKS = register("mossy_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = register("mossy_deepslate_brick_stairs", () -> new StairBlock(() -> EBBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_SLAB = register("mossy_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_WALL = register("mossy_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    //SANDSTONE
    public static final RegistryObject<Block> SANDSTONE_BRICKS = register("sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE = register("soul_sandstone", () -> new Block(EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", () -> new StairBlock(() -> EBBlocks.SOUL_SANDSTONE.get().defaultBlockState(), EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", () -> new WallBlock(EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.SOUL_SANDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", () -> new Block(EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", () -> new Block(EBProperties.BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", () -> new StairBlock(() -> EBBlocks.SMOOTH_SOUL_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_BRICKS = register("chiseled_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_BRICKS = register("chiseled_red_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE_BRICKS = register("chiseled_soul_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_TILES = register("sandstone_tiles", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_TILE_STAIRS = register("sandstone_tile_stairs", () -> new StairBlock(() -> EBBlocks.SANDSTONE_TILES.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_TILE_VERTICAL_STAIRS = register("sandstone_tile_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_TILE_SLAB = register("sandstone_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SANDSTONE = register("polished_sandstone", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_SANDSTONE.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SANDSTONE_VERTICAL_STAIRS = register("polished_sandstone_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> DECORATED_SANDSTONE_BRICKS = register("decorated_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> ENGRAVED_SANDSTONE_BRICKS = register("engraved_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_PILLAR = register("sandstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> SANDSTONE_PEDESTAL = register("sandstone_pedestal", () -> new PedestalBlock(EBProperties.BlockProperties.ROUGH_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_TILES = register("red_sandstone_tiles", () -> new Block(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_TILE_STAIRS = register("red_sandstone_tile_stairs", () -> new StairBlock(() -> EBBlocks.RED_SANDSTONE_TILES.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_TILE_VERTICAL_STAIRS = register("red_sandstone_tile_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_TILE_SLAB = register("red_sandstone_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE = register("polished_red_sandstone", () -> new Block(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_RED_SANDSTONE.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE_VERTICAL_STAIRS = register("polished_red_sandstone_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> DECORATED_RED_SANDSTONE_BRICKS = register("decorated_red_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> ENGRAVED_RED_SANDSTONE_BRICKS = register("engraved_red_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_PILLAR = register("red_sandstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> RED_SANDSTONE_PEDESTAL = register("red_sandstone_pedestal", () -> new PedestalBlock(EBProperties.BlockProperties.ROUGH_RED_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_TILES = register("soul_sandstone_tiles", () -> new Block(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_TILE_STAIRS = register("soul_sandstone_tile_stairs", () -> new StairBlock(() -> EBBlocks.SOUL_SANDSTONE_TILES.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_TILE_VERTICAL_STAIRS = register("soul_sandstone_tile_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_TILE_SLAB = register("soul_sandstone_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", () -> new Block(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_SOUL_SANDSTONE.get().defaultBlockState(), EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS = register("polished_soul_sandstone_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> DECORATED_SOUL_SANDSTONE_BRICKS = register("decorated_soul_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> ENGRAVED_SOUL_SANDSTONE_BRICKS = register("engraved_soul_sandstone_bricks", () -> new Block(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));
    public static final RegistryObject<Block> SOUL_SANDSTONE_PEDESTAL = register("soul_sandstone_pedestal", () -> new PedestalBlock(EBProperties.BlockProperties.ROUGH_SOUL_SANDSTONE));

    //BRIMSTONE
    public static final RegistryObject<Block> BRIMSTONE = register("brimstone", () -> new Block(EBProperties.BlockProperties.BRIMSTONE));
    public static final RegistryObject<Block> BRIMSTONE_STAIRS = register("brimstone_stairs", () -> new StairBlock(() -> EBBlocks.BRIMSTONE.get().defaultBlockState(), EBProperties.BlockProperties.BRIMSTONE));
    public static final RegistryObject<Block> BRIMSTONE_SLAB = register("brimstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.BRIMSTONE));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE = register("polished_brimstone", () -> new Block(EBProperties.BlockProperties.POLISHED_BRIMSTONE));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_STAIRS = register("polished_brimstone_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_BRIMSTONE.get().defaultBlockState(), EBProperties.BlockProperties.POLISHED_BRIMSTONE));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_SLAB = register("polished_brimstone_slab", () -> new SlabBlock(EBProperties.BlockProperties.POLISHED_BRIMSTONE));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_WALL = register("polished_brimstone_wall", () -> new WallBlock(EBProperties.BlockProperties.POLISHED_BRIMSTONE));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICKS = register("polished_brimstone_bricks", () -> new Block(EBProperties.BlockProperties.POLISHED_BRIMSTONE_BRICKS));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_STAIRS = register("polished_brimstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_BRIMSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.POLISHED_BRIMSTONE_BRICKS));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_SLAB = register("polished_brimstone_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.POLISHED_BRIMSTONE_BRICKS));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_WALL = register("polished_brimstone_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.POLISHED_BRIMSTONE_BRICKS));
    public static final RegistryObject<Block> CRACKED_POLISHED_BRIMSTONE_BRICKS = register("cracked_polished_brimstone_bricks", () -> new Block(EBProperties.BlockProperties.POLISHED_BRIMSTONE_BRICKS));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILES = register("polished_brimstone_tiles", () -> new Block(EBProperties.BlockProperties.POLISHED_BRIMSTONE_TILES));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_STAIRS = register("polished_brimstone_tile_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_BRIMSTONE_TILES.get().defaultBlockState(), EBProperties.BlockProperties.POLISHED_BRIMSTONE_TILES));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_SLAB = register("polished_brimstone_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.POLISHED_BRIMSTONE_TILES));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_WALL = register("polished_brimstone_tile_wall", () -> new WallBlock(EBProperties.BlockProperties.POLISHED_BRIMSTONE_TILES));
    public static final RegistryObject<Block> BRIMSTONE_LAMP = register("brimstone_lamp", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> 15)));
    public static final RegistryObject<Block> BRIMSTONE_WINDOW = register("brimstone_window", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> 15)));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_PILLAR = register("polished_brimstone_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS.get())));

    //OBSIDIAN
    public static final RegistryObject<Block> OBSIDIAN_BRICKS = register("obsidian_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> OBSIDIAN_TILES = register("obsidian_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> OBSIDIAN_TILE_STAIRS = register("obsidian_tile_stairs", () -> new StairBlock(() -> EBBlocks.OBSIDIAN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_TILES.get())));
    public static final RegistryObject<Block> OBSIDIAN_TILE_SLAB = register("obsidian_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_TILES.get())));
    public static final RegistryObject<Block> OBSIDIAN_TILE_VERTICAL_STAIRS = register("obsidian_tile_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_TILES.get())));
    public static final RegistryObject<Block> OBSIDIAN_BRICK_STAIRS = register("obsidian_brick_stairs", () -> new StairBlock((EBBlocks.OBSIDIAN_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));
    public static final RegistryObject<Block> OBSIDIAN_BRICK_SLAB = register("obsidian_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));
    public static final RegistryObject<Block> OBSIDIAN_BRICK_VERTICAL_STAIRS = register("obsidian_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS = register("cracked_obsidian_bricks", () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.OBSIDIAN_BRICKS.get())));

    //POLISHED ANDESITE/GRANITE/DIORITE
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = register("polished_andesite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = register("polished_granite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = register("polished_diorite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = register("polished_andesite_brick_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = register("polished_andesite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = register("polished_andesite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = register("polished_granite_brick_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = register("polished_granite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = register("polished_granite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = register("polished_diorite_brick_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = register("polished_diorite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = register("polished_diorite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    //COBBLED ANDESITE/GRANITE/DIORITE
    public static final RegistryObject<Block> COBBLED_ANDESITE = register("cobbled_andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_GRANITE = register("cobbled_granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_DIORITE = register("cobbled_diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_ANDESITE_STAIRS = register("cobbled_andesite_stairs", () -> new StairBlock(() -> EBBlocks.COBBLED_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_ANDESITE_SLAB = register("cobbled_andesite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_ANDESITE_WALL = register("cobbled_andesite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_GRANITE_STAIRS = register("cobbled_granite_stairs", () -> new StairBlock(() -> EBBlocks.COBBLED_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_GRANITE_SLAB = register("cobbled_granite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_GRANITE_WALL = register("cobbled_granite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_DIORITE_STAIRS = register("cobbled_diorite_stairs", () -> new StairBlock(() -> EBBlocks.COBBLED_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_DIORITE_SLAB = register("cobbled_diorite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_DIORITE_WALL = register("cobbled_diorite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    //POLISHED BLACKSTONE
    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS = register("crimson_mossy_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = register("crimson_mossy_polished_blackstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = register("crimson_mossy_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = register("crimson_mossy_polished_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS = register("warped_mossy_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = register("warped_mossy_polished_blackstone_brick_stairs", () -> new StairBlock(() -> EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = register("warped_mossy_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = register("warped_mossy_polished_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    //SMOOTH STONE
    public static final RegistryObject<Block> SMOOTH_STONE_BRICKS = register("smooth_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_STAIRS = register("smooth_stone_brick_stairs", () -> new StairBlock(() -> EBBlocks.SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_SLAB = register("smooth_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_WALL = register("smooth_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_TILES = register("smooth_stone_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_TILE_STAIRS = register("smooth_stone_tile_stairs", () -> new StairBlock(() -> EBBlocks.SMOOTH_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_TILE_SLAB = register("smooth_stone_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_TILE_WALL = register("smooth_stone_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    //boring old normal bricks + its cooler smoother sibling
    public static final RegistryObject<Block> SMOOTH_BRICKS = register("smooth_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SMOOTH_BRICK_STAIRS = register("smooth_brick_stairs", () -> new StairBlock(() -> EBBlocks.SMOOTH_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SMOOTH_BRICK_SLAB = register("smooth_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SMOOTH_BRICK_WALL = register("smooth_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CRACKED_SMOOTH_BRICKS = register("cracked_smooth_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    //MISC
    public static final RegistryObject<Block> LOGO_BLOCK = register("logo_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> ACORN = register("acorn", () -> new SaplingBlock(new AcornTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_ACORN = BLOCKS.register("potted_acorn", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ACORN, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> GOLDEN_BIRCH_SAPLING = register("golden_birch_sapling", () -> new SaplingBlock(new GoldenBirchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING)));
    public static final RegistryObject<Block> POTTED_GOLDEN_BIRCH_SAPLING = BLOCKS.register("potted_golden_birch_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.GOLDEN_BIRCH_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_BIRCH_SAPLING)));
    public static final RegistryObject<Block> AMETHYST_FIRE = register("amethyst_fire", () -> new AmethystFireBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_FIRE).lightLevel(state -> 15)));
    public static final RegistryObject<Block> ASPHALT = register("asphalt", () -> new SpeedBlock(EBProperties.BlockProperties.ASPHALT));
    public static final RegistryObject<Block> ASPHALT_STAIRS = register("asphalt_stairs", () -> new SpeedStairBlock(EBBlocks.ASPHALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));
    public static final RegistryObject<Block> ASPHALT_SLAB = register("asphalt_slab", () -> new SpeedSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));
    public static final RegistryObject<Block> ASPHALT_VERTICAL_STAIRS = register("asphalt_vertical_stairs", () -> new SpeedVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ASPHALT.get())));

    //RESOURCE
    public static final RegistryObject<Block> GOLDEN_BRICKS = register("golden_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLDEN_BRICK_STAIRS = register("golden_brick_stairs", () -> new StairBlock(() -> EBBlocks.GOLDEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLDEN_BRICK_SLAB = register("golden_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> LAPIS_LAZULI_BRICKS = register("lapis_lazuli_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_STAIRS = register("lapis_lazuli_brick_stairs", () -> new StairBlock(() -> EBBlocks.LAPIS_LAZULI_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.LAPIS_LAZULI_BRICKS.get())));
    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_SLAB = register("lapis_lazuli_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.LAPIS_LAZULI_BRICKS.get())));
    public static final RegistryObject<Block> IRON_BRICKS = register("iron_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> IRON_BRICK_STAIRS = register("iron_brick_stairs", () -> new StairBlock(() -> EBBlocks.IRON_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> IRON_BRICK_SLAB = register("iron_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> IRON_BRICK_VERTICAL_STAIRS = register("iron_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BRICKS = register("diamond_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BRICK_STAIRS = register("diamond_brick_stairs", () -> new StairBlock(() -> EBBlocks.DIAMOND_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BRICK_SLAB = register("diamond_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BRICK_VERTICAL_STAIRS = register("diamond_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BRICKS = register("netherite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BRICK_STAIRS = register("netherite_brick_stairs", () -> new StairBlock(EBBlocks.NETHERITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BRICK_SLAB = register("netherite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    //CRAFTING TABLES
    public static final RegistryObject<Block> BIRCH_CRAFTING_TABLE = register("birch_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.GENERIC_CT));
    public static final RegistryObject<Block> SPRUCE_CRAFTING_TABLE = register("spruce_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.GENERIC_CT));
    public static final RegistryObject<Block> JUNGLE_CRAFTING_TABLE = register("jungle_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.GENERIC_CT));
    public static final RegistryObject<Block> ACACIA_CRAFTING_TABLE = register("acacia_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.GENERIC_CT));
    public static final RegistryObject<Block> DARK_OAK_CRAFTING_TABLE = register("dark_oak_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.GENERIC_CT));
    public static final RegistryObject<Block> MANGROVE_CRAFTING_TABLE = register("mangrove_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.GENERIC_CT));
    public static final RegistryObject<Block> CHERRY_CRAFTING_TABLE = register("cherry_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.CHERRY_CT));
    public static final RegistryObject<Block> BAMBOO_CRAFTING_TABLE = register("bamboo_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.BAMBOO_CT));
    public static final RegistryObject<Block> CRIMSON_CRAFTING_TABLE = register("crimson_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.CRIMSON_CT));
    public static final RegistryObject<Block> WARPED_CRAFTING_TABLE = register("warped_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockProperties.WARPED_CT));

    //NETHERSLATE
    public static final RegistryObject<Block> NETHER_TILES = register("nether_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
    public static final RegistryObject<Block> NETHER_TILE_STAIRS = register("nether_tile_stairs", () -> new StairBlock(() -> EBBlocks.NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> NETHER_TILE_SLAB = register("nether_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> NETHER_TILE_WALL = register("nether_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> NETHER_TILE_VERTICAL_STAIRS = register("nether_tile_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> RED_NETHER_TILES = register("red_nether_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));
    public static final RegistryObject<Block> RED_NETHER_TILE_STAIRS = register("red_nether_tile_stairs", () -> new StairBlock(() -> EBBlocks.RED_NETHER_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> RED_NETHER_TILE_SLAB = register("red_nether_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> RED_NETHER_TILE_WALL = register("red_nether_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> RED_NETHER_TILE_VERTICAL_STAIRS = register("red_nether_tile_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.NETHER_TILES.get())));
    public static final RegistryObject<Block> BLUE_NETHER_TILES = register("blue_nether_tiles", () -> new Block(EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_TILE_STAIRS = register("blue_nether_tile_stairs", () -> new StairBlock(() -> EBBlocks.BLUE_NETHER_TILES.get().defaultBlockState(), EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_TILE_SLAB = register("blue_nether_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_TILE_WALL = register("blue_nether_tile_wall", () -> new WallBlock(EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_TILE_VERTICAL_STAIRS = register("blue_nether_tile_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_BRICKS = register("blue_nether_bricks", () -> new Block(EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", () -> new StairBlock(() -> EBBlocks.BLUE_NETHER_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.BLUE_NETHER));
    public static final RegistryObject<Block> BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.BLUE_NETHER));

    //QUARTZ
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_BRICK_VERTICAL_STAIRS = register("quartz_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_TILES = register("quartz_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_TILE_STAIRS = register("quartz_tile_stairs", () -> new StairBlock(EBBlocks.QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_TILE_SLAB = register("quartz_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));

    //NATURAL
    public static final RegistryObject<Block> QUARTZ_ORE = register("quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(3.0F).explosionResistance(3.0F), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_QUARTZ_ORE = register("deepslate_quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(EBBlocks.QUARTZ_ORE.get()).sound(SoundType.DEEPSLATE).strength(4.5F).explosionResistance(3.0F), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = register("soul_magma_block", () -> new SoulMagmaBlock(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));
    public static final RegistryObject<Block> ANCIENT_VINE = register("ancient_vine", () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE).lightLevel(state -> 4)));
    public static final RegistryObject<Block> GOLDEN_BIRCH_LEAVES = register("golden_birch_leaves", () -> new YellowMapleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).mapColor(MapColor.COLOR_YELLOW)));

    //TERRACOTTA TILES
    public static final RegistryObject<Block> TERRACOTTA_TILES = register("terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TERRACOTTA_TILE_STAIRS = register("terracotta_tile_stairs", () -> new StairBlock(EBBlocks.TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> TERRACOTTA_TILE_SLAB = register("terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_TILES = register("black_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_TILE_STAIRS = register("black_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.BLACK_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_TILE_SLAB = register("black_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_TILES = register("gray_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_TILE_STAIRS = register("gray_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.GRAY_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_TILE_SLAB = register("gray_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TILES = register("light_gray_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = register("light_gray_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TILE_SLAB = register("light_gray_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_TILES = register("brown_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_TILE_STAIRS = register("brown_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.BROWN_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_TILE_SLAB = register("brown_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_TILES = register("white_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_TILE_STAIRS = register("white_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.WHITE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_TILE_SLAB = register("white_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_TILES = register("red_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_TERRACOTTA_TILE_STAIRS = register("red_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.RED_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_TILE_SLAB = register("red_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TILES = register("orange_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TILE_STAIRS = register("orange_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.ORANGE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TILE_SLAB = register("orange_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TILES = register("yellow_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TILE_STAIRS = register("yellow_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.YELLOW_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TILE_SLAB = register("yellow_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_TILES = register("lime_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_TERRACOTTA_TILE_STAIRS = register("lime_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.LIME_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_TILE_SLAB = register("lime_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_TILES = register("green_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_TILE_STAIRS = register("green_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.GREEN_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_TILE_SLAB = register("green_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_TILES = register("cyan_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_TILE_STAIRS = register("cyan_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.CYAN_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_TILE_SLAB = register("cyan_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TILES = register("light_blue_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = register("light_blue_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TILE_SLAB = register("light_blue_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_TILES = register("blue_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_TILE_STAIRS = register("blue_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.BLUE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_TILE_SLAB = register("blue_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TILES = register("purple_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TILE_STAIRS = register("purple_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.PURPLE_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TILE_SLAB = register("purple_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TILES = register("magenta_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TILE_STAIRS = register("magenta_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.MAGENTA_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TILE_SLAB = register("magenta_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_TILES = register("pink_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_TERRACOTTA_TILE_STAIRS = register("pink_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.PINK_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_TILE_SLAB = register("pink_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_TILES = register("rainbow_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_TILE_STAIRS = register("rainbow_terracotta_tile_stairs", () -> new StairBlock(EBBlocks.RAINBOW_TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_TILE_SLAB = register("rainbow_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    //CALCITE
    public static final RegistryObject<Block> CALCITE_BRICKS = register("calcite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICKS = register("cracked_calcite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = register("calcite_brick_stairs", () -> new StairBlock(EBBlocks.CALCITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = register("calcite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    //NATURAL BUILDING BLOCKS
    public static final RegistryObject<Block> SNOW_BRICKS = register("snow_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = register("snow_brick_stairs", () -> new StairBlock(EBBlocks.SNOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.SNOW_BRICKS.get())));
    public static final RegistryObject<Block> SNOW_BRICK_SLAB = register("snow_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.SNOW_BRICKS.get())));
    public static final RegistryObject<Block> MUD_TILES = register("mud_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> MUD_TILE_STAIRS = register("mud_tile_stairs", () -> new StairBlock(EBBlocks.MUD_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> MUD_TILE_SLAB = register("mud_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    //CRYSTALS
    public static final RegistryObject<Block> FIERY_BLOCK = register("fiery_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).lightLevel(state -> 7)));
    public static final RegistryObject<Block> MIRALEN_BLOCK = register("miralen_block", () -> new AmethystBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> BUDDING_MIRALEN_BLOCK = register("budding_miralen_block", () -> new BuddingMiralenBlock(BlockBehaviour.Properties.copy(EBBlocks.MIRALEN_BLOCK.get()).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().randomTicks()));
    public static final RegistryObject<Block> SMALL_MIRALEN_BUD = register("small_miralen_bud", () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));
    public static final RegistryObject<Block> MEDIUM_MIRALEN_BUD = register("medium_miralen_bud", () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));
    public static final RegistryObject<Block> LARGE_MIRALEN_BUD = register("large_miralen_bud", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
    public static final RegistryObject<Block> MIRALEN_CLUSTER = register("miralen_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> MIRALEN_BRICKS = register("miralen_bricks", () -> new Block(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> CRACKED_MIRALEN_BRICKS = register("cracked_miralen_bricks", () -> new Block(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_BRICK_STAIRS = register("miralen_brick_stairs", () -> new StairBlock(EBBlocks.MIRALEN_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_BRICK_SLAB = register("miralen_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_BRICK_WALL = register("miralen_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_BRICK_VERTICAL_STAIRS = register("miralen_brick_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_TILES = register("miralen_tiles", () -> new Block(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> CRACKED_MIRALEN_TILES = register("cracked_miralen_tiles", () -> new Block(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_TILE_STAIRS = register("miralen_tile_stairs", () -> new StairBlock(EBBlocks.MIRALEN_TILES.get().defaultBlockState(), EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_TILE_SLAB = register("miralen_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_TILE_WALL = register("miralen_tile_wall", () -> new WallBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_TILE_VERTICAL_STAIRS = register("miralen_tile_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MIRALEN));
    public static final RegistryObject<Block> MIRALEN_GLASS = register("miralen_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> MIRALEN_GLASS_PANE = register("miralen_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> MIRALEN_LAMP = register("miralen_lamp", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN).sound(SoundType.GLASS).lightLevel(state -> 15)));
    public static final RegistryObject<Block> FIERY_GLASS = register("fiery_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> AMETHYST_GLASS = register("amethyst_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> PRISMARINE_GLASS = register("prismarine_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> FIERY_GLASS_PANE = register("fiery_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> AMETHYST_GLASS_PANE = register("amethyst_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> PRISMARINE_GLASS_PANE = register("prismarine_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> AMETHYST_LAMP = register("amethyst_lamp", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN).lightLevel(state -> 15)));
    public static final RegistryObject<Block> FIERY_LAMP = register("fiery_lamp", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN).lightLevel(state -> 11)));

    public static final RegistryObject<Block> RAINBOW_STAINED_GLASS = register("rainbow_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_STAINED_GLASS_PANE = register("rainbow_stained_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_WOOL = register("rainbow_wool",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    public static final RegistryObject<Block> RAINBOW_CARPET = register("rainbow_carpet",
            () -> new FlammableWoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CARPET), 20, 60));

    public static final RegistryObject<Block> CALCITE_BRICK_WALL = register("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.CALCITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_TILES = register("calcite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_TILE_STAIRS = register("calcite_tile_stairs",
            () -> new StairBlock(EBBlocks.CALCITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_SLAB = register("calcite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_WALL = register("calcite_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.CALCITE_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_BRICK_VERTICAL_STAIRS = register("calcite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CALCITE_TILE_VERTICAL_STAIRS = register("calcite_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> SNOW_BRICK_VERTICAL_STAIRS = register("snow_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SNOW_BRICKS.get())));

    public static final RegistryObject<Block> MUD_TILE_VERTICAL_STAIRS = register("mud_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> NETHERITE_BRICK_VERTICAL_STAIRS = register("netherite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> QUARTZ_TILE_VERTICAL_STAIRS = register("quartz_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.QUARTZ_TILES.get())));

    public static final RegistryObject<Block> FIERY_CLUSTER = register("fiery_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).lightLevel(state -> 12)));

    public static final RegistryObject<Block> KYANITE_CLUSTER = register("kyanite_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> KYANITE_BLOCK = register("kyanite_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BLOCK = register("prismarine_crystal_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> CHISELED_COPPER = register("chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = register("exposed_chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));

    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = register("weathered_chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));

    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = register("oxidized_chiseled_copper",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));

    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = register("waxed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));

    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = register("waxed_exposed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));

    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = register("waxed_weathered_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = register("waxed_oxidized_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));

    public static final RegistryObject<Block> COPPER_GRATE = register("copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = register("exposed_copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = register("weathered_copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = register("oxidized_copper_grate",
            () -> new CopperGrateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_COPPER_GRATE = register("waxed_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = register("waxed_exposed_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = register("waxed_weathered_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = register("waxed_oxidized_copper_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).noOcclusion()));

    public static final RegistryObject<Block> GOLD_GRATE = register("gold_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> IRON_GRATE = register("iron_grate",
            () -> new GenericWaterloggableBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> POLISHED_TUFF = register("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = register("polished_tuff_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_TUFF.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = register("polished_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> POLISHED_TUFF_WALL = register("polished_tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_TUFF_VERTICAL_STAIRS = register("polished_tuff_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_BRICKS = register("tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = register("chiseled_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_POLISHED_TUFF = register("chiseled_polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_BRICK_STAIRS = register("tuff_brick_stairs",
            () -> new StairBlock(EBBlocks.TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_BRICK_SLAB = register("tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_BRICK_WALL = register("tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_BRICK_VERTICAL_STAIRS = register("tuff_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILES = register("tuff_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_TILE_STAIRS = register("tuff_tile_stairs",
            () -> new StairBlock(EBBlocks.TUFF_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILE_SLAB = register("tuff_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILE_WALL = register("tuff_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_TILE_VERTICAL_STAIRS = register("tuff_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_STAIRS = register("tuff_stairs",
            () -> new StairBlock(Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_SLAB = register("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_WALL = register("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_VERTICAL_STAIRS = register("tuff_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> COPPER_BULB = register("copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = register("exposed_copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).lightLevel(litBlockEmission -> 11)));

    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = register("weathered_copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).lightLevel(litBlockEmission -> 8)));

    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = register("oxidized_copper_bulb",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).lightLevel(litBlockEmission -> 3)));

    public static final RegistryObject<Block> WAXED_COPPER_BULB = register("waxed_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BULB = register("waxed_exposed_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).lightLevel(litBlockEmission -> 11)));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BULB = register("waxed_weathered_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).lightLevel(litBlockEmission -> 8)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BULB = register("waxed_oxidized_copper_bulb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).lightLevel(litBlockEmission -> 3)));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILES = register("polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_STAIRS = register("polished_blackstone_tile_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_BLACKSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_SLAB = register("polished_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_WALL = register("polished_blackstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS = register("polished_blackstone_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BLACKSTONE_TILES.get())));

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_TILES = register("cracked_polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE_BRICKS = register("polished_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_STAIRS = register("polished_stone_brick_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_SLAB = register("polished_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_WALL = register("polished_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_BRICK_VERTICAL_STAIRS = register("polished_stone_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_POLISHED_STONE_BRICKS = register("cracked_polished_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE = register("polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE_STAIRS = register("polished_stone_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_SLAB = register("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_WALL = register("polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_STONE_VERTICAL_STAIRS = register("polished_stone_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_CALCITE = register("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs",
            () -> new StairBlock(EBBlocks.POLISHED_CALCITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = register("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = register("polished_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.CALCITE_TILES.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_CALCITE_VERTICAL_STAIRS = register("polished_calcite_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> CRACKED_CALCITE_TILES = register("cracked_calcite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_BRICKS = register("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BASKETWEAVE_BRICKS = register("basketweave_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_STAIRS = register("basketweave_brick_stairs",
            () -> new StairBlock(EBBlocks.BASKETWEAVE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_SLAB = register("basketweave_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_WALL = register("basketweave_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BASKETWEAVE_BRICK_VERTICAL_STAIRS = register("basketweave_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> HERRINGBONE_BRICKS = register("herringbone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICKS = register("smooth_basketweave_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_STAIRS = register("smooth_basketweave_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_SLAB = register("smooth_basketweave_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_WALL = register("smooth_basketweave_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS = register("smooth_basketweave_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> SMOOTH_HERRINGBONE_BRICKS = register("smooth_herringbone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STONE_LAMP = register("stone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> DEEPSLATE_LAMP = register("deepslate_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).requiresCorrectToolForDrops().lightLevel(litBlockEmission -> 15)));

    public static final RegistryObject<Block> BLACKSTONE_LAMP = register("blackstone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE_LAMP.get())));

    public static final RegistryObject<Block> BLACKSTONE_WINDOW = register("blackstone_window",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE_WINDOW.get())));

    public static final RegistryObject<Block> ANCIENT_PLANKS = register("ancient_planks",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.CHERRY_WOOD), 20, 5));

    public static final RegistryObject<Block> ANCIENT_STAIRS = register("ancient_stairs",
            () -> new FlammableStairBlock(EBBlocks.ANCIENT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_SLAB = register("ancient_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_VERTICAL_STAIRS = register("ancient_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_ANCIENT = register("chiseled_ancient",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC = register("ancient_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_STAIRS = register("ancient_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.ANCIENT_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_SLAB = register("ancient_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_MOSAIC_VERTICAL_STAIRS = register("ancient_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_FENCE = register("ancient_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> ANCIENT_FENCE_GATE = register("ancient_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()), SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN, SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> ANCIENT_DOOR = register("ancient_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).ignitedByLava().noOcclusion(), EBBlockTypes.ANCIENT_BLOCKSET));

    public static final RegistryObject<Block> ANCIENT_TRAPDOOR = register("ancient_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).noOcclusion().ignitedByLava(), EBBlockTypes.ANCIENT_BLOCKSET));

    public static final RegistryObject<Block> ANCIENT_BUTTON = register("ancient_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).sound(SoundType.CHERRY_WOOD).noCollission().noOcclusion()
            .strength(0.5f).explosionResistance(0.5f), EBBlockTypes.ANCIENT_BLOCKSET, 30, true));

    public static final RegistryObject<Block> ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_PLANKS.get()).noCollission().noOcclusion()
            .sound(SoundType.CHERRY_WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), EBBlockTypes.ANCIENT_BLOCKSET));

    public static final RegistryObject<Block> ANCIENT_LOG = register("ancient_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> ANCIENT_WOOD = register("ancient_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_ANCIENT_LOG = register("stripped_ancient_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.ANCIENT_LOG.get()), 5, 5));

    public static final RegistryObject<Block> ANCIENT_CRAFTING_TABLE = register("ancient_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE).strength(2.5f).explosionResistance(2.5f).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> ANCIENT_SAPLING = register("ancient_sapling",
            () -> new SaplingBlock(new AncientTreeGrower(), BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING).lightLevel(state -> 6)));

    public static final RegistryObject<Block> POTTED_ANCIENT_SAPLING = BLOCKS.register("potted_ancient_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ANCIENT_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_CHERRY_SAPLING).lightLevel(state -> 6)));

    public static final RegistryObject<Block> SPRUCE_LADDER = register("spruce_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> BIRCH_LADDER = register("birch_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> JUNGLE_LADDER = register("jungle_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> ACACIA_LADDER = register("acacia_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> DARK_OAK_LADDER = register("dark_oak_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> MANGROVE_LADDER = register("mangrove_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> CHERRY_LADDER = register("cherry_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> BAMBOO_LADDER = register("bamboo_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> ANCIENT_LADDER = register("ancient_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> CRIMSON_LADDER = register("crimson_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_LADDER = register("warped_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> ALGAE_BLOCK = register("algae_block", () -> new
            AlgaeBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).explosionResistance(0f).sound(SoundType.AZALEA_LEAVES).instabreak().replaceable().noCollission()));

    public static final RegistryObject<Block> TERRACOTTA_BRICKS = register("terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_STAIRS = register("terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_SLAB = register("terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = register("black_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_STAIRS = register("black_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_SLAB = register("black_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = register("gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_STAIRS = register("gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_SLAB = register("gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = register("light_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = register("light_gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = register("light_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = register("brown_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_STAIRS = register("brown_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_SLAB = register("brown_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = register("white_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_STAIRS = register("white_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_SLAB = register("white_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = register("red_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_STAIRS = register("red_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.RED_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_SLAB = register("red_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = register("orange_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = register("orange_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_SLAB = register("orange_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = register("yellow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = register("yellow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_SLAB = register("yellow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = register("lime_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_STAIRS = register("lime_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_SLAB = register("lime_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = register("green_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_STAIRS = register("green_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_SLAB = register("green_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = register("cyan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_STAIRS = register("cyan_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_SLAB = register("cyan_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = register("light_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = register("light_blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = register("light_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = register("blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_STAIRS = register("blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_SLAB = register("blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = register("purple_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = register("purple_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_SLAB = register("purple_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = register("magenta_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = register("magenta_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = register("magenta_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = register("pink_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_STAIRS = register("pink_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_SLAB = register("pink_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_BRICKS = register("rainbow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_BRICK_STAIRS = register("rainbow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> RAINBOW_TERRACOTTA_BRICK_SLAB = register("rainbow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> GRASS_SLAB = register("grass_slab",
            () -> new GrassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> ROOTED_DIRT_SLAB = register("rooted_dirt_slab",
            () -> new RootedDirtSlabBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)));

    public static final RegistryObject<Block> COARSE_DIRT_SLAB = register("coarse_dirt_slab",
            () -> new SodSlabBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)));

    public static final RegistryObject<Block> KYANITE_LAMP = register("kyanite_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.3f).explosionResistance(0.3f).sound(SoundType.GLASS).lightLevel(state -> 15)));

    public static final RegistryObject<Block> AMETHYST_BRICKS = register("amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_AMETHYST_BRICKS = register("cracked_amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_BRICK_STAIRS = register("amethyst_brick_stairs",
            () -> new StairBlock(EBBlocks.AMETHYST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_BRICK_SLAB = register("amethyst_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_BRICK_WALL = register("amethyst_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_BRICK_VERTICAL_STAIRS = register("amethyst_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILES = register("amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_AMETHYST_TILES = register("cracked_amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILE_STAIRS = register("amethyst_tile_stairs",
            () -> new StairBlock(EBBlocks.AMETHYST_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILE_SLAB = register("amethyst_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> AMETHYST_TILE_WALL = register("amethyst_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_TILE_VERTICAL_STAIRS = register("amethyst_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.AMETHYST_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICKS = register("fiery_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_FIERY_BRICKS = register("cracked_fiery_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICK_STAIRS = register("fiery_brick_stairs",
            () -> new StairBlock(EBBlocks.FIERY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICK_SLAB = register("fiery_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_BRICK_WALL = register("fiery_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FIERY_BRICK_VERTICAL_STAIRS = register("fiery_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILES = register("fiery_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_FIERY_TILES = register("cracked_fiery_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILE_STAIRS = register("fiery_tile_stairs",
            () -> new StairBlock(EBBlocks.FIERY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILE_SLAB = register("fiery_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> FIERY_TILE_WALL = register("fiery_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FIERY_TILE_VERTICAL_STAIRS = register("fiery_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICKS = register("kyanite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_KYANITE_BRICKS = register("cracked_kyanite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICK_STAIRS = register("kyanite_brick_stairs",
            () -> new StairBlock(EBBlocks.KYANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICK_SLAB = register("kyanite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_BRICK_WALL = register("kyanite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> KYANITE_BRICK_VERTICAL_STAIRS = register("kyanite_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILES = register("kyanite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_KYANITE_TILES = register("cracked_kyanite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILE_STAIRS = register("kyanite_tile_stairs",
            () -> new StairBlock(EBBlocks.KYANITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILE_SLAB = register("kyanite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_TILE_WALL = register("kyanite_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> KYANITE_TILE_VERTICAL_STAIRS = register("kyanite_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICKS = register("prismarine_crystal_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()).strength(1.5f).explosionResistance(6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_PRISMARINE_CRYSTAL_BRICKS = register("cracked_prismarine_crystal_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_STAIRS = register("prismarine_crystal_brick_stairs",
            () -> new StairBlock(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_SLAB = register("prismarine_crystal_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_WALL = register("prismarine_crystal_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_BRICK_VERTICAL_STAIRS = register("prismarine_crystal_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILES = register("prismarine_crystal_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> CRACKED_PRISMARINE_CRYSTAL_TILES = register("cracked_prismarine_crystal_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_STAIRS = register("prismarine_crystal_tile_stairs",
            () -> new StairBlock(EBBlocks.PRISMARINE_CRYSTAL_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_SLAB = register("prismarine_crystal_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_WALL = register("prismarine_crystal_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PRISMARINE_CRYSTAL_TILE_VERTICAL_STAIRS = register("prismarine_crystal_tile_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())));

    public static final RegistryObject<Block> KYANITE_GLASS = register("kyanite_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> KYANITE_GLASS_PANE = register("kyanite_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> CHISELED_SMOOTH_STONE_BRICKS = register("chiseled_smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> ANCIENT_SIGN = BLOCKS.register("ancient_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_WALL_SIGN = BLOCKS.register("ancient_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_HANGING_SIGN = BLOCKS.register("ancient_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> ANCIENT_WALL_HANGING_SIGN = BLOCKS.register("ancient_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN), EBBlockTypes.ANCIENT));

    public static final RegistryObject<Block> EMERALD_BRICKS = register("emerald_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICK_STAIRS = register("emerald_brick_stairs",
            () -> new StairBlock(() -> EBBlocks.EMERALD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICK_SLAB = register("emerald_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICK_VERTICAL_STAIRS = register("emerald_brick_vertical_stairs",
            () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> SMOOTH_TERRACOTTA_BRICKS = register("smooth_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_TERRACOTTA_BRICK_STAIRS = register("smooth_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_TERRACOTTA_BRICK_SLAB = register("smooth_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLACK_TERRACOTTA_BRICKS = register("smooth_black_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS = register("smooth_black_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB = register("smooth_black_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GRAY_TERRACOTTA_BRICKS = register("smooth_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS = register("smooth_gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB = register("smooth_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS = register("smooth_light_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = register("smooth_light_gray_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = register("smooth_light_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BROWN_TERRACOTTA_BRICKS = register("smooth_brown_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS = register("smooth_brown_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB = register("smooth_brown_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_WHITE_TERRACOTTA_BRICKS = register("smooth_white_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS = register("smooth_white_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB = register("smooth_white_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RED_TERRACOTTA_BRICKS = register("smooth_red_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RED_TERRACOTTA_BRICK_STAIRS = register("smooth_red_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RED_TERRACOTTA_BRICK_SLAB = register("smooth_red_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_ORANGE_TERRACOTTA_BRICKS = register("smooth_orange_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS = register("smooth_orange_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB = register("smooth_orange_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_YELLOW_TERRACOTTA_BRICKS = register("smooth_yellow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS = register("smooth_yellow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB = register("smooth_yellow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIME_TERRACOTTA_BRICKS = register("smooth_lime_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS = register("smooth_lime_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIME_TERRACOTTA_BRICK_SLAB = register("smooth_lime_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GREEN_TERRACOTTA_BRICKS = register("smooth_green_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS = register("smooth_green_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB = register("smooth_green_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_CYAN_TERRACOTTA_BRICKS = register("smooth_cyan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS = register("smooth_cyan_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB = register("smooth_cyan_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS = register("smooth_light_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = register("smooth_light_blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = register("smooth_light_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLUE_TERRACOTTA_BRICKS = register("smooth_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS = register("smooth_blue_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB = register("smooth_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PURPLE_TERRACOTTA_BRICKS = register("smooth_purple_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS = register("smooth_purple_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB = register("smooth_purple_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_MAGENTA_TERRACOTTA_BRICKS = register("smooth_magenta_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS = register("smooth_magenta_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB = register("smooth_magenta_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PINK_TERRACOTTA_BRICKS = register("smooth_pink_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS = register("smooth_pink_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_PINK_TERRACOTTA_BRICK_SLAB = register("smooth_pink_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RAINBOW_TERRACOTTA_BRICKS = register("smooth_rainbow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_RAINBOW_TERRACOTTA_BRICK_STAIRS = register("smooth_rainbow_terracotta_brick_stairs",
            () -> new StairBlock(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));

    public static final RegistryObject<Block> SMOOTH_RAINBOW_TERRACOTTA_BRICK_SLAB = register("smooth_rainbow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));

    public static final RegistryObject<Block> BUDDING_FIERY_BLOCK = register("budding_fiery_block",
            () -> new BuddingFieryBlock(BlockBehaviour.Properties.copy(EBBlocks.FIERY_BLOCK.get()).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().randomTicks()));

    public static final RegistryObject<Block> BUDDING_KYANITE_BLOCK = register("budding_kyanite_block",
            () -> new BuddingKyaniteBlock(BlockBehaviour.Properties.copy(EBBlocks.KYANITE_BLOCK.get()).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().randomTicks()));

    public static final RegistryObject<Block> SMALL_FIERY_BUD = register("small_fiery_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));

    public static final RegistryObject<Block> MEDIUM_FIERY_BUD = register("medium_fiery_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));

    public static final RegistryObject<Block> LARGE_FIERY_BUD = register("large_fiery_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));

    public static final RegistryObject<Block> SMALL_KYANITE_BUD = register("small_kyanite_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));

    public static final RegistryObject<Block> MEDIUM_KYANITE_BUD = register("medium_kyanite_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));

    public static final RegistryObject<Block> LARGE_KYANITE_BUD = register("large_kyanite_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));

    public static final RegistryObject<Block> DIRT_SLAB = register("dirt_slab",
            () -> new SodSlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> ROSE = register("rose",
            () -> new FlowerBlock(MobEffects.REGENERATION, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> WHITE_ROSE = register("white_rose",
            () -> new FlowerBlock(MobEffects.GLOWING, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_WHITE_ROSE = BLOCKS.register("potted_white_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.WHITE_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> CYAN_ROSE = register("cyan_rose",
            () -> new FlowerBlock(MobEffects.POISON, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_CYAN_ROSE = BLOCKS.register("potted_cyan_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.CYAN_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_PILLAR = register("smooth_stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_BRICKS.get())));

    public static final RegistryObject<Block> POLISHED_BRIMSTONE_PEDESTAL = register("polished_brimstone_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_PILLAR.get())));

    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_PEDESTAL = register("smooth_stone_brick_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_BRICK_PILLAR.get())));

    public static final RegistryObject<Block> QUARTZ_PEDESTAL = register("quartz_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)));

    public static final RegistryObject<Block> PURPUR_PEDESTAL = register("purpur_pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR)));

    public static final RegistryObject<Block> WILLOW_PLANKS = register("willow_planks",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 20, 5));

    public static final RegistryObject<Block> WILLOW_STAIRS = register("willow_stairs",
            () -> new FlammableStairBlock(EBBlocks.WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_SLAB = register("willow_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_VERTICAL_STAIRS = register("willow_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_WILLOW = register("chiseled_willow",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC = register("willow_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC_STAIRS = register("willow_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.WILLOW_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC_SLAB = register("willow_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_MOSAIC_VERTICAL_STAIRS = register("willow_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_FENCE = register("willow_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> WILLOW_FENCE_GATE = register("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WILLOW_DOOR = register("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).sound(SoundType.WOOD).ignitedByLava().noOcclusion(), EBBlockTypes.WILLOW_BLOCKSET));

    public static final RegistryObject<Block> WILLOW_TRAPDOOR = register("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).sound(SoundType.WOOD).noOcclusion().ignitedByLava(), EBBlockTypes.WILLOW_BLOCKSET));

    public static final RegistryObject<Block> WILLOW_BUTTON = register("willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).sound(SoundType.WOOD).noCollission().noOcclusion()
                    .strength(0.5f).explosionResistance(0.5f), EBBlockTypes.WILLOW_BLOCKSET, 30, true));

    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = register("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.WILLOW_PLANKS.get()).noCollission().noOcclusion()
                    .sound(SoundType.WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), EBBlockTypes.WILLOW_BLOCKSET));

    public static final RegistryObject<Block> WILLOW_LOG = register("willow_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> WILLOW_WOOD = register("willow_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = register("stripped_willow_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = register("stripped_willow_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.WILLOW_LOG.get()), 5, 5));

    public static final RegistryObject<Block> WILLOW_CRAFTING_TABLE = register("willow_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WILLOW_LEAVES = register("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_GREEN)));

    public static final RegistryObject<Block> WILLOW_SAPLING = register("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_WILLOW_SAPLING = BLOCKS.register("potted_willow_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.WILLOW_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> WILLOW_LADDER = register("willow_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> WILLOW_SIGN = BLOCKS.register("willow_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_WALL_SIGN = BLOCKS.register("willow_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_HANGING_SIGN = BLOCKS.register("willow_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_WALL_HANGING_SIGN = BLOCKS.register("willow_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), EBBlockTypes.WILLOW));

    public static final RegistryObject<Block> ROSE_BUNDLE = register("rose_bundle",
            () -> new FlowerBlock(MobEffects.REGENERATION, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_ROSE_BUNDLE = BLOCKS.register("potted_rose_bundle",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ROSE_BUNDLE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> MAPLE_PLANKS = register("maple_planks",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 20, 5));

    public static final RegistryObject<Block> MAPLE_STAIRS = register("maple_stairs",
            () -> new FlammableStairBlock(EBBlocks.MAPLE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_SLAB = register("maple_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_VERTICAL_STAIRS = register("maple_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> CHISELED_MAPLE = register("chiseled_maple",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC = register("maple_mosaic",
            () -> new FlammableBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC_STAIRS = register("maple_mosaic_stairs",
            () -> new FlammableStairBlock(EBBlocks.MAPLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC_SLAB = register("maple_mosaic_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_MOSAIC_VERTICAL_STAIRS = register("maple_mosaic_vertical_stairs",
            () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_FENCE = register("maple_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get())
                    .strength(2f).explosionResistance(3f).ignitedByLava(), 20, 5));

    public static final RegistryObject<Block> MAPLE_FENCE_GATE = register("maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> MAPLE_DOOR = register("maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).sound(SoundType.WOOD).ignitedByLava().noOcclusion(), EBBlockTypes.MAPLE_BLOCKSET));

    public static final RegistryObject<Block> MAPLE_TRAPDOOR = register("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).sound(SoundType.WOOD).noOcclusion().ignitedByLava(), EBBlockTypes.MAPLE_BLOCKSET));

    public static final RegistryObject<Block> MAPLE_BUTTON = register("maple_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).sound(SoundType.WOOD).noCollission().noOcclusion()
                    .strength(0.5f).explosionResistance(0.5f), EBBlockTypes.MAPLE_BLOCKSET, 30, true));

    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = register("maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(EBBlocks.MAPLE_PLANKS.get()).noCollission().noOcclusion()
                    .sound(SoundType.WOOD).ignitedByLava().strength(0.5f).explosionResistance(0.5f), EBBlockTypes.MAPLE_BLOCKSET));

    public static final RegistryObject<Block> MAPLE_LOG = register("maple_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f).explosionResistance(3f).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> MAPLE_WOOD = register("maple_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = register("stripped_maple_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_LOG.get()), 5, 5));

    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = register("stripped_maple_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.MAPLE_LOG.get()), 5, 5));

    public static final RegistryObject<Block> MAPLE_CRAFTING_TABLE = register("maple_crafting_table",
            () -> new EBCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)
                    .strength(2.5f).explosionResistance(2.5f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MAPLE_LADDER = register("maple_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)));

    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign",
            () -> new EBStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign",
            () -> new EBWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_HANGING_SIGN = BLOCKS.register("maple_hanging_sign",
            () -> new EBCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_WALL_HANGING_SIGN = BLOCKS.register("maple_wall_hanging_sign",
            () -> new EBWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), EBBlockTypes.MAPLE));

    public static final RegistryObject<Block> MARIGOLD = register("marigold",
            () -> new FlowerBlock(MobEffects.LUCK, 5, (BlockBehaviour.Properties.copy(Blocks.POPPY).noOcclusion().noCollission())));

    public static final RegistryObject<Block> POTTED_MARIGOLD = BLOCKS.register("potted_marigold",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.MARIGOLD, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> RED_MAPLE_SAPLING = register("red_maple_sapling",
            () -> new SaplingBlock(new RedMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_RED_MAPLE_SAPLING = BLOCKS.register("potted_red_maple_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.RED_MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> ORANGE_MAPLE_SAPLING = register("orange_maple_sapling",
            () -> new SaplingBlock(new OrangeMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_ORANGE_MAPLE_SAPLING = BLOCKS.register("potted_orange_maple_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.ORANGE_MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> YELLOW_MAPLE_SAPLING = register("yellow_maple_sapling",
            () -> new SaplingBlock(new YellowMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_YELLOW_MAPLE_SAPLING = BLOCKS.register("potted_yellow_maple_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), EBBlocks.YELLOW_MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<Block> RED_MAPLE_LEAVES = register("red_maple_leaves",
            () -> new AncientLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_RED)));

    public static final RegistryObject<Block> ORANGE_MAPLE_LEAVES = register("orange_maple_leaves",
            () -> new OrangeMapleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_ORANGE)));

    public static final RegistryObject<Block> YELLOW_MAPLE_LEAVES = register("yellow_maple_leaves",
            () -> new YellowMapleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_YELLOW)));

    public static final RegistryObject<Block> RED_MAPLE_LEAVES_PILE = register("red_maple_leaves_pile",
            () -> new LeavesPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().mapColor(MapColor.COLOR_RED)));

    public static final RegistryObject<Block> ORANGE_MAPLE_LEAVES_PILE = register("orange_maple_leaves_pile",
            () -> new LeavesPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().mapColor(MapColor.COLOR_ORANGE)));

    public static final RegistryObject<Block> YELLOW_MAPLE_LEAVES_PILE = register("yellow_maple_leaves_pile",
            () -> new LeavesPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().mapColor(MapColor.COLOR_YELLOW)));

    public static final RegistryObject<Block> HOLLOW_OAK_LOG = register("hollow_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_OAK_LOG = register("hollow_stripped_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_SPRUCE_LOG = register("hollow_spruce_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_SPRUCE_LOG = register("hollow_stripped_spruce_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_BIRCH_LOG = register("hollow_birch_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_BIRCH_LOG = register("hollow_stripped_birch_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_JUNGLE_LOG = register("hollow_jungle_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_JUNGLE_LOG = register("hollow_stripped_jungle_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_ACACIA_LOG = register("hollow_acacia_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_ACACIA_LOG = register("hollow_stripped_acacia_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_DARK_OAK_LOG = register("hollow_dark_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_DARK_OAK_LOG = register("hollow_stripped_dark_oak_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_MANGROVE_LOG = register("hollow_mangrove_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_MANGROVE_LOG = register("hollow_stripped_mangrove_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_CHERRY_LOG = register("hollow_cherry_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_CHERRY_LOG = register("hollow_stripped_cherry_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_ANCIENT_LOG = register("hollow_ancient_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_ANCIENT_LOG = register("hollow_stripped_ancient_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.CHERRY_WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_MAPLE_LOG = register("hollow_maple_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_MAPLE_LOG = register("hollow_stripped_maple_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_WILLOW_LOG = register("hollow_willow_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_WILLOW_LOG = register("hollow_stripped_willow_log",
            () -> new FlammableHollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).ignitedByLava().sound(SoundType.WOOD), 5, 5));

    public static final RegistryObject<Block> HOLLOW_CRIMSON_STEM = register("hollow_crimson_stem", () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_CRIMSON_STEM = register("hollow_stripped_crimson_stem", () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> HOLLOW_WARPED_STEM = register("hollow_warped_stem", () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> HOLLOW_STRIPPED_WARPED_STEM = register("hollow_stripped_warped_stem", () -> new HollowRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> TUFF_BRICK_PILLAR = register("tuff_brick_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_BRICKS.get())));

    public static final RegistryObject<Block> TUFF_BRICK_PEDESTAL = register("tuff_brick_pedestal", () -> new PedestalBlock(BlockBehaviour.Properties.copy(EBBlocks.TUFF_BRICK_PILLAR.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICKS = register("mossy_polished_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_STAIRS = register("mossy_polished_stone_brick_stairs", () -> new StairBlock(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_SLAB = register("mossy_polished_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_WALL = register("mossy_polished_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_BRICK_VERTICAL_STAIRS = register("mossy_polished_stone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())));

    public static final RegistryObject<Block> ANCIENT_LEAVES = register("ancient_leaves",
            () -> new AncientLeavesBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).lightLevel((state) -> { return AncientLeavesBlock.isGlowing(state) ? 0 : 9; })));

    //DECORATIVE SHELVES
    public static final RegistryObject<Block> DECORATIVE_SHELF = register("decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> SPRUCE_DECORATIVE_SHELF = register("spruce_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> BIRCH_DECORATIVE_SHELF = register("birch_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> JUNGLE_DECORATIVE_SHELF = register("jungle_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> ACACIA_DECORATIVE_SHELF = register("acacia_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> DARK_OAK_DECORATIVE_SHELF = register("dark_oak_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> MANGROVE_DECORATIVE_SHELF = register("mangrove_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> CHERRY_DECORATIVE_SHELF = register("cherry_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.CHERRY_SHELF, 30, 20));
    public static final RegistryObject<Block> BAMBOO_DECORATIVE_SHELF = register("bamboo_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.BAMBOO_SHELF, 30, 20));
    public static final RegistryObject<Block> CRIMSON_DECORATIVE_SHELF = register("crimson_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.CRIMSON_SHELF, 0, 0));
    public static final RegistryObject<Block> WARPED_DECORATIVE_SHELF = register("warped_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.WARPED_SHELF, 0, 0));
    public static final RegistryObject<Block> ANCIENT_DECORATIVE_SHELF = register("ancient_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.ANCIENT_SHELF, 30, 20));
    public static final RegistryObject<Block> MAPLE_DECORATIVE_SHELF = register("maple_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> WILLOW_DECORATIVE_SHELF = register("willow_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));

    //BOOKSHELVES
    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = register("spruce_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> BIRCH_BOOKSHELF = register("birch_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> ACACIA_BOOKSHELF = register("acacia_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = register("jungle_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> MANGROVE_BOOKSHELF = register("mangrove_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> CHERRY_BOOKSHELF = register("cherry_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.CHERRY_SHELF, 30, 20));
    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = register("crimson_bookshelf", () -> new Block(EBProperties.BlockProperties.CRIMSON_SHELF));
    public static final RegistryObject<Block> WARPED_BOOKSHELF = register("warped_bookshelf", () -> new Block(EBProperties.BlockProperties.WARPED_SHELF));
    public static final RegistryObject<Block> BAMBOO_BOOKSHELF = register("bamboo_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.BAMBOO_SHELF, 30, 20));
    public static final RegistryObject<Block> ANCIENT_BOOKSHELF = register("ancient_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.ANCIENT_SHELF, 30, 20));
    public static final RegistryObject<Block> WILLOW_BOOKSHELF = register("willow_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));
    public static final RegistryObject<Block> MAPLE_BOOKSHELF = register("maple_bookshelf", () -> new FlammableBlock(EBProperties.BlockProperties.GENERIC_SHELF, 30, 20));

    //POTS
    public static final RegistryObject<Block> TERRACOTTA_POT = register("terracotta_pot", () -> new PotBlock(EBProperties.BlockProperties.POT));
    public static final RegistryObject<Block> MARBLE_POT = register("marble_pot", () -> new PotBlock(EBProperties.BlockProperties.POT));
    public static final RegistryObject<Block> MARQUINA_MARBLE_POT = register("marquina_marble_pot", () -> new PotBlock(EBProperties.BlockProperties.POT));
    //TODO: ADD DYED VARIANTS (these will be done for v3.0.1)

    //KNITTED WOOL
    public static final RegistryObject<Block> KNITTED_RED_WOOL = register("knitted_red_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_RED_CARPET = register("knitted_red_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_RED_STAIRS = register("knitted_red_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_RED_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_RED_SLAB = register("knitted_red_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_ORANGE_WOOL = register("knitted_orange_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_ORANGE_CARPET = register("knitted_orange_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_ORANGE_STAIRS = register("knitted_orange_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_ORANGE_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_ORANGE_SLAB = register("knitted_orange_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_YELLOW_WOOL = register("knitted_yellow_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_YELLOW_CARPET = register("knitted_yellow_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_YELLOW_STAIRS = register("knitted_yellow_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_YELLOW_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_YELLOW_SLAB = register("knitted_yellow_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIME_WOOL = register("knitted_lime_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIME_CARPET = register("knitted_lime_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_LIME_STAIRS = register("knitted_lime_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_LIME_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIME_SLAB = register("knitted_lime_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_GREEN_WOOL = register("knitted_green_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_GREEN_CARPET = register("knitted_green_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_GREEN_STAIRS = register("knitted_green_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_GREEN_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_GREEN_SLAB = register("knitted_green_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));
    public static final RegistryObject<Block> DRMANGOTEA = register("drmangotea", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_CYAN_WOOL = register("knitted_cyan_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_CYAN_CARPET = register("knitted_cyan_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_CYAN_STAIRS = register("knitted_cyan_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_CYAN_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_CYAN_SLAB = register("knitted_cyan_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIGHT_BLUE_WOOL = register("knitted_light_blue_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIGHT_BLUE_CARPET = register("knitted_light_blue_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_LIGHT_BLUE_STAIRS = register("knitted_light_blue_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIGHT_BLUE_SLAB = register("knitted_light_blue_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BLUE_WOOL = register("knitted_blue_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BLUE_CARPET = register("knitted_blue_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_BLUE_STAIRS = register("knitted_blue_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_BLUE_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BLUE_SLAB = register("knitted_blue_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_PURPLE_WOOL = register("knitted_purple_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_PURPLE_CARPET = register("knitted_purple_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_PURPLE_STAIRS = register("knitted_purple_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_PURPLE_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_PURPLE_SLAB = register("knitted_purple_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_PINK_WOOL = register("knitted_pink_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_PINK_CARPET = register("knitted_pink_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_PINK_STAIRS = register("knitted_pink_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_PINK_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_PINK_SLAB = register("knitted_pink_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_MAGENTA_WOOL = register("knitted_magenta_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_MAGENTA_CARPET = register("knitted_magenta_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_MAGENTA_STAIRS = register("knitted_magenta_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_MAGENTA_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_MAGENTA_SLAB = register("knitted_magenta_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BLACK_WOOL = register("knitted_black_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BLACK_CARPET = register("knitted_black_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_BLACK_STAIRS = register("knitted_black_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_BLACK_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BLACK_SLAB = register("knitted_black_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_WHITE_WOOL = register("knitted_white_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_WHITE_CARPET = register("knitted_white_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_WHITE_STAIRS = register("knitted_white_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_WHITE_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_WHITE_SLAB = register("knitted_white_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BROWN_WOOL = register("knitted_brown_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BROWN_CARPET = register("knitted_brown_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_BROWN_STAIRS = register("knitted_brown_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_BROWN_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_BROWN_SLAB = register("knitted_brown_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIGHT_GRAY_WOOL = register("knitted_light_gray_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIGHT_GRAY_CARPET = register("knitted_light_gray_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_LIGHT_GRAY_STAIRS = register("knitted_light_gray_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_LIGHT_GRAY_SLAB = register("knitted_light_gray_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_GRAY_WOOL = register("knitted_gray_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_GRAY_CARPET = register("knitted_gray_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_GRAY_STAIRS = register("knitted_gray_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_RED_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_GRAY_SLAB = register("knitted_gray_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_RAINBOW_WOOL = register("knitted_rainbow_wool", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_RAINBOW_CARPET = register("knitted_rainbow_carpet", () -> new FlammableWoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CARPET), 20, 60));
    public static final RegistryObject<Block> KNITTED_RAINBOW_STAIRS = register("knitted_rainbow_stairs", () -> new FlammableStairBlock(EBBlocks.KNITTED_RAINBOW_WOOL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> KNITTED_RAINBOW_SLAB = register("knitted_rainbow_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));

    //VANILLA ADDITIONS
    public static final RegistryObject<Block> RED_WOOL_STAIRS = register("red_wool_stairs", () -> new FlammableStairBlock(Blocks.RED_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> RED_WOOL_SLAB = register("red_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL), 60, 30));
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = register("orange_wool_stairs", () -> new FlammableStairBlock(Blocks.ORANGE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = register("orange_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), 60, 30));
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = register("yellow_wool_stairs", () -> new FlammableStairBlock(Blocks.YELLOW_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = register("yellow_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), 60, 30));
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = register("lime_wool_stairs", () -> new FlammableStairBlock(Blocks.LIME_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = register("lime_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), 60, 30));
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = register("green_wool_stairs", () -> new FlammableStairBlock(Blocks.GREEN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = register("green_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), 60, 30));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = register("cyan_wool_stairs", () -> new FlammableStairBlock(Blocks.CYAN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = register("cyan_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), 60, 30));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = register("light_blue_wool_stairs", () -> new FlammableStairBlock(Blocks.LIGHT_BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = register("light_blue_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = register("blue_wool_stairs", () -> new FlammableStairBlock(Blocks.BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = register("blue_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), 60, 30));
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = register("purple_wool_stairs", () -> new FlammableStairBlock(Blocks.PURPLE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = register("purple_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), 60, 30));
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = register("magenta_wool_stairs", () -> new FlammableStairBlock(Blocks.MAGENTA_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = register("magenta_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), 60, 30));
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = register("pink_wool_stairs", () -> new FlammableStairBlock(Blocks.PINK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = register("pink_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), 60, 30));
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = register("gray_wool_stairs", () -> new FlammableStairBlock(Blocks.GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = register("gray_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = register("light_gray_wool_stairs", () -> new FlammableStairBlock(Blocks.LIGHT_GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = register("light_gray_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), 60, 30));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = register("brown_wool_stairs", () -> new FlammableStairBlock(Blocks.BROWN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = register("brown_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), 60, 30));
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = register("white_wool_stairs", () -> new FlammableStairBlock(Blocks.WHITE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = register("white_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), 60, 30));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = register("black_wool_stairs", () -> new FlammableStairBlock(Blocks.BLACK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = register("black_wool_slab", () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), 60, 30));

    //MARBLE
    public static final RegistryObject<Block> MARBLE = register("marble", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_STAIRS = register("marble_stairs", () -> new StairBlock(() -> EBBlocks.MARBLE.get().defaultBlockState(), EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_SLAB = register("marble_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_WALL = register("marble_wall", () -> new WallBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE = register("marquina_marble", () -> new Block(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_STAIRS = register("marquina_marble_stairs", () -> new StairBlock(() -> EBBlocks.MARQUINA_MARBLE.get().defaultBlockState(), EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_SLAB = register("marquina_marble_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_WALL = register("marquina_marble_wall", () -> new WallBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> CHISELED_POLISHED_MARBLE = register("chiseled_polished_marble", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> CHISELED_POLISHED_MARBLE_SLAB = register("chiseled_polished_marble_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> POLISHED_MARBLE = register("polished_marble", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = register("polished_marble_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_MARBLE.get().defaultBlockState(), EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = register("polished_marble_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> POLISHED_MARBLE_WALL = register("polished_marble_wall", () -> new WallBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> POLISHED_MARQUINA_MARBLE = register("polished_marquina_marble", () -> new Block(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> POLISHED_MARQUINA_MARBLE_STAIRS = register("polished_marquina_marble_stairs", () -> new StairBlock(() -> EBBlocks.POLISHED_MARQUINA_MARBLE.get().defaultBlockState(), EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> POLISHED_MARQUINA_MARBLE_SLAB = register("polished_marquina_marble_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> POLISHED_MARQUINA_MARBLE_WALL = register("polished_marquina_marble_wall", () -> new WallBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARBLE_BRICKS = register("marble_bricks", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_BRICK_STAIRS = register("marble_brick_stairs", () -> new StairBlock(() -> EBBlocks.MARBLE_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_BRICK_SLAB = register("marble_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_BRICK_WALL = register("marble_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_BRICKS = register("marquina_marble_bricks", () -> new Block(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_BRICK_STAIRS = register("marquina_marble_brick_stairs", () -> new StairBlock(() -> EBBlocks.MARQUINA_MARBLE_BRICKS.get().defaultBlockState(), EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_BRICK_SLAB = register("marquina_marble_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_BRICK_WALL = register("marquina_marble_brick_wall", () -> new WallBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> CHISELED_MARBLE_BRICKS = register("chiseled_marble_bricks", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> CHISELED_MARBLE_BRICK_SLAB = register("chiseled_marble_brick_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_TILES = register("marble_tiles", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_TILE_STAIRS = register("marble_tile_stairs", () -> new StairBlock(() -> EBBlocks.MARBLE_TILES.get().defaultBlockState(), EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_TILE_SLAB = register("marble_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_TILE_WALL = register("marble_tile_wall", () -> new WallBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> CHISELED_MARBLE_TILES = register("chiseled_marble_tiles", () -> new Block(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> CHISELED_MARBLE_TILE_SLAB = register("chiseled_marble_tile_slab", () -> new SlabBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARBLE_PILLAR = register("marble_pillar", () -> new RotatedPillarBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_PILLAR = register("marquina_marble_pillar", () -> new RotatedPillarBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARBLE_PEDESTAL = register("marble_pedestal", () -> new PedestalBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_PEDESTAL = register("marquina_marble_pedestal", () -> new PedestalBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARBLE_VERTICAL_STAIRS = register("marble_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_VERTICAL_STAIRS = register("marquina_marble_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> POLISHED_MARBLE_VERTICAL_STAIRS = register("polished_marble_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> POLISHED_MARQUINA_MARBLE_VERTICAL_STAIRS = register("polished_marquina_marble_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARBLE_BRICK_VERTICAL_STAIRS = register("marble_brick_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARBLE));
    public static final RegistryObject<Block> MARQUINA_MARBLE_BRICK_VERTICAL_STAIRS = register("marquina_marble_brick_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARQUINA_MARBLE));
    public static final RegistryObject<Block> MARBLE_TILE_VERTICAL_STAIRS = register("marble_tile_vertical_stairs", () -> new VerticalStairBlock(EBProperties.BlockProperties.MARBLE));

    //VERTICAL STAIRS (for blocks before they were added + vanilla)
    public static final RegistryObject<Block> OAK_VERTICAL_STAIRS = register("oak_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> SPRUCE_VERTICAL_STAIRS = register("spruce_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> BIRCH_VERTICAL_STAIRS = register("birch_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> JUNGLE_VERTICAL_STAIRS = register("jungle_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> ACACIA_VERTICAL_STAIRS = register("acacia_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> DARK_OAK_VERTICAL_STAIRS = register("dark_oak_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> MANGROVE_VERTICAL_STAIRS = register("mangrove_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> CHERRY_VERTICAL_STAIRS = register("cherry_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), 20, 5));
    public static final RegistryObject<Block> BAMBOO_VERTICAL_STAIRS = register("bamboo_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS), 20, 5));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_VERTICAL_STAIRS = register("bamboo_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC), 20, 5));
    public static final RegistryObject<Block> CRIMSON_VERTICAL_STAIRS = register("crimson_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> WARPED_VERTICAL_STAIRS = register("warped_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> STONE_VERTICAL_STAIRS = register("stone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_VERTICAL_STAIRS = register("cobblestone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL_STAIRS = register("mossy_cobblestone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistryObject<Block> STONE_BRICK_VERTICAL_STAIRS = register("stone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICK_VERTICAL_STAIRS = register("mossy_stone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_VERTICAL_STAIRS = register("deepslate_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_TILE_VERTICAL_STAIRS = register("deepslate_tile_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_VERTICAL_STAIRS = register("polished_deepslate_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_VERTICAL_STAIRS = register("cobbled_deepslate_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> BLACKSTONE_VERTICAL_STAIRS = register("blackstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL_STAIRS = register("polished_blackstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("polished_blackstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> BRICK_VERTICAL_STAIRS = register("brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> QUARTZ_VERTICAL_STAIRS = register("quartz_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL_STAIRS = register("smooth_quartz_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<Block> SANDSTONE_VERTICAL_STAIRS = register("sandstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL_STAIRS = register("red_sandstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL_STAIRS = register("smooth_sandstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = register("smooth_red_sandstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final RegistryObject<Block> PRISMARINE_VERTICAL_STAIRS = register("prismarine_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL_STAIRS = register("dark_prismarine_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
    public static final RegistryObject<Block> PRISMARINE_BRICK_VERTICAL_STAIRS = register("prismarine_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public static final RegistryObject<Block> NETHER_BRICK_VERTICAL_STAIRS = register("nether_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));
    public static final RegistryObject<Block> RED_NETHER_BRICK_VERTICAL_STAIRS = register("red_nether_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));
    public static final RegistryObject<Block> ANDESITE_VERTICAL_STAIRS = register("andesite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GRANITE_VERTICAL_STAIRS = register("granite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DIORITE_VERTICAL_STAIRS = register("diorite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL_STAIRS = register("polished_andesite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL_STAIRS = register("polished_diorite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL_STAIRS = register("polished_granite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PURPUR_VERTICAL_STAIRS = register("purpur_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)));
    public static final RegistryObject<Block> MUD_BRICK_VERTICAL_STAIRS = register("mud_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> END_STONE_BRICK_VERTICAL_STAIRS = register("end_stone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_VERTICAL_STAIRS = register("oak_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_VERTICAL_STAIRS = register("spruce_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> BIRCH_MOSAIC_VERTICAL_STAIRS = register("birch_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_VERTICAL_STAIRS = register("jungle_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> ACACIA_MOSAIC_VERTICAL_STAIRS = register("acacia_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_VERTICAL_STAIRS = register("dark_oak_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_VERTICAL_STAIRS = register("mangrove_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> CHERRY_MOSAIC_VERTICAL_STAIRS = register("cherry_mosaic_vertical_stairs", () -> new FlammableVerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), 20, 5));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_VERTICAL_STAIRS = register("crimson_mosaic_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> WARPED_MOSAIC_VERTICAL_STAIRS = register("warped_mosaic_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> COBBLESTONE_BRICK_VERTICAL_STAIRS = register("cobblestone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("cobbled_deepslate_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_BRICK_VERTICAL_STAIRS = register("smooth_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = register("mossy_cobblestone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("mossy_cobbled_deepslate_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> BLACKSTONE_BRICK_VERTICAL_STAIRS = register("blackstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("crimson_mossy_blackstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("warped_mossy_blackstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("crimson_mossy_polished_blackstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("warped_mossy_polished_blackstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> GOLDEN_BRICK_VERTICAL_STAIRS = register("golden_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_VERTICAL_STAIRS = register("lapis_lazuli_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> BRIMSTONE_VERTICAL_STAIRS = register("brimstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.BRIMSTONE.get())));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_VERTICAL_STAIRS = register("polished_brimstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE.get())));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = register("polished_brimstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS = register("polished_brimstone_tile_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_BRIMSTONE_TILES.get())));
    public static final RegistryObject<Block> SOUL_SANDSTONE_VERTICAL_STAIRS = register("soul_sandstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SOUL_SANDSTONE.get())));
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = register("soul_sandstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SOUL_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> SANDSTONE_BRICK_VERTICAL_STAIRS = register("sandstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_VERTICAL_STAIRS = register("red_sandstone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.RED_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = register("smooth_soul_sandstone_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_SOUL_SANDSTONE.get())));
    public static final RegistryObject<Block> BLUE_NETHER_BRICK_VERTICAL_STAIRS = register("blue_nether_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.BLUE_NETHER_BRICKS.get())));
    public static final RegistryObject<Block> COBBLED_DIORITE_VERTICAL_STAIRS = register("cobbled_diorite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_DIORITE.get())));
    public static final RegistryObject<Block> COBBLED_ANDESITE_VERTICAL_STAIRS = register("cobbled_andesite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_ANDESITE.get())));
    public static final RegistryObject<Block> COBBLED_GRANITE_VERTICAL_STAIRS = register("cobbled_granite_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.COBBLED_GRANITE.get())));
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_VERTICAL_STAIRS = register("polished_granite_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_GRANITE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS = register("polished_andesite_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_ANDESITE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_VERTICAL_STAIRS = register("polished_diorite_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.POLISHED_DIORITE_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_STONE_BRICK_VERTICAL_STAIRS = register("smooth_stone_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_BRICKS.get())));
    public static final RegistryObject<Block> SMOOTH_STONE_TILE_VERTICAL_STAIRS = register("smooth_stone_tile_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.SMOOTH_STONE_TILES.get())));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("mossy_deepslate_brick_vertical_stairs", () -> new VerticalStairBlock(BlockBehaviour.Properties.copy(EBBlocks.MOSSY_DEEPSLATE_BRICKS.get())));

   public static <B extends Block>RegistryObject<B> register(String name, Supplier<B> block) {
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
