package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.block.entity.EBHangingSignBlockEntity;

public class EBWallHangingSignBlock extends WallHangingSignBlock {
    public EBWallHangingSignBlock(Properties properties, WoodType type) {
        super(type, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EBHangingSignBlockEntity(pos, state);
    }
}
