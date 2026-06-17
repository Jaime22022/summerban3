package net.jangper.summerban3;

import net.fabricmc.api.ModInitializer;

import net.jangper.summerban3.creativemodtab.ModCreativeModeTabs;
import net.jangper.summerban3.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SummerBan3 implements ModInitializer {
	public static final String MOD_ID = "summerban3";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
	}
}