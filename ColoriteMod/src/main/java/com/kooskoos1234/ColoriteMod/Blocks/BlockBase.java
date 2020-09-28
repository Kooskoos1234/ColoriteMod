package com.kooskoos1234.ColoriteMod.Blocks;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModBlocks;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		return null;
	}

	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return null;
	}

	public TileEntity createTileEntity(World worldIn, int meta) 
	{
		return null;
	}
}
