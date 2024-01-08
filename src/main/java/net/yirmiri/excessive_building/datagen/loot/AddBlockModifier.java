package net.yirmiri.excessive_building.datagen.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class AddBlockModifier extends LootModifier {
    public static final Supplier<Codec<AddBlockModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create
            (inst -> codecStart(inst).and(ForgeRegistries.BLOCKS.getCodec().fieldOf("block").forGetter(m -> m.block)).apply(inst, AddBlockModifier::new)));

    private final Block block;

    public AddBlockModifier(LootItemCondition[] conditionsIn, Block block) {
        super(conditionsIn);
        this.block = block;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for(LootItemCondition condition : this.conditions) {
            if(!condition.test(context)) {
                return generatedLoot;
            }
        }

        generatedLoot.add(new ItemStack(this.block));
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
