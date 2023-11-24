package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.EBBlocks;
import net.yirmiri.excessive_building.compat.aether.AetherIntegration;

public class EBItemModelProvider extends ItemModelProvider {

    public EBItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExcessiveBuilding.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        evenSimplerBlockItem(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        wallItem(EBBlocks.POLISHED_BLACKSTONE_TILE_WALL, EBBlocks.POLISHED_BLACKSTONE_TILES);

        evenSimplerBlockItem(AetherIntegration.SKYROOT_MOSAIC_STAIRS);
        evenSimplerBlockItem(AetherIntegration.SKYROOT_MOSAIC_SLAB);

        evenSimplerBlockItem(AetherIntegration.AMBROSIUM_BRICK_STAIRS);
        evenSimplerBlockItem(AetherIntegration.AMBROSIUM_BRICK_SLAB);

        evenSimplerBlockItem(AetherIntegration.ZANITE_BRICK_STAIRS);
        evenSimplerBlockItem(AetherIntegration.ZANITE_BRICK_SLAB);

        evenSimplerBlockItem(AetherIntegration.ENCHANTED_GRAVITITE_BRICK_STAIRS);
        evenSimplerBlockItem(AetherIntegration.ENCHANTED_GRAVITITE_BRICK_SLAB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ExcessiveBuilding.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ExcessiveBuilding.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ExcessiveBuilding.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ExcessiveBuilding.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MOD_ID,"block/" + item.getId().getPath()));
    }
}
