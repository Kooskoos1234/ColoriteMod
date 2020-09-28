package com.kooskoos1234.ColoriteMod.Tabs;

import com.kooskoos1234.ColoriteMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModdedResourcesTab extends CreativeTabs
{
	public ModdedResourcesTab(String label) 
	{
		super("modded_resources_tab");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.COLORITE);
	}
}
