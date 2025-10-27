package com.marbles.paracraft.gui.creativetabs;

import com.marbles.paracraft.init.ParaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ParacraftItemsTab extends CreativeTabs {
    public static final ParacraftItemsTab INSTANCE = new ParacraftItemsTab();
    private ParacraftItemsTab(){
        super("tab_paracraft_items");
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(ParaItems.STEEL_INGOT);
    }

}
