package com.marbles.paracraft.items;

import com.marbles.paracraft.Paracraft;
import com.marbles.paracraft.init.ParaItems;
import com.marbles.paracraft.util.ItemModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModel {

    public ItemBase(String name, CreativeTabs creativeTab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativeTab);

        ParaItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Paracraft.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
