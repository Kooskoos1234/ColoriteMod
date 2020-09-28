package com.kooskoos1234.ColoriteMod.Items.Tools;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.Entities.ColoriteArrow.EntityColoriteArrow;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ColoriteArrow extends ItemArrow implements IHasModel
{
	public ColoriteArrow(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setMaxStackSize(64);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) 
	{
		EntityColoriteArrow entityColoriteArrow = new EntityColoriteArrow(worldIn, shooter);
		return entityColoriteArrow;
	}
	
	@Override
	public void registerModels() 
	{ 
		Main.proxy.registerItemRenderer(ModItems.COLORITE_ARROW, 0, "inventory");
	}
}
