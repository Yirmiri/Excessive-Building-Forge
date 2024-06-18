package net.yirmiri.excessive_building.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GrowingPlantBlock.class)
public abstract class GrowingPlantBlockMixin {
    @Shadow @Final protected Direction growthDirection;
    @Shadow protected abstract GrowingPlantHeadBlock getHeadBlock();
    @Shadow protected abstract Block getBodyBlock();

    @Inject(at = @At("RETURN"), method = "canSurvive", cancellable = true)
    private void canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos, CallbackInfoReturnable cir) {
        BlockPos blockpos = blockPos.relative(growthDirection.getOpposite());
        BlockState blockstate = levelReader.getBlockState(blockpos);
        cir.setReturnValue(blockstate.is(BlockTags.LEAVES) || blockstate.is(this.getHeadBlock()) || blockstate.is(this.getBodyBlock()) || blockstate.isFaceSturdy(levelReader, blockpos, this.growthDirection));
    }
}
