package net.yirmiri.excessive_building.register;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.yirmiri.excessive_building.potion.EBMobEffects;

public class EBFoods {
    public static final FoodProperties ANCIENT_FRUIT = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).effect(new MobEffectInstance(EBMobEffects.REACHING.get(), 200, 0), 1.0F).build();

    //Compat Foods
    public static final FoodProperties ANCIENT_CIDER = new FoodProperties.Builder().alwaysEat().effect(new MobEffectInstance(EBMobEffects.REACHING.get(), 1200, 0), 1.0F).build();
}