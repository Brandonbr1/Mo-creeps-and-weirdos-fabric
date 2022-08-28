package com.jerios.mcawfabric;

import com.jerios.mcawfabric.register.RegistryItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "mcawfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger("mcaw_fabric");

	@Override
	public void onInitialize() {

		RegistryItem.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
