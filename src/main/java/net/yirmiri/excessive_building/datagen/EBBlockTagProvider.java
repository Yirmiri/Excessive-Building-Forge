package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EBBlockTagProvider extends BlockTagsProvider {
    public static final TagKey<Block> AMETHYST_FIRE_BASE_BLOCKS = tag("amethyst_fire_base_blocks");

    public EBBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExcessiveBuilding.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(EBBlockTagProvider.AMETHYST_FIRE_BASE_BLOCKS).add(
                EBBlocks.AMETHYST_BRICKS.get(),
                EBBlocks.AMETHYST_BRICK_STAIRS.get(),
                EBBlocks.AMETHYST_BRICK_SLAB.get(),
                EBBlocks.AMETHYST_BRICK_VERTICAL_STAIRS.get(),
                EBBlocks.AMETHYST_TILES.get(),
                EBBlocks.AMETHYST_TILE_STAIRS.get(),
                EBBlocks.AMETHYST_TILE_SLAB.get(),
                EBBlocks.AMETHYST_TILE_VERTICAL_STAIRS.get(),
                EBBlocks.AMETHYST_GLASS.get(),
                EBBlocks.AMETHYST_LAMP.get(),
                EBBlocks.CRACKED_AMETHYST_TILES.get(),
                EBBlocks.CRACKED_AMETHYST_BRICKS.get()
        );
    }

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(ExcessiveBuilding.MODID, name));
    }
}
