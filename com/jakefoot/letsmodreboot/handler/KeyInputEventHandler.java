package com.jakefoot.letsmodreboot.handler;

import net.minecraft.util.ChatComponentText;

import com.jakefoot.letsmodreboot.client.settings.KeyBindings;
import com.jakefoot.letsmodreboot.reference.Key;
import com.jakefoot.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{

	private static Key getPressedKeybinding()
	{
		if (KeyBindings.charge.isPressed())
		{
			return Key.CHARGE;
		}
		else if (KeyBindings.release.isPressed())
		{
			return Key.RELEASE;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		LogHelper.info(getPressedKeybinding());
	}

}
