package com.kooskoos1234.ColoriteMod.Blocks;

import com.kooskoos1234.ColoriteMod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CrystalBlocks extends BlockBase 
{

	public CrystalBlocks(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(80.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 3);
		setLightOpacity(1);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
	}

}
