package com.kooskoos1234.ColoriteMod.util.Handlers;

import java.io.File;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	
	//GUI IDs
	public static int GUI_COLORITE_FURNACE = 4;
	
	
	public static void init(File file)
	{
		config = new Configuration(file);
		String category;
		
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set IDs for each GUI.");
		GUI_COLORITE_FURNACE = config.getInt("GUI Colorite Furnace", category, 4, 0, 500, "GUI ID for the Silver Furnace");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}