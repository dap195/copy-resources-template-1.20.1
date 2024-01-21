package net.dap195dapa.copyresources.blocks;

import net.dap195dapa.copyresources.CopyResources;
import net.dap195dapa.copyresources.blocks.custom.CopyCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COPY_BLOCK = registerBlock("copy_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    //public static final Block COPY_CROP = Registry.register(Registries.BLOCK, new Identifier(CopyResources.MOD_ID, "copy_crop"),
    //        new CopyCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block COPY_CROP = Registry.register(Registries.BLOCK, new Identifier(CopyResources.MOD_ID, "copy_crop"),
            new CopyCropBlock(FabricBlockSettings.create().mapColor(MapColor.BLUE).noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CopyResources.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(CopyResources.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlock(){
        CopyResources.LOGGER.info("Registering Mod Blocks for " + CopyResources.MOD_ID);
    }
}
