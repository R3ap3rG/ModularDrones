package com.R3ap3rG.modulardrones;

import com.R3ap3rG.modulardrones.block.ModBlocks;
import com.R3ap3rG.modulardrones.client.model.ModelDroneBase;
import com.R3ap3rG.modulardrones.client.renderer.entity.RenderDroneBase;
import com.R3ap3rG.modulardrones.entity.EntityDroneBase;
import com.R3ap3rG.modulardrones.handler.ConfigHandler;
import com.R3ap3rG.modulardrones.handler.Recipes;
import com.R3ap3rG.modulardrones.handler.WorldGenMDOres;
import com.R3ap3rG.modulardrones.item.ModItems;
import com.R3ap3rG.modulardrones.reference.Reference;
import com.R3ap3rG.modulardrones.util.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModularDrones {

    @Mod.Instance("ModularDrones")
    public static ModularDrones instance;

    WorldGenMDOres eventOreWorldGen = new WorldGenMDOres();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        LogHelper.info("PreInitialisation Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        RenderingRegistry.registerEntityRenderingHandler(EntityDroneBase.class, new RenderDroneBase(new ModelDroneBase(),0.3F));
        EntityRegistry.registerGlobalEntityID(EntityDroneBase.class, "DroneBase", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);

        ModItems.init();
        ModBlocks.init();
        Recipes.init();

        LogHelper.info("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        GameRegistry.registerWorldGenerator(eventOreWorldGen, 0);

        LogHelper.info("PostInitialisation Complete!");
    }
}
