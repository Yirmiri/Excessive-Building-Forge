package net.yirmiri.excessive_building.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.yirmiri.excessive_building.register.EBMobEffects;

public class EBProperties {

    public class BlockProperties {
        //WOOD
        public static final BlockBehaviour.Properties GENERIC_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties CHERRY_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties BAMBOO_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties CRIMSON_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties WARPED_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties ANCIENT_WOOD = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava();

        //SHELF
        public static final BlockBehaviour.Properties GENERIC_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties CHERRY_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.CHERRY_WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties BAMBOO_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.BAMBOO_WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties CRIMSON_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties WARPED_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties ANCIENT_SHELF = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(1.5F, 1.5F).sound(SoundType.CHERRY_WOOD).ignitedByLava();

        //CRAFTING TABLE
        public static final BlockBehaviour.Properties GENERIC_CT = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.5F, 2.5F).sound(SoundType.WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties CHERRY_CT = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.5F, 2.5F).sound(SoundType.CHERRY_WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties BAMBOO_CT = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.5F, 2.5F).sound(SoundType.BAMBOO_WOOD).ignitedByLava();
        public static final BlockBehaviour.Properties CRIMSON_CT = BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(2.5F, 2.5F).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties WARPED_CT = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.BASS).strength(2.5F, 2.5F).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties ANCIENT_CT = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.5F, 2.5F).sound(SoundType.CHERRY_WOOD).ignitedByLava();

        //STONE
        public static final BlockBehaviour.Properties ASPHALT = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(1.0F, 2.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK);
        public static final BlockBehaviour.Properties ROUGH_SANDSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(1.0F, 1.0F).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties ROUGH_RED_SANDSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(1.0F, 1.0F).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties ROUGH_SOUL_SANDSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASS).strength(1.0F, 1.0F).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties SOUL_SANDSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASS).strength(0.8F, 0.8F).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties BLUE_NETHER = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops();

        //BRIMSTONE
        public static final BlockBehaviour.Properties BRIMSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(1.5F, 6.0F).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties POLISHED_BRIMSTONE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties POLISHED_BRIMSTONE_BRICKS = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties POLISHED_BRIMSTONE_TILES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops();

        //CRYSTAL
        public static final BlockBehaviour.Properties FIERY = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties PRISMARINE = BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties KYANITE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties MIRALEN = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.CHIME).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();

        //MARBLE
        public static final BlockBehaviour.Properties MARBLE = BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(1.0F, 3.0F).sound(EBSoundEvents.EBSoundTypes.MARBLE).requiresCorrectToolForDrops();
        public static final BlockBehaviour.Properties MARQUINA_MARBLE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(1.0F, 3.0F).sound(EBSoundEvents.EBSoundTypes.MARBLE).requiresCorrectToolForDrops();

        //MISC
        public static final BlockBehaviour.Properties POT = BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.DECORATED_POT_CRACKED);
    }

    public class Foods {
        //FOOD PROPERTIES
        public static final FoodProperties ANCIENT_FRUIT = new FoodProperties.Builder().alwaysEat().nutrition(4).saturationMod(0.2f).effect(new MobEffectInstance(EBMobEffects.REACHING.get(), 200, 0), 1.0F).build();
        public static final FoodProperties ANCIENT_CIDER = new FoodProperties.Builder().alwaysEat().effect(new MobEffectInstance(EBMobEffects.REACHING.get(), 6000, 0), 1.0F).build();
    }
}