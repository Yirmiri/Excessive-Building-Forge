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
import net.yirmiri.excessive_building.item.EBItems;

public class EBItemModelProvider extends ItemModelProvider {

    public EBItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExcessiveBuilding.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        wallItem(EBBlocks.POLISHED_BLACKSTONE_TILE_WALL, EBBlocks.POLISHED_BLACKSTONE_TILES);

        evenSimplerBlockItem(EBBlocks.POLISHED_STONE_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_STONE_BRICK_SLAB);
        wallItem(EBBlocks.POLISHED_STONE_BRICK_WALL, EBBlocks.POLISHED_STONE_BRICKS);

        evenSimplerBlockItem(EBBlocks.POLISHED_STONE_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_STONE_SLAB);
        wallItem(EBBlocks.POLISHED_STONE_WALL, EBBlocks.POLISHED_STONE);

        evenSimplerBlockItem(EBBlocks.POLISHED_CALCITE_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_CALCITE_SLAB);
        wallItem(EBBlocks.POLISHED_CALCITE_WALL, EBBlocks.POLISHED_CALCITE);

        wallItem(EBBlocks.BASKETWEAVE_BRICK_WALL, EBBlocks.BASKETWEAVE_BRICKS);
        wallItem(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_WALL, EBBlocks.SMOOTH_BASKETWEAVE_BRICKS);

        evenSimplerBlockItem(EBBlocks.SWIFT_ASPHALT_STAIRS);
        evenSimplerBlockItem(EBBlocks.SWIFT_ASPHALT_SLAB);
        evenSimplerBlockItem(EBBlocks.ASPHALT_STAIRS);
        evenSimplerBlockItem(EBBlocks.ASPHALT_SLAB);

        //simpleItem(EBItems.ANCIENT_SIGN);
        //simpleItem(EBItems.ANCIENT_HANGING_SIGN);
        evenSimplerBlockItem(EBBlocks.ANCIENT_STAIRS);
        evenSimplerBlockItem(EBBlocks.ANCIENT_SLAB);
        evenSimplerBlockItem(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        evenSimplerBlockItem(EBBlocks.ANCIENT_MOSAIC_SLAB);
        evenSimplerBlockItem(EBBlocks.ANCIENT_PRESSURE_PLATE);
        evenSimplerBlockItem(EBBlocks.ANCIENT_FENCE_GATE);
        fenceItem(EBBlocks.ANCIENT_FENCE, EBBlocks.ANCIENT_PLANKS);
        buttonItem(EBBlocks.ANCIENT_BUTTON, EBBlocks.ANCIENT_PLANKS);

        simpleItem(EBItems.ANCIENT_FRUIT);

        evenSimplerBlockItem(EBBlocks.POLISHED_BASALT_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_BASALT_SLAB);
        wallItem(EBBlocks.POLISHED_BASALT_WALL, EBBlocks.POLISHED_BASALT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MODID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ExcessiveBuilding.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ExcessiveBuilding.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ExcessiveBuilding.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ExcessiveBuilding.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExcessiveBuilding.MODID,"block/" + item.getId().getPath()));
    }
}
