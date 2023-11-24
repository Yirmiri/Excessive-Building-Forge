package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.EBBlocks;
import net.yirmiri.excessive_building.compat.aether.AetherIntegration;

public class EBBlockStateProvider extends BlockStateProvider {
    public EBBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExcessiveBuilding.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(EBBlocks.POLISHED_BLACKSTONE_TILES);
        blockWithItem(EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        stairsBlock(((StairBlock) EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()));
        slabBlock(((SlabBlock) EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()));
        wallBlock(((WallBlock) EBBlocks.POLISHED_BLACKSTONE_TILE_WALL.get()), blockTexture(EBBlocks.POLISHED_BLACKSTONE_TILES.get()));

        stairsBlock(((StairBlock) AetherIntegration.SKYROOT_MOSAIC_STAIRS.get()), blockTexture(AetherIntegration.SKYROOT_MOSAIC.get()));
        slabBlock(((SlabBlock) AetherIntegration.SKYROOT_MOSAIC_SLAB.get()), blockTexture(AetherIntegration.SKYROOT_MOSAIC.get()), blockTexture(AetherIntegration.SKYROOT_MOSAIC.get()));

        stairsBlock(((StairBlock) AetherIntegration.AMBROSIUM_BRICK_STAIRS.get()), blockTexture(AetherIntegration.AMBROSIUM_BRICKS.get()));
        slabBlock(((SlabBlock) AetherIntegration.AMBROSIUM_BRICK_SLAB.get()), blockTexture(AetherIntegration.AMBROSIUM_BRICKS.get()), blockTexture(AetherIntegration.AMBROSIUM_BRICKS.get()));

        stairsBlock(((StairBlock) AetherIntegration.ZANITE_BRICK_STAIRS.get()), blockTexture(AetherIntegration.ZANITE_BRICKS.get()));
        slabBlock(((SlabBlock) AetherIntegration.ZANITE_BRICK_SLAB.get()), blockTexture(AetherIntegration.ZANITE_BRICKS.get()), blockTexture(AetherIntegration.ZANITE_BRICKS.get()));

        stairsBlock(((StairBlock) AetherIntegration.ENCHANTED_GRAVITITE_BRICK_STAIRS.get()), blockTexture(AetherIntegration.ENCHANTED_GRAVITITE_BRICKS.get()));
        slabBlock(((SlabBlock) AetherIntegration.ENCHANTED_GRAVITITE_BRICK_SLAB.get()), blockTexture(AetherIntegration.ENCHANTED_GRAVITITE_BRICKS.get()), blockTexture(AetherIntegration.ENCHANTED_GRAVITITE_BRICKS.get()));
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
