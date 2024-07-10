package com.wulliestudios;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WulliesReconsole implements ModInitializer {
	public static final String ModID = "wullies_reconsole";
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}