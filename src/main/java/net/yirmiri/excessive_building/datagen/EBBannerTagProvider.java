package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.init.EBBannerPatterns;

import java.util.concurrent.CompletableFuture;

public class EBBannerTagProvider extends TagsProvider<BannerPattern> {
    public static final TagKey<BannerPattern> EXCESSIVE_BANNER_PATTERN = tag("pattern_item/excessive");

    public EBBannerTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper existingFileHelper) {
        super(output, Registries.BANNER_PATTERN, provider, ExcessiveBuilding.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(EXCESSIVE_BANNER_PATTERN).add(EBBannerPatterns.EXCESSIVE.getKey());
    }

    private static TagKey<BannerPattern> tag(String name) {
        return TagKey.create(Registries.BANNER_PATTERN, (new ResourceLocation(ExcessiveBuilding.MODID, name)));
    }
}
