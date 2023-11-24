package net.yirmiri.excessive_building.block.blocktypes;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.yirmiri.excessive_building.util.EBWeatheringCopper;

import javax.annotation.Nullable;

public class CopperBulbBlock extends Block implements EBWeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public CopperBulbBlock(BlockBehaviour.Properties properties, WeatherState weatherState) {
        super(properties);
        this.weatherState = weatherState;
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        this.onRandomTick(blockState, serverLevel, blockPos, randomSource);
    }

    public boolean isRandomlyTicking(BlockState blockState) {
        return WeatheringCopper.getNext(blockState.getBlock()).isPresent();
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }

    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext level) {
        return this.defaultBlockState().setValue(LIT, Boolean.valueOf(level.getLevel().hasNeighborSignal(level.getClickedPos())));
    }

    public void neighborChanged(BlockState p_55666_, Level p_55667_, BlockPos p_55668_, Block p_55669_, BlockPos p_55670_, boolean p_55671_) {
        if (!p_55667_.isClientSide) {
            boolean flag = p_55666_.getValue(LIT);
            if (flag != p_55667_.hasNeighborSignal(p_55668_)) {
                if (flag) {
                    p_55667_.scheduleTick(p_55668_, this, 4);
                } else {
                    p_55667_.setBlock(p_55668_, p_55666_.cycle(LIT), 2);
                }
            }

        }
    }

    public void tick(BlockState p_221937_, ServerLevel p_221938_, BlockPos p_221939_, RandomSource p_221940_) {
        if (p_221937_.getValue(LIT) && !p_221938_.hasNeighborSignal(p_221939_)) {
            p_221938_.setBlock(p_221939_, p_221937_.cycle(LIT), 2);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55673_) {
        p_55673_.add(LIT);
    }
}
