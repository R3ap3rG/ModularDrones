package com.R3ap3rG.modulardrones.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(BlockMD.crystalBlock), "sss", "sss", "sss", 's', new ItemStack(ItemMD.crystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockMD.copperBlock, true, new Object[]{"sss", "sss", "sss", 's', ItemMD.ingotCopper}));
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockMD.tinBlock, true, new Object[]{"sss", "sss", "sss", 's', ItemMD.ingotTin}));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemMD.crystal, 9), new ItemStack(BlockMD.crystalBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemMD.ingotCopper, 9), new ItemStack(BlockMD.copperBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemMD.ingotTin, 9), new ItemStack(BlockMD.tinBlock));

        GameRegistry.addRecipe(new ItemStack(ItemMD.plateIron, 2), " s ", "sss", " s ", 's', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(ItemMD.plateCopper, 2), " s ", "sss", " s ", 's', ItemMD.ingotCopper);
        GameRegistry.addRecipe(new ItemStack(ItemMD.plateTin, 2), " s ", "sss", " s ", 's', ItemMD.ingotTin);


        GameRegistry.addSmelting(BlockMD.copperOre, new ItemStack(ItemMD.ingotCopper), 5);
        GameRegistry.addSmelting(BlockMD.tinOre, new ItemStack(ItemMD.ingotTin), 5);

        //Nether Ore Smelts
        GameRegistry.addSmelting(BlockMD.coalNetherOre, new ItemStack(Blocks.coal_ore), 5);
        GameRegistry.addSmelting(BlockMD.ironNetherOre, new ItemStack(Blocks.iron_ore), 5);
        GameRegistry.addSmelting(BlockMD.copperNetherOre, new ItemStack(BlockMD.copperOre), 5);
        GameRegistry.addSmelting(BlockMD.tinNetherOre, new ItemStack(BlockMD.tinOre), 5);
        GameRegistry.addSmelting(BlockMD.crystalNetherOre, new ItemStack(BlockMD.crystalOre), 5);
        GameRegistry.addSmelting(BlockMD.goldNetherOre, new ItemStack(Blocks.gold_ore), 5);
        GameRegistry.addSmelting(BlockMD.diamondNetherOre, new ItemStack(Blocks.diamond_ore), 5);
        GameRegistry.addSmelting(BlockMD.emeraldNetherOre, new ItemStack(Blocks.emerald_ore), 5);
        GameRegistry.addSmelting(BlockMD.lapisNetherOre, new ItemStack(Blocks.lapis_ore), 5);
        GameRegistry.addSmelting(BlockMD.redstoneNetherOre, new ItemStack(Blocks.redstone_ore), 5);
    }
}
