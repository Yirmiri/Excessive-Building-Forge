package net.yirmiri.excessive_building.block.blocktypes.flammable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WoolCarpetBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FlammableWoolCarpetBlock extends WoolCarpetBlock {
    public FlammableWoolCarpetBlock(DyeColor dyeColor, Properties properties) {
        super(dyeColor, properties);
    }

        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 20; }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60;
    }
}
