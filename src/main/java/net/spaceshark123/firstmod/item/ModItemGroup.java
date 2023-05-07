package net.spaceshark123.firstmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spaceshark123.firstmod.FirstMod;

public class ModItemGroup {
    public static final ItemGroup CUSTOM_ITEMS = FabricItemGroup.builder(new Identifier(FirstMod.MOD_ID, "custom_items"))
            .icon(() -> new ItemStack(ModItems.RAW_TANZANITE))
            .build();
}
