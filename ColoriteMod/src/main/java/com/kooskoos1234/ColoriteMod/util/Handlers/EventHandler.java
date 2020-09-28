package com.kooskoos1234.ColoriteMod.util.Handlers;

import com.kooskoos1234.ColoriteMod.proxy.ClientProxy;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class EventHandler 
{
	static boolean FIsDown;
	static boolean SpaceIsDown;
	public static void onEvent(KeyInputEvent event)
	{
	    // DEBUG
	    System.out.println("Key Input Event");

	    // make local copy of key binding array
	    KeyBinding[] keyBindings = ClientProxy.keyBindings;
	    
	    if (keyBindings[0].isPressed()) 
	    {
	        System.out.println("Key binding ="+keyBindings[0].getKeyDescription());
	        FIsDown = true;
	    }
	    if (keyBindings[1].isPressed()) 
	    {
	        System.out.println("Key binding ="+keyBindings[1].getKeyDescription());
	        SpaceIsDown = true;
	    }
	}
	
	public static boolean isKeyDown(String key)
	{
		if(key == "F")
		{
			if(FIsDown == true)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if(key == "Space")
		{
			if(SpaceIsDown == true)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
