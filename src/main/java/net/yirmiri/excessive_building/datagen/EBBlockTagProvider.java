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
import net.yirmiri.excessive_building.init.EBBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EBBlockTagProvider extends BlockTagsProvider {
    public static final TagKey<Block> PEDESTALS = tag("pedestals");

    public EBBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExcessiveBuilding.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(EBBlockTagProvider.PEDESTALS).add(
                EBBlocks.POLISHED_BRIMSTONE_PEDESTAL.get(),
                EBBlocks.SMOOTH_STONE_BRICK_PEDESTAL.get(),
                EBBlocks.QUARTZ_PEDESTAL.get(),
                EBBlocks.PURPUR_PEDESTAL.get()
        );
    }

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(ExcessiveBuilding.MODID, name));
    }
}
