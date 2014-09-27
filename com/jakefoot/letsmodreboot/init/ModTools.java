package com.jakefoot.letsmodreboot.init;

import com.jakefoot.letsmodreboot.materials.ModMaterials;
import com.jakefoot.letsmodreboot.reference.Reference;
import com.jakefoot.letsmodreboot.tools.LMRBaxe;
import com.jakefoot.letsmodreboot.tools.LMRBhoe;
import com.jakefoot.letsmodreboot.tools.LMRBpickaxe;
import com.jakefoot.letsmodreboot.tools.LMRBshovel;
import com.jakefoot.letsmodreboot.tools.LMRBsword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModTools
{
	//Purple tools
	public static final Item purpleaxe = new LMRBaxe(ModMaterials.purplematerial).setUnlocalizedName("purpleaxe");
	public static final Item purplepickaxe = new LMRBpickaxe(ModMaterials.purplematerial).setUnlocalizedName("purplepickaxe");
	public static final Item purplehoe = new LMRBhoe(ModMaterials.purplematerial).setUnlocalizedName("purplehoe");
	public static final Item purpleshovel = new LMRBshovel(ModMaterials.purplematerial).setUnlocalizedName("purpleshovel");
	public static final Item purplesword = new LMRBsword(ModMaterials.purplematerial).setUnlocalizedName("purplesword");
	
	
	public static void init()
	{
		//Purple tools
		GameRegistry.registerItem(purpleaxe, "purpleaxe");
		GameRegistry.registerItem(purplepickaxe, "purplepickaxe");
		GameRegistry.registerItem(purplehoe, "purplehoe");
		GameRegistry.registerItem(purpleshovel, "purpleshovel");
		GameRegistry.registerItem(purplesword, "purplesword");
	}

}
