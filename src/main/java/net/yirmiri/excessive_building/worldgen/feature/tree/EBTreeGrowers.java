package net.yirmiri.excessive_building.worldgen.feature.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.worldgen.feature.EBConfiguredFeatures;

import java.util.Optional;

public class EBTreeGrowers {

    public static final TreeGrower ANCIENT_GROWER = register("ancient_grower", Optional.of(EBConfiguredFeatures.ANCIENT_TREE), Optional.empty());
    public static final TreeGrower WILLOW_GROWER = register("willow_grower", Optional.of(EBConfiguredFeatures.WILLOW_TREE), Optional.empty());
    public static final TreeGrower GOLDEN_BIRCH_GROWER = register("golden_birch_grower", Optional.of(EBConfiguredFeatures.GOLDEN_BIRCH_TREE), Optional.empty());
    public static final TreeGrower RED_MAPLE_GROWER = register("red_maple_grower", Optional.of(EBConfiguredFeatures.RED_MAPLE_TREE), Optional.empty());
    public static final TreeGrower ORANGE_MAPLE_GROWER = register("orange_maple_grower", Optional.of(EBConfiguredFeatures.ORANGE_MAPLE_TREE), Optional.empty());
    public static final TreeGrower YELLOW_MAPLE_GROWER = register("yellow_maple_grower", Optional.of(EBConfiguredFeatures.YELLOW_MAPLE_TREE), Optional.empty());

    private static TreeGrower register(String name, Optional<ResourceKey<ConfiguredFeature<?, ?>>> megaTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryMegaTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> tree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> flowers, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryFlowers) {
        return new TreeGrower(String.format("%s:%s", ExcessiveBuilding.MOD_ID, name), (float) 0.1, megaTree, secondaryMegaTree, tree, secondaryTree, flowers, secondaryFlowers);
    }

    private static TreeGrower register(String name, Optional<ResourceKey<ConfiguredFeature<?, ?>>> tree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryTree) {
        return register(name, Optional.empty(), Optional.empty(), tree, secondaryTree, Optional.empty(), Optional.empty());
    }
}
