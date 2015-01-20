package com.R3ap3rG.modulardrones.client.renderer.entity;

import com.R3ap3rG.modulardrones.client.model.ModelDroneBase;
import com.R3ap3rG.modulardrones.entity.EntityDroneBase;
import com.R3ap3rG.modulardrones.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderDroneBase extends RenderLiving {

    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "models/DroneBase.png");

    public static ModelDroneBase modelEntity;

    public RenderDroneBase(ModelBase par1, float f1) {
        super (par1, f1);

        modelEntity = ((ModelDroneBase) mainModel);
    }

    public void renderDroneBase(EntityDroneBase entityL, double x, double y, double z, float u, float v){
        super.doRender(entityL, x,y,z,u,v);
    }

    public void doRenderLiving(EntityLiving entity,double x, double y, double z, float u, float v){
        renderDroneBase((EntityDroneBase)entity ,x,y,z,u,v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v){
        renderDroneBase((EntityDroneBase)entity ,x,y,z,u,v);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }

    protected void preRenderCallback(EntityLivingBase entity, float f1)
    {
        float scale = 1.2f;
        GL11.glScalef(scale, scale, scale);
    }
}
