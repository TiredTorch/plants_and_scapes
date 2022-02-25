package com.tr_torch.plants_and_scapes.block;

import com.tr_torch.plants_and_scapes.Plants_and_Scapes_Main;
import com.tr_torch.plants_and_scapes.item.ModCreativeModeTab;
import com.tr_torch.plants_and_scapes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Plants_and_Scapes_Main.MOD_ID);

    ///BLOCKS///
    public static final RegistryObject<Block> HERB_BLOCK = registerBlock("herb_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT)
                    .strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.PLANTS_AND_SCAPES_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
