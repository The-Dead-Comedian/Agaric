package net.deadcomedian.agaric.client;

import net.deadcomedian.agaric.Agaric;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer SPORDER =
            new EntityModelLayer(new Identifier(Agaric.MOD_ID, "sporder"),"main");
}
