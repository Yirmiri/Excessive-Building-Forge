package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBBlocks;

public class EBBlockStateProvider extends BlockStateProvider {
    public EBBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExcessiveBuilding.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(EBBlocks.SULFURIC_BRIMSTONE_LAMP);
        blockWithItem(EBBlocks.SULFURIC_BRIMSTONE_WINDOW);

        blockWithItem(EBBlocks.POLISHED_BLACKSTONE_TILES);
        blockWithItem(EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        stairsBlock(((StairBlock) EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()));
        slabBlock(((SlabBlock) EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()));
        wallBlock(((WallBlock) EBBlocks.POLISHED_BLACKSTONE_TILE_WALL.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()));

        blockWithItem(EBBlocks.POLISHED_STONE_BRICKS);
        blockWithItem(EBBlocks.CRACKED_POLISHED_STONE_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.POLISHED_STONE_BRICK_STAIRS.get()), blockTexture(EBBlocks.POLISHED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.POLISHED_STONE_BRICK_SLAB.get()), blockTexture(EBBlocks.POLISHED_STONE_BRICKS.get()), blockTexture(EBBlocks.POLISHED_STONE_BRICKS.get()));
        wallBlock(((WallBlock) EBBlocks.POLISHED_STONE_BRICK_WALL.get()), blockTexture(EBBlocks.POLISHED_STONE_BRICKS.get()));

        blockWithItem(EBBlocks.POLISHED_STONE);
        stairsBlock(((StairBlock) EBBlocks.POLISHED_STONE_STAIRS.get()), blockTexture(EBBlocks.POLISHED_STONE.get()));
        slabBlock(((SlabBlock) EBBlocks.POLISHED_STONE_SLAB.get()), blockTexture(EBBlocks.POLISHED_STONE.get()), blockTexture(EBBlocks.POLISHED_STONE.get()));
        wallBlock(((WallBlock) EBBlocks.POLISHED_STONE_WALL.get()), blockTexture(EBBlocks.POLISHED_STONE.get()));

        blockWithItem(EBBlocks.POLISHED_CALCITE);
        blockWithItem(EBBlocks.CRACKED_CALCITE_TILES);
        stairsBlock(((StairBlock) EBBlocks.POLISHED_CALCITE_STAIRS.get()), blockTexture(EBBlocks.POLISHED_CALCITE.get()));
        slabBlock(((SlabBlock) EBBlocks.POLISHED_CALCITE_SLAB.get()), blockTexture(EBBlocks.POLISHED_CALCITE.get()), blockTexture(EBBlocks.POLISHED_CALCITE.get()));
        wallBlock(((WallBlock) EBBlocks.POLISHED_CALCITE_WALL.get()), blockTexture(EBBlocks.POLISHED_CALCITE.get()));

        wallBlock(((WallBlock) EBBlocks.BASKETWEAVE_BRICK_WALL.get()), blockTexture(EBBlocks.BASKETWEAVE_BRICKS.get()));
        wallBlock(((WallBlock) EBBlocks.SMOOTH_BASKETWEAVE_BRICK_WALL.get()), blockTexture(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()));

        blockWithItem(EBBlocks.SWIFT_ASPHALT);
        stairsBlock(((StairBlock) EBBlocks.SWIFT_ASPHALT_STAIRS.get()), blockTexture(EBBlocks.SWIFT_ASPHALT.get()));
        slabBlock(((SlabBlock) EBBlocks.SWIFT_ASPHALT_SLAB.get()), blockTexture(EBBlocks.SWIFT_ASPHALT.get()), blockTexture(EBBlocks.SWIFT_ASPHALT.get()));
        stairsBlock(((StairBlock) EBBlocks.ASPHALT_STAIRS.get()), blockTexture(EBBlocks.ASPHALT.get()));
        slabBlock(((SlabBlock) EBBlocks.ASPHALT_SLAB.get()), blockTexture(EBBlocks.ASPHALT.get()), blockTexture(EBBlocks.ASPHALT.get()));

        blockWithItem(EBBlocks.ANCIENT_PLANKS);
        stairsBlock(((StairBlock) EBBlocks.ANCIENT_STAIRS.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        slabBlock(((SlabBlock) EBBlocks.ANCIENT_SLAB.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        fenceBlock(((FenceBlock) EBBlocks.ANCIENT_FENCE.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) EBBlocks.ANCIENT_FENCE_GATE.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        buttonBlock(((ButtonBlock) EBBlocks.ANCIENT_BUTTON.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) EBBlocks.ANCIENT_PRESSURE_PLATE.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        blockWithItem(EBBlocks.ANCIENT_MOSAIC);
        stairsBlock(((StairBlock) EBBlocks.ANCIENT_MOSAIC_STAIRS.get()), blockTexture(EBBlocks.ANCIENT_MOSAIC.get()));
        slabBlock(((SlabBlock) EBBlocks.ANCIENT_MOSAIC_SLAB.get()), blockTexture(EBBlocks.ANCIENT_MOSAIC.get()), blockTexture(EBBlocks.ANCIENT_MOSAIC.get()));
        blockWithItem(EBBlocks.ANCIENT_LEAVES);
        blockWithItem(EBBlocks.UNLIT_ANCIENT_LEAVES);

        blockWithItem(EBBlocks.COPPER_BULB);
        blockWithItem(EBBlocks.WEATHERED_COPPER_BULB);
        blockWithItem(EBBlocks.EXPOSED_COPPER_BULB);
        blockWithItem(EBBlocks.OXIDIZED_COPPER_BULB);
        blockWithItem(EBBlocks.WAXED_COPPER_BULB);
        blockWithItem(EBBlocks.WAXED_WEATHERED_COPPER_BULB);
        blockWithItem(EBBlocks.WAXED_EXPOSED_COPPER_BULB);
        blockWithItem(EBBlocks.WAXED_OXIDIZED_COPPER_BULB);

        blockWithItem(EBBlocks.TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.RAINBOW_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.RAINBOW_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.RAINBOW_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.RED_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.RED_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.RED_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.RED_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.RED_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.RED_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.ORANGE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.YELLOW_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.LIME_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.LIME_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.LIME_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.LIME_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.GREEN_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.BLUE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.CYAN_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.PURPLE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.MAGENTA_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.PINK_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.PINK_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.PINK_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.PINK_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.WHITE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.BLACK_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.GRAY_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.BROWN_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()));

        stairsBlock(((StairBlock) EBBlocks.NETHERRACK_STAIRS.get()), blockTexture(Blocks.NETHERRACK));
        slabBlock(((SlabBlock) EBBlocks.NETHERRACK_SLAB.get()), blockTexture(Blocks.NETHERRACK), blockTexture(Blocks.NETHERRACK));

        stairsBlock(((StairBlock) EBBlocks.END_STONE_STAIRS.get()), blockTexture(Blocks.END_STONE));
        slabBlock(((SlabBlock) EBBlocks.END_STONE_SLAB.get()), blockTexture(Blocks.END_STONE), blockTexture(Blocks.END_STONE));

        stairsBlock(((StairBlock) EBBlocks.SMOOTH_BASALT_STAIRS.get()), blockTexture(Blocks.SMOOTH_BASALT));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_BASALT_SLAB.get()), blockTexture(Blocks.SMOOTH_BASALT), blockTexture(Blocks.SMOOTH_BASALT));

        signBlock(((StandingSignBlock) EBBlocks.ANCIENT_SIGN.get()), ((WallSignBlock) EBBlocks.ANCIENT_WALL_SIGN.get()),
                blockTexture(EBBlocks.ANCIENT_PLANKS.get()));

        hangingSignBlock(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));

        blockWithItem(EBBlocks.EMERALD_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.EMERALD_BRICK_STAIRS.get()), blockTexture(EBBlocks.EMERALD_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.EMERALD_BRICK_SLAB.get()), blockTexture(EBBlocks.EMERALD_BRICKS.get()), blockTexture(EBBlocks.EMERALD_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS.get()), blockTexture(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB.get()), blockTexture(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()), blockTexture(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()));

        blockWithItem(EBBlocks.BUDDING_FIERY_BLOCK);
        blockWithItem(EBBlocks.BUDDING_KYANITE_BLOCK);

        blockWithItem(EBBlocks.WILLOW_PLANKS);
        stairsBlock(((StairBlock) EBBlocks.WILLOW_STAIRS.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) EBBlocks.WILLOW_SLAB.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()));
        fenceBlock(((FenceBlock) EBBlocks.WILLOW_FENCE.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) EBBlocks.WILLOW_FENCE_GATE.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()));
        buttonBlock(((ButtonBlock) EBBlocks.WILLOW_BUTTON.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) EBBlocks.WILLOW_PRESSURE_PLATE.get()), blockTexture(EBBlocks.WILLOW_PLANKS.get()));
        blockWithItem(EBBlocks.WILLOW_MOSAIC);
        stairsBlock(((StairBlock) EBBlocks.WILLOW_MOSAIC_STAIRS.get()), blockTexture(EBBlocks.WILLOW_MOSAIC.get()));
        slabBlock(((SlabBlock) EBBlocks.WILLOW_MOSAIC_SLAB.get()), blockTexture(EBBlocks.WILLOW_MOSAIC.get()), blockTexture(EBBlocks.WILLOW_MOSAIC.get()));

        signBlock(((StandingSignBlock) EBBlocks.WILLOW_SIGN.get()), ((WallSignBlock) EBBlocks.WILLOW_WALL_SIGN.get()),
                blockTexture(EBBlocks.WILLOW_PLANKS.get()));

        hangingSignBlock(EBBlocks.WILLOW_HANGING_SIGN.get(), EBBlocks.WILLOW_WALL_HANGING_SIGN.get(), blockTexture(EBBlocks.WILLOW_PLANKS.get()));

        blockWithItem(EBBlocks.MAPLE_PLANKS);
        stairsBlock(((StairBlock) EBBlocks.MAPLE_STAIRS.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()));
        slabBlock(((SlabBlock) EBBlocks.MAPLE_SLAB.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()));
        fenceBlock(((FenceBlock) EBBlocks.MAPLE_FENCE.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) EBBlocks.MAPLE_FENCE_GATE.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()));
        buttonBlock(((ButtonBlock) EBBlocks.MAPLE_BUTTON.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) EBBlocks.MAPLE_PRESSURE_PLATE.get()), blockTexture(EBBlocks.MAPLE_PLANKS.get()));
        blockWithItem(EBBlocks.MAPLE_MOSAIC);
        stairsBlock(((StairBlock) EBBlocks.MAPLE_MOSAIC_STAIRS.get()), blockTexture(EBBlocks.MAPLE_MOSAIC.get()));
        slabBlock(((SlabBlock) EBBlocks.MAPLE_MOSAIC_SLAB.get()), blockTexture(EBBlocks.MAPLE_MOSAIC.get()), blockTexture(EBBlocks.MAPLE_MOSAIC.get()));

        signBlock(((StandingSignBlock) EBBlocks.MAPLE_SIGN.get()), ((WallSignBlock) EBBlocks.MAPLE_WALL_SIGN.get()),
                blockTexture(EBBlocks.MAPLE_PLANKS.get()));

        hangingSignBlock(EBBlocks.MAPLE_HANGING_SIGN.get(), EBBlocks.MAPLE_WALL_HANGING_SIGN.get(), blockTexture(EBBlocks.MAPLE_PLANKS.get()));

        blockWithItem(EBBlocks.RED_MAPLE_LEAVES);
        blockWithItem(EBBlocks.ORANGE_MAPLE_LEAVES);
        blockWithItem(EBBlocks.YELLOW_MAPLE_LEAVES);

        simpleBlockWithItem(EBBlocks.MARIGOLD.get(), models().cross(blockTexture(EBBlocks.MARIGOLD.get()).getPath(),
                blockTexture(EBBlocks.MARIGOLD.get())).renderType("cutout"));

        simpleBlockWithItem(EBBlocks.POTTED_MARIGOLD.get(), models().singleTexture("potted_marigold",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(EBBlocks.MARIGOLD.get())).renderType("cutout"));

        blockWithItem(EBBlocks.MOSSY_POLISHED_STONE_BRICKS);
        stairsBlock(((StairBlock) EBBlocks.MOSSY_POLISHED_STONE_BRICK_STAIRS.get()), blockTexture(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) EBBlocks.MOSSY_POLISHED_STONE_BRICK_SLAB.get()), blockTexture(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), blockTexture(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()));
        wallBlock(((WallBlock) EBBlocks.MOSSY_POLISHED_STONE_BRICK_WALL.get()), blockTexture(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()));

        doorBlockWithRenderType(((DoorBlock) EBBlocks.IRON_BAR_DOOR.get()), modLoc("block/iron_bar_door_bottom"), modLoc("block/iron_bar_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) EBBlocks.IRON_BAR_TRAPDOOR.get()), modLoc("block/iron_bar_trapdoor"), true, "cutout");

        blockWithItem(EBBlocks.BUDDING_MIRALEN_BLOCK);
        blockWithItem(EBBlocks.GOLDEN_BIRCH_LEAVES);

        blockWithItem(EBBlocks.KNITTED_BLACK_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_BLACK_STAIRS.get()), blockTexture(EBBlocks.KNITTED_BLACK_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_BLACK_SLAB.get()), blockTexture(EBBlocks.KNITTED_BLACK_WOOL.get()), blockTexture(EBBlocks.KNITTED_BLACK_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_LIGHT_GRAY_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_LIGHT_GRAY_STAIRS.get()), blockTexture(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_LIGHT_GRAY_SLAB.get()), blockTexture(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()), blockTexture(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_GRAY_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_GRAY_STAIRS.get()), blockTexture(EBBlocks.KNITTED_GRAY_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_GRAY_SLAB.get()), blockTexture(EBBlocks.KNITTED_GRAY_WOOL.get()), blockTexture(EBBlocks.KNITTED_GRAY_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_WHITE_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_WHITE_STAIRS.get()), blockTexture(EBBlocks.KNITTED_WHITE_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_WHITE_SLAB.get()), blockTexture(EBBlocks.KNITTED_WHITE_WOOL.get()), blockTexture(EBBlocks.KNITTED_WHITE_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_BROWN_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_BROWN_STAIRS.get()), blockTexture(EBBlocks.KNITTED_BROWN_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_BROWN_SLAB.get()), blockTexture(EBBlocks.KNITTED_BROWN_WOOL.get()), blockTexture(EBBlocks.KNITTED_BROWN_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_RED_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_RED_STAIRS.get()), blockTexture(EBBlocks.KNITTED_RED_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_RED_SLAB.get()), blockTexture(EBBlocks.KNITTED_RED_WOOL.get()), blockTexture(EBBlocks.KNITTED_RED_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_ORANGE_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_ORANGE_STAIRS.get()), blockTexture(EBBlocks.KNITTED_ORANGE_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_ORANGE_SLAB.get()), blockTexture(EBBlocks.KNITTED_ORANGE_WOOL.get()), blockTexture(EBBlocks.KNITTED_ORANGE_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_YELLOW_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_YELLOW_STAIRS.get()), blockTexture(EBBlocks.KNITTED_YELLOW_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_YELLOW_SLAB.get()), blockTexture(EBBlocks.KNITTED_YELLOW_WOOL.get()), blockTexture(EBBlocks.KNITTED_YELLOW_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_LIME_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_LIME_STAIRS.get()), blockTexture(EBBlocks.KNITTED_LIME_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_LIME_SLAB.get()), blockTexture(EBBlocks.KNITTED_LIME_WOOL.get()), blockTexture(EBBlocks.KNITTED_LIME_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_GREEN_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_GREEN_STAIRS.get()), blockTexture(EBBlocks.KNITTED_GREEN_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_GREEN_SLAB.get()), blockTexture(EBBlocks.KNITTED_GREEN_WOOL.get()), blockTexture(EBBlocks.KNITTED_GREEN_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_CYAN_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_CYAN_STAIRS.get()), blockTexture(EBBlocks.KNITTED_CYAN_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_CYAN_SLAB.get()), blockTexture(EBBlocks.KNITTED_CYAN_WOOL.get()), blockTexture(EBBlocks.KNITTED_CYAN_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_LIGHT_BLUE_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_LIGHT_BLUE_STAIRS.get()), blockTexture(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_LIGHT_BLUE_SLAB.get()), blockTexture(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()), blockTexture(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_BLUE_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_BLUE_STAIRS.get()), blockTexture(EBBlocks.KNITTED_BLUE_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_BLUE_SLAB.get()), blockTexture(EBBlocks.KNITTED_BLUE_WOOL.get()), blockTexture(EBBlocks.KNITTED_BLUE_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_PURPLE_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_PURPLE_STAIRS.get()), blockTexture(EBBlocks.KNITTED_PURPLE_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_PURPLE_SLAB.get()), blockTexture(EBBlocks.KNITTED_PURPLE_WOOL.get()), blockTexture(EBBlocks.KNITTED_PURPLE_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_MAGENTA_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_MAGENTA_STAIRS.get()), blockTexture(EBBlocks.KNITTED_MAGENTA_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_MAGENTA_SLAB.get()), blockTexture(EBBlocks.KNITTED_MAGENTA_WOOL.get()), blockTexture(EBBlocks.KNITTED_MAGENTA_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_PINK_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_PINK_STAIRS.get()), blockTexture(EBBlocks.KNITTED_PINK_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_PINK_SLAB.get()), blockTexture(EBBlocks.KNITTED_PINK_WOOL.get()), blockTexture(EBBlocks.KNITTED_PINK_WOOL.get()));

        blockWithItem(EBBlocks.KNITTED_RAINBOW_WOOL);
        stairsBlock(((StairBlock) EBBlocks.KNITTED_RAINBOW_STAIRS.get()), blockTexture(EBBlocks.KNITTED_RAINBOW_WOOL.get()));
        slabBlock(((SlabBlock) EBBlocks.KNITTED_RAINBOW_SLAB.get()), blockTexture(EBBlocks.KNITTED_RAINBOW_WOOL.get()), blockTexture(EBBlocks.KNITTED_RAINBOW_WOOL.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
