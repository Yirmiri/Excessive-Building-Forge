package net.yirmiri.excessive_building.other;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ExcessiveBuilding.MODID);

    public static final RegistryObject<SoundEvent> MARBLE_BREAK = register("block.marble.break");
    public static final RegistryObject<SoundEvent> MARBLE_STEP = register("block.marble.step");
    public static final RegistryObject<SoundEvent> MARBLE_PLACE = register("block.marble.place");
    public static final RegistryObject<SoundEvent> MARBLE_HIT = register("block.marble.hit");
    public static final RegistryObject<SoundEvent> MARBLE_FALL = register("block.marble.fall");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ExcessiveBuilding.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    public class EBSoundTypes {
        public static final ForgeSoundType MARBLE = new ForgeSoundType(1.0F, 1.0F, EBSoundEvents.MARBLE_BREAK, EBSoundEvents.MARBLE_STEP, EBSoundEvents.MARBLE_PLACE, EBSoundEvents.MARBLE_HIT, EBSoundEvents.MARBLE_FALL);
    }
}