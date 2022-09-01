package net.titus.winecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.titus.winecraft.WineCraft;

public class ModItems {

//This is the bit where you can add a new item. My first item is chardonnay grapes.
public static final Item CHARDONNAY_GRAPES = registerItem("chardonnay_grapes",
        new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        //This puts the grape into 'decorations' for some reason
    //Just duplicate this to add a new item, change the name, go to en_us.json and make a new json


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WineCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        WineCraft.LOGGER.debug("Registering Mod Items for" + WineCraft.MOD_ID);
    }


}
