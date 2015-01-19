package com.R3ap3rG.modulardrones.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDroneBase extends ModelBase
{
  //fields
    ModelRenderer HeadBase;
    ModelRenderer HeadRamp;
    ModelRenderer LightBase;
    ModelRenderer LightLeft;
    ModelRenderer LightRight;
    ModelRenderer CntrStrutVert;
    ModelRenderer CntrStrutHrzn;
    ModelRenderer BodyVert;
    ModelRenderer BodyHrzn;
    ModelRenderer Fin;
  
  public ModelDroneBase()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      HeadBase = new ModelRenderer(this, 0, 10);
      HeadBase.addBox(0F, 0F, 0F, 3, 1, 5);
      HeadBase.setRotationPoint(-2F, 8F, -7F);
      HeadBase.setTextureSize(64, 32);
      HeadBase.mirror = true;
      setRotation(HeadBase, 0F, 0F, 0F);
      HeadRamp = new ModelRenderer(this, 0, 5);
      HeadRamp.addBox(0F, 0F, -3F, 3, 1, 4);
      HeadRamp.setRotationPoint(-2F, 7.266667F, -3F);
      HeadRamp.setTextureSize(64, 32);
      HeadRamp.mirror = true;
      setRotation(HeadRamp, 0.2617994F, 0F, 0F);
      LightBase = new ModelRenderer(this, 0, 22);
      LightBase.addBox(0F, 0F, 0F, 4, 1, 5);
      LightBase.setRotationPoint(-2.5F, 9F, -7F);
      LightBase.setTextureSize(64, 32);
      LightBase.mirror = true;
      setRotation(LightBase, 0F, 0F, 0F);
      LightLeft = new ModelRenderer(this, 16, 3);
      LightLeft.addBox(0F, 0F, 0F, 1, 1, 1);
      LightLeft.setRotationPoint(0F, 9.2F, -7.5F);
      LightLeft.setTextureSize(64, 32);
      LightLeft.mirror = true;
      setRotation(LightLeft, 0F, 0F, -0.7853982F);
      LightRight = new ModelRenderer(this, 16, 3);
      LightRight.addBox(0F, 0F, 0F, 1, 1, 1);
      LightRight.setRotationPoint(-1.5F, 8.5F, -7.466667F);
      LightRight.setTextureSize(64, 32);
      LightRight.mirror = true;
      setRotation(LightRight, 0F, 0F, 0.7853982F);
      CntrStrutVert = new ModelRenderer(this, 1, 1);
      CntrStrutVert.addBox(0F, 0F, 0F, 3, 1, 3);
      CntrStrutVert.setRotationPoint(-1F, 11F, 4F);
      CntrStrutVert.setTextureSize(64, 32);
      CntrStrutVert.mirror = true;
      setRotation(CntrStrutVert, 1.570796F, 1.570796F, 0F);
      CntrStrutHrzn = new ModelRenderer(this, 1, 1);
      CntrStrutHrzn.addBox(0F, 0F, 0F, 3, 1, 3);
      CntrStrutHrzn.setRotationPoint(-2F, 9F, 1F);
      CntrStrutHrzn.setTextureSize(64, 32);
      CntrStrutHrzn.mirror = true;
      setRotation(CntrStrutHrzn, 0F, 0F, 0F);
      BodyVert = new ModelRenderer(this, 20, 6);
      BodyVert.addBox(0F, 0F, 0F, 3, 5, 3);
      BodyVert.setRotationPoint(-2F, 7F, -2F);
      BodyVert.setTextureSize(64, 32);
      BodyVert.mirror = true;
      setRotation(BodyVert, 0F, 0F, 0F);
      BodyHrzn = new ModelRenderer(this, 23, 0);
      BodyHrzn.addBox(0F, 0F, 0F, 5, 3, 3);
      BodyHrzn.setRotationPoint(-3F, 8F, -2F);
      BodyHrzn.setTextureSize(64, 32);
      BodyHrzn.mirror = true;
      setRotation(BodyHrzn, 0F, 0F, 0F);
      Fin = new ModelRenderer(this, 13, 0);
      Fin.addBox(0F, 0F, 0F, 1, 5, 4);
      Fin.setRotationPoint(-1F, 7F, 3F);
      Fin.setTextureSize(64, 32);
      Fin.mirror = true;
      setRotation(Fin, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    HeadBase.render(f5);
    HeadRamp.render(f5);
    LightBase.render(f5);
    LightLeft.render(f5);
    LightRight.render(f5);
    CntrStrutVert.render(f5);
    CntrStrutHrzn.render(f5);
    BodyVert.render(f5);
    BodyHrzn.render(f5);
    Fin.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
