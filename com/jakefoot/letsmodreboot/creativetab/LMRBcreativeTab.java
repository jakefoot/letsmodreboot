package com.jakefoot.letsmodreboot.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.jakefoot.letsmodreboot.init.ModItems;
import com.jakefoot.letsmodreboot.reference.Reference;

public class LMRBcreativeTab
{	
	public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.creeperfork;
		}
				
	};
}
