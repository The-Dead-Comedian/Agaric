package net.deadcomedian.agaric.item;

import net.deadcomedian.agaric.Agaric;
import net.deadcomedian.agaric.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPORDER_BUCKET= registerItem("sporder_bucket",  new NoFluidBucket(ModEntities.SPORDER,  SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1))) ;


    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.add(SPORDER_BUCKET);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Agaric.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Agaric.LOGGER.info("Registering Mod Items for" + Agaric.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }


}
