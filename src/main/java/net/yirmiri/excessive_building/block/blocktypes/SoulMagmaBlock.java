package net.yirmiri.excessive_building.block.blocktypes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class SoulMagmaBlock extends Block {
    private static final int BUBBLE_COLUMN_CHECK_DELAY = 20;

    public SoulMagmaBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)entity)) {
            entity.hurt(level.damageSources().hotFloor(), 2.0F);
        }

        super.stepOn(level, blockPos, blockState, entity);
    }

    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        BubbleColumnBlock.updateColumn(serverLevel, blockPos.above(), blockState);
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState state, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos pos) {
        if (direction == Direction.UP && state.is(Blocks.WATER)) {
            levelAccessor.scheduleTick(blockPos, this, 20);
        }

        return super.updateShape(blockState, direction, state, levelAccessor, blockPos, pos);
    }

    public void onPlace(BlockState blockState, Level level, BlockPos blockPos, BlockState state, boolean p_54827_) {
        level.scheduleTick(blockPos, this, 20);
    }
}
