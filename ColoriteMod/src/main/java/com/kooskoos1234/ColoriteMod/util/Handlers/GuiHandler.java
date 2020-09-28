package com.kooskoos1234.ColoriteMod.util.Handlers;

import com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.ContainerColoriteFurnace;
import com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.GuiColoriteFurnace;
import com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.TileEntityColoriteFurnace;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_COLORITE_FURNACE)
		{
			return new ContainerColoriteFurnace(player.inventory, (TileEntityColoriteFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{	
		if(ID == ConfigHandler.GUI_COLORITE_FURNACE)
		{
			return new GuiColoriteFurnace(player.inventory, (TileEntityColoriteFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
}