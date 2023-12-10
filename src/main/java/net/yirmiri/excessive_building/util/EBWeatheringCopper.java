package net.yirmiri.excessive_building.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.block.EBBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface EBWeatheringCopper extends WeatheringCopper {

    default BlockState getFirst(BlockState state) {
        return WeatheringCopper.getFirst(state.getBlock()).withPropertiesOf(state);
    }

    default Optional<BlockState> getPrevious(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).map((prevBlock) -> prevBlock.withPropertiesOf(state));
    }

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                .put(EBBlocks.CHISELED_COPPER.get(), EBBlocks.EXPOSED_CHISELED_COPPER.get())
                .put(EBBlocks.EXPOSED_CHISELED_COPPER.get(), EBBlocks.WEATHERED_CHISELED_COPPER.get())
                .put(EBBlocks.WEATHERED_CHISELED_COPPER.get(), EBBlocks.OXIDIZED_CHISELED_COPPER.get())
                .put(EBBlocks.COPPER_GRATE.get(), EBBlocks.EXPOSED_COPPER_GRATE.get())
                .put(EBBlocks.EXPOSED_COPPER_GRATE.get(), EBBlocks.WEATHERED_COPPER_GRATE.get())
                .put(EBBlocks.WEATHERED_COPPER_GRATE.get(), EBBlocks.OXIDIZED_COPPER_GRATE.get())
                .put(EBBlocks.COPPER_BULB.get(), EBBlocks.EXPOSED_COPPER_BULB.get())
                .put(EBBlocks.EXPOSED_COPPER_BULB.get(), EBBlocks.WEATHERED_COPPER_BULB.get())
                .put(EBBlocks.WEATHERED_COPPER_BULB.get(), EBBlocks.OXIDIZED_COPPER_BULB.get())
                .build();
    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return NEXT_BY_BLOCK.get().inverse();
    });

    static Optional<Block> getPrevious(Block p_154891_) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
    }

    static Block getFirst(Block p_154898_) {
        Block block = p_154898_;

        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(p_154898_); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }
}
