package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.EBBlocks;

public class EBItemModelProvider extends ItemModelProvider {

    public EBItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExcessiveBuilding.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        evenSimplerBlockItem(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        evenSimplerBlockItem(EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        wallItem(EBBlocks.POLISHED_BLACKSTONE_TILE_WALL, EBBlocks.POLISHED_BLACKSTONE_TILES);
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ExcessiveBuilding.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ExcessiveBuilding.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
}
