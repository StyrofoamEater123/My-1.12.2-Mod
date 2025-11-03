package com.marbles.paracraft.util.handlers;

import com.marbles.paracraft.init.ParaBlocksInit;
import com.marbles.paracraft.init.ParaItemsInit;
import com.marbles.paracraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ParaItemsInit.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(ParaBlocksInit.BLOCKS.toArray(new Block[0]));
    }


    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ParaItemsInit.ITEMS){ //Loops through every Paracraft item
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : ParaBlocksInit.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }
    }
}
