package net.deadcomedian.agaric.entity;

import net.deadcomedian.agaric.Agaric;
import net.deadcomedian.agaric.entity.custom.SporderEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlimeBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class ModEntities {
    public static final EntityType<SporderEntity> SPORDER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Agaric.MOD_ID, "sporder"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SporderEntity::new)
                    .dimensions(EntityDimensions.changing(1.25f, 1.3f)).build());




    //bounciness
    public void onLandedUpon(World world, BlockPos pos, net.minecraft.entity.Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance, 1.0f, entity.getDamageSources().fall());
    }

    /**
     * Called after the entity lands on the block.
     *
     * <p>Default implementation resets the entity's vertical velocity. Blocks that cause
     * entities to jump (such as {@link SlimeBlock}) should override this.
     *
     * <p>This method is called on both the logical client and logical server, so take caution
     * when overriding this method. The logical side can be checked using {@link
     * World#isClient}.
     */
    public void onEntityLand(BlockView world, Entity entity) {
        entity.setVelocity(entity.getVelocity().multiply(1.0, 0.0, 1.0));
    }
}
