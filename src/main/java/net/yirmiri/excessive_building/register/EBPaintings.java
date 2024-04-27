package net.yirmiri.excessive_building.register;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ExcessiveBuilding.MODID);

    //YIRMIRI'S PAINTINGS
    public static final RegistryObject<PaintingVariant> FORGOTTEN_KINGDOM = PAINTING_VARIANTS.register("forgotten_kingdom", () -> new PaintingVariant(32, 16));

    //ORIGINAL
    public static final RegistryObject<PaintingVariant> COURBET_ORIGINAL = PAINTING_VARIANTS.register("courbet_original", () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> STAGE_ORIGINAL = PAINTING_VARIANTS.register("stage_original", () -> new PaintingVariant(32, 32));

    //1.20.5 BACKPORTS
    public static final RegistryObject<PaintingVariant> BAROQUE = PAINTING_VARIANTS.register("baroque", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> HUMBLE = PAINTING_VARIANTS.register("humble", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> MEDITATIVE = PAINTING_VARIANTS.register("meditative", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> PRAIRIE_RIDE = PAINTING_VARIANTS.register("prairie_ride", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> UNPACKED = PAINTING_VARIANTS.register("unpacked", () -> new PaintingVariant(64, 64));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
