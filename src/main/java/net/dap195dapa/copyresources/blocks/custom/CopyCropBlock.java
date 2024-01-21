package net.dap195dapa.copyresources.blocks.custom;

import net.dap195dapa.copyresources.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;


public class CopyCropBlock extends CropBlock {
    public static final int MAX_AGE = 15;
    public static final IntProperty AGE = Properties.AGE_15;


    public CopyCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem(){
        return ModItems.COPY_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty(){
        return AGE;
    }

    @Override
    public int getMaxAge(){
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(AGE);
    }
}
