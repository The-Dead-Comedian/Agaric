package net.deadcomedian.agaric.client.models;

import net.deadcomedian.agaric.entity.animation.ModAnimations;
import net.deadcomedian.agaric.entity.custom.SporderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SporderModel<T extends SporderEntity> extends SinglePartEntityModel<T> {
	private final ModelPart funnymoney;

	public SporderModel(ModelPart root) {
		this.funnymoney = root.getChild("funnymoney");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData funnymoney = modelPartData.addChild("funnymoney", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.75F, 0.0F));

		ModelPartData body = funnymoney.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0F, -8.75F, -10.0F, 20.0F, 9.0F, 20.0F, new Dilation(0.0F))
		.uv(0, 29).cuboid(-7.0F, 0.25F, -7.0F, 14.0F, 8.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData fang = body.addChild("fang", ModelPartBuilder.create().uv(42, 29).cuboid(-1.5F, -0.75F, -3.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 35).cuboid(0.0F, 3.25F, -3.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.5F, 6.0F, -7.0F));

		ModelPartData fang2 = body.addChild("fang2", ModelPartBuilder.create().uv(0, 35).cuboid(0.0F, 3.25F, -3.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(42, 29).mirrored().cuboid(-1.5F, -0.75F, -3.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(3.5F, 6.0F, -7.0F));

		ModelPartData right_front_leg = body.addChild("right_front_leg", ModelPartBuilder.create().uv(8, 16).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 7.75F, -5.5F));

		ModelPartData cube_r1 = right_front_leg.addChild("cube_r1", ModelPartBuilder.create().uv(0, 29).cuboid(-1.0F, -6.75F, -1.5F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.5F, 0.0F, 0.0F, -0.7854F));

		ModelPartData bone = right_front_leg.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-1.9138F, -2.2306F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-5.0F, -3.5F, 0.5F));

		ModelPartData left_front_leg = body.addChild("left_front_leg", ModelPartBuilder.create().uv(8, 16).mirrored().cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(7.0F, 7.75F, -5.5F));

		ModelPartData cube_r2 = left_front_leg.addChild("cube_r2", ModelPartBuilder.create().uv(0, 29).mirrored().cuboid(-2.0F, -6.75F, -1.5F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone2 = left_front_leg.addChild("bone2", ModelPartBuilder.create().uv(0, 0).mirrored().cuboid(-2.0862F, -2.2306F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.pivot(5.0F, -3.5F, 0.5F));

		ModelPartData left_front_leg2 = body.addChild("left_front_leg2", ModelPartBuilder.create().uv(8, 16).mirrored().cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(7.0F, 7.75F, 4.5F));

		ModelPartData cube_r3 = left_front_leg2.addChild("cube_r3", ModelPartBuilder.create().uv(0, 29).mirrored().cuboid(-2.0F, -6.75F, -1.5F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone3 = left_front_leg2.addChild("bone3", ModelPartBuilder.create().uv(0, 0).mirrored().cuboid(-2.0862F, -2.2306F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.pivot(5.0F, -3.5F, 0.5F));

		ModelPartData right_front_leg2 = body.addChild("right_front_leg2", ModelPartBuilder.create().uv(8, 16).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 7.75F, 4.5F));

		ModelPartData cube_r4 = right_front_leg2.addChild("cube_r4", ModelPartBuilder.create().uv(0, 29).cuboid(-1.0F, -6.75F, -1.5F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.5F, 0.0F, 0.0F, -0.7854F));

		ModelPartData bone4 = right_front_leg2.addChild("bone4", ModelPartBuilder.create().uv(0, 0).cuboid(-1.9138F, -2.2306F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-5.0F, -3.5F, 0.5F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		funnymoney.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return funnymoney;
	}


	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);


		this.animateMovement(ModAnimations.WALK, limbAngle, limbDistance, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, animationProgress, 1f);
		this.updateAnimation(entity.sittingAnimationState, ModAnimations.SIT, animationProgress, 1f);

	}
}