package com.jakefoot.letsmodreboot.blocks;

import java.util.Random;

import com.jakefoot.letsmodreboot.init.ModItems;
import com.jakefoot.letsmodreboot.items.LMRBitem;
import com.jakefoot.letsmodreboot.items.PurpleGem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PurpleOre extends LMRBblock
{

	public PurpleOre()
	{
		super();
		this.setBlockName("purpleore");
	}

	@Override
	public LMRBitem getItemDropped(int metadata, Random random, int fortune)
	{
	return ModItems.purplegem;
	}
}
