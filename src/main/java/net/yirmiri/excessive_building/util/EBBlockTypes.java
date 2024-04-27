package net.yirmiri.excessive_building.util;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBBlockTypes {
    public static BlockSetType ANCIENT_BLOCKSET = new BlockSetType(ExcessiveBuilding.MODID + ":ancient", true, SoundType.CHERRY_WOOD, SoundEvents.CHERRY_WOOD_DOOR_CLOSE, SoundEvents.CHERRY_WOOD_DOOR_OPEN, SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE, SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN, SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF, SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON);
    public static BlockSetType WILLOW_BLOCKSET = new BlockSetType(ExcessiveBuilding.MODID + ":willow", true, SoundType.WOOD, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON);
    public static BlockSetType MAPLE_BLOCKSET = new BlockSetType(ExcessiveBuilding.MODID + ":maple", true, SoundType.WOOD, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON);

    public static final WoodType ANCIENT = WoodType.register(new WoodType(ExcessiveBuilding.MODID + ":ancient", EBBlockTypes.ANCIENT_BLOCKSET));
    public static final WoodType WILLOW = WoodType.register(new WoodType(ExcessiveBuilding.MODID + ":willow", EBBlockTypes.WILLOW_BLOCKSET));
    public static final WoodType MAPLE = WoodType.register(new WoodType(ExcessiveBuilding.MODID + ":maple", EBBlockTypes.MAPLE_BLOCKSET));
}
