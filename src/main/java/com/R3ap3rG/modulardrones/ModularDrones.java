package com.R3ap3rG.modulardrones;

import com.R3ap3rG.modulardrones.handler.ConfigHandler;
import com.R3ap3rG.modulardrones.reference.Reference;
import com.R3ap3rG.modulardrones.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModularDrones {

    @Mod.Instance("ModularDrones")
    public static ModularDrones instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        LogHelper.info("PreInitialisation Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        LogHelper.info("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("PostInitialisation Complete!");
    }
}
