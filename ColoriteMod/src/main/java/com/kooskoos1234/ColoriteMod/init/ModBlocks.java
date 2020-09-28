package com.kooskoos1234.ColoriteMod.init;

import java.util.ArrayList;
import java.util.List;

import com.kooskoos1234.ColoriteMod.Blocks.SapphireOre;
import com.kooskoos1234.ColoriteMod.Blocks.ColoriteOre;
import com.kooskoos1234.ColoriteMod.Blocks.CrystalBlocks;
import com.kooskoos1234.ColoriteMod.Blocks.AquamarineOre;
import com.kooskoos1234.ColoriteMod.Blocks.MalachiteOre;
import com.kooskoos1234.ColoriteMod.Blocks.KyaniteOre;
import com.kooskoos1234.ColoriteMod.Blocks.AmberOre;
import com.kooskoos1234.ColoriteMod.Blocks.AmethystOre;
import com.kooskoos1234.ColoriteMod.Blocks.RubyOre;
import com.kooskoos1234.ColoriteMod.Blocks.TopazOre;
import com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.ColoriteFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new CrystalBlocks("ruby_block", Material.IRON);
	public static final Block AMBER_BLOCK = new CrystalBlocks("amber_block", Material.IRON);
	public static final Block TOPAZ_BLOCK = new CrystalBlocks("topaz_block", Material.IRON);
	public static final Block MALACHITE_BLOCK = new CrystalBlocks("malachite_block", Material.IRON);
	public static final Block KYANITE_BLOCK = new CrystalBlocks("kyanite_block", Material.IRON);
	public static final Block AQUAMARINE_BLOCK = new CrystalBlocks("aquamarine_block", Material.IRON);
	public static final Block SAPPHIRE_BLOCK = new CrystalBlocks("sapphire_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new CrystalBlocks("amethyst_block", Material.IRON);
	public static final Block COLORITE_BLOCK = new CrystalBlocks("colorite_block", Material.IRON);
	
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block AMBER_ORE = new AmberOre("amber_ore", Material.ROCK);
	public static final Block TOPAZ_ORE = new TopazOre("topaz_ore", Material.ROCK);
	public static final Block MALACHITE_ORE = new MalachiteOre("malachite_ore", Material.ROCK);
	public static final Block KYANITE_ORE = new KyaniteOre("kyanite_ore", Material.ROCK);
	public static final Block AQUAMARINE_ORE = new AquamarineOre("aquamarine_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	public static final Block COLORITE_ORE = new ColoriteOre("colorite_ore", Material.ROCK);
	
	public static final Block COLORITE_FURNACE_OFF = new ColoriteFurnace("colorite_furnace_off", false).setCreativeTab(CreativeTabs.INVENTORY);
	public static final Block COLORITE_FURNACE_ON = new ColoriteFurnace("colorite_furnace_on", true);
}