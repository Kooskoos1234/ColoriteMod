package com.kooskoos1234.ColoriteMod.Potions;

import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class Flight extends Potion
{
	public Flight() 
	{
		super(false, 0x33F4FF);
		setPotionName("effect.flight");
		setIconIndex(3,2);
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + "flight"));
	}
}
