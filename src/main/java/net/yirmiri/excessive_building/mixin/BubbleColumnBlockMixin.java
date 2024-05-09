package net.yirmiri.excessive_building.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.register.EBBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BubbleColumnBlock.class)
public abstract class BubbleColumnBlockMixin {
    @Inject(at = @At("HEAD"), method = "getColumnState", cancellable = true)
    private static void getColumnState(BlockState state, CallbackInfoReturnable<BlockState> info) {
        if (state.is(EBBlocks.SOUL_MAGMA_BLOCK.get())) {
            info.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(BubbleColumnBlock.DRAG_DOWN, true));
        }
    }

    @Inject(at = @At("HEAD"), method = "canSurvive", cancellable = true)
    public void canSurvive(BlockState state1, LevelReader reader, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        BlockState state = reader.getBlockState(pos.below());
        if (state.is(EBBlocks.SOUL_MAGMA_BLOCK.get())) {
            info.setReturnValue(true);
        }
    }
}
