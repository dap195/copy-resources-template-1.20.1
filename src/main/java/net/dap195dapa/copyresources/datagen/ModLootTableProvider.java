package net.dap195dapa.copyresources.datagen;

import net.dap195dapa.copyresources.blocks.ModBlocks;
import net.dap195dapa.copyresources.blocks.custom.CopyCropBlock;
import net.dap195dapa.copyresources.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COPY_BLOCK);

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.COPY_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(CopyCropBlock.AGE, 15));
        addDrop(ModBlocks.COPY_CROP, cropDrops(ModBlocks.COPY_CROP, ModItems.COPY_ITEM, ModItems.COPY_SEEDS, builder));

    }

    @Override
    public BlockLootTableGenerator withConditions(ConditionJsonProvider... conditions) {
        return super.withConditions(conditions);
    }

    @Override
    public BiConsumer<Identifier, LootTable.Builder> withConditions(BiConsumer<Identifier, LootTable.Builder> exporter, ConditionJsonProvider... conditions) {
        return super.withConditions(exporter, conditions);
    }
}
