package net.yirmiri.excessive_building.worldgen.feature.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.feature.EBConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class AcornTreeGrower extends AbstractTreeGrower {
    @Nullable @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        if (Math.random() < 0.55) {
        return EBConfiguredFeatures.RED_MAPLE_TREE;
        } else if (Math.random() < 0.25) {
        return EBConfiguredFeatures.ORANGE_MAPLE_TREE;
        }
        else return EBConfiguredFeatures.YELLOW_MAPLE_TREE;
    }
}
