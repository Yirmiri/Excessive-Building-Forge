package net.yirmiri.excessive_building.worldgen.feature.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.feature.EBConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class GoldenBirchTreeGrower extends AbstractTreeGrower {
    @Nullable @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return b ? EBConfiguredFeatures.GOLDEN_BIRCH_TREE_BEES_01 : EBConfiguredFeatures.GOLDEN_BIRCH_TREE;
    }
}
