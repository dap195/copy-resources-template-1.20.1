package net.dap195dapa.copyresources.items;

import net.dap195dapa.copyresources.CopyResources;
import net.dap195dapa.copyresources.blocks.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPY_ITEM = registerItem("copy_item", new Item(new FabricItemSettings()));
    public static final Item COPY_FOOD = registerItem("copy_food", new Item(new FabricItemSettings().food(ModFoodComponents.COPY_FOOD)));
    public static final Item COPY_SEEDS = registerItem("copy_seeds",
            new AliasedBlockItem(ModBlocks.COPY_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CopyResources.MOD_ID, name), item);
    }
    public static void registerModItem(){
        CopyResources.LOGGER.info("Registering Mod Items for " + CopyResources.MOD_ID);
    }
}
