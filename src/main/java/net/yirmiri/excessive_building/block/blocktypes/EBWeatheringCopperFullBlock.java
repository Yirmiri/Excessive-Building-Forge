package net.yirmiri.excessive_building.block.blocktypes;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.util.EBWeatheringCopper;

public class EBWeatheringCopperFullBlock extends Block implements EBWeatheringCopper {
    private final EBWeatheringCopper.WeatherState weatherState;

    public EBWeatheringCopperFullBlock(EBWeatheringCopper.WeatherState weatherState, BlockBehaviour.Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        this.onRandomTick(blockState, serverLevel, blockPos, randomSource);
    }

    public boolean isRandomlyTicking(BlockState blockState) {
        return WeatheringCopper.getNext(blockState.getBlock()).isPresent();
    }

    public EBWeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}
