package com.marbles.paracraft.init;

import com.marbles.paracraft.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ParaBlocksInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
}
