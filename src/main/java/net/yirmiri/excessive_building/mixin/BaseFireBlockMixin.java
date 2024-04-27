package net.yirmiri.excessive_building.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.block.AmethystFireBlock;
import net.yirmiri.excessive_building.register.EBBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BaseFireBlock.class)
public abstract class BaseFireBlockMixin extends Block {
    public BaseFireBlockMixin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Inject(method = "getState", at = @At("HEAD"), cancellable = true)
    private static void getAmethystFirePlacement(BlockGetter reader, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
        if (AmethystFireBlock.canSurviveOnBlock(reader.getBlockState(pos.below()))) {
            cir.setReturnValue(EBBlocks.AMETHYST_FIRE.get().defaultBlockState());
        }
    }
}
