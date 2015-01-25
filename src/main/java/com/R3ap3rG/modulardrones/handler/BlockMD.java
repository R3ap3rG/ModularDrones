package com.R3ap3rG.modulardrones.handler;


import com.R3ap3rG.modulardrones.block.ModBlocks;
import com.R3ap3rG.modulardrones.item.ModItems;
import com.R3ap3rG.modulardrones.reference.Reference;
import com.R3ap3rG.modulardrones.util.CreativeTabMD;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMD extends Block
{
    public BlockMD(Material material){
        super(material);
        this.setHardness(4F);
        this.setCreativeTab(CreativeTabMD.MD_TAB);
    }

    public BlockMD(){
        this(Material.rock);
    }

    public Item getItemDropped(int i, Random random, int x) {
        return this == ModBlocks.crystalOre ? ModItems.crystal : (this == ModBlocks.osmiumNetherOre ? ModItems.dustOsmium : Item.getItemFromBlock(this));
    }

    public int quantityDropped(Random random){
        return this == ModBlocks.crystalOre ? random.nextInt(4) : (this == ModBlocks.osmiumNetherOre ? random.nextInt(5): 1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
