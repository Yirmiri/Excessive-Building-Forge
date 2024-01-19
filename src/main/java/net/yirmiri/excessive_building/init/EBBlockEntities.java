package net.yirmiri.excessive_building.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExcessiveBuilding.MODID);

    /*
    public static final RegistryObject<BlockEntityType<EBSignBlockEntity>> EB_SIGN = BLOCK_ENTITIES.register("eb_sign", () ->
            BlockEntityType.Builder.of(EBSignBlockEntity::new,
                    //EBBlocks.CHORUS_SIGN.get(), EBBlocks.CHORUS_WALL_SIGN.get(),
                    EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<EBHangingSignBlockEntity>> EB_HANGING_SIGN = BLOCK_ENTITIES.register("eb_hanging_sign", () ->
            BlockEntityType.Builder.of(EBHangingSignBlockEntity::new,
                    //EBBlocks.CHORUS_HANGING_SIGN.get(), EBBlocks.CHORUS_WALL_HANGING_SIGN.get(),
                    EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get()).build(null));
     */


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
