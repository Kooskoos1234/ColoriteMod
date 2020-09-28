package com.kooskoos1234.ColoriteMod.Items.Tools;

import org.codehaus.plexus.util.cli.shell.CmdShell;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.functions.SetAttributes;

public class ToolWaterJet extends Item implements IHasModel
{
	public ToolWaterJet(String name)
	{
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) 
	{
		ItemStack item = player.getHeldItem(handIn);
		if(player.isInWater())
		{
			Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
			player.motionX = look.x * 1.5;
			player.motionY = look.y * 1.5;
			player.motionZ = look.z * 1.5;
		}
		return super.onItemRightClick(worldIn, player, handIn); //A return method, since this method isn't a void
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
