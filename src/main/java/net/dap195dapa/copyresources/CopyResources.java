package net.dap195dapa.copyresources;

import net.dap195dapa.copyresources.blocks.ModBlocks;
import net.dap195dapa.copyresources.items.ModItemGroups;
import net.dap195dapa.copyresources.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopyResources implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "copy-resources";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlock();
	}
}