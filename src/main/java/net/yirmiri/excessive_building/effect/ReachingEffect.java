package net.yirmiri.excessive_building.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeMod;

public class ReachingEffect extends MobEffect {
    public ReachingEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
        this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "5657434B-29fE-43A2-AC22-589694EE1344",
                0.6669D, AttributeModifier.Operation.MULTIPLY_BASE);
        //7.5 blocks is around 0.6667 so I couldn't pass on it
    }
}
