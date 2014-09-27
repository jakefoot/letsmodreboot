package com.jakefoot.letsmodreboot.init;

import com.jakefoot.letsmodreboot.items.CreeperFork;
import com.jakefoot.letsmodreboot.items.HotDog;
import com.jakefoot.letsmodreboot.items.LMRBfood;
import com.jakefoot.letsmodreboot.items.LMRBitem;
import com.jakefoot.letsmodreboot.items.PurpleGem;
import com.jakefoot.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{

	public static final LMRBitem purplegem = new PurpleGem();
	public static final LMRBitem creeperfork = new CreeperFork();
	public static final LMRBfood hotdog = new HotDog(7, 0.7f, true);
	
	
	public static void init()
	{		
		GameRegistry.registerItem(purplegem, "purplegem");	
		GameRegistry.registerItem(creeperfork, "creeperfork");	
		GameRegistry.registerItem(hotdog, "hotdog");		
	}
}
