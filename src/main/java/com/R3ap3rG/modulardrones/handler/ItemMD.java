package com.R3ap3rG.modulardrones.handler;

import com.R3ap3rG.modulardrones.item.*;
import com.R3ap3rG.modulardrones.reference.Reference;
import com.R3ap3rG.modulardrones.util.CreativeTabMD;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMD extends Item
{
    public ItemMD()
    {
        super();
        this.setCreativeTab(CreativeTabMD.MD_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static final ItemMD crystal = new ItemCrystal();
    public static final ItemMD ingotCopper = new ItemIngotCopper();
    public static final ItemMD ingotTin = new ItemIngotTin();
    public static final ItemMD dustOsmium = new ItemDustOsmium();
    public static final ItemMD shardOsmium = new ItemShardOsmium();

    public static final ItemMD plateIron = new ItemIronPlate();
    public static final ItemMD plateCopper = new ItemCopperPlate();
    public static final ItemMD plateTin = new ItemTinPlate();

    public static void init()
    {
        GameRegistry.registerItem(crystal, "crystal");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(dustOsmium, "dustOsmium");
        GameRegistry.registerItem(shardOsmium, "shardOsmium");
        GameRegistry.registerItem(plateIron, "itemPlateIron");
        GameRegistry.registerItem(plateCopper, "itemPlateCopper");
        GameRegistry.registerItem(plateTin, "itemPlateTin");

        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("itemPlateIron", plateIron);
        OreDictionary.registerOre("itemPlateCopper", plateCopper);
        OreDictionary.registerOre("itemPlateTin", plateTin);


    }
}
