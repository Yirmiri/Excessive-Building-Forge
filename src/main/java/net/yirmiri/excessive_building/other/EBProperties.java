package net.yirmiri.excessive_building.other;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.yirmiri.excessive_building.potion.EBMobEffects;

public class EBProperties {

    //WOOD PROPERTIES
    public static final BlockBehaviour.Properties GENERIC_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava();
    public static final BlockBehaviour.Properties CHERRY_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava();
    public static final BlockBehaviour.Properties BAMBOO_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava();
    public static final BlockBehaviour.Properties CRIMSON_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD);
    public static final BlockBehaviour.Properties WARPED_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD);
    public static final BlockBehaviour.Properties ANCIENT_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava();

    //SHELF PROPERTIES
    public static final BlockBehaviour.Properties GENERIC_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.WOOD).ignitedByLava();
    public static final BlockBehaviour.Properties CHERRY_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.CHERRY_WOOD).ignitedByLava();
    public static final BlockBehaviour.Properties BAMBOO_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.BAMBOO_WOOD).ignitedByLava();
    public static final BlockBehaviour.Properties CRIMSON_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.NETHER_WOOD);
    public static final BlockBehaviour.Properties WARPED_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.NETHER_WOOD);
    public static final BlockBehaviour.Properties ANCIENT_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.CHERRY_WOOD).ignitedByLava();

    //STONE PROPERTIES
    public static final BlockBehaviour.Properties BRIMSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties SULFURIC_BRIMSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sound(SoundType.BASALT).requiresCorrectToolForDrops();

    //CRYSTAL PROPERTIES
    public static final BlockBehaviour.Properties FIERY = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties PRISMARINE = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties KYANITE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties MIRALEN = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();

    //FOOD PROPERTIES
    public static final FoodProperties ANCIENT_FRUIT = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).effect(new MobEffectInstance(EBMobEffects.REACHING.get(), 200, 0), 1.0F).build();
    public static final FoodProperties ANCIENT_CIDER = new FoodProperties.Builder().alwaysEat().effect(new MobEffectInstance(EBMobEffects.REACHING.get(), 1200, 0), 1.0F).build();
}