package com.R3ap3rG.modulardrones.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityDroneBase extends EntityTameable {
    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return null;
    }
    //todo
    public EntityDroneBase(World world)
    {
        super(world);
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAIWander(this,1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.setSize(0.6F, 1.8F);
    }


    public boolean allowLeashing()
    {
        return false;
    }
    //todo
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(29, (byte) 0);
        this.getDataWatcher().addObject(30, (byte) 0);
        this.getDataWatcher().addObject(31, (byte) 0);
    }

    //todo
    public boolean interact(EntityPlayer player)
    {
        return true;
    }

    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
}
