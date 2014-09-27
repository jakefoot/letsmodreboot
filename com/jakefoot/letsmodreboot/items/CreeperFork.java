package com.jakefoot.letsmodreboot.items;

import com.jakefoot.letsmodreboot.creativetab.LMRBcreativeTab;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class CreeperFork extends LMRBitem
{

	public CreeperFork() 
	{
		super();
		this.setUnlocalizedName("creeperfork");
	}
	
	@Override	
	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase target)
	{
	
		if(!target.worldObj.isRemote)
		{
			if(target instanceof EntityCreeper)
			{
				target.motionY = 2.5;
			} 
			else
			{
				player.addChatMessage(new ChatComponentText("This only works on creepers!"));
			
			}
	}
		return false;
		

	}
	
}
