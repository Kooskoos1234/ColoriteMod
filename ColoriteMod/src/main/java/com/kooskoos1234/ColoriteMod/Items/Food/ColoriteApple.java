package com.kooskoos1234.ColoriteMod.Items.Food;

import com.kooskoos1234.ColoriteMod.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ColoriteApple extends FoodBase
{
	
	PotionEffect effect;
	
	public ColoriteApple(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(name, amount, saturation, isAnimalFood);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setAlwaysEdible();
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (5*60*20), 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (60*20), 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, (5*60*20), 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (5*60*20), 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, (5*60*20), 4, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (5*60*20), 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, (60*20), 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (5*60*20), 1, false, true));
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return false;
	}
}
