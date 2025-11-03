package com.marbles.paracraft;

import com.marbles.paracraft.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Paracraft.MODID, name = Paracraft.NAME, version = Paracraft.VERSION)
public class Paracraft
{



    public static final String MODID = "paracraft";
    public static final String NAME = "Paracraft Core";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "com.marbles.paracraft.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.marbles.paracraft.proxy.CommonProxy";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }

    @Mod.Instance
    public static Paracraft instance;

    @SidedProxy(clientSide = Paracraft.CLIENT_PROXY_CLASS, serverSide = Paracraft.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
}
