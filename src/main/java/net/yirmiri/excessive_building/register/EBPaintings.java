package net.yirmiri.excessive_building.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ExcessiveBuilding.MOD_ID);

    //YIRMIRI'S PAINTINGS
    public static final RegistryObject<PaintingVariant> FORGOTTEN_KINGDOM = PAINTING_VARIANTS.register("forgotten_kingdom", () -> new PaintingVariant(32, 16, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "forgotten_kingdom")));
    public static final RegistryObject<PaintingVariant> FIT_FOR_A_QUEEN = PAINTING_VARIANTS.register("fit_for_a_queen", () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "fit_for_a_queen")));

    //COMMUNITY PAINTINGS
    public static final RegistryObject<PaintingVariant> PALEOBOTANY = PAINTING_VARIANTS.register("paleobotany", () -> new PaintingVariant(48, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "paleobotany"))); //Hecco
    public static final RegistryObject<PaintingVariant> BUST = PAINTING_VARIANTS.register("bust", () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "bust"))); //Kolos
    public static final RegistryObject<PaintingVariant> CRASH_LANDING = PAINTING_VARIANTS.register("crash_landing", () -> new PaintingVariant(80, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "crash_landing"))); //BackupCup
    public static final RegistryObject<PaintingVariant> THINE_HOLY_PEANUT = PAINTING_VARIANTS.register("thine_holy_peanut", () -> new PaintingVariant(32, 16, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "thine_holy_peanut"))); //YesMan2
    public static final RegistryObject<PaintingVariant> PUFFERLIGHT = PAINTING_VARIANTS.register("pufferlight", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "pufferlight"))); //Pepagg
    public static final RegistryObject<PaintingVariant> HORIZON = PAINTING_VARIANTS.register("horizon", () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "horizon"))); //HaWii
    public static final RegistryObject<PaintingVariant> THE_LONE_TREE = PAINTING_VARIANTS.register("the_lone_tree", () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "the_lone_tree"))); //SuperMightByte
    public static final RegistryObject<PaintingVariant> SNIFFING_IN_THE_PINE_FOREST = PAINTING_VARIANTS.register("sniffing_in_the_pine_forest", () -> new PaintingVariant(64, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "sniffing_in_the_pine_forest"))); //Brickerman
    public static final RegistryObject<PaintingVariant> IMMINENT_DETONATION = PAINTING_VARIANTS.register("imminent_detonation", () -> new PaintingVariant(80, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "imminent_detonation"))); //BackupCup
    public static final RegistryObject<PaintingVariant> WHY_DO_MY_EYES_HURT = PAINTING_VARIANTS.register("why_do_my_eyes_hurt", () -> new PaintingVariant(80, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "why_do_my_eyes_hurt"))); //BackupCup
    public static final RegistryObject<PaintingVariant> LONE_BRIDGE = PAINTING_VARIANTS.register("lone_bridge", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "lone_bridge"))); //Nebula
    public static final RegistryObject<PaintingVariant> THE_END = PAINTING_VARIANTS.register("the_end", () -> new PaintingVariant(80, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "the_end"))); //BackupCup
    public static final RegistryObject<PaintingVariant> SCOURGE_BRINGER = PAINTING_VARIANTS.register("scourge_bringer", () -> new PaintingVariant(80, 48, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "scourge_bringer"))); //BackupCup
    public static final RegistryObject<PaintingVariant> BEACON_OF_THE_DESERT = PAINTING_VARIANTS.register("beacon_of_the_desert", () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "beacon_of_the_desert"))); //Brickerman
    public static final RegistryObject<PaintingVariant> BEACON_OF_THE_DESERT_TRIMMED = PAINTING_VARIANTS.register("beacon_of_the_desert_trimmed", () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "beacon_of_the_desert_trimmed"))); //Brickerman
    public static final RegistryObject<PaintingVariant> SOMETHING_WICKED = PAINTING_VARIANTS.register("something_wicked", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "something_wicked"))); //Something wicked comes this way
    public static final RegistryObject<PaintingVariant> BURRITO = PAINTING_VARIANTS.register("burrito", () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "burrito"))); //DrIsFish, its not a burrito.
    public static final RegistryObject<PaintingVariant> FLOORS = PAINTING_VARIANTS.register("floors", () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "floors"))); //Brickerman
    public static final RegistryObject<PaintingVariant> LONG_TRIPS = PAINTING_VARIANTS.register("long_trips", () -> new PaintingVariant(64, 96, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "long_trips"))); //SmillyScarfs

    //CREATIVE PAINTINGS
    public static final RegistryObject<PaintingVariant> REBELLIOUS = PAINTING_VARIANTS.register("rebellious", () -> new PaintingVariant(128, 128, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "rebellious"))); //CreekWanderer

    //ORIGINAL PORTS
    public static final RegistryObject<PaintingVariant> COURBET_ORIGINAL = PAINTING_VARIANTS.register("courbet_original", () -> new PaintingVariant(32, 16, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "courbet_original")));
    public static final RegistryObject<PaintingVariant> STAGE_ORIGINAL = PAINTING_VARIANTS.register("stage_original", () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "stage_original")));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
