package net.yirmiri.excessive_building.register;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ExcessiveBuilding.MOD_ID);

    //YIRMIRI'S PAINTINGS
    public static final RegistryObject<PaintingVariant> FORGOTTEN_KINGDOM = PAINTING_VARIANTS.register("forgotten_kingdom", () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> FIT_FOR_A_QUEEN = PAINTING_VARIANTS.register("fit_for_a_queen", () -> new PaintingVariant(16, 16));

    //COMMUNITY PAINTINGS
    public static final RegistryObject<PaintingVariant> PALEOBOTANY = PAINTING_VARIANTS.register("paleobotany", () -> new PaintingVariant(48, 48)); //Hecco
    public static final RegistryObject<PaintingVariant> BUST = PAINTING_VARIANTS.register("bust", () -> new PaintingVariant(32, 32)); //Kolos
    public static final RegistryObject<PaintingVariant> CRASH_LANDING = PAINTING_VARIANTS.register("crash_landing", () -> new PaintingVariant(80, 48)); //BackupCup
    public static final RegistryObject<PaintingVariant> THINE_HOLY_PEANUT = PAINTING_VARIANTS.register("thine_holy_peanut", () -> new PaintingVariant(32, 16)); //YesMan2
    public static final RegistryObject<PaintingVariant> PUFFERLIGHT = PAINTING_VARIANTS.register("pufferlight", () -> new PaintingVariant(64, 32)); //Pepagg
    public static final RegistryObject<PaintingVariant> HORIZON = PAINTING_VARIANTS.register("horizon", () -> new PaintingVariant(32, 32)); //HaWii
    public static final RegistryObject<PaintingVariant> THE_LONE_TREE = PAINTING_VARIANTS.register("the_lone_tree", () -> new PaintingVariant(32, 32)); //SuperMightByte
    public static final RegistryObject<PaintingVariant> SNIFFING_IN_THE_PINE_FOREST = PAINTING_VARIANTS.register("sniffing_in_the_pine_forest", () -> new PaintingVariant(64, 48)); //Brickerman
    public static final RegistryObject<PaintingVariant> IMMINENT_DETONATION = PAINTING_VARIANTS.register("imminent_detonation", () -> new PaintingVariant(80, 48)); //BackupCup
    public static final RegistryObject<PaintingVariant> WHY_DO_MY_EYES_HURT = PAINTING_VARIANTS.register("why_do_my_eyes_hurt", () -> new PaintingVariant(80, 48)); //BackupCup
    public static final RegistryObject<PaintingVariant> LONE_BRIDGE = PAINTING_VARIANTS.register("lone_bridge", () -> new PaintingVariant(64, 32)); //Nebula
    public static final RegistryObject<PaintingVariant> THE_END = PAINTING_VARIANTS.register("the_end", () -> new PaintingVariant(80, 48)); //BackupCup
    public static final RegistryObject<PaintingVariant> SCOURGE_BRINGER = PAINTING_VARIANTS.register("scourge_bringer", () -> new PaintingVariant(80, 48)); //BackupCup
    public static final RegistryObject<PaintingVariant> BEACON_OF_THE_DESERT = PAINTING_VARIANTS.register("beacon_of_the_desert", () -> new PaintingVariant(16, 32)); //Brickerman
    public static final RegistryObject<PaintingVariant> BEACON_OF_THE_DESERT_TRIMMED = PAINTING_VARIANTS.register("beacon_of_the_desert_trimmed", () -> new PaintingVariant(16, 32)); //Brickerman
    public static final RegistryObject<PaintingVariant> SOMETHING_WICKED = PAINTING_VARIANTS.register("something_wicked", () -> new PaintingVariant(64, 32)); //Something wicked comes this way
    public static final RegistryObject<PaintingVariant> BURRITO = PAINTING_VARIANTS.register("burrito", () -> new PaintingVariant(16, 16)); //DrIsFish, its not a burrito.
    public static final RegistryObject<PaintingVariant> FLOORS = PAINTING_VARIANTS.register("floors", () -> new PaintingVariant(16, 16)); //Brickerman
    public static final RegistryObject<PaintingVariant> LONG_TRIPS = PAINTING_VARIANTS.register("long_trips", () -> new PaintingVariant(64, 96)); //SmillyScarfs

    //CREATIVE PAINTINGS
    public static final RegistryObject<PaintingVariant> REBELLIOUS = PAINTING_VARIANTS.register("rebellious", () -> new PaintingVariant(128, 128)); //CreekWanderer

    //ORIGINAL PORTS
    public static final RegistryObject<PaintingVariant> COURBET_ORIGINAL = PAINTING_VARIANTS.register("courbet_original", () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> STAGE_ORIGINAL = PAINTING_VARIANTS.register("stage_original", () -> new PaintingVariant(32, 32));

    //1.21 BACKPORTS
    public static final RegistryObject<PaintingVariant> BAROQUE = PAINTING_VARIANTS.register("baroque", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> HUMBLE = PAINTING_VARIANTS.register("humble", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> MEDITATIVE = PAINTING_VARIANTS.register("meditative", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> PRAIRIE_RIDE = PAINTING_VARIANTS.register("prairie_ride", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> UNPACKED = PAINTING_VARIANTS.register("unpacked", () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> BACKYARD = PAINTING_VARIANTS.register("backyard", () -> new PaintingVariant(48, 64));
    public static final RegistryObject<PaintingVariant> BOUQUET = PAINTING_VARIANTS.register("bouquet", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> CAVEBIRD = PAINTING_VARIANTS.register("cavebird", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> CHANGING = PAINTING_VARIANTS.register("changing", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> COTAN = PAINTING_VARIANTS.register("cotan", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> ENDBOSS = PAINTING_VARIANTS.register("endboss", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> FERN = PAINTING_VARIANTS.register("fern", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> FINDING = PAINTING_VARIANTS.register("finding", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> LOWMIST = PAINTING_VARIANTS.register("lowmist", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> ORB = PAINTING_VARIANTS.register("orb", () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> OWLEMONS = PAINTING_VARIANTS.register("owlemons", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> PASSAGE = PAINTING_VARIANTS.register("passage", () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> POND = PAINTING_VARIANTS.register("pond", () -> new PaintingVariant(48, 64));
    public static final RegistryObject<PaintingVariant> SUNFLOWERS = PAINTING_VARIANTS.register("sunflowers", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> TIDES = PAINTING_VARIANTS.register("tides", () -> new PaintingVariant(48, 48));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
