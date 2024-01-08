package net.yirmiri.excessive_building.init;

import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.particle.AncientParticle;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EBParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ExcessiveBuilding.MODID);

    public static final RegistryObject<SimpleParticleType> ANCIENT_PARTICLE = PARTICLE_TYPES.register("ancient_particle",
            () -> new SimpleParticleType(true));


    @SubscribeEvent
    public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(EBParticleTypes.ANCIENT_PARTICLE.get(), AncientParticle.Provider::new);
    }

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
