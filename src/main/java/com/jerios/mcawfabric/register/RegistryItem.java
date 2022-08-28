package com.jerios.mcawfabric.register;

import com.jerios.mcawfabric.MainMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryItem {

    public static final Item RAM16K = registerItem("ram16k",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MONEY = registerItem("money",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MainMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MainMod.LOGGER.info("Regestered all items");
    }


}
