package com.kooskoos1234.ColoriteMod.Entities.ColoriteArrow;

import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderColoriteArrow extends RenderArrow<EntityColoriteArrow>
{
	public RenderColoriteArrow(RenderManager manager)
	{
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityColoriteArrow entity)
	{
		return new ResourceLocation(Reference.MOD_ID + ":textures/entity/arrows/colorite_arrow.png");
	}
}
