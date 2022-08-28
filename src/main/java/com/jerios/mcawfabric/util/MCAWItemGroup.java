package com.jerios.mcawfabric.util;

import com.jerios.mcawfabric.MainMod;
import com.jerios.mcawfabric.register.RegistryItem;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MCAWItemGroup {


    public static final ItemGroup MONEY = FabricItemGroupBuilder.build(new Identifier(MainMod.MOD_ID, "money"),
            () -> new ItemStack(RegistryItem.MONEY));

    public static final ItemGroup RAM16K = FabricItemGroupBuilder.build(new Identifier(MainMod.MOD_ID, "money"),
            () -> new ItemStack(RegistryItem.RAM16K));
}
