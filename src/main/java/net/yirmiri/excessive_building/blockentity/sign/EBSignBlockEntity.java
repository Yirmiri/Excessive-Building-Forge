package net.yirmiri.excessive_building.blockentity.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.init.EBBlockEntities;

public class EBSignBlockEntity extends SignBlockEntity {
    public EBSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(EBBlockEntities.EB_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return EBBlockEntities.EB_SIGN.get();
    }
}