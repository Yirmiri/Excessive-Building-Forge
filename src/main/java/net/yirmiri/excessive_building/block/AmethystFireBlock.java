package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.datagen.EBBlockTagProvider;

public class AmethystFireBlock extends BaseFireBlock {
    public AmethystFireBlock(BlockBehaviour.Properties properties) {
        super(properties, 2.0F);
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState state, LevelAccessor accessor, BlockPos pos, BlockPos pos1) {
        return this.canSurvive(blockState, accessor, pos) ? this.defaultBlockState() : Blocks.AIR.defaultBlockState();
    }

    public boolean canSurvive(BlockState blockState, LevelReader reader, BlockPos pos) {
        return canSurviveOnBlock(reader.getBlockState(pos.below()));
    }

    public static boolean canSurviveOnBlock(BlockState blockState) {
        return blockState.is(EBBlockTagProvider.AMETHYST_FIRE_BASE_BLOCKS);
    }

    protected boolean canBurn(BlockState blockState) {
        return true;
    }
}
