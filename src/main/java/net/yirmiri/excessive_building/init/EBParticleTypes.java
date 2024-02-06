package net.yirmiri.excessive_building.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.particle.FallingLeavesParticle;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EBParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ExcessiveBuilding.MODID);

    public static final RegistryObject<SimpleParticleType> ANCIENT_PARTICLE = PARTICLE_TYPES.register("ancient_particle",
            () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> ORANGE_MAPLE_PARTICLE = PARTICLE_TYPES.register("orange_maple_particle",
            () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> YELLOW_MAPLE_PARTICLE = PARTICLE_TYPES.register("yellow_maple_particle",
            () -> new SimpleParticleType(true));

    @OnlyIn(Dist.CLIENT) @SubscribeEvent
    public static void registerFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(EBParticleTypes.ANCIENT_PARTICLE.get(), FallingLeavesParticle.Provider::new);
        event.registerSpriteSet(EBParticleTypes.ORANGE_MAPLE_PARTICLE.get(), FallingLeavesParticle.Provider::new);
        event.registerSpriteSet(EBParticleTypes.YELLOW_MAPLE_PARTICLE.get(), FallingLeavesParticle.Provider::new);
    }

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
