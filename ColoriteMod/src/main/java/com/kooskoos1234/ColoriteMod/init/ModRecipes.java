package com.kooskoos1234.ColoriteMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init( ) 
	{
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY), 10.0F);
		GameRegistry.addSmelting(ModBlocks.AMBER_ORE, new ItemStack(ModItems.AMBER), 20.0F);
		GameRegistry.addSmelting(ModBlocks.TOPAZ_ORE, new ItemStack(ModItems.TOPAZ), 30.0F);
		GameRegistry.addSmelting(ModBlocks.MALACHITE_ORE, new ItemStack(ModItems.MALACHITE), 40.0F);
		GameRegistry.addSmelting(ModBlocks.KYANITE_ORE, new ItemStack(ModItems.KYANITE), 50.0F);
		GameRegistry.addSmelting(ModBlocks.AQUAMARINE_ORE, new ItemStack(ModItems.AQUAMARINE), 60.0F);
		GameRegistry.addSmelting(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE), 70.0F);
		GameRegistry.addSmelting(ModBlocks.AMETHYST_ORE, new ItemStack(ModItems.AMETHYST), 80.0F);
		GameRegistry.addSmelting(ModBlocks.COLORITE_ORE, new ItemStack(ModItems.COLORITE), 1000.0F);
		GameRegistry.addSmelting(Items.CAKE, new ItemStack(ModItems.CHOCOLATE_CAKE, 1), 5.0F);
	}
}
