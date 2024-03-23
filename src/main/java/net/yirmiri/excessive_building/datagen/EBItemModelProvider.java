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
import net.yirmiri.excessive_building.register.EBBlocks;
import net.yirmiri.excessive_building.register.EBItems;

public class EBItemModelProvider extends ItemModelProvider {

    public EBItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExcessiveBuilding.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(EBBlocks.TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.RAINBOW_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.RAINBOW_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.RED_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.GREEN_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.LIME_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.BLUE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.CYAN_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.PINK_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.WHITE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.GRAY_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.BLACK_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.BROWN_TERRACOTTA_BRICK_SLAB);

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

        evenSimplerBlockItem(EBBlocks.ANCIENT_STAIRS);
        evenSimplerBlockItem(EBBlocks.ANCIENT_SLAB);
        evenSimplerBlockItem(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        evenSimplerBlockItem(EBBlocks.ANCIENT_MOSAIC_SLAB);
        evenSimplerBlockItem(EBBlocks.ANCIENT_PRESSURE_PLATE);
        evenSimplerBlockItem(EBBlocks.ANCIENT_FENCE_GATE);
        fenceItem(EBBlocks.ANCIENT_FENCE, EBBlocks.ANCIENT_PLANKS);
        buttonItem(EBBlocks.ANCIENT_BUTTON, EBBlocks.ANCIENT_PLANKS);

        simpleItem(EBItems.ANCIENT_FRUIT);

        evenSimplerBlockItem(EBBlocks.SMOOTH_BASALT_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_BASALT_SLAB);

        evenSimplerBlockItem(EBBlocks.END_STONE_STAIRS);
        evenSimplerBlockItem(EBBlocks.END_STONE_SLAB);

        evenSimplerBlockItem(EBBlocks.NETHERRACK_STAIRS);
        evenSimplerBlockItem(EBBlocks.NETHERRACK_SLAB);

        simpleItem(EBItems.ANCIENT_SIGN);
        simpleItem(EBItems.ANCIENT_HANGING_SIGN);

        evenSimplerBlockItem(EBBlocks.EMERALD_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.EMERALD_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB);

        evenSimplerBlockItem(EBBlocks.WILLOW_STAIRS);
        evenSimplerBlockItem(EBBlocks.WILLOW_SLAB);
        evenSimplerBlockItem(EBBlocks.WILLOW_MOSAIC_STAIRS);
        evenSimplerBlockItem(EBBlocks.WILLOW_MOSAIC_SLAB);
        evenSimplerBlockItem(EBBlocks.WILLOW_PRESSURE_PLATE);
        evenSimplerBlockItem(EBBlocks.WILLOW_FENCE_GATE);
        fenceItem(EBBlocks.WILLOW_FENCE, EBBlocks.WILLOW_PLANKS);
        buttonItem(EBBlocks.WILLOW_BUTTON, EBBlocks.WILLOW_PLANKS);

        simpleItem(EBItems.WILLOW_SIGN);
        simpleItem(EBItems.WILLOW_HANGING_SIGN);

        evenSimplerBlockItem(EBBlocks.MAPLE_STAIRS);
        evenSimplerBlockItem(EBBlocks.MAPLE_SLAB);
        evenSimplerBlockItem(EBBlocks.MAPLE_MOSAIC_STAIRS);
        evenSimplerBlockItem(EBBlocks.MAPLE_MOSAIC_SLAB);
        evenSimplerBlockItem(EBBlocks.MAPLE_PRESSURE_PLATE);
        evenSimplerBlockItem(EBBlocks.MAPLE_FENCE_GATE);
        fenceItem(EBBlocks.MAPLE_FENCE, EBBlocks.MAPLE_PLANKS);
        buttonItem(EBBlocks.MAPLE_BUTTON, EBBlocks.MAPLE_PLANKS);

        simpleItem(EBItems.MAPLE_SIGN);
        simpleItem(EBItems.MAPLE_HANGING_SIGN);

        simpleItem(EBItems.EXCESSIVE_BANNER_PATTERN);
        simpleBlockItemBlockTexture(EBBlocks.MARIGOLD);

        evenSimplerBlockItem(EBBlocks.MOSSY_POLISHED_STONE_BRICK_STAIRS);
        evenSimplerBlockItem(EBBlocks.MOSSY_POLISHED_STONE_BRICK_SLAB);
        wallItem(EBBlocks.MOSSY_POLISHED_STONE_BRICK_WALL, EBBlocks.POLISHED_STONE_BRICKS);

        simpleBlockItem(EBBlocks.IRON_BAR_DOOR);
        trapdoorItem(EBBlocks.IRON_BAR_TRAPDOOR);

        evenSimplerBlockItem(EBBlocks.KNITTED_RED_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_RED_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_ORANGE_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_ORANGE_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_YELLOW_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_YELLOW_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_LIME_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_LIME_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_GREEN_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_GREEN_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_BLUE_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_BLUE_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_LIGHT_BLUE_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_LIGHT_BLUE_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_CYAN_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_CYAN_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_BLUE_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_BLUE_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_PINK_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_PINK_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_MAGENTA_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_MAGENTA_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_WHITE_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_WHITE_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_GRAY_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_GRAY_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_LIGHT_GRAY_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_LIGHT_GRAY_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_BLACK_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_BLACK_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_PURPLE_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_PURPLE_SLAB);

        evenSimplerBlockItem(EBBlocks.KNITTED_BROWN_STAIRS);
        evenSimplerBlockItem(EBBlocks.KNITTED_BROWN_SLAB);
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
