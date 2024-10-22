package net.yirmiri.excessive_building.worldgen.feature.tree.grower;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.feature.EBConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class RedMapleTreeGrower extends AbstractTreeGrower {
    @Nullable @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return EBConfiguredFeatures.RED_MAPLE_TREE;
    }
}
