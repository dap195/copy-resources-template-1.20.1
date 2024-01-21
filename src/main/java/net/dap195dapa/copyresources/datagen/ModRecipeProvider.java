package net.dap195dapa.copyresources.datagen;

import net.dap195dapa.copyresources.blocks.ModBlocks;
import net.dap195dapa.copyresources.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private List<ItemConvertible> COPY_FOOD_SMELTABLE = List.of(ModItems.COPY_ITEM);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, COPY_FOOD_SMELTABLE, RecipeCategory.MISC, ModItems.COPY_FOOD,
                20f, 200, "copy_food");
        offerBlasting(exporter, COPY_FOOD_SMELTABLE, RecipeCategory.MISC, ModItems.COPY_FOOD,
                20f, 100, "copy_food");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COPY_ITEM, RecipeCategory.DECORATIONS,
                ModBlocks.COPY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COPY_BLOCK, 1)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.COPY_ITEM)
                .criterion(hasItem(ModItems.COPY_ITEM), conditionsFromItem(ModItems.COPY_ITEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COPY_BLOCK)));
    }
}
