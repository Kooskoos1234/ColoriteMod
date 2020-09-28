package com.kooskoos1234.ColoriteMod.Items.Food;

import com.kooskoos1234.ColoriteMod.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EnchantedColoriteApple extends FoodBase
{
	
	PotionEffect effect;
	
	public EnchantedColoriteApple(String name, int amount, float saturation, boolean isAnimalFood) 
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
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (10*60*20), 4, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (10*60*20), 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, (10*60*20), 4, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (10*60*20), 4, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, (10*60*20), 9, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (10*60*20), 2, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, (10*60*20), 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (10*60*20), 4, false, true));
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
}
