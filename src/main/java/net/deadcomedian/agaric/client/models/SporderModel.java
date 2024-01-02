package net.deadcomedian.agaric.client.models;

import net.deadcomedian.agaric.Agaric;
import net.deadcomedian.agaric.entity.animation.ModAnimations;
import net.deadcomedian.agaric.entity.custom.SporderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SporderModel extends GeoModel<SporderEntity> {

	@Override
	public Identifier getModelResource(SporderEntity animatable) {
		return new Identifier(Agaric.MOD_ID, "geo/spordermodel.geo.json");
	}

	@Override
	public Identifier getTextureResource(SporderEntity animatable) {
		return new Identifier(Agaric.MOD_ID, "textures/entity/sporder.png");
	}

	@Override
	public Identifier getAnimationResource(SporderEntity animatable) {
		return new Identifier(Agaric.MOD_ID, "animations/sporderanimations.geo.json");
	}
}