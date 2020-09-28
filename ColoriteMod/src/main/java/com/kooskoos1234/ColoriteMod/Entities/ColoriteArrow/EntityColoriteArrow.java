package com.kooskoos1234.ColoriteMod.Entities.ColoriteArrow;

import com.kooskoos1234.ColoriteMod.init.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityColoriteArrow extends EntityArrow
{
	public EntityColoriteArrow(World worldIn) 
	{
		super(worldIn);
	}
	
	public EntityColoriteArrow(World worldIn, double x, double y, double z) 
	{
		super(worldIn, x, y, z);
	}
	
	public EntityColoriteArrow(World worldIn, EntityLivingBase shooter) 
	{
		super(worldIn, shooter);
	}
	
	@Override
	protected ItemStack getArrowStack() 
	{
		return new ItemStack(ModItems.COLORITE_ARROW);
	}
	
	@Override
	protected void arrowHit(EntityLivingBase living) 
	{
		super.arrowHit(living);
	}
	
	
}