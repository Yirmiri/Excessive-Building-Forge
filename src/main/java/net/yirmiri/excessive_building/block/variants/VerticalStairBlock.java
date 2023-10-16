package net.yirmiri.excessive_building.block.variants;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class VerticalStairBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public VerticalStairBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(8, 0, 0, 16, 16, 8), box(0, 0, 0, 8, 16, 16));
            case NORTH -> Shapes.or(box(0, 0, 8, 8, 16, 16), box(8, 0, 0, 16, 16, 16));
            case EAST -> Shapes.or(box(0, 0, 0, 8, 16, 8), box(0, 0, 8, 16, 16, 16));
            case WEST -> Shapes.or(box(8, 0, 8, 16, 16, 16), box(0, 0, 0, 16, 16, 8));
        };
    }

    @Override
    public BlockState updateShape(BlockState canSurvive, Direction direction, BlockState blockState, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos1) {
        if (canSurvive.getValue(WATERLOGGED)) {
            levelAccessor.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        }

        return direction == canSurvive.getValue(FACING).getOpposite() && !canSurvive.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() :
                super.updateShape(canSurvive, direction, blockState, levelAccessor, blockPos, blockPos1);
    }

    @Override
    public FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED, FACING);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        LevelAccessor levelaccessor = blockPlaceContext.getLevel();
        BlockPos blockpos = blockPlaceContext.getClickedPos();
        return this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER))
                .setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }
}
