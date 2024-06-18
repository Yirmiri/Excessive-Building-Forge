package net.yirmiri.excessive_building.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yirmiri.excessive_building.register.EBBlocks;

public class AncientVinesPlantBlock extends GrowingPlantBodyBlock {
    public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public AncientVinesPlantBlock(BlockBehaviour.Properties p_154975_) {
        super(p_154975_, Direction.DOWN, SHAPE, false);
    }

    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) EBBlocks.ANCIENT_VINES.get();
    }

    public static final MapCodec<AncientVinesPlantBlock> CODEC = simpleCodec(AncientVinesPlantBlock::new);

    @Override
    public MapCodec<AncientVinesPlantBlock> codec() {
        return CODEC;
    }
}
