package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.PotBlock;
import net.yirmiri.excessive_building.register.EBBlocks;

public class EBBlockStateProvider extends BlockStateProvider {
    public EBBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExcessiveBuilding.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (DyeColor colours : DyeColor.values()) {
            simplePotBlockWithItem(EBBlocks.getDyedTerracottaPot(colours.getId()),
                    potModel(colours.getName() + "_terracotta_pot")
                    .texture("0", "block/" + colours.getName() + "_terracotta_pot")
                    .texture("particle", "minecraft:block/" + colours.getName() + "_terracotta"),
                    potModel(colours.getName() + "_terracotta_pot_filled")
                    .texture("0", "block/" + colours.getName() + "_terracotta_pot_filled")
                    .texture("particle", "minecraft:block/" + colours.getName() + "_terracotta"));

        }
    }

    public ModelBuilder<?> potModel(String name) {
        return models().withExistingParent(name, "excessive_building:custom/template_pot");
    }
    public void simplePotBlockWithItem(Block block, ModelFile model, ModelFile modelFilled) {
        potBlock(block, model, modelFilled);
        simpleBlockItem(block, model);
    }
    public void potBlock(Block block, ModelFile normalModel, ModelFile modelFilled) {
        getVariantBuilder(block)
                .partialState().with(PotBlock.FILLED, true).addModels(new ConfiguredModel(modelFilled))
                .partialState().with(PotBlock.FILLED, false).addModels(new ConfiguredModel(normalModel));
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
