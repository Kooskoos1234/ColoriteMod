package com.kooskoos1234.ColoriteMod.Items.Wands;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ToolFireWand extends Item implements IHasModel
{
	public ToolFireWand(String name)
	{
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		playerIn.getCooldownTracker().setCooldown(this, 50);
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1,1,1);
		
		fireball.setPosition(playerIn.posX + aim.x * 1.50, playerIn.posY + aim.y * 1.50, playerIn.posZ + aim.z * 1.50);
		fireball.accelerationX = aim.x * 0.5;
		fireball.accelerationY = aim.y * 0.5;
		fireball.accelerationZ = aim.z * 0.5;
		worldIn.spawnEntity(fireball);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
