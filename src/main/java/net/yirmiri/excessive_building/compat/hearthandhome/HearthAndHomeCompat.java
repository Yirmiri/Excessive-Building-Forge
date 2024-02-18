package net.yirmiri.excessive_building.compat.hearthandhome;

import com.starfish_studios.hearth_and_home.block.LatticeBlock;
import com.starfish_studios.hearth_and_home.registry.HNHBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.init.EBBlocks;

public class HearthAndHomeCompat {

    public static final RegistryObject<Block> ANCIENT_LATTICE = EBBlocks.registerBlock("ancient_lattice",
            () -> new LatticeBlock(HNHBlocks.Properties.weak_wood.noOcclusion()));

    public static final RegistryObject<Block> WILLOW_LATTICE = EBBlocks.registerBlock("willow_lattice",
            () -> new LatticeBlock(HNHBlocks.Properties.weak_wood.noOcclusion()));

    public static final RegistryObject<Block> MAPLE_LATTICE = EBBlocks.registerBlock("maple_lattice",
            () -> new LatticeBlock(HNHBlocks.Properties.weak_wood.noOcclusion()));

    public static final RegistryObject<Block> ANCIENT_PARQUET = EBBlocks.registerBlock("ancient_parquet",
            () -> new LatticeBlock(HNHBlocks.Properties.weak_wood.noOcclusion()));

    public static final RegistryObject<Block> WILLOW_PARQUET = EBBlocks.registerBlock("willow_parquet",
            () -> new LatticeBlock(HNHBlocks.Properties.weak_wood.noOcclusion()));

    public static final RegistryObject<Block> MAPLE_PARQUET = EBBlocks.registerBlock("maple_parquet",
            () -> new LatticeBlock(HNHBlocks.Properties.weak_wood.noOcclusion()));


    public static void register(IEventBus eventBus) {
    }
}
