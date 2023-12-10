package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yirmiri.excessive_building.block.EBBlocks;

import java.util.List;
import java.util.function.Consumer;

public class EBRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> QUARTZ_SMELTABLES = List.of(EBBlocks.QUARTZ_ORE.get(), EBBlocks.DEEPSLATE_QUARTZ_ORE.get());
    public EBRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        stairBuilder(EBBlocks.TUFF_STAIRS.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_SLAB.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(pWriter);

        verticalstairBuilder(EBBlocks.TUFF_VERTICAL_STAIRS.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_WALL.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(pWriter);

        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_POLISHED_TUFF.get(), Ingredient.of(EBBlocks.POLISHED_TUFF_SLAB.get()))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(pWriter);

        stairBuilder(EBBlocks.POLISHED_TUFF_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF_WALL.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(pWriter);

        stairBuilder(EBBlocks.TUFF_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_SLAB.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_WALL.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(pWriter);

        stairBuilder(EBBlocks.TUFF_TILE_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_SLAB.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.TUFF_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_WALL.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(pWriter);

        copperbulbBuilder(EBBlocks.COPPER_BULB.get(), Ingredient.of(Blocks.COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK)).save(pWriter);

        copperbulbBuilder(EBBlocks.EXPOSED_COPPER_BULB.get(), Ingredient.of(Blocks.EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER)).save(pWriter);

        copperbulbBuilder(EBBlocks.WEATHERED_COPPER_BULB.get(), Ingredient.of(Blocks.WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER)).save(pWriter);

        copperbulbBuilder(EBBlocks.OXIDIZED_COPPER_BULB.get(), Ingredient.of(Blocks.OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER)).save(pWriter);

        copperbulbBuilder(EBBlocks.WAXED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.WAXED_COPPER_BLOCK), has(Blocks.WAXED_COPPER_BLOCK)).save(pWriter);

        copperbulbBuilder(EBBlocks.WAXED_EXPOSED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), has(Blocks.WAXED_EXPOSED_COPPER)).save(pWriter);

        copperbulbBuilder(EBBlocks.WAXED_WEATHERED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_COPPER), has(Blocks.WAXED_WEATHERED_COPPER)).save(pWriter);

        copperbulbBuilder(EBBlocks.WAXED_OXIDIZED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_COPPER), has(Blocks.WAXED_OXIDIZED_COPPER)).save(pWriter);

        grateBuilder(EBBlocks.COPPER_GRATE.get(), Ingredient.of(Blocks.COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK)).save(pWriter);

        grateBuilder(EBBlocks.EXPOSED_COPPER_GRATE.get(), Ingredient.of(Blocks.EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER)).save(pWriter);

        grateBuilder(EBBlocks.WEATHERED_COPPER_GRATE.get(), Ingredient.of(Blocks.WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER)).save(pWriter);

        grateBuilder(EBBlocks.OXIDIZED_COPPER_GRATE.get(), Ingredient.of(Blocks.OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER)).save(pWriter);

        grateBuilder(EBBlocks.WAXED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.WAXED_COPPER_BLOCK), has(Blocks.WAXED_COPPER_BLOCK)).save(pWriter);

        grateBuilder(EBBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), has(Blocks.WAXED_EXPOSED_COPPER)).save(pWriter);

        grateBuilder(EBBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_COPPER), has(Blocks.WAXED_WEATHERED_COPPER)).save(pWriter);

        grateBuilder(EBBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_COPPER), has(Blocks.WAXED_OXIDIZED_COPPER)).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF.get(), 4)
                .define('#', Items.TUFF)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Items.TUFF), has(Items.TUFF)).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICKS.get(), 4)
                .define('#', EBBlocks.POLISHED_TUFF.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILES.get(), 4)
                .define('#', EBBlocks.TUFF_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(pWriter);

        slabBuilder(RecipeCategory.DECORATIONS, EBBlocks.DIRT_SLAB.get(), Ingredient.of(Blocks.DIRT))
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT)).save(pWriter);

        grateBuilder(EBBlocks.IRON_GRATE.get(), Ingredient.of(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK)).save(pWriter);

        grateBuilder(EBBlocks.GOLD_GRATE.get(), Ingredient.of(Blocks.GOLD_BLOCK))
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK)).save(pWriter);
    }

    protected static RecipeBuilder verticalstairBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 4)
                .define('#', ingredient)
                .pattern("###")
                .pattern("## ")
                .pattern("#  ");
    }

    protected static RecipeBuilder copperbulbBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 4)
                .define('#', Items.BLAZE_ROD).define('@', Items.REDSTONE).define('$', ingredient)
                .pattern(" $ ")
                .pattern("$#$")
                .pattern(" @ ");
    }

    protected static RecipeBuilder grateBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 4)
                .define('#', ingredient)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ");
    }
}
