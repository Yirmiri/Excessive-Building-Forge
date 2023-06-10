package net.yirmiri.excessive_building.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.block.ModBlocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, ExcessiveBuilding.MOD_ID);
            public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
                    DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ExcessiveBuilding.MOD_ID);

            public static final RegistryObject<PoiType> CONSTRUCTION_TABLE_POI = POI_TYPES.register("construction_table_poi",
                    () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CONSTRUCTION_TABLE.get().getStateDefinition().getPossibleStates()),
                        1, 1));

            public static final RegistryObject<VillagerProfession> CONSTRUCTION_WORKER = VILLAGER_PROFESSIONS.register("construction_worker",
                    () -> new VillagerProfession("construction_worker", x -> x.get() == CONSTRUCTION_TABLE_POI.get(),
            x -> x.get() == CONSTRUCTION_TABLE_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_CARTOGRAPHER));

            public static void registerPOIs() {
                try {
                    ObfuscationReflectionHelper.findMethod(PoiType.class,"registerBlockStates", PoiType.class).invoke(null, CONSTRUCTION_TABLE_POI.get());
                } catch (InvocationTargetException | IllegalAccessException exception) {
                    exception.printStackTrace();
                }
            }

                    public static void register(IEventBus eventBus) {
                        POI_TYPES.register(eventBus);
                        VILLAGER_PROFESSIONS.register(eventBus);
                    }
}
