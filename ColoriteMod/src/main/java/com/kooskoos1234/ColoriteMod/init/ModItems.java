package com.kooskoos1234.ColoriteMod.init;

import java.util.ArrayList;
import java.util.List;

import com.kooskoos1234.ColoriteMod.Items.ItemBase;
import com.kooskoos1234.ColoriteMod.Items.Armor.ArmorBase;
import com.kooskoos1234.ColoriteMod.Items.Armor.HermesBoots;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeDagger;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeEnduranceWand;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeFireWand;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeFlyingWand;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeLightningWand;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativePowerWand;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeRecoveryWand;
import com.kooskoos1234.ColoriteMod.Items.CreativeTools.ToolCreativeWaterWand;
import com.kooskoos1234.ColoriteMod.Items.Food.ColoriteApple;
import com.kooskoos1234.ColoriteMod.Items.Food.EnchantedColoriteApple;
import com.kooskoos1234.ColoriteMod.Items.Food.EnchantedFoodEffectBase;
import com.kooskoos1234.ColoriteMod.Items.Food.FoodBase;
import com.kooskoos1234.ColoriteMod.Items.Food.FoodEffectBase;
import com.kooskoos1234.ColoriteMod.Items.Tools.ToolAxe;
import com.kooskoos1234.ColoriteMod.Items.Tools.ToolDagger;
import com.kooskoos1234.ColoriteMod.Items.Tools.ToolHoe;
import com.kooskoos1234.ColoriteMod.Items.Tools.ToolPickaxe;
import com.kooskoos1234.ColoriteMod.Items.Tools.ToolSpade;
import com.kooskoos1234.ColoriteMod.Items.Tools.ToolSword;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolEnduranceWand;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolFireWand;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolFlyingWand;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolLightningWand;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolPowerWand;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolRecoveryWand;
import com.kooskoos1234.ColoriteMod.Items.Wands.ToolWaterWand;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item RUBY_SHARD = new ItemBase("ruby_shard");
	public static final Item AMBER = new ItemBase("amber");
	public static final Item AMBER_SHARD = new ItemBase("amber_shard");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item TOPAZ_SHARD = new ItemBase("topaz_shard");
	public static final Item MALACHITE = new ItemBase("malachite");
	public static final Item MALACHITE_SHARD = new ItemBase("malachite_shard");
	public static final Item KYANITE = new ItemBase("kyanite");
	public static final Item KYANITE_SHARD = new ItemBase("kyanite_shard");
	public static final Item AQUAMARINE = new ItemBase("aquamarine");
	public static final Item AQUAMARINE_SHARD = new ItemBase("aquamarine_shard");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item SAPPHIRE_SHARD = new ItemBase("sapphire_shard");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item AMETHYST_SHARD = new ItemBase("amethyst_shard");
	public static final Item COLORITE = new ItemBase("colorite");
	public static final Item COLORITE_SHARD = new ItemBase("colorite_shard");
	public static final Item MINERAL_BASE = new ItemBase("mineral_base");
	public static final Item FIRE_STONE = new ItemBase("fire_stone");
	public static final Item WATER_STONE = new ItemBase("water_stone");
	public static final Item LIFE_STONE = new ItemBase("life_stone");
	public static final Item SKY_STONE = new ItemBase("sky_stone");
	public static final Item LIGHTNING_STONE = new ItemBase("lightning_stone");
	public static final Item POWER_STONE = new ItemBase("power_stone");
	public static final Item ENDURANCE_STONE = new ItemBase("endurance_stone");
	public static final ToolMaterial TOOL_MATERIAL_COLORITE = EnumHelper.addToolMaterial("tool_material_colorite", 3, 9999999, 24.0F, 26.0F, 100);
	public static final ToolMaterial DAGGER_MATERIAL_COLORITE = EnumHelper.addToolMaterial("dagger_material_colorite", 3, 9999999, 24.0F, 16.0F, 100);
	public static final ArmorMaterial ARMOR_MATERIAL_COLORITE = EnumHelper.addArmorMaterial("armor_material_colorite", Reference.MOD_ID + ":colorite", 9999999, new int[] {24, 48, 64, 24}, 100, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial HERMES_MATERIAL = EnumHelper.addArmorMaterial("hermes_material", Reference.MOD_ID + ":colorite", 0, new int[] {1, 3, 2, 1}, 100, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//Armor
	public static final Item COLORITE_HELMET = new ArmorBase("colorite_helmet", ARMOR_MATERIAL_COLORITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item COLORITE_CHESTPLATE = new ArmorBase("colorite_chestplate", ARMOR_MATERIAL_COLORITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COLORITE_LEGGINGS = new ArmorBase("colorite_leggings", ARMOR_MATERIAL_COLORITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item COLORITE_BOOTS = new ArmorBase("colorite_boots", ARMOR_MATERIAL_COLORITE, 1, EntityEquipmentSlot.FEET);
	public static final Item HERMES_CAP = new ArmorBase("hermes_cap", HERMES_MATERIAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item HERMES_BOOTS = new HermesBoots("hermes_boots", HERMES_MATERIAL, 1, EntityEquipmentSlot.FEET);
	//Hermes boots will give you some kind of dash ability, by changing your x and z velocity in the direction you look, and not effecting the y
	//Hermes cap will give you the ability to perform a midair jump, by changing your y velocity and nothing else
	
	//Tools
	public static final ItemSword COLORITE_DAGGER = new ToolDagger("colorite_dagger", DAGGER_MATERIAL_COLORITE);
	public static final ItemSword COLORITE_LONGSWORD = new ToolSword("colorite_longsword", TOOL_MATERIAL_COLORITE);
	public static final ItemPickaxe COLORITE_PICKAXE = new ToolPickaxe("colorite_pickaxe", TOOL_MATERIAL_COLORITE);
	public static final ItemAxe COLORITE_AXE = new ToolAxe("colorite_axe", TOOL_MATERIAL_COLORITE);
	public static final ItemSpade COLORITE_SHOVEL = new ToolSpade("colorite_shovel", TOOL_MATERIAL_COLORITE);
	public static final ItemHoe COLORITE_HOE = new ToolHoe("colorite_hoe", TOOL_MATERIAL_COLORITE);
	//public static final Item WATER_JET = new ToolWaterJet("water_jet");
	//public static final Item KITCHEN_KNIFE = new ItemBase("kitchen_knife");
	
	//Wands
	public static final ToolFireWand WAND_OF_BURNING = new ToolFireWand("wand_of_burning");
	public static final ToolFlyingWand WAND_OF_FLYING = new ToolFlyingWand("wand_of_flying");
	public static final ToolRecoveryWand WAND_OF_RECOVERY = new ToolRecoveryWand("wand_of_recovery");
	public static final ToolLightningWand WAND_OF_LIGHTNING = new ToolLightningWand("wand_of_lightning");
	public static final ToolWaterWand WAND_OF_WATER = new ToolWaterWand("wand_of_water");
	public static final ToolPowerWand WAND_OF_POWER = new ToolPowerWand("wand_of_power");
	public static final ToolEnduranceWand WAND_OF_ENDURANCE= new ToolEnduranceWand("wand_of_endurance");
	
	//Effect Items
	//public static final Item DEMONIC_WINGS = new BuffItemBase("demonic_wings", new PotionEffect(Main.FLIGHT_POTION, 2, 0, false, false));
	//caused a nullPointerException crash
	
	//Creative Items
	public static final ItemSword CREATIVE_COLORITE_DAGGER = new ToolCreativeDagger("creative_colorite_dagger", DAGGER_MATERIAL_COLORITE);
	public static final ToolCreativeFireWand CREATIVE_WAND_OF_BURNING = new ToolCreativeFireWand("creative_wand_of_burning");
	public static final ToolCreativeFlyingWand CREATIVE_WAND_OF_FLYING = new ToolCreativeFlyingWand("creative_wand_of_flying");
	public static final ToolCreativeRecoveryWand CREATIVE_WAND_OF_RECOVERY = new ToolCreativeRecoveryWand("creative_wand_of_recovery");
	public static final ToolCreativeLightningWand CREATIVE_WAND_OF_LIGHTNING = new ToolCreativeLightningWand("creative_wand_of_lightning");
	public static final ToolCreativeWaterWand CREATIVE_WAND_OF_WATER = new ToolCreativeWaterWand("creative_wand_of_water");
	public static final ToolCreativePowerWand CREATIVE_WAND_OF_POWER = new ToolCreativePowerWand("creative_wand_of_power");
	public static final ToolCreativeEnduranceWand CREATIVE_WAND_OF_ENDURANCE= new ToolCreativeEnduranceWand("creative_wand_of_endurance");
	
	//Food
	public static final Item CHOCOLATE_CAKE = new FoodBase("chocolate_cake", 4, 2.4F, false);
	//public static final Item FRIES = new FoodBase("fries", 1, 0F, false);
	//public static final Item LETTUCE = new FoodBase("lettuce", 0, 0F, false);
	//public static final Item TOMATO = new FoodBase("tomato", 2, 1F, false);
	//public static final Item TOMATO_SLICE = new FoodBase("tomato_slice", 1, 0F, false);
	//public static final Item BREAD_SLICE = new FoodBase("bread_slice", 1, 1F, false);
	//public static final Item BURGER = new FoodBase("burger", 11, 5.0F, false);
	//public static final Item BURGER_WITH_FRIES = new FoodBase("burger_with_fries", 15, 7.5F, false);
	//public static final Item BALANCED_MEAL = new FoodEffectBase("balanced_meal", 0, 0, false, new PotionEffect(MobEffects.SATURATION, 2400, 4, false, false));
	
	
	//Effect Food
	public static final Item RUBY_APPLE = new FoodEffectBase("ruby_apple", 5, 2.8F, false, new PotionEffect(MobEffects.STRENGTH, (5*60*20), 1, false, true));
	public static final Item ENCHANTED_RUBY_APPLE = new EnchantedFoodEffectBase("enchanted_ruby_apple", 5, 2.8F, false, new PotionEffect(MobEffects.STRENGTH, (10*60*20), 4, false, true));
	public static final Item AMBER_APPLE = new FoodEffectBase("amber_apple", 6, 3.2F, false, new PotionEffect(MobEffects.FIRE_RESISTANCE, (60*20), 0, false, true));
	public static final Item ENCHANTED_AMBER_APPLE = new EnchantedFoodEffectBase("enchanted_amber_apple", 6, 3.2F, false, new PotionEffect(MobEffects.FIRE_RESISTANCE, (10*60*20), 0, false, true));
	public static final Item TOPAZ_APPLE = new FoodEffectBase("topaz_apple", 7, 3.6F, false, new PotionEffect(MobEffects.HASTE, (5*60*20), 1, false, true));
	public static final Item ENCHANTED_TOPAZ_APPLE = new EnchantedFoodEffectBase("enchanted_topaz_apple", 6, 3.2F, false, new PotionEffect(MobEffects.HASTE, (10*60*20), 4, false, true));
	public static final Item MALACHITE_APPLE = new FoodEffectBase("malachite_apple", 8, 4.0F, false, new PotionEffect(MobEffects.JUMP_BOOST, (5*60*20), 1, false, true));
	public static final Item ENCHANTED_MALACHITE_APPLE = new EnchantedFoodEffectBase("enchanted_malachite_apple", 8, 4.0F, false, new PotionEffect(MobEffects.JUMP_BOOST, (10*60*20), 4, false, true));
	public static final Item KYANITE_APPLE = new FoodEffectBase("kyanite_apple", 9, 4.4F, false, new PotionEffect(MobEffects.SPEED, (5*60*20), 4, false, true));
	public static final Item ENCHANTED_KYANITE_APPLE = new EnchantedFoodEffectBase("enchanted_kyanite_apple", 9, 4.4F, false, new PotionEffect(MobEffects.SPEED, (10*60*20), 9, false, true));
	public static final Item AQUAMARINE_APPLE = new FoodEffectBase("aquamarine_apple", 10, 4.8F, false, new PotionEffect(MobEffects.RESISTANCE, (5*60*20), 0, false, true));
	public static final Item ENCHANTED_AQUAMARINE_APPLE = new EnchantedFoodEffectBase("enchanted_aquamarine_apple", 10, 4.8F, false, new PotionEffect(MobEffects.RESISTANCE, (10*60*20), 2, false, true));
	public static final Item SAPPHIRE_APPLE = new FoodEffectBase("sapphire_apple", 11, 5.2F, false, new PotionEffect(MobEffects.WATER_BREATHING, (60*20), 0, false, true));
	public static final Item ENCHANTED_SAPPHIRE_APPLE = new EnchantedFoodEffectBase("enchanted_sapphire_apple", 11, 5.2F, false, new PotionEffect(MobEffects.WATER_BREATHING, (10*60*20), 0, false, true));
	public static final Item AMETHYST_APPLE = new FoodEffectBase("amethyst_apple", 12, 5.6F, false, new PotionEffect(MobEffects.REGENERATION, (5*60*20), 1, false, true));
	public static final Item ENCHANTED_AMETHYST_APPLE = new EnchantedFoodEffectBase("enchanted_amethyst_apple", 12, 5.6F, false, new PotionEffect(MobEffects.REGENERATION, (10*60*20), 4, false, true));
	public static final Item COLORITE_APPLE = new ColoriteApple("colorite_apple", 20, 25.0F, false);
	public static final Item ENCHANTED_COLORITE_APPLE = new EnchantedColoriteApple("enchanted_colorite_apple", 20, 125.0F, false);
}