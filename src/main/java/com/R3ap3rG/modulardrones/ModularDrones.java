package com.R3ap3rG.modulardrones;

import com.R3ap3rG.modulardrones.block.DevBlock;
import com.R3ap3rG.modulardrones.client.model.ModelDroneBase;
import com.R3ap3rG.modulardrones.client.renderer.entity.RenderDroneBase;
import com.R3ap3rG.modulardrones.entity.EntityDroneBase;
import com.R3ap3rG.modulardrones.handler.ConfigHandler;
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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModularDrones {

    @Mod.Instance("ModularDrones")
    public static ModularDrones instance;

    public static Block devBlock;

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

        devBlock = new DevBlock(Material.glass);
        GameRegistry.registerBlock(new DevBlock(Material.glass),"devBlock");

        LogHelper.info("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("PostInitialisation Complete!");
    }
}
