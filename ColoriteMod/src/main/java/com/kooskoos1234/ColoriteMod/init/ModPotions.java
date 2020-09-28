package com.kooskoos1234.ColoriteMod.init;

import com.kooskoos1234.ColoriteMod.Potions.CustomPotion;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModPotions 
{
	public static final Potion REACH_EFFECT = new CustomPotion("reach_potion", false, 0, 0, 0).registerPotionAttributeModifier(SharedMonsterAttributes.ATTACK_SPEED, MathHelper.getRandomUUID().toString(), 3.0D, 2);
	
	public static void registerPotions()
	{
		registerPotions(REACH_EFFECT);
	}
	
	private static void registerPotions(Potion effect)
	{
		ForgeRegistries.POTIONS.register(effect);
	}
}
