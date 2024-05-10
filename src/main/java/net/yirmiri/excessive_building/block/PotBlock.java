package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import net.yirmiri.excessive_building.datagen.EBItemTagProvider;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class PotBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty FILLED = BooleanProperty.create("filled");

    private static final VoxelShape AABB = Shapes.or(box(0, 13, 0, 16, 16, 16),
            Block.box(1, 11, 1, 15, 13, 15),
            Block.box(0, 2, 0, 16, 11, 16),
            Block.box(1, 0, 1, 15, 2, 15));

    public PotBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(WATERLOGGED, false).setValue(FILLED, false));
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return AABB;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(stack, getter, list, flag);
        list.add(CommonComponents.EMPTY);
        list.add(Component.translatable("tooltip.block.interact_dirt").withStyle(ChatFormatting.GRAY));
        list.add(CommonComponents.space().append(Component.translatable("tooltip.block.fill").withStyle(ChatFormatting.BLUE)));
    }

    @Override @NotNull
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!state.getValue(FILLED) && itemstack.is(EBItemTagProvider.POT_SOILS)) {
            addFilling(state, level, pos);
            if (!player.isCreative()) {
                itemstack.shrink(1);
            }
        }

        if (state.getValue(FILLED)) {
            removeFilling(state, level, pos);
            if (!player.isCreative()) {
                popResource(level, pos, new ItemStack(Items.DIRT));
            }

        } else {
            return InteractionResult.CONSUME;
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    private static void addFilling(BlockState state, Level level, BlockPos pos) {
        if (!level.isClientSide) {
            level.setBlockAndUpdate(pos, state.setValue(FILLED, true));
            level.playSound(null, pos, SoundEvents.ROOTED_DIRT_PLACE, SoundSource.BLOCKS, 1, 1);
        }
    }

    private static void removeFilling(BlockState state, Level level, BlockPos pos) {
        if (!level.isClientSide) {
            level.setBlockAndUpdate(pos, state.setValue(FILLED, false));
            level.playSound(null, pos, SoundEvents.ROOTED_DIRT_BREAK, SoundSource.BLOCKS, 1, 1);
        }
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
        return state.getValue(FILLED);
    }

    @Override
    public BlockState updateShape(BlockState canSurvive, Direction direction, BlockState state, LevelAccessor accessor, BlockPos pos, BlockPos blockPos) {
        if (canSurvive.getValue(WATERLOGGED)) {
            accessor.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(accessor));
        }

        return !canSurvive.canSurvive(accessor, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(canSurvive, direction, state, accessor, pos, blockPos);
    }

    @Override
    public FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED, FILLED);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        LevelAccessor levelaccessor = ctx.getLevel();
        BlockPos blockpos = ctx.getClickedPos();
        return this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER));
    }

    public void onProjectileHit(Level level, BlockState state, BlockHitResult result, Projectile projectile) {
        BlockPos blockpos = result.getBlockPos();
        if (!level.isClientSide && projectile.mayInteract(level, blockpos) && projectile.getType().is(EntityTypeTags.IMPACT_PROJECTILES)) {
            level.destroyBlock(blockpos, true, projectile);
        }
    }
}
