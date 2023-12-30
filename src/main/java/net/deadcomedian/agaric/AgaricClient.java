package net.deadcomedian.agaric;

import net.deadcomedian.agaric.client.ModModelLayers;
import net.deadcomedian.agaric.client.models.SporderModel;
import net.deadcomedian.agaric.client.renderer.SporderRenderer;
import net.deadcomedian.agaric.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AgaricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.SPORDER, SporderRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SPORDER, SporderModel::getTexturedModelData);
    }
}
