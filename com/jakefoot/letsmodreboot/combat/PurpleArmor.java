package com.jakefoot.letsmodreboot.combat;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.jakefoot.letsmodreboot.init.ModArmor;
import com.jakefoot.letsmodreboot.reference.Reference;

public class PurpleArmor extends ItemArmor
{

	public PurpleArmor(ArmorMaterial material, int ID,
			int placement)
	{
		super(material, ID, placement);		
		switch (placement)
		{
		case 0:
			this.setTextureName(Reference.MOD_ID + ":" + "purplehelmet");
			this.setUnlocalizedName("purplehelmet");
			break;
		case 1:		
			this.setTextureName(Reference.MOD_ID + ":" + "purplechestplate");
			this.setUnlocalizedName("purplechestplate");
			break;
		case 2:
			this.setTextureName(Reference.MOD_ID + ":" + "purpleleggings");
			this.setUnlocalizedName("purpleleggings");
			break;
		case 3:
			this.setTextureName(Reference.MOD_ID + ":" + "purpleboots");
			this.setUnlocalizedName("purpleboots");
			break;			
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem()==ModArmor.purpleboots || stack.getItem()==ModArmor.purplechestplate || stack.getItem()==ModArmor.purplehelmet)
		{
			return Reference.MOD_ID + ":textures/models/armor/purple_armor_1.png";
		}
		if (stack.getItem()==ModArmor.purpleleggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/purple_armor_2.png";
		}
		else
		{
			return null;
		}
		
	}
}
