package com.kooskoos1234.ColoriteMod.util.Handlers;

import com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.TileEntityColoriteFurnace;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityColoriteFurnace.class, new ResourceLocation(Reference.MOD_ID + "colorite_furnace"));
	}
}
