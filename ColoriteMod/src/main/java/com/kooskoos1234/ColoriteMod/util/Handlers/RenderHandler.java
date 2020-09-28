package com.kooskoos1234.ColoriteMod.util.Handlers;

import com.kooskoos1234.ColoriteMod.Entities.ColoriteArrow.EntityColoriteArrow;
import com.kooskoos1234.ColoriteMod.Entities.ColoriteArrow.RenderColoriteArrow;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityColoriteArrow.class, new IRenderFactory<EntityColoriteArrow>() 
		{
			@Override
			public Render<? super EntityColoriteArrow> createRenderFor(RenderManager manager) 
			{
				return new RenderColoriteArrow(manager);
			}
		});
	}
}
