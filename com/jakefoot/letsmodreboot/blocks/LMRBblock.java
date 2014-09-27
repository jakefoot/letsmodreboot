package com.jakefoot.letsmodreboot.blocks;

import com.jakefoot.letsmodreboot.creativetab.LMRBcreativeTab;
import com.jakefoot.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class LMRBblock extends Block
{

	public LMRBblock(Material material)
	{
		super (material);
		this.setCreativeTab(LMRBcreativeTab.LMRB_TAB);
	}

	public LMRBblock()
	{
		this(Material.rock);
	}
	
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));				
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
			
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);		
	}

}
