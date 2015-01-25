package com.R3ap3rG.modulardrones.item;

import com.R3ap3rG.modulardrones.handler.ItemMD;
import com.R3ap3rG.modulardrones.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

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
