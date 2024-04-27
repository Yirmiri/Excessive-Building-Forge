package net.yirmiri.excessive_building.register;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, ExcessiveBuilding.MODID);

    public static final RegistryObject<Potion> REACHING_POTION = POTIONS.register("reaching_potion", () -> new Potion(new MobEffectInstance(EBMobEffects.REACHING.get(), 12000, 0)));
    public static final RegistryObject<Potion> LONG_REACHING_POTION = POTIONS.register("long_reaching_potion", () -> new Potion(new MobEffectInstance(EBMobEffects.REACHING.get(), 24000, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
