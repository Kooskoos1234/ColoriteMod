package com.kooskoos1234.ColoriteMod.init;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.Entities.ColoriteArrow.EntityColoriteArrow;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void registerEntities()
	{
		registerArrow("colorite_arrow", EntityColoriteArrow.class, Reference.ENTITY_COLORITE_ARROW);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, 64, 20, true);
	}
}
