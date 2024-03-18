package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EBItemTagProvider extends ItemTagsProvider {
    public EBItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> aSuper, CompletableFuture<TagLookup<Block>> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, aSuper, future, ExcessiveBuilding.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIM_MATERIALS).add(
                EBItems.FIERY_SHARDS.get(),
                EBItems.MIRALEN_SHARDS.get(),
                EBItems.KYANITE_SHARDS.get());
    }
}
