package net.dap195dapa.copyresources.datagen;

import net.dap195dapa.copyresources.blocks.ModBlocks;
import net.dap195dapa.copyresources.blocks.custom.CopyCropBlock;
import net.dap195dapa.copyresources.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPY_BLOCK);

        blockStateModelGenerator
                .registerCrop(ModBlocks.COPY_CROP, CopyCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COPY_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPY_FOOD, Models.GENERATED);
    }
}
