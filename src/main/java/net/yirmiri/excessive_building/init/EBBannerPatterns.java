package net.yirmiri.excessive_building.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBBannerPatterns {
    public static final DeferredRegister<BannerPattern> BANNER_PATTERNS = DeferredRegister.create(Registries.BANNER_PATTERN, ExcessiveBuilding.MODID);

    public static final RegistryObject<BannerPattern> EXCESSIVE = BANNER_PATTERNS.register("excessive", () -> new BannerPattern("excessive"));

    public static void register(IEventBus eventBus) {
        BANNER_PATTERNS.register(eventBus);
    }
}
