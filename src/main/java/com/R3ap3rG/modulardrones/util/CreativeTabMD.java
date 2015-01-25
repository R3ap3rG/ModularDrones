package com.R3ap3rG.modulardrones.util;

import com.R3ap3rG.modulardrones.item.ModItems;
import com.R3ap3rG.modulardrones.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMD {
    public static final CreativeTabs MD_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.crystal;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Modular Drones";
        }
    };
}
