package com.jakefoot.letsmodreboot.proxy;

import com.jakefoot.letsmodreboot.client.settings.KeyBindings;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(KeyBindings.charge);
		ClientRegistry.registerKeyBinding(KeyBindings.release);
	}
}
