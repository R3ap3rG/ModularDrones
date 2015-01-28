package com.R3ap3rG.modulardrones.handler;


import com.R3ap3rG.modulardrones.block.*;
import com.R3ap3rG.modulardrones.reference.Reference;
import com.R3ap3rG.modulardrones.util.CreativeTabMD;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

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
        return this == BlockMD.crystalOre ? ItemMD.crystal : (this == BlockMD.osmiumNetherOre ? ItemMD.dustOsmium : Item.getItemFromBlock(this));
    }

    public int quantityDropped(Random random){
        return this == BlockMD.crystalOre ? random.nextInt(4) : (this == BlockMD.osmiumNetherOre ? random.nextInt(5): 1);
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


    public static final BlockMD crystalBlock = new BlockCrystal();
    public static final BlockMD copperBlock = new BlockCopper();
    public static final BlockMD tinBlock = new BlockTin();

    public static final BlockMD crystalOre = new OreCrystal();
    public static final BlockMD copperOre = new OreCopper();
    public static final BlockMD tinOre = new OreTin();

    public static final BlockMD tinNetherOre = new OreNetherTin();
    public static final BlockMD copperNetherOre = new OreNetherCopper();
    public static final BlockMD ironNetherOre = new OreNetherIron();
    public static final BlockMD goldNetherOre = new OreNetherGold();
    public static final BlockMD coalNetherOre = new OreNetherCoal();
    public static final BlockMD diamondNetherOre = new OreNetherDiamond();
    public static final BlockMD crystalNetherOre = new OreNetherCrystal();
    public static final BlockMD emeraldNetherOre = new OreNetherEmerald();
    public static final BlockMD lapisNetherOre = new OreNetherLapis();
    public static final BlockMD redstoneNetherOre = new OreNetherRedstone();
    public static final BlockMD osmiumNetherOre = new OreNetherOsmium();
    public static final BlockMD devBlock = new DevBlock();

    public static void init()
    {

        GameRegistry.registerBlock(devBlock, "devBlock");

        GameRegistry.registerBlock(crystalBlock, "crystalBlock");
        GameRegistry.registerBlock(copperBlock, "copperBlock");
        GameRegistry.registerBlock(tinBlock, "tinBlock");

        GameRegistry.registerBlock(crystalOre, "crystalOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(tinOre, "tinOre");

        GameRegistry.registerBlock(tinNetherOre, "tinNetherOre");
        GameRegistry.registerBlock(copperNetherOre, "copperNetherOre");
        GameRegistry.registerBlock(coalNetherOre, "coalNetherOre");
        GameRegistry.registerBlock(ironNetherOre, "ironNetherOre");
        GameRegistry.registerBlock(goldNetherOre, "goldNetherOre");
        GameRegistry.registerBlock(diamondNetherOre, "diamondNetherOre");
        GameRegistry.registerBlock(crystalNetherOre, "crystalNetherOre");
        GameRegistry.registerBlock(emeraldNetherOre, "emeraldNetherOre");
        GameRegistry.registerBlock(lapisNetherOre, "lapisNetherOre");
        GameRegistry.registerBlock(redstoneNetherOre, "redstoneNetherOre");
        GameRegistry.registerBlock(osmiumNetherOre, "osmiumNetherOre");


        OreDictionary.registerOre("blockCopper", copperBlock);
        OreDictionary.registerOre("blockTin", tinBlock);

        OreDictionary.registerOre("oreCopper", copperOre);
        OreDictionary.registerOre("oreTin", tinOre);

        OreDictionary.registerOre("oreNetherTin", tinNetherOre);
        OreDictionary.registerOre("oreNetherCopper", copperNetherOre);
        OreDictionary.registerOre("oreNetherCoal", coalNetherOre);
        OreDictionary.registerOre("oreNetherIron", ironNetherOre);
        OreDictionary.registerOre("oreNetherGold", goldNetherOre);
        OreDictionary.registerOre("oreNetherDiamond", diamondNetherOre);
        OreDictionary.registerOre("oreNetherEmerald", emeraldNetherOre);
        OreDictionary.registerOre("oreNetherLapis", lapisNetherOre);
        OreDictionary.registerOre("oreNetherRedstone", redstoneNetherOre);
        OreDictionary.registerOre("oreNetherOsmium", osmiumNetherOre);
    }
}
