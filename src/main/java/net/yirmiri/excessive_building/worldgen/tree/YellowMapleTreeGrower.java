package net.yirmiri.excessive_building.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.EBConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class YellowMapleTreeGrower extends AbstractTreeGrower {
    @Nullable @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return EBConfiguredFeatures.YELLOW_MAPLE_TREE;
    }
}