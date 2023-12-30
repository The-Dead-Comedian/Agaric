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

public class SporderRenderer extends MobEntityRenderer<SporderEntity, SporderModel<SporderEntity>> {
    private static final Identifier TEXTURE = new Identifier(Agaric.MOD_ID, "textures/entity/sporder.png");

    public SporderRenderer(EntityRendererFactory.Context context) {
        super(context, new SporderModel<>(context.getPart(ModModelLayers.SPORDER)), 0.6f);
    }

    @Override
    public Identifier getTexture(SporderEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SporderEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}