package net.yirmiri.excessive_building.datagen.loot;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBBlocks;

public class EBGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public EBGlobalLootModifiersProvider(PackOutput output) {
        super(output, ExcessiveBuilding.MOD_ID);
    }

    @Override
    protected void start() {
        add("ancient_sapling_from_sniffer", new AddLootModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/sniffer_digging")).build(), LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, EBBlocks.ANCIENT_SAPLING.get()));
    }
}
