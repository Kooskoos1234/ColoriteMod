package com.kooskoos1234.ColoriteMod.Items.Armor;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HermesCap extends ItemArmor implements IHasModel 
{

	public HermesCap(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
