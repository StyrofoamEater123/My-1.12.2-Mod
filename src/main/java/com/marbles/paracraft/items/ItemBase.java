package com.marbles.paracraft.items;

import com.marbles.paracraft.Paracraft;
import com.marbles.paracraft.init.ParaItemsInit;
import com.marbles.paracraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs creativeTab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativeTab);

        ParaItemsInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Paracraft.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
