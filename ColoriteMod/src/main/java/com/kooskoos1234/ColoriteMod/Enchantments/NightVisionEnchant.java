package com.kooskoos1234.ColoriteMod.Enchantments;

import com.kooskoos1234.ColoriteMod.init.ModEnchants;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class NightVisionEnchant extends Enchantment
{
	public NightVisionEnchant(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) 
	{
		super(rarityIn, typeIn, slots);
		this.setName("enchant_night_vision");
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":enchant_night_vision"));
		
		ModEnchants.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) 
	{	
		return 20 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) 
	{
		return this.getMinEnchantability(enchantmentLevel) + 1000;
	}
	
	@Override
	public int getMaxLevel() 
	{
		return 1;
	}
	
	//@Override
	//protected boolean canApplyTogether(Enchantment ench) 
	//{
	//	if(ench == ModEnchants.ENCHANT_REACH)
	//	{
	//		return false;
	//	}
	//	return true;
	//}
}
