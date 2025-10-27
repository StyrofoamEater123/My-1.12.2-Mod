package com.marbles.paracraft.init;

import com.marbles.paracraft.gui.creativetabs.ParacraftItemsTab;
import com.marbles.paracraft.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ParaItems { //This is the class for registering items!
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item STEEL_INGOT = new ItemBase("steel_ingot", ParacraftItemsTab.INSTANCE);
    public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot", ParacraftItemsTab.INSTANCE);
    public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot", ParacraftItemsTab.INSTANCE);
    public static final Item METEORITE_INGOT = new ItemBase("meteorite_ingot", ParacraftItemsTab.INSTANCE);
    public static final Item LIVING_INGOT = new ItemBase("living_ingot", ParacraftItemsTab.INSTANCE);


}
