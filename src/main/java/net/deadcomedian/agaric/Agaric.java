package net.deadcomedian.agaric;

import net.deadcomedian.agaric.entity.ModEntities;
import net.deadcomedian.agaric.entity.custom.SporderEntity;
import net.deadcomedian.agaric.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Agaric implements ModInitializer {
	public static final String MOD_ID = "agaric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		FabricDefaultAttributeRegistry.register(ModEntities.SPORDER, SporderEntity.createSporderAttributes());
	}
}