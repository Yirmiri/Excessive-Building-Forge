package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.datagen.loot.EBGlobalLootModifiersProvider;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EBDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new EBRecipeProvider(packOutput));
        generator.addProvider(event.includeClient(), new EBBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new EBItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new EBWorldGenProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new EBGlobalLootModifiersProvider(packOutput));

        EBBlockTagProvider blockTagGenerator = generator.addProvider(event.includeServer(),
                new EBBlockTagProvider(packOutput, lookupProvider, existingFileHelper));

        EBBannerTagProvider bannerTagProvider = generator.addProvider(event.includeServer(),
                new EBBannerTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(),
                new EBItemTagProvider(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
