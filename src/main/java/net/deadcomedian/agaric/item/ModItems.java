package net.deadcomedian.agaric.item;

import net.deadcomedian.agaric.Agaric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPORDER_IN_A_BUCKET = registerItem("sporder_in_a_bucket", new Item(new FabricItemSettings()));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.add(SPORDER_IN_A_BUCKET);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Agaric.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Agaric.LOGGER.info("Registering Mod Items for" + Agaric.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }


}
