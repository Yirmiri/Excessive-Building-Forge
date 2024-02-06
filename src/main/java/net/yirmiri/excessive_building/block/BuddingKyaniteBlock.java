package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.yirmiri.excessive_building.init.EBBlocks;

public class BuddingKyaniteBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingKyaniteBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (randomSource.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[randomSource.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = blockPos.relative(direction);
            BlockState blockstate = serverLevel.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = EBBlocks.SMALL_KYANITE_BUD.get();
            } else if (blockstate.is(EBBlocks.SMALL_KYANITE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = EBBlocks.MEDIUM_KYANITE_BUD.get();
            } else if (blockstate.is(EBBlocks.MEDIUM_KYANITE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = EBBlocks.LARGE_KYANITE_BUD.get();
            } else if (blockstate.is(EBBlocks.LARGE_KYANITE_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = EBBlocks.KYANITE_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                serverLevel.setBlockAndUpdate(blockpos, blockstate1);
            }
        }
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }
}
