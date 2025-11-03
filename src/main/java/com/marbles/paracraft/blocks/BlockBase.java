package com.marbles.paracraft.blocks;
import com.marbles.paracraft.Paracraft;
import com.marbles.paracraft.init.ParaBlocksInit;
import com.marbles.paracraft.init.ParaItemsInit;
import com.marbles.paracraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ParaBlocksInit.BLOCKS.add(this);
        ParaItemsInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Paracraft.proxy.registerItemRenderer(ItemBlock.getItemFromBlock(this),0,"inventory");
    }
}
