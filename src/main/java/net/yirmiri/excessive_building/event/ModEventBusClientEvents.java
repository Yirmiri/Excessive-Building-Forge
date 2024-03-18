package net.yirmiri.excessive_building.event;

import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBBlockEntities;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(EBBlockEntities.EB_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(EBBlockEntities.EB_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
