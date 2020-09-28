package com.kooskoos1234.ColoriteMod.init;

import java.util.ArrayList;
import java.util.List;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.Enchantments.AquaticEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.FireImmunityEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.NimbleEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.PoisonEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.FlightEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.HasteEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.LeapingEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.LifeStealEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.NightVisionEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.QuickDrawEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.ReachEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.RecoveryEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.SaturationEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.StrengthEnchant;
import com.kooskoos1234.ColoriteMod.Enchantments.TankEnchant;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModEnchants 
{
	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	//public static final Enchantment ENCHANT_QUICK_DRAW = new QuickDrawEnchant(Rarity.RARE, EnumEnchantmentType.BOW, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
	public static final Enchantment ENCHANT_LIFE_STEAL = new LifeStealEnchant(Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
	public static final Enchantment ENCHANT_POISON = new PoisonEnchant(Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
	//function should be find the attacker, if isUndead give regeneration, else give poison
	public static final Enchantment ENCHANT_HASTE = new HasteEnchant(Rarity.RARE, EnumEnchantmentType.DIGGER, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
	public static final Enchantment ENCHANT_NIMBLE = new NimbleEnchant(Rarity.UNCOMMON, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] {EntityEquipmentSlot.FEET});
	public static final Enchantment ENCHANT_LEAPING = new LeapingEnchant(Rarity.UNCOMMON, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] {EntityEquipmentSlot.FEET});
	public static final Enchantment ENCHANT_TANK = new TankEnchant(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR, new EntityEquipmentSlot[] {EntityEquipmentSlot.FEET, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.HEAD});
	public static final Enchantment ENCHANT_FIRE_IMMUNITY = new FireImmunityEnchant(Rarity.RARE, EnumEnchantmentType.ARMOR_LEGS, new EntityEquipmentSlot[] {EntityEquipmentSlot.LEGS});
	public static final Enchantment ENCHANT_RECOVERY = new RecoveryEnchant(Rarity.RARE, EnumEnchantmentType.ARMOR_LEGS, new EntityEquipmentSlot[] {EntityEquipmentSlot.LEGS});
	public static final Enchantment ENCHANT_FLIGHT = new FlightEnchant(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST});
	public static final Enchantment ENCHANT_STRENGTH = new StrengthEnchant(Rarity.RARE, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST});
	public static final Enchantment ENCHANT_REACH = new ReachEnchant(Rarity.RARE, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST});;
	public static final Enchantment ENCHANT_NIGHT_VISION = new NightVisionEnchant(Rarity.UNCOMMON, EnumEnchantmentType.ARMOR_HEAD, new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD});
	public static final Enchantment ENCHANT_AQUATIC = new AquaticEnchant(Rarity.RARE, EnumEnchantmentType.ARMOR_HEAD, new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD});
	public static final Enchantment ENCHANT_SATURATION = new SaturationEnchant(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_HEAD, new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD});
	
	@SubscribeEvent
	public static void enchantStrengthFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{
			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_STRENGTH, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0 && entityPlayer.isSwingInProgress)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (1 * 5), (level - 1), false, true));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantReachFunction(LivingEquipmentChangeEvent event)
	{
		Object player = event.getEntityLiving();
		if (event.getEntityLiving() instanceof EntityLivingBase || !(player == null))
	    {
		    
		    EntityLivingBase entityPlayer = (EntityLivingBase)player;
			   	
	        int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_REACH, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST));
	        if(!entityPlayer.getEntityWorld().isRemote && level == 1)
	        {
	            entityPlayer.getEntityAttribute(EntityPlayer.REACH_DISTANCE).applyModifier(new AttributeModifier("REACH_1", 0.0001, 1));
	            }
	            
	        else if(!entityPlayer.getEntityWorld().isRemote && level == 2)
	        {
	          	entityPlayer.getEntityAttribute(EntityPlayer.REACH_DISTANCE).applyModifier(new AttributeModifier("REACH_2", 0.0002, 1));
	        }
	           
	        else if(!entityPlayer.getEntityWorld().isRemote && level == 3)
	        {
	           	entityPlayer.getEntityAttribute(EntityPlayer.REACH_DISTANCE).applyModifier(new AttributeModifier("REACH_3", 0.0003, 1));
	        }
	        {
	           	entityPlayer.getEntityAttribute(EntityPlayer.REACH_DISTANCE).removeModifier(entityPlayer.getUniqueID());
	        }
		}
	}
	
	//@SubscribeEvent
	//public static void enchantQuickDrawFunction(LivingEntityUseItemEvent event)
	//{
	//	EntityLivingBase living = event.getEntityLiving();
	//	int level = EnchantmentHelper.getMaxEnchantmentLevel(ENCHANT_QUICK_DRAW, living);
	//	if(level > 0)
	//	{
	//		//stack.getItemUseDuration() - entity.getItemInUseCount() / 20.0F
	//	}
	//}
	
	@SubscribeEvent
	public static void enchantLifeStealFunction(LivingAttackEvent event)
	{
		Object attacker = event.getSource().getTrueSource();
		if(attacker instanceof EntityLivingBase)
		{
			EntityLivingBase entityAttacker = (EntityLivingBase)attacker;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_LIFE_STEAL, entityAttacker.getHeldItemMainhand());
			if(!entityAttacker.getEntityWorld().isRemote && level > 0)
			{
				float floatLevel = (float)level;
				entityAttacker.heal(event.getAmount() * (floatLevel/10));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantNimbleFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_NIMBLE, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.SPEED, (3 * 20), (level - 1), false, true));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantLeapingFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{
			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_LEAPING, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (3 * 20), (level - 1), false, true));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantTankFunction(LivingEquipmentChangeEvent event)
	{
		Object player = event.getEntityLiving();
		if (event.getEntityLiving() instanceof EntityLivingBase)
	    {
	        EntityEquipmentSlot slotChanged = event.getSlot();
	        if (slotChanged.getSlotIndex() > 0 && slotChanged.getSlotIndex() < 5)
	        {
	        	EntityLivingBase entityPlayer = (EntityLivingBase)player;
	        	int levelFeet = EnchantmentHelper.getEnchantmentLevel(ENCHANT_TANK, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET));
	        	int levelLegs = EnchantmentHelper.getEnchantmentLevel(ENCHANT_TANK, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.LEGS));
	        	int levelChest = EnchantmentHelper.getEnchantmentLevel(ENCHANT_TANK, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST));
	        	int levelHead = EnchantmentHelper.getEnchantmentLevel(ENCHANT_TANK, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.HEAD));
	        	if(!entityPlayer.getEntityWorld().isRemote && (levelFeet > 0 || levelLegs > 0 || levelChest > 0 || levelHead > 0))
	        	{
	        		entityPlayer.removePotionEffect(MobEffects.HEALTH_BOOST);
	        		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (24 * 60 * 60 * 20), (levelFeet) + (levelLegs) + (levelChest) + (levelHead) - 1, false, false));
	        	}
	        	else
	        	{
	        		entityPlayer.removePotionEffect(MobEffects.HEALTH_BOOST);
	        	}
	        }
		}
	}
	
	@SubscribeEvent
	public static void enchantSaturationFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_SATURATION, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.HEAD));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.SATURATION, (1 * 5), (level - 1), false, false));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantFlightFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_FLIGHT, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(Main.FLIGHT_POTION, (1 * 5), (level) - 1, false, true));
			}	
		}
     }
	
	@SubscribeEvent
	public static void enchantFireImmunityFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_FIRE_IMMUNITY, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.LEGS));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (1 * 5), (level) - 1, false, true));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantRecoveryFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_RECOVERY, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.LEGS));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (1 * 20), (level) - 1, false, true));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantNightVisionFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_NIGHT_VISION, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.HEAD));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (1 * 20), (level) - 1, false, true));
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantAquaticFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_AQUATIC, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.HEAD));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				if(entityPlayer.isInWater())
				{
					entityPlayer.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, (1), (level) - 1, false, true));
					entityPlayer.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (1), (level) - 1, false, true));
					entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HASTE, (1), 1, false, true));
				}
			}
		}
	}
	
	@SubscribeEvent
	public static void enchantHasteFunction(LivingUpdateEvent event)
	{
		Object player = event.getEntityLiving();
		if(player instanceof EntityLivingBase)
		{

			EntityLivingBase entityPlayer = (EntityLivingBase)player;
			int level = EnchantmentHelper.getEnchantmentLevel(ENCHANT_HASTE, entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND));
			if(!entityPlayer.getEntityWorld().isRemote && level > 0)
			{
				entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HASTE, (1 * 20), (level) - 1, false, true));
			}
		}
	}
}