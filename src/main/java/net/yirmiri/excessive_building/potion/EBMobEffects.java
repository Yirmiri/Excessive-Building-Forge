package net.yirmiri.excessive_building.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExcessiveBuilding.MODID);

    public static final RegistryObject<MobEffect> REACHING = MOB_EFFECTS.register("reaching",
            () -> new ReachingEffect(MobEffectCategory.BENEFICIAL, -4377188).addAttributeModifier(ForgeMod.BLOCK_REACH.get(),
                    "5657434B-29fE-43A2-AC22-589694EE1344", 0.6669D, AttributeModifier.Operation.MULTIPLY_BASE)); //7.5 blocks is around 0.6667 so I couldn't pass on it

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
