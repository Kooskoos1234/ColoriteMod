package com.kooskoos1234.ColoriteMod.util;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModEnchants;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModEvents 
{
	@SubscribeEvent
	public static void onFly(TickEvent.PlayerTickEvent event)
	{
		boolean fly = false;
		if(event.player.isPotionActive(Main.FLIGHT_POTION)) 
			{
				fly = true;
			}
		if(fly == true || event.player.isCreative() || event.player.isSpectator())
		{
			event.player.capabilities.allowFlying = true;
			event.player.fallDistance = 0.0F;
			int flightLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchants.ENCHANT_FLIGHT, event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST));
			if(flightLevel == 1)
			{
				event.player.capabilities.setFlySpeed(0.05F);
			}
			else if(flightLevel == 2)
			{
				event.player.capabilities.setFlySpeed(0.07F);
			}
			else if(flightLevel == 3)
			{
				event.player.capabilities.setFlySpeed(0.10F);
			}
			else if(flightLevel == 4)
			{
				event.player.capabilities.setFlySpeed(0.13F);
			}
			else if(flightLevel == 5)
			{
				event.player.capabilities.setFlySpeed(0.15F);
			}
			else
			{
				event.player.capabilities.setFlySpeed(0.05F);
			}
		}
		else
		{
			fly = false;
			event.player.capabilities.isFlying = false;
			event.player.capabilities.allowFlying = false;
		}
	}
}
