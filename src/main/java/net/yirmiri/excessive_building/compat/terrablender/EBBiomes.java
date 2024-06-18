package net.yirmiri.excessive_building.compat.terrablender;

//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.worldgen.BiomeDefaultFeatures;
//import net.minecraft.data.worldgen.BootstrapContext;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.sounds.Musics;
//import net.minecraft.sounds.SoundEvents;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.MobCategory;
//import net.minecraft.world.level.biome.*;
//import net.yirmiri.excessive_building.ExcessiveBuilding;
//
//public class EBBiomes {
//    public static final ResourceKey<Biome> MAPLE_FOREST = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "maple_forest"));
//    public static final ResourceKey<Biome> SNOWY_MAPLE_FOREST = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "snowy_maple_forest"));
//    public static final ResourceKey<Biome> GOLDEN_BIRCH_FOREST = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "golden_birch_forest"));
//
//    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
//        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
//        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
//        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
//        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
//        BiomeDefaultFeatures.addDefaultSprings(builder);
//        BiomeDefaultFeatures.addSurfaceFreezing(builder);
//    }
//
//    public static void boostrap(BootstrapContext<Biome> ctx) {
//        ctx.register(MAPLE_FOREST, mapleForest(ctx));
//        ctx.register(SNOWY_MAPLE_FOREST, snowyMapleForest(ctx));
//        ctx.register(GOLDEN_BIRCH_FOREST, goldenBirchForest(ctx));
//    }
//
//    //GOLDEN BIRCH FOREST BIOME
//    public static Biome goldenBirchForest(BootstrapContext<Biome> context) {
//        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
//
//        //CREATURES
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
//
//        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
//        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
//
//        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
//
//        globalOverworldGeneration(biomeBuilder);
//        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addFerns(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addJungleGrass(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
//        BiomeDefaultFeatures.addRareBerryBushes(biomeBuilder);
//        BiomeDefaultFeatures.addCommonBerryBushes(biomeBuilder);
//
//        return new Biome.BiomeBuilder()
//                .hasPrecipitation(true)
//                .downfall(0.6f)
//                .temperature(0.6f)
//                .generationSettings(biomeBuilder.build())
//                .mobSpawnSettings(spawnBuilder.build())
//                .specialEffects((new BiomeSpecialEffects.Builder())
//                        .skyColor(0x79a6ff)
//                        .fogColor(0xc0d8ff)
//                        .grassColorOverride(0x88bb67)
//                        .foliageColorOverride(0x6ba941)
//                        .waterColor(0x3f76e4)
//                        .waterFogColor(0x3f76e4)
//                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
//                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_FOREST)).build()).build();
//    }
//
//    //MAPLE FOREST BIOME
//    public static Biome mapleForest(BootstrapContext<Biome> context) {
//        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
//
//        //CREATURES
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
//
//        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
//        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
//
//        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
//
//        globalOverworldGeneration(biomeBuilder);
//        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
//        BiomeDefaultFeatures.addPlainVegetation(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addForestGrass(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
//
//        return new Biome.BiomeBuilder()
//                .hasPrecipitation(true)
//                .downfall(0.6f)
//                .temperature(0.6f)
//                .generationSettings(biomeBuilder.build())
//                .mobSpawnSettings(spawnBuilder.build())
//                .specialEffects((new BiomeSpecialEffects.Builder())
//                .skyColor(0x79a6ff)
//                .fogColor(0xc0d8ff)
//                .grassColorOverride(0xcac056)
//                .foliageColorOverride(0xae9f2a)
//                .waterColor(0x3f76e4)
//                .waterFogColor(0x3f76e4)
//                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
//                .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW)).build()).build();
//    }
//
//    //SNOWY MAPLE FOREST BIOME
//    public static Biome snowyMapleForest(BootstrapContext<Biome> context) {
//        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
//
//        //CREATURES
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 4, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
//
//        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
//        BiomeDefaultFeatures.snowySpawns(spawnBuilder);
//
//        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
//
//        globalOverworldGeneration(biomeBuilder);
//        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
//        BiomeDefaultFeatures.addPlainVegetation(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addForestGrass(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
//        BiomeDefaultFeatures.addFrozenSprings(biomeBuilder);
//
//        return new Biome.BiomeBuilder()
//                .hasPrecipitation(true)
//                .downfall(0.4f)
//                .temperature(-0.5f)
//                .generationSettings(biomeBuilder.build())
//                .mobSpawnSettings(spawnBuilder.build())
//                .specialEffects((new BiomeSpecialEffects.Builder())
//                        .skyColor(0x79a6ff)
//                        .fogColor(0xc0d8ff)
//                        .grassColorOverride(0xcac056)
//                        .foliageColorOverride(0xae9f2a)
//                        .waterColor(0x3f76e4)
//                        .waterFogColor(0x3f76e4)
//                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
//                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW)).build()).build();
//    }
//
//    public static void register() {
//    }
//}