package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class PedestalBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<Direction.Axis> AXIS;

    public PedestalBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(AXIS)) {
            default -> Shapes.or(Block.box(2, 0, 2, 14, 16, 14),
                    Block.box(0, 0, 0, 16, 3, 16),
                    Block.box(0, 13, 0, 16, 16, 16));

            case X -> Shapes.or(Block.box(0, 2, 2, 16, 14, 14),
                    Block.box(0, 0, 0, 3, 16, 16),
                    Block.box(13, 0, 0, 16, 16, 16));

            case Z -> Shapes.or(Block.box(2, 2, 0, 14, 14, 16),
                    Block.box(0, 0, 0, 16, 16, 3),
                    Block.box(0, 0, 13, 16, 16, 16));
        };
    }

    public BlockState rotate(BlockState state, Rotation rotation) {
        return rotatePillar(state, rotation);
    }

    public static BlockState rotatePillar(BlockState state, Rotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch ((Direction.Axis)state.getValue(AXIS)) {
                    case X -> {
                        return (BlockState)state.setValue(AXIS, Direction.Axis.Z);
                    }
                    case Z -> {
                        return (BlockState)state.setValue(AXIS, Direction.Axis.X);
                    }
                    default -> {
                        return state;
                    }
                }
            default:
                return state;
        }
    }

    @Override
    public BlockState updateShape(BlockState canSurvive, Direction direction, BlockState blockState, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos1) {
        if (canSurvive.getValue(WATERLOGGED)) {
            levelAccessor.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        }

        return !canSurvive.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() :
                super.updateShape(canSurvive, direction, blockState, levelAccessor, blockPos, blockPos1);
    }

    @Override
    public FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED, AXIS);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        LevelAccessor levelaccessor = blockPlaceContext.getLevel();
        BlockPos blockpos = blockPlaceContext.getClickedPos();
        return this.defaultBlockState().setValue(AXIS, blockPlaceContext.getClickedFace().getAxis()).setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER));
    }

    static {
        AXIS = BlockStateProperties.AXIS;
    }
}
