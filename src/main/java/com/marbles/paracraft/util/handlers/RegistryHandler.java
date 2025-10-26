package com.marbles.paracraft.util.handlers;

import com.marbles.paracraft.init.ParaItems;
import com.marbles.paracraft.util.ItemModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ParaItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ParaItems.ITEMS){ //Loops through every Paracraft item
            if(item instanceof ItemModel){
                ((ItemModel)item).registerModels();
            }
        }
    }
}
