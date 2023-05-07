package net.spaceshark123.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spaceshark123.firstmod.FirstMod;

public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new Item.Settings()), ModItemGroup.CUSTOM_ITEMS);


    public static void registerModItems() {
        FirstMod.LOGGER.debug("registering mod items for " + FirstMod.MOD_ID);
    }

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
}
