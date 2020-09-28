package com.kooskoos1234.ColoriteMod.Blocks;

import java.util.Random;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AquamarineOre extends BlockBase 
{

	public AquamarineOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(22.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setLightOpacity(0);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.AQUAMARINE_SHARD;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 2;
		return rand.nextInt(max) + min;
	}

}
