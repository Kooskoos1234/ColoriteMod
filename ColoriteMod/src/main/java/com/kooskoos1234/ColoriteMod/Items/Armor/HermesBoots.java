package com.kooskoos1234.ColoriteMod.Items.Armor;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.util.Handlers.EventHandler;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.proxy.ClientProxy;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class HermesBoots extends ItemArmor implements IHasModel 
{

	static boolean FIsDown;
	KeyBinding[] keyBindings = ClientProxy.keyBindings;
	
	public HermesBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	public static void onEvent(KeyInputEvent event, EntityPlayer player)
	{
		KeyBinding[] keyBindings = ClientProxy.keyBindings;
	    if (keyBindings[0].isPressed()) 
	    {
	    	Vec3d look = player.getLookVec();
	    	double goToX = look.x * 1;
			double goToY = 0.4;
			double goToZ = look.z * 1;
			if(player.isAirBorne|| player.onGround)
			{
				player.setVelocity(goToX, goToY, goToZ);
			}
	    }
	}
	
	//@Override
	//public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	//{
	//	Vec3d look = player.getLookVec();
	//	BlockPos pos = player.getPosition();
	//	if(FIsDown)
	//	{
	//		player.getCooldownTracker().setCooldown(this, 23);
	//		double goToX = look.x * 1;
	//		double goToY = 0.4;
	//		double goToZ = look.z * 1;
	//		if(player.isAirBorne|| player.onGround)
	//		{
	//			player.setVelocity(goToX, goToY, goToZ);
	//		}
	//	}
	//	super.onArmorTick(world, player, itemStack);
	//}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) 
	{
		Vec3d look = player.getLookVec();
		player.getCooldownTracker().setCooldown(this, 23);
		double goToX = look.x * 1;
		double goToY = 0.4;
		double goToZ = look.z * 1;
		if(player.isAirBorne || player.onGround)
		{
			player.setVelocity(goToX, goToY, goToZ);
		}
		return super.onItemRightClick(worldIn, player, handIn);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
