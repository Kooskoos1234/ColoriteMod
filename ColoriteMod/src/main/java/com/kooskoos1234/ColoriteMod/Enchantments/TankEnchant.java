package com.kooskoos1234.ColoriteMod.Enchantments;

import com.kooskoos1234.ColoriteMod.init.ModEnchants;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class TankEnchant extends Enchantment 
{

	public TankEnchant(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) 
	{
		super(rarityIn, typeIn, slots);
		this.setName("enchant_tank");
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":enchant_tank"));
		
		ModEnchants.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) 
	{
		return enchantmentLevel * 10;
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
}