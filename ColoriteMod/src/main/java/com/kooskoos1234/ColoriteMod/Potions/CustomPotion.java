package com.kooskoos1234.ColoriteMod.Potions;

import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class CustomPotion extends Potion
{
	public CustomPotion(String name, boolean isBadPotion, int color, int iconIndexX, int iconIndexY)
	{
		super(isBadPotion, color);
		setPotionName("effect." + name);
		setIconIndex(iconIndexX, iconIndexY);
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
	
	@Override
	public boolean hasStatusIcon() 
	{
		return false;
	}
}
