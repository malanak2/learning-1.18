package net.malanak.modlearn;

import net.fabricmc.api.ModInitializer;
import net.malanak.modlearn.block.ModBlocks;
import net.malanak.modlearn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnMod implements ModInitializer {
	public static final String MOD_ID = "modlearn";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
