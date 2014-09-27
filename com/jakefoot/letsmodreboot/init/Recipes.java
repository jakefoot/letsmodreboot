package com.jakefoot.letsmodreboot.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{

	public static void init()
	{
		//GameRegistry.addRecipe(new ItemStack(ModItems.creeperfork), "sss", " s ", " x ",
			//	's', new ItemStack(Items.diamond), 'x', new ItemStack(Items.stick));
		
		//GameRegistry.addShapelessRecipe(new ItemStack (ModBlocks.purpleore),
			//	new ItemStack(ModItems.creeperfork), new ItemStack(ModItems.creeperfork), new ItemStack(ModItems.creeperfork));
		
		
		//Using OreRecipe allows use of any type... in this case any type of "stickWood"
		
		// Items
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.creeperfork), "sss", " s ", " x ",
				's', new ItemStack(Items.diamond), 'x', "stickWood"));
		
		
		//Food
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hotdog), "s", "x", "s",
				's', new ItemStack(Items.bread), 'x', new ItemStack(Items.porkchop)));
		
		
		// Tools
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.purpleaxe), "ss ", "sx ", " x ",
				's', new ItemStack(ModItems.purplegem), 'x', "stickWood"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.purplehoe), "ss ", " x ", " x ",
				's', new ItemStack(ModItems.purplegem), 'x', "stickWood"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.purplepickaxe), "sss", " x ", " x ",
				's', new ItemStack(ModItems.purplegem), 'x', "stickWood"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.purpleshovel), " s ", " x ", " x ",
				's', new ItemStack(ModItems.purplegem), 'x', "stickWood"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.purplesword), " s ", " s ", " x ",
				's', new ItemStack(ModItems.purplegem), 'x', "stickWood"));
		
		
		//Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModArmor.purplehelmet), "sss", "s s",
				's', new ItemStack(ModItems.purplegem)));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModArmor.purplechestplate), "s s", "sss", "sss",
				's', new ItemStack(ModItems.purplegem)));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModArmor.purpleleggings), "sss", "s s", "s s",
				's', new ItemStack(ModItems.purplegem)));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModArmor.purpleboots), "s s", "s s",
				's', new ItemStack(ModItems.purplegem)));
	}

}
