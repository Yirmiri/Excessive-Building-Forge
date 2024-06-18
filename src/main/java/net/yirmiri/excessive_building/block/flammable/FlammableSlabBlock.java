package net.yirmiri.excessive_building.block.flammable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FlammableSlabBlock extends SlabBlock {
    public final int flammability;
    public final int spreadingSpeed;

    public FlammableSlabBlock(Properties properties, int flammability, int spreadingSpeed) {
        super(properties);
        this.flammability = flammability;
        this.spreadingSpeed = spreadingSpeed;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return flammability; //5: logs || 20: planks/carpet || 30: shelves || 60: wool
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return spreadingSpeed; //5: planks/logs || 20: shelves || 30: wool || 60: carpet
    }
}
