package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yirmiri.excessive_building.register.EBBlocks;
import net.yirmiri.excessive_building.register.EBItems;

import java.util.function.Consumer;

public class EBRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public EBRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> output) {

        stairBuilder(EBBlocks.TUFF_STAIRS.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_SLAB.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(output);

        verticalstairBuilder(EBBlocks.TUFF_VERTICAL_STAIRS.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_WALL.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(output);

        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_POLISHED_TUFF.get(), Ingredient.of(EBBlocks.POLISHED_TUFF_SLAB.get()))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF)).save(output);

        stairBuilder(EBBlocks.POLISHED_TUFF_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(output);

        verticalstairBuilder(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF_WALL.get(), Ingredient.of(EBBlocks.POLISHED_TUFF.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(output);

        stairBuilder(EBBlocks.TUFF_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_SLAB.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_WALL.get(), Ingredient.of(EBBlocks.TUFF_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.TUFF_TILE_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_SLAB.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.TUFF_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_WALL.get(), Ingredient.of(EBBlocks.TUFF_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES.get()), has(EBBlocks.TUFF_TILES.get())).save(output);

        copperbulbBuilder(EBBlocks.COPPER_BULB.get(), Ingredient.of(Blocks.COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK)).save(output);

        copperbulbBuilder(EBBlocks.EXPOSED_COPPER_BULB.get(), Ingredient.of(Blocks.EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER)).save(output);

        copperbulbBuilder(EBBlocks.WEATHERED_COPPER_BULB.get(), Ingredient.of(Blocks.WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER)).save(output);

        copperbulbBuilder(EBBlocks.OXIDIZED_COPPER_BULB.get(), Ingredient.of(Blocks.OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER)).save(output);

        copperbulbBuilder(EBBlocks.WAXED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.WAXED_COPPER_BLOCK), has(Blocks.WAXED_COPPER_BLOCK)).save(output);

        copperbulbBuilder(EBBlocks.WAXED_EXPOSED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), has(Blocks.WAXED_EXPOSED_COPPER)).save(output);

        copperbulbBuilder(EBBlocks.WAXED_WEATHERED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_COPPER), has(Blocks.WAXED_WEATHERED_COPPER)).save(output);

        copperbulbBuilder(EBBlocks.WAXED_OXIDIZED_COPPER_BULB.get(), Ingredient.of(Blocks.WAXED_OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_COPPER), has(Blocks.WAXED_OXIDIZED_COPPER)).save(output);

        grateBuilder(EBBlocks.COPPER_GRATE.get(), Ingredient.of(Blocks.COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK)).save(output);

        grateBuilder(EBBlocks.EXPOSED_COPPER_GRATE.get(), Ingredient.of(Blocks.EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER)).save(output);

        grateBuilder(EBBlocks.WEATHERED_COPPER_GRATE.get(), Ingredient.of(Blocks.WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER)).save(output);

        grateBuilder(EBBlocks.OXIDIZED_COPPER_GRATE.get(), Ingredient.of(Blocks.OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER)).save(output);

        grateBuilder(EBBlocks.WAXED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_COPPER_BLOCK))
                .unlockedBy(getHasName(Blocks.WAXED_COPPER_BLOCK), has(Blocks.WAXED_COPPER_BLOCK)).save(output);

        grateBuilder(EBBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_EXPOSED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), has(Blocks.WAXED_EXPOSED_COPPER)).save(output);

        grateBuilder(EBBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_WEATHERED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_COPPER), has(Blocks.WAXED_WEATHERED_COPPER)).save(output);

        grateBuilder(EBBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), Ingredient.of(Blocks.WAXED_OXIDIZED_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_COPPER), has(Blocks.WAXED_OXIDIZED_COPPER)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF.get(), 4)
                .define('#', Items.TUFF)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Items.TUFF), has(Items.TUFF)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICKS.get(), 4)
                .define('#', EBBlocks.POLISHED_TUFF.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.POLISHED_TUFF.get()), has(EBBlocks.POLISHED_TUFF.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILES.get(), 4)
                .define('#', EBBlocks.TUFF_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.DECORATIONS, EBBlocks.DIRT_SLAB.get(), Ingredient.of(Blocks.DIRT))
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT)).save(output);

        grateBuilder(EBBlocks.IRON_GRATE.get(), Ingredient.of(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK)).save(output);

        grateBuilder(EBBlocks.GOLD_GRATE.get(), Ingredient.of(Blocks.GOLD_BLOCK))
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_TILES.get(), 4)
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE_BRICKS), has(Blocks.POLISHED_BLACKSTONE_BRICKS)).save(output);

        stairBuilder(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_TILE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE.get(), 4)
                .define('#', Blocks.STONE).define('@', Blocks.SMOOTH_STONE)
                .pattern("#@")
                .pattern("@#").unlockedBy(getHasName(Blocks.SMOOTH_STONE), has(Blocks.SMOOTH_STONE)).save(output);

        stairBuilder(EBBlocks.POLISHED_STONE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(output);

        verticalstairBuilder(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_BRICKS.get(), 4)
                .define('#', EBBlocks.POLISHED_STONE.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(output);

        stairBuilder(EBBlocks.POLISHED_STONE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.POLISHED_STONE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_BRICK_WALL.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HERRINGBONE_BRICKS.get(), 2)
                .define('#', Blocks.BRICK_SLAB)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.BRICK_SLAB), has(Blocks.BRICK_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BASKETWEAVE_BRICKS.get(), 1)
                .define('#', Blocks.BRICK_SLAB)
                .pattern("#")
                .pattern("#").unlockedBy(getHasName(Blocks.BRICK_SLAB), has(Blocks.BRICK_SLAB)).save(output);

        stairBuilder(EBBlocks.BASKETWEAVE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BASKETWEAVE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.BASKETWEAVE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BASKETWEAVE_BRICK_WALL.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_HERRINGBONE_BRICKS.get(), 2)
                .define('#', EBBlocks.SMOOTH_BRICK_SLAB.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.SMOOTH_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_BRICK_SLAB.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get(), 1)
                .define('#', EBBlocks.SMOOTH_BRICK_SLAB.get())
                .pattern("#")
                .pattern("#").unlockedBy(getHasName(EBBlocks.SMOOTH_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_BRICK_SLAB.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BASKETWEAVE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BASKETWEAVE_BRICK_WALL.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.BRICKS), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.STONE_LAMP.get(), 4)
                .define('#', EBBlocks.POLISHED_STONE.get()).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.DEEPSLATE_LAMP.get(), 4)
                .define('#', Blocks.POLISHED_DEEPSLATE).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BLACKSTONE_LAMP.get(), 4)
                .define('#', Blocks.POLISHED_BLACKSTONE).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BLACKSTONE_WINDOW.get(), 2)
                .define('#', Items.NETHER_BRICK).define('@', EBItems.FIERY_SHARDS.get()).define('%', Blocks.POLISHED_BLACKSTONE)
                .pattern("#@#")
                .pattern("@%@")
                .pattern("#@#").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BRIMSTONE_LAMP.get(), 4)
                .define('#', EBBlocks.POLISHED_BRIMSTONE.get()).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BRIMSTONE_WINDOW.get(), 2)
                .define('#', Items.NETHER_BRICK).define('@', EBItems.FIERY_SHARDS.get()).define('%', EBBlocks.POLISHED_BRIMSTONE.get())
                .pattern("#@#")
                .pattern("@%@")
                .pattern("#@#").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        stairBuilder(EBBlocks.ASPHALT_STAIRS.get(), Ingredient.of(EBBlocks.ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_SLAB.get(), Ingredient.of(EBBlocks.ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(output);

        verticalstairBuilder(EBBlocks.ASPHALT_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(output);

        stairBuilder(EBBlocks.ANCIENT_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_SLAB.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        verticalstairBuilder(EBBlocks.ANCIENT_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        stairBuilder(EBBlocks.ANCIENT_MOSAIC_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC.get()), has(EBBlocks.ANCIENT_MOSAIC.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_MOSAIC_SLAB.get(), Ingredient.of(EBBlocks.ANCIENT_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC.get()), has(EBBlocks.ANCIENT_MOSAIC.get())).save(output);

        verticalstairBuilder(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC.get()), has(EBBlocks.ANCIENT_MOSAIC.get())).save(output);

        craftingtableBuilder(EBBlocks.ANCIENT_CRAFTING_TABLE.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        EBmosaicBuilder(EBBlocks.ANCIENT_MOSAIC.get(), Ingredient.of(EBBlocks.ANCIENT_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_SLAB.get()), has(EBBlocks.ANCIENT_SLAB.get())).save(output);

        chiseledplankBuilder(EBBlocks.CHISELED_ANCIENT.get(), Ingredient.of(EBBlocks.ANCIENT_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_SLAB.get()), has(EBBlocks.ANCIENT_SLAB.get())).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_PLANKS.get(), 4).requires(EBBlocks.ANCIENT_LOG.get())
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LOG.get()), has(EBBlocks.ANCIENT_LOG.get())).save(output);

        woodBuilder(EBBlocks.ANCIENT_WOOD.get(), Ingredient.of(EBBlocks.ANCIENT_LOG.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LOG.get()), has(EBBlocks.ANCIENT_LOG.get())).save(output);

        woodBuilder(EBBlocks.STRIPPED_ANCIENT_WOOD.get(), Ingredient.of(EBBlocks.STRIPPED_ANCIENT_LOG.get()))
                .unlockedBy(getHasName(EBBlocks.STRIPPED_ANCIENT_LOG.get()), has(EBBlocks.STRIPPED_ANCIENT_LOG.get())).save(output);

        fenceBuilder(EBBlocks.ANCIENT_FENCE.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        fenceGateBuilder(EBBlocks.ANCIENT_FENCE_GATE.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        doorBuilder(EBBlocks.ANCIENT_DOOR.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        trapdoorBuilder(EBBlocks.ANCIENT_TRAPDOOR.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        buttonBuilder(EBBlocks.ANCIENT_BUTTON.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.ANCIENT_PRESSURE_PLATE.get())
                .define('#', EBBlocks.ANCIENT_PLANKS.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_WOOL.get(), 9)
                .define('R', Blocks.RED_WOOL).define('O', Blocks.ORANGE_WOOL).define('Y', Blocks.YELLOW_WOOL)
                .define('L', Blocks.LIME_WOOL).define('G', Blocks.GREEN_WOOL).define('C', Blocks.LIGHT_BLUE_WOOL)
                .define('B', Blocks.BLUE_WOOL).define('P', Blocks.PURPLE_WOOL).define('I', Blocks.PINK_WOOL)
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_WOOL.get()), has(EBBlocks.RAINBOW_WOOL.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_TERRACOTTA_TILES.get(), 9)
                .define('R', EBBlocks.RED_TERRACOTTA_TILES.get()).define('O', EBBlocks.ORANGE_TERRACOTTA_TILES.get()).define('Y', EBBlocks.YELLOW_TERRACOTTA_TILES.get())
                .define('L', EBBlocks.LIME_TERRACOTTA_TILES.get()).define('G', EBBlocks.GREEN_TERRACOTTA_TILES.get()).define('C', EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get())
                .define('B', EBBlocks.BLUE_TERRACOTTA_TILES.get()).define('P', EBBlocks.PURPLE_TERRACOTTA_TILES.get()).define('I', EBBlocks.PINK_TERRACOTTA_TILES.get())
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_TERRACOTTA_TILES.get()), has(EBBlocks.RAINBOW_TERRACOTTA_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_STAINED_GLASS.get(), 9)
                .define('R', Blocks.RED_STAINED_GLASS).define('O', Blocks.ORANGE_STAINED_GLASS).define('Y', Blocks.YELLOW_STAINED_GLASS)
                .define('L', Blocks.LIME_STAINED_GLASS).define('G', Blocks.GREEN_STAINED_GLASS).define('C', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .define('B', Blocks.BLUE_STAINED_GLASS).define('P', Blocks.PURPLE_STAINED_GLASS).define('I', Blocks.PINK_STAINED_GLASS)
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_STAINED_GLASS.get()), has(EBBlocks.RAINBOW_STAINED_GLASS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.RAINBOW_STAINED_GLASS_PANE.get(), 16)
                .define('#', EBBlocks.RAINBOW_STAINED_GLASS.get())
                .pattern("###")
                .pattern("###").unlockedBy(getHasName(EBBlocks.RAINBOW_STAINED_GLASS.get()), has(EBBlocks.RAINBOW_STAINED_GLASS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.RAINBOW_CARPET.get(), 6)
                .define('#', EBBlocks.RAINBOW_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.RAINBOW_WOOL.get()), has(EBBlocks.RAINBOW_WOOL.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get(), 9)
                .define('R', EBBlocks.RED_TERRACOTTA_BRICKS.get()).define('O', EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()).define('Y', EBBlocks.YELLOW_TERRACOTTA_BRICKS.get())
                .define('L', EBBlocks.LIME_TERRACOTTA_BRICKS.get()).define('G', EBBlocks.GREEN_TERRACOTTA_BRICKS.get()).define('C', EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())
                .define('B', EBBlocks.BLUE_TERRACOTTA_BRICKS.get()).define('P', EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()).define('I', EBBlocks.PINK_TERRACOTTA_BRICKS.get())
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.RAINBOW_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICKS.get(), 4)
                .define('#', Blocks.COBBLESTONE)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICKS.get(), 4)
                .define('#', Blocks.COBBLED_DEEPSLATE).define('@', Blocks.POLISHED_DEEPSLATE)
                .pattern("@#")
                .pattern("#@").unlockedBy(getHasName(Blocks.COBBLED_DEEPSLATE), has(Blocks.COBBLED_DEEPSLATE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICKS.get(), 4)
                .define('#', Blocks.BLACKSTONE).define('@', Blocks.POLISHED_BLACKSTONE)
                .pattern("@#")
                .pattern("#@").unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE), has(Blocks.POLISHED_BLACKSTONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.TERRACOTTA), has(Blocks.TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TERRACOTTA_BRICKS.get()), has(EBBlocks.TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.TERRACOTTA_BRICKS.get()), has(EBBlocks.TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.RED_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.RED_TERRACOTTA), has(Blocks.RED_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.RED_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.RED_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.RED_TERRACOTTA_BRICKS.get()), has(EBBlocks.RED_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.RED_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.RED_TERRACOTTA_BRICKS.get()), has(EBBlocks.RED_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ORANGE_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.ORANGE_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.ORANGE_TERRACOTTA), has(Blocks.ORANGE_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), has(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), has(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.YELLOW_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.YELLOW_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.YELLOW_TERRACOTTA), has(Blocks.YELLOW_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LIME_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.LIME_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.LIME_TERRACOTTA), has(Blocks.LIME_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.LIME_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIME_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LIME_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.LIME_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIME_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GREEN_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.GREEN_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.GREEN_TERRACOTTA), has(Blocks.GREEN_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), has(EBBlocks.GREEN_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), has(EBBlocks.GREEN_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLUE_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.BLUE_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.BLUE_TERRACOTTA), has(Blocks.BLUE_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.BLUE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.BLUE_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.LIGHT_BLUE_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.LIGHT_BLUE_TERRACOTTA), has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CYAN_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.CYAN_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.CYAN_TERRACOTTA), has(Blocks.CYAN_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), has(EBBlocks.CYAN_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), has(EBBlocks.CYAN_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PURPLE_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.PURPLE_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.PURPLE_TERRACOTTA), has(Blocks.PURPLE_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), has(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), has(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.MAGENTA_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.MAGENTA_TERRACOTTA), has(Blocks.MAGENTA_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), has(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), has(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PINK_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.PINK_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.PINK_TERRACOTTA), has(Blocks.PINK_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.PINK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), has(EBBlocks.PINK_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PINK_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.PINK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), has(EBBlocks.PINK_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BROWN_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.BROWN_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.BROWN_TERRACOTTA), has(Blocks.BROWN_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), has(EBBlocks.BROWN_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), has(EBBlocks.BROWN_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACK_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.BLACK_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.BLACK_TERRACOTTA), has(Blocks.BLACK_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), has(EBBlocks.BLACK_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), has(EBBlocks.BLACK_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WHITE_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.WHITE_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.WHITE_TERRACOTTA), has(Blocks.WHITE_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), has(EBBlocks.WHITE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), has(EBBlocks.WHITE_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRAY_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.GRAY_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.GRAY_TERRACOTTA), has(Blocks.GRAY_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.GRAY_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.GRAY_TERRACOTTA_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get(), 4)
                .define('#', Blocks.LIGHT_GRAY_TERRACOTTA)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.LIGHT_GRAY_TERRACOTTA), has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(output);

        stairBuilder(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRASS_SLAB.get(), Ingredient.of(Blocks.GRASS_BLOCK))
                .unlockedBy(getHasName(Blocks.GRASS_BLOCK), has(Blocks.GRASS_BLOCK)).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ROOTED_DIRT_SLAB.get(), Ingredient.of(Blocks.ROOTED_DIRT))
                .unlockedBy(getHasName(Blocks.ROOTED_DIRT), has(Blocks.ROOTED_DIRT)).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COARSE_DIRT_SLAB.get(), Ingredient.of(Blocks.COARSE_DIRT))
                .unlockedBy(getHasName(Blocks.COARSE_DIRT), has(Blocks.COARSE_DIRT)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICKS.get(), 4)
                .define('#', Blocks.MOSSY_COBBLESTONE)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.MOSSY_COBBLESTONE), has(Blocks.MOSSY_COBBLESTONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KYANITE_LAMP.get(), 2)
                .define('#', Items.IRON_INGOT).define('@', EBItems.KYANITE_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.KYANITE_SHARDS.get()), has(EBItems.KYANITE_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KYANITE_GLASS_PANE.get(), 16)
                .define('#', EBBlocks.KYANITE_GLASS.get())
                .pattern("###")
                .pattern("###").unlockedBy(getHasName(EBBlocks.KYANITE_GLASS.get()), has(EBBlocks.KYANITE_GLASS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_GLASS.get(), 4)
                .define('@', EBItems.KYANITE_SHARDS.get()).define('#', Blocks.GLASS)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.KYANITE_SHARDS.get()), has(EBItems.KYANITE_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_GLASS.get(), 4)
                .define('@', Items.AMETHYST_SHARD).define('#', Blocks.GLASS)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_GLASS.get(), 4)
                .define('@', Items.PRISMARINE_CRYSTALS).define('#', Blocks.GLASS)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(Items.PRISMARINE_CRYSTALS), has(Items.PRISMARINE_CRYSTALS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_GLASS.get(), 4)
                .define('@', EBItems.FIERY_SHARDS.get()).define('#', Blocks.GLASS)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICKS.get(), 4)
                .define('#', Blocks.AMETHYST_BLOCK)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK)).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_AMETHYST_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.AMETHYST_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICK_SLAB.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.AMETHYST_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICK_WALL.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_TILES.get(), 4)
                .define('#', EBBlocks.AMETHYST_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.AMETHYST_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_AMETHYST_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.AMETHYST_TILES.get()), has(EBBlocks.AMETHYST_TILES.get())).save(output);

        stairBuilder(EBBlocks.AMETHYST_TILE_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_TILES.get()), has(EBBlocks.AMETHYST_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_TILE_SLAB.get(), Ingredient.of(EBBlocks.AMETHYST_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_TILES.get()), has(EBBlocks.AMETHYST_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.AMETHYST_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_TILES.get()), has(EBBlocks.AMETHYST_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_TILE_WALL.get(), Ingredient.of(EBBlocks.AMETHYST_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_TILES.get()), has(EBBlocks.AMETHYST_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get(), 4)
                .define('#', EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_PRISMARINE_CRYSTAL_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.PRISMARINE_CRYSTAL_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_CRYSTAL_BRICK_SLAB.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.PRISMARINE_CRYSTAL_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_CRYSTAL_BRICK_WALL.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_CRYSTAL_TILES.get(), 4)
                .define('#', EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_PRISMARINE_CRYSTAL_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), has(EBBlocks.PRISMARINE_CRYSTAL_TILES.get())).save(output);

        stairBuilder(EBBlocks.PRISMARINE_CRYSTAL_TILE_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), has(EBBlocks.PRISMARINE_CRYSTAL_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_CRYSTAL_TILE_SLAB.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), has(EBBlocks.PRISMARINE_CRYSTAL_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.PRISMARINE_CRYSTAL_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), has(EBBlocks.PRISMARINE_CRYSTAL_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_CRYSTAL_TILE_WALL.get(), Ingredient.of(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_TILES.get()), has(EBBlocks.PRISMARINE_CRYSTAL_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_BRICKS.get(), 4)
                .define('#', EBBlocks.FIERY_BLOCK.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.FIERY_BLOCK.get()), has(EBBlocks.FIERY_BLOCK.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.FIERY_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_FIERY_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.FIERY_BRICKS.get()), has(EBBlocks.FIERY_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.FIERY_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.FIERY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_BRICKS.get()), has(EBBlocks.FIERY_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_BRICK_SLAB.get(), Ingredient.of(EBBlocks.FIERY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_BRICKS.get()), has(EBBlocks.FIERY_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.FIERY_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.FIERY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_BRICKS.get()), has(EBBlocks.FIERY_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_BRICK_WALL.get(), Ingredient.of(EBBlocks.FIERY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_BRICKS.get()), has(EBBlocks.FIERY_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_TILES.get(), 4)
                .define('#', EBBlocks.FIERY_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.FIERY_BRICKS.get()), has(EBBlocks.FIERY_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.FIERY_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_FIERY_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.FIERY_TILES.get()), has(EBBlocks.FIERY_TILES.get())).save(output);

        stairBuilder(EBBlocks.FIERY_TILE_STAIRS.get(), Ingredient.of(EBBlocks.FIERY_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_TILES.get()), has(EBBlocks.FIERY_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_TILE_SLAB.get(), Ingredient.of(EBBlocks.FIERY_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_TILES.get()), has(EBBlocks.FIERY_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.FIERY_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.FIERY_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_TILES.get()), has(EBBlocks.FIERY_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.FIERY_TILE_WALL.get(), Ingredient.of(EBBlocks.FIERY_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.FIERY_TILES.get()), has(EBBlocks.FIERY_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_BRICKS.get(), 4)
                .define('#', EBBlocks.KYANITE_BLOCK.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.KYANITE_BLOCK.get()), has(EBBlocks.KYANITE_BLOCK.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.KYANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_KYANITE_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.KYANITE_BRICKS.get()), has(EBBlocks.KYANITE_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.KYANITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.KYANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_BRICKS.get()), has(EBBlocks.KYANITE_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.KYANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_BRICKS.get()), has(EBBlocks.KYANITE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.KYANITE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.KYANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_BRICKS.get()), has(EBBlocks.KYANITE_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.KYANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_BRICKS.get()), has(EBBlocks.KYANITE_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_TILES.get(), 4)
                .define('#', EBBlocks.KYANITE_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.KYANITE_BRICKS.get()), has(EBBlocks.KYANITE_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.KYANITE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_KYANITE_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.KYANITE_TILES.get()), has(EBBlocks.KYANITE_TILES.get())).save(output);

        stairBuilder(EBBlocks.KYANITE_TILE_STAIRS.get(), Ingredient.of(EBBlocks.KYANITE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_TILES.get()), has(EBBlocks.KYANITE_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_TILE_SLAB.get(), Ingredient.of(EBBlocks.KYANITE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_TILES.get()), has(EBBlocks.KYANITE_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.KYANITE_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.KYANITE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_TILES.get()), has(EBBlocks.KYANITE_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KYANITE_TILE_WALL.get(), Ingredient.of(EBBlocks.KYANITE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.KYANITE_TILES.get()), has(EBBlocks.KYANITE_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SMOOTH_STONE_BRICKS.get(), 1)
                .define('#', EBBlocks.SMOOTH_STONE_BRICK_SLAB.get())
                .pattern("#")
                .pattern("#").unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get())).save(output);

        signBuilder(EBBlocks.ANCIENT_SIGN.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_HANGING_SIGN.get(), 6)
                .define('#', EBBlocks.STRIPPED_ANCIENT_LOG.get()).define('@', Items.CHAIN)
                .pattern("@ @")
                .pattern("###")
                .pattern("###").unlockedBy(getHasName(EBBlocks.STRIPPED_ANCIENT_LOG.get()), has(EBBlocks.STRIPPED_ANCIENT_LOG.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICKS.get(), 1)
                .define('#', Items.EMERALD)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD)).save(output);

        stairBuilder(EBBlocks.EMERALD_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.EMERALD_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS.get()), has(EBBlocks.EMERALD_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_SLAB.get(), Ingredient.of(EBBlocks.EMERALD_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS.get()), has(EBBlocks.EMERALD_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.EMERALD_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS.get()), has(EBBlocks.EMERALD_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_RED_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_RAINBOW_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.RAINBOW_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.TERRACOTTA_BRICKS.get()), has(EBBlocks.TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.RED_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_RED_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.RED_TERRACOTTA_BRICKS.get()), has(EBBlocks.RED_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_YELLOW_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get()), has(EBBlocks.YELLOW_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_ORANGE_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get()), has(EBBlocks.ORANGE_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LIME_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LIME_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIME_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_GREEN_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.GREEN_TERRACOTTA_BRICKS.get()), has(EBBlocks.GREEN_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_CYAN_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.CYAN_TERRACOTTA_BRICKS.get()), has(EBBlocks.CYAN_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BLUE_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.BLUE_TERRACOTTA_BRICKS.get()), has(EBBlocks.BLUE_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_PURPLE_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get()), has(EBBlocks.PURPLE_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_MAGENTA_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get()), has(EBBlocks.MAGENTA_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_PINK_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.PINK_TERRACOTTA_BRICKS.get()), has(EBBlocks.PINK_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_WHITE_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.WHITE_TERRACOTTA_BRICKS.get()), has(EBBlocks.WHITE_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_GRAY_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.GRAY_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get()), has(EBBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BLACK_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.BLACK_TERRACOTTA_BRICKS.get()), has(EBBlocks.BLACK_TERRACOTTA_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BROWN_TERRACOTTA_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.BROWN_TERRACOTTA_BRICKS.get()), has(EBBlocks.BROWN_TERRACOTTA_BRICKS.get())).save(output);

        EBmosaicBuilder(EBBlocks.SMOOTH_STONE_BRICK_PILLAR.get(), Ingredient.of(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.POLISHED_BRIMSTONE_PEDESTAL.get(), 3)
                .define('#', EBBlocks.POLISHED_BRIMSTONE_SLAB.get()).define('@', EBBlocks.POLISHED_BRIMSTONE_PILLAR.get())
                .pattern("###")
                .pattern(" @ ")
                .pattern("###").unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE_SLAB.get()), has(EBBlocks.POLISHED_BRIMSTONE_SLAB.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.SMOOTH_STONE_BRICK_PEDESTAL.get(), 3)
                .define('#', EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()).define('@', EBBlocks.SMOOTH_STONE_BRICK_PILLAR.get())
                .pattern("###")
                .pattern(" @ ")
                .pattern("###").unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_STONE_BRICK_SLAB.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.QUARTZ_PEDESTAL.get(), 3)
                .define('#', Blocks.QUARTZ_SLAB).define('@', Blocks.QUARTZ_PILLAR)
                .pattern("###")
                .pattern(" @ ")
                .pattern("###").unlockedBy(getHasName(Blocks.QUARTZ_SLAB), has(Blocks.QUARTZ_SLAB)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.PURPUR_PEDESTAL.get(), 3)
                .define('#', Blocks.PURPUR_SLAB).define('@', Blocks.PURPUR_PILLAR)
                .pattern("###")
                .pattern(" @ ")
                .pattern("###").unlockedBy(getHasName(Blocks.PURPUR_SLAB), has(Blocks.PURPUR_SLAB)).save(output);

        stairBuilder(EBBlocks.WILLOW_STAIRS.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WILLOW_SLAB.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        verticalstairBuilder(EBBlocks.WILLOW_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        stairBuilder(EBBlocks.WILLOW_MOSAIC_STAIRS.get(), Ingredient.of(EBBlocks.WILLOW_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_MOSAIC.get()), has(EBBlocks.WILLOW_MOSAIC.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WILLOW_MOSAIC_SLAB.get(), Ingredient.of(EBBlocks.WILLOW_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_MOSAIC.get()), has(EBBlocks.WILLOW_MOSAIC.get())).save(output);

        verticalstairBuilder(EBBlocks.WILLOW_MOSAIC_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.WILLOW_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_MOSAIC.get()), has(EBBlocks.WILLOW_MOSAIC.get())).save(output);

        craftingtableBuilder(EBBlocks.WILLOW_CRAFTING_TABLE.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        EBmosaicBuilder(EBBlocks.WILLOW_MOSAIC.get(), Ingredient.of(EBBlocks.WILLOW_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_SLAB.get()), has(EBBlocks.WILLOW_SLAB.get())).save(output);

        chiseledplankBuilder(EBBlocks.CHISELED_WILLOW.get(), Ingredient.of(EBBlocks.WILLOW_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_SLAB.get()), has(EBBlocks.WILLOW_SLAB.get())).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WILLOW_PLANKS.get(), 4).requires(EBBlocks.WILLOW_LOG.get())
                .unlockedBy(getHasName(EBBlocks.WILLOW_LOG.get()), has(EBBlocks.WILLOW_LOG.get())).save(output);

        woodBuilder(EBBlocks.WILLOW_WOOD.get(), Ingredient.of(EBBlocks.WILLOW_LOG.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_LOG.get()), has(EBBlocks.WILLOW_LOG.get())).save(output);

        woodBuilder(EBBlocks.STRIPPED_WILLOW_WOOD.get(), Ingredient.of(EBBlocks.STRIPPED_WILLOW_LOG.get()))
                .unlockedBy(getHasName(EBBlocks.STRIPPED_WILLOW_LOG.get()), has(EBBlocks.STRIPPED_WILLOW_LOG.get())).save(output);

        fenceBuilder(EBBlocks.WILLOW_FENCE.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        fenceGateBuilder(EBBlocks.WILLOW_FENCE_GATE.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        doorBuilder(EBBlocks.WILLOW_DOOR.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        trapdoorBuilder(EBBlocks.WILLOW_TRAPDOOR.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        buttonBuilder(EBBlocks.WILLOW_BUTTON.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.WILLOW_PRESSURE_PLATE.get())
                .define('#', EBBlocks.WILLOW_PLANKS.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        signBuilder(EBBlocks.WILLOW_SIGN.get(), Ingredient.of(EBBlocks.WILLOW_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WILLOW_HANGING_SIGN.get(), 6)
                .define('#', EBBlocks.STRIPPED_WILLOW_LOG.get()).define('@', Items.CHAIN)
                .pattern("@ @")
                .pattern("###")
                .pattern("###").unlockedBy(getHasName(EBBlocks.STRIPPED_WILLOW_LOG.get()), has(EBBlocks.STRIPPED_WILLOW_LOG.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.ROSE_BUNDLE.get(), 4)
                .define('#', EBBlocks.ROSE.get()).define('@', Blocks.ROSE_BUSH)
                .pattern("#@#").unlockedBy(getHasName(EBBlocks.ROSE.get()), has(EBBlocks.ROSE.get())).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.EXCESSIVE_BANNER_PATTERN.get(), 1).requires(EBBlocks.COBBLESTONE_BRICKS.get())
                .requires(EBBlocks.CRIMSON_MOSAIC.get()).requires(EBBlocks.DECORATIVE_SHELF.get())
                .unlockedBy(getHasName(EBBlocks.DECORATIVE_SHELF.get()), has(EBBlocks.DECORATIVE_SHELF.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_OAK_LOG.get(), 8)
                .define('#', Blocks.OAK_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.OAK_LOG), has(Blocks.OAK_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_CHERRY_LOG.get(), 8)
                .define('#', Blocks.CHERRY_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.CHERRY_LOG), has(Blocks.CHERRY_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_MANGROVE_LOG.get(), 8)
                .define('#', Blocks.MANGROVE_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.MANGROVE_LOG), has(Blocks.MANGROVE_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_DARK_OAK_LOG.get(), 8)
                .define('#', Blocks.DARK_OAK_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.DARK_OAK_LOG), has(Blocks.DARK_OAK_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_ACACIA_LOG.get(), 8)
                .define('#', Blocks.ACACIA_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.ACACIA_LOG), has(Blocks.ACACIA_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_JUNGLE_LOG.get(), 8)
                .define('#', Blocks.JUNGLE_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.JUNGLE_LOG), has(Blocks.JUNGLE_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_BIRCH_LOG.get(), 8)
                .define('#', Blocks.BIRCH_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.BIRCH_LOG), has(Blocks.BIRCH_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_SPRUCE_LOG.get(), 8)
                .define('#', Blocks.SPRUCE_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.SPRUCE_LOG), has(Blocks.SPRUCE_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_CRIMSON_STEM.get(), 8)
                .define('#', Blocks.CRIMSON_STEM)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.CRIMSON_STEM), has(Blocks.CRIMSON_STEM)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_WARPED_STEM.get(), 8)
                .define('#', Blocks.WARPED_STEM)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.WARPED_STEM), has(Blocks.WARPED_STEM)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_WILLOW_LOG.get(), 8)
                .define('#', EBBlocks.WILLOW_LOG.get())
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(EBBlocks.WILLOW_LOG.get()), has(EBBlocks.WILLOW_LOG.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_ANCIENT_LOG.get(), 8)
                .define('#', EBBlocks.ANCIENT_LOG.get())
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(EBBlocks.ANCIENT_LOG.get()), has(EBBlocks.ANCIENT_LOG.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_OAK_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_OAK_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_OAK_LOG), has(Blocks.STRIPPED_OAK_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_CHERRY_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_CHERRY_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_CHERRY_LOG), has(Blocks.STRIPPED_CHERRY_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_MANGROVE_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_MANGROVE_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_MANGROVE_LOG), has(Blocks.STRIPPED_MANGROVE_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_DARK_OAK_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_DARK_OAK_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_DARK_OAK_LOG), has(Blocks.STRIPPED_DARK_OAK_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_ACACIA_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_ACACIA_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_ACACIA_LOG), has(Blocks.STRIPPED_ACACIA_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_JUNGLE_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_JUNGLE_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_JUNGLE_LOG), has(Blocks.STRIPPED_JUNGLE_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_BIRCH_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_BIRCH_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_BIRCH_LOG), has(Blocks.STRIPPED_BIRCH_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_SPRUCE_LOG.get(), 8)
                .define('#', Blocks.STRIPPED_SPRUCE_LOG)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_SPRUCE_LOG), has(Blocks.STRIPPED_SPRUCE_LOG)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_CRIMSON_STEM.get(), 8)
                .define('#', Blocks.STRIPPED_CRIMSON_STEM)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_CRIMSON_STEM), has(Blocks.STRIPPED_CRIMSON_STEM)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_WARPED_STEM.get(), 8)
                .define('#', Blocks.STRIPPED_WARPED_STEM)
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.STRIPPED_WARPED_STEM), has(Blocks.STRIPPED_WARPED_STEM)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_WILLOW_LOG.get(), 8)
                .define('#', EBBlocks.STRIPPED_WILLOW_LOG.get())
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(EBBlocks.STRIPPED_WILLOW_LOG.get()), has(EBBlocks.STRIPPED_WILLOW_LOG.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HOLLOW_STRIPPED_ANCIENT_LOG.get(), 8)
                .define('#', EBBlocks.STRIPPED_ANCIENT_LOG.get())
                .pattern("###")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(EBBlocks.STRIPPED_ANCIENT_LOG.get()), has(EBBlocks.STRIPPED_ANCIENT_LOG.get())).save(output);

        stairBuilder(EBBlocks.MOSSY_POLISHED_STONE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), has(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_POLISHED_STONE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), has(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.MOSSY_POLISHED_STONE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), has(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_POLISHED_STONE_BRICK_WALL.get(), Ingredient.of(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get()), has(EBBlocks.MOSSY_POLISHED_STONE_BRICKS.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_RED_WOOL.get(), Ingredient.of(Blocks.RED_WOOL))
                .unlockedBy(getHasName(Blocks.RED_WOOL), has(Blocks.RED_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_RED_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_RED_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_RED_WOOL.get()), has(EBBlocks.KNITTED_RED_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_RED_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_RED_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_RED_WOOL.get()), has(EBBlocks.KNITTED_RED_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_RED_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_RED_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_RED_WOOL.get()), has(EBBlocks.KNITTED_RED_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_CYAN_WOOL.get(), Ingredient.of(Blocks.CYAN_WOOL))
                .unlockedBy(getHasName(Blocks.CYAN_WOOL), has(Blocks.CYAN_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_CYAN_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_CYAN_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_CYAN_WOOL.get()), has(EBBlocks.KNITTED_CYAN_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_CYAN_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_CYAN_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_CYAN_WOOL.get()), has(EBBlocks.KNITTED_CYAN_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_CYAN_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_CYAN_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_CYAN_WOOL.get()), has(EBBlocks.KNITTED_CYAN_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_BLUE_WOOL.get(), Ingredient.of(Blocks.BLUE_WOOL))
                .unlockedBy(getHasName(Blocks.BLUE_WOOL), has(Blocks.BLUE_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_BLUE_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_BLUE_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_BLUE_WOOL.get()), has(EBBlocks.KNITTED_BLUE_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_BLUE_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_BLUE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_BLUE_WOOL.get()), has(EBBlocks.KNITTED_BLUE_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_BLUE_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_BLUE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_BLUE_WOOL.get()), has(EBBlocks.KNITTED_BLUE_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_PURPLE_WOOL.get(), Ingredient.of(Blocks.PURPLE_WOOL))
                .unlockedBy(getHasName(Blocks.PURPLE_WOOL), has(Blocks.PURPLE_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_PURPLE_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_PURPLE_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_PURPLE_WOOL.get()), has(EBBlocks.KNITTED_PURPLE_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_PURPLE_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_PURPLE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_PURPLE_WOOL.get()), has(EBBlocks.KNITTED_PURPLE_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_PURPLE_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_PURPLE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_PURPLE_WOOL.get()), has(EBBlocks.KNITTED_PURPLE_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_BLACK_WOOL.get(), Ingredient.of(Blocks.BLACK_WOOL))
                .unlockedBy(getHasName(Blocks.BLACK_WOOL), has(Blocks.BLACK_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_BLACK_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_BLACK_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_BLACK_WOOL.get()), has(EBBlocks.KNITTED_BLACK_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_BLACK_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_BLACK_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_BLACK_WOOL.get()), has(EBBlocks.KNITTED_BLACK_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_BLACK_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_BLACK_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_BLACK_WOOL.get()), has(EBBlocks.KNITTED_BLACK_WOOL.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_BRICKS.get(), 4)
                .define('#', EBBlocks.MIRALEN_BLOCK.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.MIRALEN_BLOCK.get()), has(EBBlocks.MIRALEN_BLOCK.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.MIRALEN_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_MIRALEN_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.MIRALEN_BRICKS.get()), has(EBBlocks.MIRALEN_BRICKS.get())).save(output);

        stairBuilder(EBBlocks.MIRALEN_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.MIRALEN_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_BRICKS.get()), has(EBBlocks.MIRALEN_BRICKS.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_BRICK_SLAB.get(), Ingredient.of(EBBlocks.MIRALEN_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_BRICKS.get()), has(EBBlocks.MIRALEN_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.MIRALEN_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MIRALEN_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_BRICKS.get()), has(EBBlocks.MIRALEN_BRICKS.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_BRICK_WALL.get(), Ingredient.of(EBBlocks.MIRALEN_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_BRICKS.get()), has(EBBlocks.MIRALEN_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_TILES.get(), 4)
                .define('#', EBBlocks.MIRALEN_BRICKS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.MIRALEN_BRICKS.get()), has(EBBlocks.MIRALEN_BRICKS.get())).save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.MIRALEN_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_MIRALEN_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.MIRALEN_TILES.get()), has(EBBlocks.MIRALEN_TILES.get())).save(output);

        stairBuilder(EBBlocks.MIRALEN_TILE_STAIRS.get(), Ingredient.of(EBBlocks.MIRALEN_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_TILES.get()), has(EBBlocks.MIRALEN_TILES.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_TILE_SLAB.get(), Ingredient.of(EBBlocks.MIRALEN_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_TILES.get()), has(EBBlocks.MIRALEN_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.MIRALEN_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MIRALEN_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_TILES.get()), has(EBBlocks.MIRALEN_TILES.get())).save(output);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_TILE_WALL.get(), Ingredient.of(EBBlocks.MIRALEN_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.MIRALEN_TILES.get()), has(EBBlocks.MIRALEN_TILES.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_BLOCK.get(), 1)
                .define('#', EBItems.MIRALEN_SHARDS.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.MIRALEN_BLOCK.get()), has(EBBlocks.MIRALEN_BLOCK.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.MIRALEN_LAMP.get(), 2)
                .define('#', Items.IRON_INGOT).define('@', EBItems.MIRALEN_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.MIRALEN_SHARDS.get()), has(EBItems.MIRALEN_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.MIRALEN_GLASS_PANE.get(), 16)
                .define('#', EBBlocks.MIRALEN_GLASS.get())
                .pattern("###")
                .pattern("###").unlockedBy(getHasName(EBBlocks.MIRALEN_GLASS.get()), has(EBBlocks.MIRALEN_GLASS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MIRALEN_GLASS.get(), 4)
                .define('@', EBItems.MIRALEN_SHARDS.get()).define('#', Blocks.GLASS)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.MIRALEN_SHARDS.get()), has(EBItems.MIRALEN_SHARDS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_PILLAR.get(), 2)
                .define('#', EBBlocks.TUFF_BRICKS.get())
                .pattern("#")
                .pattern("#").unlockedBy(getHasName(EBBlocks.TUFF_BRICKS.get()), has(EBBlocks.TUFF_BRICKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.TUFF_BRICK_PEDESTAL.get(), 3)
                .define('#', EBBlocks.TUFF_BRICK_SLAB.get()).define('@', EBBlocks.TUFF_BRICK_PILLAR.get())
                .pattern("###")
                .pattern(" @ ")
                .pattern("###").unlockedBy(getHasName(EBBlocks.TUFF_BRICK_SLAB.get()), has(EBBlocks.TUFF_BRICK_SLAB.get())).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.ANCIENT_VINE.get(), 8).requires(EBBlocks.ANCIENT_LEAVES.get(), 2)
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LEAVES.get()), has(EBBlocks.ANCIENT_LEAVES.get())).save(output);

        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_TUFF_BRICKS.get(), Ingredient.of(EBBlocks.TUFF_BRICK_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.TUFF_BRICK_SLAB.get()), has(EBBlocks.TUFF_BRICK_SLAB.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get(), Ingredient.of(Blocks.LIGHT_BLUE_WOOL))
                .unlockedBy(getHasName(Blocks.LIGHT_BLUE_WOOL), has(Blocks.LIGHT_BLUE_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_LIGHT_BLUE_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()), has(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_LIGHT_BLUE_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()), has(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_LIGHT_BLUE_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get()), has(EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_MAGENTA_WOOL.get(), Ingredient.of(Blocks.MAGENTA_WOOL))
                .unlockedBy(getHasName(Blocks.MAGENTA_WOOL), has(Blocks.MAGENTA_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_MAGENTA_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_MAGENTA_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_MAGENTA_WOOL.get()), has(EBBlocks.KNITTED_MAGENTA_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_MAGENTA_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_MAGENTA_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_MAGENTA_WOOL.get()), has(EBBlocks.KNITTED_MAGENTA_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_MAGENTA_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_MAGENTA_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_MAGENTA_WOOL.get()), has(EBBlocks.KNITTED_MAGENTA_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_PINK_WOOL.get(), Ingredient.of(Blocks.PINK_WOOL))
                .unlockedBy(getHasName(Blocks.PINK_WOOL), has(Blocks.PINK_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_PINK_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_PINK_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_PINK_WOOL.get()), has(EBBlocks.KNITTED_PINK_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_PINK_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_PINK_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_PINK_WOOL.get()), has(EBBlocks.KNITTED_PINK_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_PINK_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_PINK_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_PINK_WOOL.get()), has(EBBlocks.KNITTED_PINK_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_ORANGE_WOOL.get(), Ingredient.of(Blocks.ORANGE_WOOL))
                .unlockedBy(getHasName(Blocks.ORANGE_WOOL), has(Blocks.ORANGE_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_ORANGE_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_ORANGE_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_ORANGE_WOOL.get()), has(EBBlocks.KNITTED_ORANGE_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_ORANGE_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_ORANGE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_ORANGE_WOOL.get()), has(EBBlocks.KNITTED_ORANGE_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_ORANGE_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_ORANGE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_ORANGE_WOOL.get()), has(EBBlocks.KNITTED_ORANGE_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_YELLOW_WOOL.get(), Ingredient.of(Blocks.YELLOW_WOOL))
                .unlockedBy(getHasName(Blocks.YELLOW_WOOL), has(Blocks.YELLOW_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_YELLOW_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_YELLOW_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_YELLOW_WOOL.get()), has(EBBlocks.KNITTED_YELLOW_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_YELLOW_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_YELLOW_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_YELLOW_WOOL.get()), has(EBBlocks.KNITTED_YELLOW_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_YELLOW_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_YELLOW_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_YELLOW_WOOL.get()), has(EBBlocks.KNITTED_YELLOW_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_LIME_WOOL.get(), Ingredient.of(Blocks.LIME_WOOL))
                .unlockedBy(getHasName(Blocks.LIME_WOOL), has(Blocks.LIME_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_LIME_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_LIME_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_LIME_WOOL.get()), has(EBBlocks.KNITTED_LIME_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_LIME_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_LIME_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_LIME_WOOL.get()), has(EBBlocks.KNITTED_LIME_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_LIME_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_LIME_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_LIME_WOOL.get()), has(EBBlocks.KNITTED_LIME_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_GREEN_WOOL.get(), Ingredient.of(Blocks.GREEN_WOOL))
                .unlockedBy(getHasName(Blocks.GREEN_WOOL), has(Blocks.GREEN_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_GREEN_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_GREEN_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_GREEN_WOOL.get()), has(EBBlocks.KNITTED_GREEN_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_GREEN_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_GREEN_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_GREEN_WOOL.get()), has(EBBlocks.KNITTED_GREEN_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_GREEN_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_GREEN_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_GREEN_WOOL.get()), has(EBBlocks.KNITTED_GREEN_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_WHITE_WOOL.get(), Ingredient.of(Blocks.WHITE_WOOL))
                .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_WHITE_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_WHITE_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_WHITE_WOOL.get()), has(EBBlocks.KNITTED_WHITE_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_WHITE_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_WHITE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_WHITE_WOOL.get()), has(EBBlocks.KNITTED_WHITE_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_WHITE_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_WHITE_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_WHITE_WOOL.get()), has(EBBlocks.KNITTED_WHITE_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_GRAY_WOOL.get(), Ingredient.of(Blocks.GRAY_WOOL))
                .unlockedBy(getHasName(Blocks.GRAY_WOOL), has(Blocks.GRAY_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_GRAY_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_GRAY_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_GRAY_WOOL.get()), has(EBBlocks.KNITTED_GRAY_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_GRAY_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_GRAY_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_GRAY_WOOL.get()), has(EBBlocks.KNITTED_GRAY_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_GRAY_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_GRAY_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_GRAY_WOOL.get()), has(EBBlocks.KNITTED_GRAY_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get(), Ingredient.of(Blocks.LIGHT_GRAY_WOOL))
                .unlockedBy(getHasName(Blocks.LIGHT_GRAY_WOOL), has(Blocks.LIGHT_GRAY_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_LIGHT_GRAY_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()), has(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_LIGHT_GRAY_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()), has(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_LIGHT_GRAY_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get()), has(EBBlocks.KNITTED_LIGHT_GRAY_WOOL.get())).save(output);

        fourforfourBuilder(EBBlocks.KNITTED_BROWN_WOOL.get(), Ingredient.of(Blocks.BROWN_WOOL))
                .unlockedBy(getHasName(Blocks.BROWN_WOOL), has(Blocks.BROWN_WOOL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_BROWN_CARPET.get(), 3)
                .define('#', EBBlocks.KNITTED_BROWN_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_BROWN_WOOL.get()), has(EBBlocks.KNITTED_BROWN_WOOL.get())).save(output);

        stairBuilder(EBBlocks.KNITTED_BROWN_STAIRS.get(), Ingredient.of(EBBlocks.KNITTED_BROWN_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_BROWN_WOOL.get()), has(EBBlocks.KNITTED_BROWN_WOOL.get())).save(output);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_BROWN_SLAB.get(), Ingredient.of(EBBlocks.KNITTED_BROWN_WOOL.get()))
                .unlockedBy(getHasName(EBBlocks.KNITTED_BROWN_WOOL.get()), has(EBBlocks.KNITTED_BROWN_WOOL.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.KNITTED_RAINBOW_WOOL.get(), 9)
                .define('R', EBBlocks.KNITTED_RED_WOOL.get()).define('O', EBBlocks.KNITTED_ORANGE_WOOL.get()).define('Y', EBBlocks.KNITTED_YELLOW_WOOL.get())
                .define('L', EBBlocks.KNITTED_LIME_WOOL.get()).define('G', EBBlocks.KNITTED_GREEN_WOOL.get()).define('C', EBBlocks.KNITTED_LIGHT_BLUE_WOOL.get())
                .define('B', EBBlocks.KNITTED_BLUE_WOOL.get()).define('P', EBBlocks.KNITTED_PURPLE_WOOL.get()).define('I', EBBlocks.KNITTED_PINK_WOOL.get())
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.KNITTED_RAINBOW_WOOL.get()), has(EBBlocks.KNITTED_RAINBOW_WOOL.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.KNITTED_RAINBOW_CARPET.get(), 6)
                .define('#', EBBlocks.KNITTED_RAINBOW_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.KNITTED_RAINBOW_WOOL.get()), has(EBBlocks.KNITTED_RAINBOW_WOOL.get())).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.DRMANGOTEA.get(), 1).requires(EBBlocks.KNITTED_CYAN_WOOL.get(), 1).requires(EBItems.ANCIENT_FRUIT.get())
                .unlockedBy(getHasName(EBBlocks.DRMANGOTEA.get()), has(EBBlocks.DRMANGOTEA.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE.get(), 2)
                .define('#', Blocks.SANDSTONE).define('@', Blocks.SAND)
                .pattern("#@")
                .pattern("@#").unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE.get(), 2)
                .define('#', Blocks.RED_SANDSTONE).define('@', Blocks.RED_SAND)
                .pattern("#@")
                .pattern("@#").unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE.get(), 2)
                .define('#', EBBlocks.SOUL_SANDSTONE.get()).define('@', Blocks.SOUL_SAND)
                .pattern("#@")
                .pattern("@#").unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE.get()), has(EBBlocks.SOUL_SANDSTONE.get())).save(output);

        verticalstairBuilder(EBBlocks.MARBLE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MARBLE.get()))
                .unlockedBy(getHasName(EBBlocks.MARBLE.get()), has(EBBlocks.MARBLE.get())).save(output);

        verticalstairBuilder(EBBlocks.MARBLE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MARBLE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MARBLE_BRICKS.get()), has(EBBlocks.MARBLE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.MARBLE_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MARBLE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.MARBLE_TILES.get()), has(EBBlocks.MARBLE_TILES.get())).save(output);

        verticalstairBuilder(EBBlocks.POLISHED_MARBLE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_MARBLE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_MARBLE.get()), has(EBBlocks.POLISHED_MARBLE.get())).save(output);

        verticalstairBuilder(EBBlocks.MARQUINA_MARBLE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MARQUINA_MARBLE.get()))
                .unlockedBy(getHasName(EBBlocks.MARQUINA_MARBLE.get()), has(EBBlocks.MARQUINA_MARBLE.get())).save(output);

        verticalstairBuilder(EBBlocks.MARQUINA_MARBLE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.MARQUINA_MARBLE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MARQUINA_MARBLE_BRICKS.get()), has(EBBlocks.MARQUINA_MARBLE_BRICKS.get())).save(output);

        verticalstairBuilder(EBBlocks.POLISHED_MARQUINA_MARBLE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_MARQUINA_MARBLE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_MARQUINA_MARBLE.get()), has(EBBlocks.POLISHED_MARQUINA_MARBLE.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.OAK_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SPRUCE_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.SPRUCE_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BIRCH_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.BIRCH_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.JUNGLE_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.JUNGLE_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ACACIA_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.ACACIA_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_OAK_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.DARK_OAK_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MANGROVE_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.MANGROVE_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHERRY_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.CHERRY_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BAMBOO_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.BAMBOO_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRIMSON_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.CRIMSON_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WARPED_DECORATIVE_SHELF.get(), 1)
                .define('#', Blocks.WARPED_PLANKS)
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_DECORATIVE_SHELF.get(), 1)
                .define('#', EBBlocks.ANCIENT_PLANKS.get())
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MAPLE_DECORATIVE_SHELF.get(), 1)
                .define('#', EBBlocks.MAPLE_PLANKS.get())
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(EBBlocks.MAPLE_PLANKS.get()), has(EBBlocks.MAPLE_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WILLOW_DECORATIVE_SHELF.get(), 1)
                .define('#', EBBlocks.WILLOW_PLANKS.get())
                .pattern("###")
                .pattern("   ")
                .pattern("###").unlockedBy(getHasName(EBBlocks.WILLOW_PLANKS.get()), has(EBBlocks.WILLOW_PLANKS.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.TERRACOTTA_POT.get(), 4)
                .define('#', Blocks.TERRACOTTA)
                .pattern(" # ")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(Blocks.TERRACOTTA), has(Blocks.TERRACOTTA)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.TERRACOTTA_POT.get(), 4)
                .define('#', EBBlocks.MARBLE.get())
                .pattern(" # ")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(EBBlocks.MARBLE.get()), has(EBBlocks.MARBLE.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.TERRACOTTA_POT.get(), 4)
                .define('#', EBBlocks.MARQUINA_MARBLE.get())
                .pattern(" # ")
                .pattern("# #")
                .pattern("###").unlockedBy(getHasName(EBBlocks.MARQUINA_MARBLE.get()), has(EBBlocks.MARQUINA_MARBLE.get())).save(output);
    }

    protected static RecipeBuilder fourforfourBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 4)
                .define('#', ingredient)
                .pattern("##")
                .pattern("##");
    }

    protected static RecipeBuilder EBmosaicBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 1)
                .define('#', ingredient)
                .pattern("#")
                .pattern("#");
    }

    protected static RecipeBuilder woodBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 3)
                .define('#', ingredient)
                .pattern("##")
                .pattern("##");
    }

    protected static RecipeBuilder chiseledplankBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 2)
                .define('#', ingredient)
                .pattern("##")
                .pattern("##");
    }

    protected static RecipeBuilder craftingtableBuilder(ItemLike itemLike, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, itemLike, 1)
                .define('#', ingredient)
                .pattern("##")
                .pattern("##");
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
