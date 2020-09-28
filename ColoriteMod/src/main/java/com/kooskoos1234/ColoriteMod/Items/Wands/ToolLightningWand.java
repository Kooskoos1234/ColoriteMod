package com.kooskoos1234.ColoriteMod.Items.Wands;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.Entities.EntityLightningBall.EntityLightningBall;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ToolLightningWand extends Item implements IHasModel
{
	public ToolLightningWand(String name)
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
		Vec3d look = playerIn.getLookVec();
		EntityLightningBall lightningball = new EntityLightningBall(worldIn, 0d, 0d, 0d);
		
		lightningball.setPosition(playerIn.posX + look.x * 1.50, playerIn.posY + look.y * 1.50, playerIn.posZ + look.z * 1.50);
		lightningball.motionX = look.x * 3.0d;
		lightningball.motionY = look.y * 3.0d;
		lightningball.motionZ = look.z * 3.0d;
		lightningball.setGlowing(true);
		worldIn.spawnEntity(lightningball);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
