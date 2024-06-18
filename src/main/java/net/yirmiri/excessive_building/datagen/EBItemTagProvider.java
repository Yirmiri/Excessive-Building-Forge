package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EBItemTagProvider extends ItemTagsProvider {
    public static final TagKey<Item> POT_SOILS = tag("pot_soils");
    public static final TagKey<Item> GLOW_REMOVALS = tag("glow_removals");
    public static final TagKey<Item> SPEED_PASTES = tag("speed_pastes");

    public EBItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> aSuper, CompletableFuture<TagLookup<Block>> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, aSuper, future, ExcessiveBuilding.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIM_MATERIALS).add(
                EBItems.FIERY_SHARDS.get(),
                EBItems.MIRALEN_SHARDS.get(),
                Items.PRISMARINE_CRYSTALS,
                Blocks.CRYING_OBSIDIAN.asItem(),
                EBItems.KYANITE_SHARDS.get()
        );

        this.tag(EBItemTagProvider.POT_SOILS).add(
                Items.DIRT,
                Items.ROOTED_DIRT,
                Items.COARSE_DIRT
        );

        this.tag(EBItemTagProvider.GLOW_REMOVALS).add(
                Items.PAPER
        );

        this.tag(EBItemTagProvider.SPEED_PASTES).add(
                Items.SUGAR
        );
    }

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, name));
    }
}
