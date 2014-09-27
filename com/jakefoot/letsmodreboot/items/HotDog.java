package com.jakefoot.letsmodreboot.items;

import net.minecraft.potion.Potion;

import com.jakefoot.letsmodreboot.creativetab.LMRBcreativeTab;


public class HotDog extends LMRBfood
{

	public HotDog(int hunger, float saturation, boolean wolffood)
	{
		super(hunger, saturation, wolffood);
		this.setUnlocalizedName("hotdog");
		this.setCreativeTab(LMRBcreativeTab.LMRB_TAB);
		this.setPotionEffect(Potion.jump.id, 30, 2, 1.0f);
		this.setAlwaysEdible();
	}
}
