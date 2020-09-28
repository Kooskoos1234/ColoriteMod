package com.kooskoos1234.ColoriteMod;

import java.io.File;

import org.lwjgl.input.Keyboard;

import com.kooskoos1234.ColoriteMod.Potions.Flight;
import com.kooskoos1234.ColoriteMod.Tabs.ModdedResourcesTab;
import com.kooskoos1234.ColoriteMod.World.ModWorldGen;
import com.kooskoos1234.ColoriteMod.init.ModPotions;
import com.kooskoos1234.ColoriteMod.init.ModRecipes;
import com.kooskoos1234.ColoriteMod.proxy.CommonProxy;
import com.kooskoos1234.ColoriteMod.util.Reference;
import com.kooskoos1234.ColoriteMod.util.Handlers.GuiHandler;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static File config;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs MODDEDRESOURCESTAB = new ModdedResourcesTab("modded_resources_tab");
	
	public static final Potion FLIGHT_POTION = new Flight();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		ForgeRegistries.POTIONS.register(FLIGHT_POTION);
		
		ModPotions.registerPotions();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		
		KeyBinding[] keyBindings = new KeyBinding[2];
		
		keyBindings[0] = new KeyBinding("key.structure.desc", Keyboard.KEY_F, "key.gameplay.category");
		keyBindings[1] = new KeyBinding("key.structure.desc", Keyboard.KEY_SPACE, "key.gameplay.category");
		
		for (int i = 0; i < keyBindings.length; ++i)
		{
			ClientRegistry.registerKeyBinding(keyBindings[i]);
		}
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
