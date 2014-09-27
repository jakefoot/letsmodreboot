package com.jakefoot.letsmodreboot.init;

import com.jakefoot.letsmodreboot.blocks.LMRBblock;
import com.jakefoot.letsmodreboot.blocks.PurpleOre;
import com.jakefoot.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks

{
	public static final LMRBblock purpleore = new PurpleOre();
	
	public static void init()
	{
		GameRegistry.registerBlock(purpleore, "purpleore");
	}

}
