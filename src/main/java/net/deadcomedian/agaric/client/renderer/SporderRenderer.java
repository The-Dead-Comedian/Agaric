package net.deadcomedian.agaric.client.renderer;


import net.deadcomedian.agaric.Agaric;
import net.deadcomedian.agaric.client.ModModelLayers;
import net.deadcomedian.agaric.client.models.SporderModel;
import net.deadcomedian.agaric.entity.custom.SporderEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SporderRenderer extends GeoEntityRenderer<SporderEntity> {
    public SporderRenderer(EntityRendererFactory.Context renderManager ) {

        super(renderManager, new SporderModel());
    }
    @Override
    public Identifier getTextureLocation(SporderEntity animatable) {
        return new Identifier(Agaric.MOD_ID, "textures/entity/sporder.png");
    }
    @Override
    public void render(SporderEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}