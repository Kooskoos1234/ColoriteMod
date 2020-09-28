package com.kooskoos1234.ColoriteMod.Items.Tools;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ColoriteBow extends ItemBow implements IHasModel
{
	public ColoriteBow(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setMaxDamage(9999999);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	protected boolean isArrow(ItemStack stack) 
	{
		if(stack.getItem() == ModItems.COLORITE_ARROW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int getItemEnchantability() 
	{
		return 100;
	}
	
	@Override
	public void registerModels() 
	{ 
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
