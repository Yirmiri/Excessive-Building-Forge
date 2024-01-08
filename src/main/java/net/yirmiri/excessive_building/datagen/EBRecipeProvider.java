package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yirmiri.excessive_building.block.EBBlocks;
import net.yirmiri.excessive_building.item.EBItems;

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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_TILES.get(), 4)
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE_BRICKS), has(Blocks.POLISHED_BLACKSTONE_BRICKS)).save(pWriter);

        stairBuilder(EBBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_TILE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(pWriter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_POLISHED_BLACKSTONE_TILES.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.POLISHED_BLACKSTONE_TILES.get()), has(EBBlocks.POLISHED_BLACKSTONE_TILES.get())).save(pWriter);

        oreSmelting(pWriter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.2f, 200, "quartz");
        oreBlasting(pWriter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.2f, 100, "quartz");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE.get(), 4)
                .define('#', Blocks.STONE).define('@', Blocks.SMOOTH_STONE)
                .pattern("#@")
                .pattern("@#").unlockedBy(getHasName(Blocks.SMOOTH_STONE), has(Blocks.SMOOTH_STONE)).save(pWriter);

        stairBuilder(EBBlocks.POLISHED_STONE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_STONE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_BRICKS.get(), 4)
                .define('#', EBBlocks.POLISHED_STONE.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.POLISHED_STONE.get()), has(EBBlocks.POLISHED_STONE.get())).save(pWriter);

        stairBuilder(EBBlocks.POLISHED_STONE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.POLISHED_STONE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_BRICK_WALL.get(), Ingredient.of(EBBlocks.POLISHED_STONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE_BRICKS.get()), has(EBBlocks.POLISHED_STONE_BRICKS.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.FIERY_SHARDS.get(), 4).requires(EBBlocks.FIERY_BLOCK.get())
                .unlockedBy(getHasName(EBBlocks.FIERY_BLOCK.get()), has(EBBlocks.FIERY_BLOCK.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.KYANITE_SHARDS.get(), 4).requires(EBBlocks.KYANITE_BLOCK.get())
                .unlockedBy(getHasName(EBBlocks.KYANITE_BLOCK.get()), has(EBBlocks.KYANITE_BLOCK.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PRISMARINE_CRYSTALS, 4).requires(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get())
                .unlockedBy(getHasName(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get()), has(EBBlocks.PRISMARINE_CRYSTAL_BLOCK.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HERRINGBONE_BRICKS.get(), 2)
                .define('#', Blocks.BRICK_SLAB)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.BRICK_SLAB), has(Blocks.BRICK_SLAB)).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BASKETWEAVE_BRICKS.get(), 1)
                .define('#', Blocks.BRICK_SLAB)
                .pattern("#")
                .pattern("#").unlockedBy(getHasName(Blocks.BRICK_SLAB), has(Blocks.BRICK_SLAB)).save(pWriter);

        stairBuilder(EBBlocks.BASKETWEAVE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BASKETWEAVE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.BASKETWEAVE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BASKETWEAVE_BRICK_WALL.get(), Ingredient.of(EBBlocks.BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.BASKETWEAVE_BRICKS.get()), has(EBBlocks.BASKETWEAVE_BRICKS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_HERRINGBONE_BRICKS.get(), 2)
                .define('#', EBBlocks.SMOOTH_BRICK_SLAB.get())
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(EBBlocks.SMOOTH_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_BRICK_SLAB.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get(), 1)
                .define('#', EBBlocks.SMOOTH_BRICK_SLAB.get())
                .pattern("#")
                .pattern("#").unlockedBy(getHasName(EBBlocks.SMOOTH_BRICK_SLAB.get()), has(EBBlocks.SMOOTH_BRICK_SLAB.get())).save(pWriter);

        stairBuilder(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BASKETWEAVE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BASKETWEAVE_BRICK_WALL.get(), Ingredient.of(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get()), has(EBBlocks.SMOOTH_BASKETWEAVE_BRICKS.get())).save(pWriter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.BRICKS), RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRACKED_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS)).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.STONE_LANTERN.get(), 4)
                .define('#', EBBlocks.POLISHED_STONE.get()).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.DEEPSLATE_LANTERN.get(), 4)
                .define('#', Blocks.POLISHED_DEEPSLATE).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BLACKSTONE_LANTERN.get(), 4)
                .define('#', Blocks.POLISHED_BLACKSTONE).define('@', EBItems.FIERY_SHARDS.get())
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BLACKSTONE_WINDOW.get(), 1)
                .define('#', Items.NETHER_BRICK).define('@', EBItems.FIERY_SHARDS.get()).define('%', Blocks.POLISHED_BLACKSTONE)
                .pattern("#@#")
                .pattern("@%@")
                .pattern("#@#").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.BRIMSTONE_WINDOW.get(), 1)
                .define('#', Items.NETHER_BRICK).define('@', EBItems.FIERY_SHARDS.get()).define('%', EBBlocks.POLISHED_BRIMSTONE.get())
                .pattern("#@#")
                .pattern("@%@")
                .pattern("#@#").unlockedBy(getHasName(EBItems.FIERY_SHARDS.get()), has(EBItems.FIERY_SHARDS.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SWIFT_ASPHALT.get(), 8)
                .requires(EBBlocks.ASPHALT.get(), 8).requires(Items.SUGAR)
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(pWriter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.SWIFT_ASPHALT.get()), RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(pWriter);

        stairBuilder(EBBlocks.SWIFT_ASPHALT_STAIRS.get(), Ingredient.of(EBBlocks.SWIFT_ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.SWIFT_ASPHALT.get()), has(EBBlocks.SWIFT_ASPHALT.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SWIFT_ASPHALT_SLAB.get(), Ingredient.of(EBBlocks.SWIFT_ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.SWIFT_ASPHALT.get()), has(EBBlocks.SWIFT_ASPHALT.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.SWIFT_ASPHALT_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.SWIFT_ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.SWIFT_ASPHALT.get()), has(EBBlocks.SWIFT_ASPHALT.get())).save(pWriter);

        stairBuilder(EBBlocks.ASPHALT_STAIRS.get(), Ingredient.of(EBBlocks.ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_SLAB.get(), Ingredient.of(EBBlocks.ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.ASPHALT_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.ASPHALT.get()))
                .unlockedBy(getHasName(EBBlocks.ASPHALT.get()), has(EBBlocks.ASPHALT.get())).save(pWriter);

        stairBuilder(EBBlocks.ANCIENT_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_SLAB.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.ANCIENT_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        stairBuilder(EBBlocks.ANCIENT_MOSAIC_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC.get()), has(EBBlocks.ANCIENT_MOSAIC.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_MOSAIC_SLAB.get(), Ingredient.of(EBBlocks.ANCIENT_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC.get()), has(EBBlocks.ANCIENT_MOSAIC.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.ANCIENT_MOSAIC.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC.get()), has(EBBlocks.ANCIENT_MOSAIC.get())).save(pWriter);

        craftingtableBuilder(EBBlocks.ANCIENT_CRAFTING_TABLE.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        EBmosaicBuilder(EBBlocks.ANCIENT_MOSAIC.get(), Ingredient.of(EBBlocks.ANCIENT_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_SLAB.get()), has(EBBlocks.ANCIENT_SLAB.get())).save(pWriter);

        chiseledplankBuilder(EBBlocks.CHISELED_ANCIENT.get(), Ingredient.of(EBBlocks.ANCIENT_SLAB.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_SLAB.get()), has(EBBlocks.ANCIENT_SLAB.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_PLANKS.get(), 4).requires(EBBlocks.ANCIENT_LOG.get())
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LOG.get()), has(EBBlocks.ANCIENT_LOG.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_WOOL.get(), 9)
                .define('R', Blocks.RED_WOOL).define('O', Blocks.ORANGE_WOOL).define('Y', Blocks.YELLOW_WOOL)
                .define('L', Blocks.LIME_WOOL).define('G', Blocks.GREEN_WOOL).define('C', Blocks.LIGHT_BLUE_WOOL)
                .define('B', Blocks.BLUE_WOOL).define('P', Blocks.PURPLE_WOOL).define('I', Blocks.PINK_WOOL)
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_WOOL.get()), has(EBBlocks.RAINBOW_WOOL.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_TERRACOTTA_TILES.get(), 9)
                .define('R', EBBlocks.RED_TERRACOTTA_TILES.get()).define('O', EBBlocks.ORANGE_TERRACOTTA_TILES.get()).define('Y', EBBlocks.YELLOW_TERRACOTTA_TILES.get())
                .define('L', EBBlocks.LIME_TERRACOTTA_TILES.get()).define('G', EBBlocks.GREEN_TERRACOTTA_TILES.get()).define('C', EBBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get())
                .define('B', EBBlocks.BLUE_TERRACOTTA_TILES.get()).define('P', EBBlocks.PURPLE_TERRACOTTA_TILES.get()).define('I', EBBlocks.PINK_TERRACOTTA_TILES.get())
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_TERRACOTTA_TILES.get()), has(EBBlocks.RAINBOW_TERRACOTTA_TILES.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RAINBOW_STAINED_GLASS.get(), 9)
                .define('R', Blocks.RED_STAINED_GLASS).define('O', Blocks.ORANGE_STAINED_GLASS).define('Y', Blocks.YELLOW_STAINED_GLASS)
                .define('L', Blocks.LIME_STAINED_GLASS).define('G', Blocks.GREEN_STAINED_GLASS).define('C', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .define('B', Blocks.BLUE_STAINED_GLASS).define('P', Blocks.PURPLE_STAINED_GLASS).define('I', Blocks.PINK_STAINED_GLASS)
                .pattern("ROY")
                .pattern("LGC")
                .pattern("BPI").unlockedBy(getHasName(EBBlocks.RAINBOW_STAINED_GLASS.get()), has(EBBlocks.RAINBOW_STAINED_GLASS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.RAINBOW_STAINED_GLASS_PANE.get(), 16)
                .define('#', EBBlocks.RAINBOW_STAINED_GLASS.get())
                .pattern("###")
                .pattern("###").unlockedBy(getHasName(EBBlocks.RAINBOW_STAINED_GLASS.get()), has(EBBlocks.RAINBOW_STAINED_GLASS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.RAINBOW_CARPET.get(), 6)
                .define('#', EBBlocks.RAINBOW_WOOL.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.RAINBOW_WOOL.get()), has(EBBlocks.RAINBOW_WOOL.get())).save(pWriter);

        woodBuilder(EBBlocks.ANCIENT_WOOD.get(), Ingredient.of(EBBlocks.ANCIENT_LOG.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LOG.get()), has(EBBlocks.ANCIENT_LOG.get())).save(pWriter);

        woodBuilder(EBBlocks.STRIPPED_ANCIENT_WOOD.get(), Ingredient.of(EBBlocks.STRIPPED_ANCIENT_LOG.get()))
                .unlockedBy(getHasName(EBBlocks.STRIPPED_ANCIENT_LOG.get()), has(EBBlocks.STRIPPED_ANCIENT_LOG.get())).save(pWriter);

        fenceBuilder(EBBlocks.ANCIENT_FENCE.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        fenceGateBuilder(EBBlocks.ANCIENT_FENCE_GATE.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        doorBuilder(EBBlocks.ANCIENT_DOOR.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        trapdoorBuilder(EBBlocks.ANCIENT_TRAPDOOR.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        buttonBuilder(EBBlocks.ANCIENT_BUTTON.get(), Ingredient.of(EBBlocks.ANCIENT_PLANKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.ANCIENT_PRESSURE_PLATE.get())
                .define('#', EBBlocks.ANCIENT_PLANKS.get())
                .pattern("##").unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS.get()), has(EBBlocks.ANCIENT_PLANKS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.POLISHED_BASALT.get(), 4)
                .define('#', Blocks.SMOOTH_BASALT)
                .pattern("##")
                .pattern("##").unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT)).save(pWriter);

        stairBuilder(EBBlocks.POLISHED_BASALT_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_BASALT.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BASALT.get()), has(EBBlocks.POLISHED_BASALT.get())).save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BASALT_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_BASALT.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BASALT.get()), has(EBBlocks.POLISHED_BASALT.get())).save(pWriter);

        verticalstairBuilder(EBBlocks.POLISHED_BASALT_VERTICAL_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_BASALT.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BASALT.get()), has(EBBlocks.POLISHED_BASALT.get())).save(pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BASALT_WALL.get(), Ingredient.of(EBBlocks.POLISHED_BASALT.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BASALT.get()), has(EBBlocks.POLISHED_BASALT.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.UNLIT_ANCIENT_LEAVES.get(), 1).requires(EBBlocks.ANCIENT_LEAVES.get())
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LEAVES.get()), has(EBBlocks.ANCIENT_LEAVES.get())).save(pWriter);
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
