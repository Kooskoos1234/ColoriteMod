package com.kooskoos1234.ColoriteMod.Enchantments;

import com.kooskoos1234.ColoriteMod.init.ModEnchants;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class FlightEnchant extends Enchantment 
{

	public FlightEnchant(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) 
	{
		super(rarityIn, typeIn, slots);
		this.setName("enchant_flight");
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":enchant_flight"));
		
		ModEnchants.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) 
	{
		return enchantmentLevel * 30;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) 
	{
		return this.getMinEnchantability(enchantmentLevel) + 1000;
	}
	
	@Override
	public int getMaxLevel() 
	{
		return 5;
	}
	
	//@Override
	//protected boolean canApplyTogether(Enchantment ench) 
	//{
	//	if(ench == Enchantments.SHARPNESS)
	//	{
	//		return false;
	//	}
	//}
}