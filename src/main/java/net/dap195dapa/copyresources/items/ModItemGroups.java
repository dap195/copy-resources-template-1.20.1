package net.dap195dapa.copyresources.items;

import net.dap195dapa.copyresources.CopyResources;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup COPY_RESOURCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CopyResources.MOD_ID, "copy_item"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.copy_item"))
                    .icon(() -> new ItemStack(ModItems.COPY_ITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COPY_ITEM);
                    }).build());

    public static void registerItemGroups(){
        CopyResources.LOGGER.info("Registering Item Groups for " + CopyResources.MOD_ID);
    }
}
