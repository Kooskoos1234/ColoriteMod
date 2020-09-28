package com.kooskoos1234.ColoriteMod.Items.Food;

import com.kooskoos1234.ColoriteMod.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase
{
	
	PotionEffect effect;
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect) 
	{
		super(name, amount, saturation, isAnimalFood);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setAlwaysEdible();
		
		this.effect = effect;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return false; 
	}
}