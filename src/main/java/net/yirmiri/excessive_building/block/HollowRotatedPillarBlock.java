package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HollowRotatedPillarBlock extends RotatedPillarBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public HollowRotatedPillarBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch(state.getValue(AXIS)) {
            case X -> Shapes.or(Block.box(0F, 0F, 0F, 16F, 2F, 16F),
                    Block.box(0F, 14F, 0F, 16F, 16F, 16F),
                    Block.box(0F, 0F, 0F, 16F, 16F, 2F),
                    Block.box(0F, 0F, 14F, 16F, 16F, 16F));

            case Y -> Shapes.or(Block.box(0F, 0F, 0F, 2F, 16F, 16F),
                    Block.box(14F, 0F, 0F, 16F, 16F, 16F),
                    Block.box(0F, 0F, 0F, 16F, 16F, 2F),
                    Block.box(0F, 0F, 14F, 16F, 16F, 16F));

            case Z -> Shapes.or(Block.box(0F, 0F, 0F, 16F, 2F, 16F),
                    Block.box(0F, 14F, 0F, 16F, 16F, 16F),
                    Block.box(0F, 0F, 0F, 2F, 16F, 16F),
                    Block.box(14F, 0F, 0F, 16F, 16F, 16F));
        };
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
        builder.add(WATERLOGGED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return !state.getValue(WATERLOGGED) && state.getValue(AXIS) == Direction.Axis.Y;
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState blockState) {
        return true;
    }
}
