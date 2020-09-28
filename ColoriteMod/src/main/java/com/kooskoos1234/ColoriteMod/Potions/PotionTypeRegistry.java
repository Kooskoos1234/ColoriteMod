package com.kooskoos1234.ColoriteMod.Potions;

import com.kooskoos1234.ColoriteMod.Main;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionTypeRegistry 
{
	public static final PotionType FLIGHT = new PotionType("flight", new PotionEffect[] {new PotionEffect(Main.FLIGHT_POTION, 2400)}).setRegistryName("flight");
	public static final PotionType LONG_FLIGHT = new PotionType("flight", new PotionEffect[] {new PotionEffect(Main.FLIGHT_POTION, 9600)}).setRegistryName("long_flight");
	
	public static void registerPotionTypes()
	{
		ForgeRegistries.POTION_TYPES.register(FLIGHT);
		ForgeRegistries.POTION_TYPES.register(LONG_FLIGHT);
		PotionHelper.addMix(PotionTypes.INVISIBILITY, Items.ENDER_EYE, FLIGHT);
		PotionHelper.addMix(FLIGHT, Items.REDSTONE, LONG_FLIGHT);
	}
}