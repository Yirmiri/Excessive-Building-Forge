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
import net.yirmiri.excessive_building.block.EBBlocks;

public class EBBlockStateProvider extends BlockStateProvider {
    public EBBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExcessiveBuilding.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
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
        /*
        signBlock(((StandingSignBlock) EBBlocks.ANCIENT_SIGN.get()), ((WallSignBlock) EBBlocks.ANCIENT_WALL_SIGN.get()), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
        hangingSignBlock(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), blockTexture(EBBlocks.ANCIENT_PLANKS.get()));
         */
        blockWithItem(EBBlocks.ANCIENT_MOSAIC);
        stairsBlock(((StairBlock) EBBlocks.ANCIENT_MOSAIC_STAIRS.get()), blockTexture(EBBlocks.ANCIENT_MOSAIC.get()));
        slabBlock(((SlabBlock) EBBlocks.ANCIENT_MOSAIC_SLAB.get()), blockTexture(EBBlocks.ANCIENT_MOSAIC.get()), blockTexture(EBBlocks.ANCIENT_MOSAIC.get()));
        blockWithItem(EBBlocks.ANCIENT_LEAVES);
        blockWithItem(EBBlocks.UNLIT_ANCIENT_LEAVES);

        blockWithItem(EBBlocks.POLISHED_BASALT);
        stairsBlock(((StairBlock) EBBlocks.POLISHED_BASALT_STAIRS.get()), blockTexture(EBBlocks.POLISHED_BASALT.get()));
        slabBlock(((SlabBlock) EBBlocks.POLISHED_BASALT_SLAB.get()), blockTexture(EBBlocks.POLISHED_BASALT.get()), blockTexture(EBBlocks.POLISHED_BASALT.get()));
        wallBlock(((WallBlock) EBBlocks.POLISHED_BASALT_WALL.get()), blockTexture(EBBlocks.POLISHED_BASALT.get()));
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
