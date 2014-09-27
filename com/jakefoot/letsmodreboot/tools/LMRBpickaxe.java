package com.jakefoot.letsmodreboot.tools;

import com.jakefoot.letsmodreboot.creativetab.LMRBcreativeTab;
import com.jakefoot.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class LMRBpickaxe extends ItemPickaxe {

	public LMRBpickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(LMRBcreativeTab.LMRB_TAB);
		//this.setUnlocalizedName("purplepickaxe");
		//this.setTextureName(Reference.MOD_ID + ":" + "purplepickaxe");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));				
	}	
	
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));			
	}
	
	
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);		
	}

}