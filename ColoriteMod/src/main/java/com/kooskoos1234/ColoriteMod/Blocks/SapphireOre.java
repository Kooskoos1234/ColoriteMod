package com.kooskoos1234.ColoriteMod.Blocks;

import java.util.Random;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.Enchantments.AutosmeltEnchant;
import com.kooskoos1234.ColoriteMod.init.ModEnchants;
import com.kooskoos1234.ColoriteMod.init.ModItems;

import ibxm.Player;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SapphireOre extends BlockBase 
{

	public SapphireOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(26.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setLightOpacity(0);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.SAPPHIRE_SHARD;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 2;
		return rand.nextInt(max) + min;
	}

}
