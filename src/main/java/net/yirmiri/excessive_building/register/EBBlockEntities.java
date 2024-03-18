package net.yirmiri.excessive_building.register;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.blockentity.sign.EBHangingSignBlockEntity;
import net.yirmiri.excessive_building.blockentity.sign.EBSignBlockEntity;

public class EBBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExcessiveBuilding.MODID);

    public static final RegistryObject<BlockEntityType<EBSignBlockEntity>> EB_SIGN = BLOCK_ENTITIES.register("eb_sign",
            () -> BlockEntityType.Builder.of(EBSignBlockEntity::new, EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get(),
                    EBBlocks.WILLOW_SIGN.get(), EBBlocks.WILLOW_WALL_SIGN.get(), EBBlocks.MAPLE_SIGN.get(), EBBlocks.MAPLE_WALL_SIGN.get()
            ).build(null));

    public static final RegistryObject<BlockEntityType<EBHangingSignBlockEntity>> EB_HANGING_SIGN = BLOCK_ENTITIES.register("eb_hanging_sign",
            () -> BlockEntityType.Builder.of(EBHangingSignBlockEntity::new, EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(),
                    EBBlocks.WILLOW_HANGING_SIGN.get(), EBBlocks.WILLOW_WALL_HANGING_SIGN.get(), EBBlocks.MAPLE_HANGING_SIGN.get(), EBBlocks.MAPLE_WALL_HANGING_SIGN.get()
            ).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
