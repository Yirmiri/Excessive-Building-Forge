package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EBDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new EBRecipeProvider(packOutput));
        generator.addProvider(true, new EBItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new EBBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new EBWorldGenProvider(packOutput, lookupProvider));
    }
}
