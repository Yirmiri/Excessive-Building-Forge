package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class SpeedSlabBlock extends SlabBlock {
    public static final BooleanProperty SWIFT = BooleanProperty.create("swift");

    public SpeedSlabBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(SWIFT, false));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(stack, getter, list, flag);
        list.add(CommonComponents.EMPTY);
        list.add(Component.translatable("tooltip.block.interact_sugar").withStyle(ChatFormatting.GRAY));
        list.add(CommonComponents.space().append(Component.translatable("tooltip.block.swift").withStyle(ChatFormatting.BLUE)));
    }

    @Override @NotNull
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!state.getValue(SWIFT) && itemstack.is(Items.SUGAR)) {
            addSugar(state, level, pos);
            if (!player.isCreative()) {
                itemstack.shrink(1);
            }
        } else {
            return InteractionResult.CONSUME;
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    private static void addSugar(BlockState state, Level level, BlockPos pos) {
        if (!level.isClientSide) {
            level.setBlockAndUpdate(pos, state.setValue(SWIFT, true));
            level.playSound(null, pos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 1, 1);
        }
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (state.getValue(SWIFT) && entity instanceof LivingEntity) {
            double d0 = Math.abs(entity.getDeltaMovement().y);
            if (d0 < 1.1) {
                double d1 = 1.2 + d0 * 1.2;
                entity.setDeltaMovement(entity.getDeltaMovement().multiply(d1, 1.0, d1));
            }
            super.stepOn(level, pos, state, entity);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SWIFT);
    }
}
