package com.jakefoot.letsmodreboot;

import com.jakefoot.letsmodreboot.handler.ConfigurationHandler;
import com.jakefoot.letsmodreboot.handler.KeyInputEventHandler;
import com.jakefoot.letsmodreboot.init.ModArmor;
import com.jakefoot.letsmodreboot.init.ModBlocks;
import com.jakefoot.letsmodreboot.init.ModItems;
import com.jakefoot.letsmodreboot.init.ModTools;
import com.jakefoot.letsmodreboot.init.Recipes;
import com.jakefoot.letsmodreboot.proxy.IProxy;
import com.jakefoot.letsmodreboot.reference.Reference;
import com.jakefoot.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class letsmodreboot
{

	@Mod.Instance(Reference.MOD_ID)
	public static letsmodreboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		//FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		//proxy.registerKeyBindings();
		
		ModItems.init();
		
		ModBlocks.init();
		
		ModTools.init();
		
		ModArmor.init();
		
		LogHelper.info("Pre Initialization Complete");
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		Recipes.init();		
		LogHelper.info("Initialization Complete");
		
	}


	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete");
		
	}


}
