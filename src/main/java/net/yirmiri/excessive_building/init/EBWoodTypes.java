package net.yirmiri.excessive_building.init;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBWoodTypes {
    public static final WoodType ANCIENT = WoodType.register(new WoodType(ExcessiveBuilding.MODID + ":ancient", BlockSetType.CHERRY));
    public static final WoodType WILLOW = WoodType.register(new WoodType(ExcessiveBuilding.MODID + ":willow", BlockSetType.OAK));
    public static final WoodType MAPLE = WoodType.register(new WoodType(ExcessiveBuilding.MODID + ":maple", BlockSetType.OAK));
}
