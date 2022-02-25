package com.tr_torch.plants_and_scapes.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PLANTS_AND_SCAPES_TAB = new CreativeModeTab("plants_and_scapes_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LIGHT_MEDICINE.get());
        }
    };
}
