package net.yirmiri.excessive_building.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class DrMangoWool extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public DrMangoWool(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return Shapes.empty();
    }

    @Override
    public BlockState updateShape(BlockState canSurvive, Direction direction, BlockState state, LevelAccessor accessor, BlockPos pos, BlockPos blockPos) {
        return direction == canSurvive.getValue(FACING).getOpposite() && !canSurvive.canSurvive(accessor, pos) ? Blocks.AIR.defaultBlockState() :
                super.updateShape(canSurvive, direction, state, accessor, pos, blockPos);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation rotation) {
        return pState.setValue(FACING, rotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror mirror) {
        return pState.rotate(mirror.getRotation(pState.getValue(FACING)));
    }

    public static final MapCodec<DrMangoWool> CODEC = simpleCodec(DrMangoWool::new);

    @Override
    public MapCodec<DrMangoWool> codec() {
        return CODEC;
    }
}
