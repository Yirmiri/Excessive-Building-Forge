package net.yirmiri.excessive_building.register;

//import net.minecraft.core.Holder;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.effect.MobEffect;
//import net.minecraft.world.effect.MobEffectCategory;
//import net.minecraft.world.entity.ai.attributes.AttributeModifier;
//import net.minecraft.world.entity.ai.attributes.Attributes;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import net.yirmiri.excessive_building.ExcessiveBuilding;
//import net.yirmiri.excessive_building.potion.NoSpecialEffect;
//
//public class EBMobEffects {
//    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExcessiveBuilding.MOD_ID);
//
//    public static final RegistryObject<MobEffect> REACHING = MOB_EFFECTS.register("reaching", new NoSpecialEffect(MobEffectCategory.BENEFICIAL, -4377188)
//            .addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, ResourceLocation.withDefaultNamespace("effect.reaching"), 0.3D, AttributeModifier.Operation.ADD_VALUE));
//
//    public static void register(IEventBus eventBus) {
//        MOB_EFFECTS.register(eventBus);
//    }
//}
