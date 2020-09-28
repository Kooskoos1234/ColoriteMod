package com.kooskoos1234.ColoriteMod.Items.Tools;

import org.codehaus.plexus.util.cli.shell.CmdShell;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ToolDagger extends ItemSword implements IHasModel
{
	public ToolDagger(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) 
	{
		player.getCooldownTracker().setCooldown(this, 23); //Sets a cooldown of 23 ticks
		{
			Vec3d look = player.getLookVec(); //Lets you check the coordinates the player is facing
			BlockPos pos = player.getPosition();
			float rot = (float)(2 * (look.x));
			double goToX = pos.getX() + look.x * 3;
			double goToY = pos.getY() + look.y * 3;
			double goToZ = pos.getZ() + look.z * 3;
			if(player.isAirBorne || player.onGround)
			{
				player.setPositionAndRotation(goToX, goToY, goToZ, player.getPitchYaw().y + 180F, player.getPitchYaw().x);
				//player.setVelocity(look.x * 1, 0, look.z * 1); would set the player's velocity towards the direction they are looking at
			}
			return super.onItemRightClick(worldIn, player, handIn); //A return method, since this method isn't a void
		}
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
