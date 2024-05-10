package net.yirmiri.excessive_building;

import com.google.common.collect.ImmutableMap;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yirmiri.excessive_building.block.GrassSlabBlock;
import net.yirmiri.excessive_building.compat.EBCompatRegistries;
import net.yirmiri.excessive_building.compat.SMCompat;
import net.yirmiri.excessive_building.compat.terrablender.EBOverworldRegion;
import net.yirmiri.excessive_building.datagen.loot.EBLootTableModifiers;
import net.yirmiri.excessive_building.register.*;
import net.yirmiri.excessive_building.util.EBBlockTypes;
import net.yirmiri.excessive_building.util.EBCreativeModeTabs;
import net.yirmiri.excessive_building.util.EBSoundEvents;

@Mod(ExcessiveBuilding.MODID)
public class ExcessiveBuilding {
    public static final String MODID = "excessive_building";

    public ExcessiveBuilding() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EBConfig.COMMON);

        EBBlocks.register(modEventBus);
        EBItems.register(modEventBus);
        EBItemGroups.register(modEventBus);
        EBMobEffects.register(modEventBus);
        EBPotions.register(modEventBus);
        EBLootTableModifiers.register(modEventBus);
        EBParticleTypes.register(modEventBus);
        EBBlockEntities.register(modEventBus);
        EBBannerPatterns.register(modEventBus);
        EBCompatRegistries.register(modEventBus);
        EBSoundEvents.register(modEventBus);
        EBPaintings.register(modEventBus);

        modEventBus.addListener(EBCreativeModeTabs::buildCreativeTabs);
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::onClientSetup);
        modEventBus.addListener(this::commonSetup);

        if (EBCompatRegistries.terrablender) {
            modEventBus.addListener(EBOverworldRegion::onClientSetup);
        }

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.ANCIENT_SAPLING.getId(), EBBlocks.POTTED_ANCIENT_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.ROSE.getId(), EBBlocks.POTTED_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.CYAN_ROSE.getId(), EBBlocks.POTTED_CYAN_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.WHITE_ROSE.getId(), EBBlocks.POTTED_WHITE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.WILLOW_SAPLING.getId(), EBBlocks.POTTED_WILLOW_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.ROSE_BUNDLE.getId(), EBBlocks.POTTED_ROSE_BUNDLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.MARIGOLD.getId(), EBBlocks.POTTED_MARIGOLD);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.GOLDEN_BIRCH_SAPLING.getId(), EBBlocks.POTTED_GOLDEN_BIRCH_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.RED_MAPLE_SAPLING.getId(), EBBlocks.POTTED_RED_MAPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.ORANGE_MAPLE_SAPLING.getId(), EBBlocks.POTTED_ORANGE_MAPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.YELLOW_MAPLE_SAPLING.getId(), EBBlocks.POTTED_YELLOW_MAPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EBBlocks.ACORN.getId(), EBBlocks.POTTED_ACORN);

            ItemStack awkwardPotion = PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.AWKWARD);
            ItemStack reachingPotion = PotionUtils.setPotion(new ItemStack(Items.POTION), EBPotions.REACHING_POTION.get());

            if (EBConfig.ENABLE_REACHING_POTIONS.get()) {
                BrewingRecipeRegistry.addRecipe(new BrewingRecipe(Ingredient.of(awkwardPotion), Ingredient.of(EBItems.ANCIENT_FRUIT.get()), PotionUtils.setPotion(new ItemStack(Items.POTION), EBPotions.REACHING_POTION.get())));
                BrewingRecipeRegistry.addRecipe(new BrewingRecipe(Ingredient.of(reachingPotion), Ingredient.of(Items.REDSTONE), PotionUtils.setPotion(new ItemStack(Items.POTION), EBPotions.LONG_REACHING_POTION.get())));
            }
        });
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        //TRANSLUCENT
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.FIERY_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.AMETHYST_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.PRISMARINE_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.FIERY_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.AMETHYST_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.PRISMARINE_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.RAINBOW_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.RAINBOW_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.KYANITE_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.KYANITE_GLASS_PANE.get(), RenderType.translucent());
        //CUTOUT
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SPRUCE_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.BIRCH_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.BAMBOO_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.JUNGLE_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ACACIA_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.DARK_OAK_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MANGROVE_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ANCIENT_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.CHERRY_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WARPED_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.CRIMSON_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ALGAE_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.GRASS_SLAB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WILLOW_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MAPLE_LADDER.get(), RenderType.cutout());
        //CUTOUT MIPPED
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.AMETHYST_FIRE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.RED_MAPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_RED_MAPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ORANGE_MAPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_ORANGE_MAPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.YELLOW_MAPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_YELLOW_MAPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.RED_MAPLE_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ORANGE_MAPLE_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.YELLOW_MAPLE_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MAPLE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MAPLE_TRAPDOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.RED_MAPLE_LEAVES_PILE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ORANGE_MAPLE_LEAVES_PILE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.YELLOW_MAPLE_LEAVES_PILE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ACORN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_ACORN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.EXPOSED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WEATHERED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.OXIDIZED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WAXED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.GOLD_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.IRON_GRATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ANCIENT_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ANCIENT_TRAPDOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ANCIENT_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ANCIENT_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_ANCIENT_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.FIERY_CLUSTER.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.KYANITE_CLUSTER.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.LARGE_KYANITE_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MEDIUM_KYANITE_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SMALL_KYANITE_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.LARGE_FIERY_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MEDIUM_FIERY_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SMALL_FIERY_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ROSE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_ROSE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WHITE_ROSE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_WHITE_ROSE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.CYAN_ROSE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_CYAN_ROSE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WILLOW_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_WILLOW_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WILLOW_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WILLOW_TRAPDOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ROSE_BUNDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_ROSE_BUNDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MARIGOLD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_MARIGOLD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MIRALEN_CLUSTER.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.LARGE_MIRALEN_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MEDIUM_MIRALEN_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SMALL_MIRALEN_BUD.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.GOLDEN_BIRCH_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.GOLDEN_BIRCH_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POTTED_GOLDEN_BIRCH_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.ANCIENT_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.WILLOW_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SMOOTH_STONE_BRICK_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.TUFF_BRICK_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MARBLE_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.MARQUINA_MARBLE_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SANDSTONE_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.RED_SANDSTONE_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.SOUL_SANDSTONE_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.POLISHED_BRIMSTONE_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.QUARTZ_PEDESTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.PURPUR_PEDESTAL.get(), RenderType.cutoutMipped());

        Sheets.addWoodType(EBBlockTypes.ANCIENT);
        Sheets.addWoodType(EBBlockTypes.WILLOW);
        Sheets.addWoodType(EBBlockTypes.MAPLE);

        if (EBCompatRegistries.sullysMod) {
            ItemBlockRenderTypes.setRenderLayer(SMCompat.JADE_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(SMCompat.JADE_GLASS_PANE.get(), RenderType.translucent());
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES)
                    .put(EBBlocks.ANCIENT_LOG.get(), EBBlocks.STRIPPED_ANCIENT_LOG.get()).put(EBBlocks.ANCIENT_WOOD.get(), EBBlocks.STRIPPED_ANCIENT_WOOD.get())
                    .put(EBBlocks.WILLOW_LOG.get(), EBBlocks.STRIPPED_WILLOW_LOG.get()).put(EBBlocks.WILLOW_WOOD.get(), EBBlocks.STRIPPED_WILLOW_WOOD.get())
                    .put(EBBlocks.HOLLOW_OAK_LOG.get(), EBBlocks.HOLLOW_STRIPPED_OAK_LOG.get())
                    .put(EBBlocks.HOLLOW_SPRUCE_LOG.get(), EBBlocks.HOLLOW_STRIPPED_SPRUCE_LOG.get())
                    .put(EBBlocks.HOLLOW_BIRCH_LOG.get(), EBBlocks.HOLLOW_STRIPPED_BIRCH_LOG.get())
                    .put(EBBlocks.HOLLOW_JUNGLE_LOG.get(), EBBlocks.HOLLOW_STRIPPED_JUNGLE_LOG.get())
                    .put(EBBlocks.HOLLOW_ACACIA_LOG.get(), EBBlocks.HOLLOW_STRIPPED_ACACIA_LOG.get())
                    .put(EBBlocks.HOLLOW_DARK_OAK_LOG.get(), EBBlocks.HOLLOW_STRIPPED_DARK_OAK_LOG.get())
                    .put(EBBlocks.HOLLOW_WILLOW_LOG.get(), EBBlocks.HOLLOW_STRIPPED_WILLOW_LOG.get())
                    .put(EBBlocks.HOLLOW_ANCIENT_LOG.get(), EBBlocks.HOLLOW_STRIPPED_ANCIENT_LOG.get())
                    .put(EBBlocks.HOLLOW_MANGROVE_LOG.get(), EBBlocks.HOLLOW_STRIPPED_MANGROVE_LOG.get())
                    .put(EBBlocks.HOLLOW_CHERRY_LOG.get(), EBBlocks.HOLLOW_STRIPPED_CHERRY_LOG.get())
                    .put(EBBlocks.HOLLOW_CRIMSON_STEM.get(), EBBlocks.HOLLOW_STRIPPED_CRIMSON_STEM.get())
                    .put(EBBlocks.HOLLOW_WARPED_STEM.get(), EBBlocks.HOLLOW_STRIPPED_WARPED_STEM.get())
                    .put(EBBlocks.MAPLE_LOG.get(), EBBlocks.STRIPPED_MAPLE_LOG.get()).put(EBBlocks.MAPLE_WOOD.get(), EBBlocks.STRIPPED_MAPLE_WOOD.get())
                    .put(EBBlocks.HOLLOW_MAPLE_LOG.get(), EBBlocks.HOLLOW_STRIPPED_MAPLE_LOG.get())
                    .build();
        });
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
            GrassSlabBlock.blockColorLoad(event);
        }

        @SubscribeEvent
        public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
            GrassSlabBlock.itemColorLoad(event);
        }
    }
}