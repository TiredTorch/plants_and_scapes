package com.tr_torch.plants_and_scapes.item;

import com.tr_torch.plants_and_scapes.Plants_and_Scapes_Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Plants_and_Scapes_Main.MOD_ID);

    public static final RegistryObject<Item> LIGHT_MEDICINE = ITEMS.register("light_medicine",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.PLANTS_AND_SCAPES_TAB)));

    public static final RegistryObject<Item> MEDIUM_MEDICINE = ITEMS.register("medium_medicine",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.PLANTS_AND_SCAPES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
