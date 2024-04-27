package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.flammable.FlammableBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DecorativeShelfBlock extends FlammableBlock {
    public static final IntegerProperty VARIANT = IntegerProperty.create("variant", 0, 7);

    public DecorativeShelfBlock(Properties properties, int flammability, int spreadingSpeed) {
        super(properties, flammability, spreadingSpeed);
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return variantPowerBonus(state);
    }

    public float variantPowerBonus(BlockState state) {
        if ((state.getValue(VARIANT) == 2) || (state.getValue(VARIANT) == 5)) {
            return EBConfig.DECORATIVE_ENCHANT_BONUS.get();
        }
        return 0;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(stack, getter, list, flag);
        list.add(CommonComponents.EMPTY);
        list.add(Component.translatable("tooltip.block.interact").withStyle(ChatFormatting.GRAY));
        list.add(CommonComponents.space().append(Component.translatable("tooltip.block.variant").withStyle(ChatFormatting.BLUE)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(VARIANT);
    }

    @Override @NotNull
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        level.setBlockAndUpdate(pos, state.cycle(VARIANT));
        level.playSound(null, pos, SoundEvents.BOOK_PUT, SoundSource.BLOCKS, 1, 1);
        return InteractionResult.SUCCESS;
    }
}
