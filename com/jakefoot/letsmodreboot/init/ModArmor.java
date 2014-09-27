package com.jakefoot.letsmodreboot.init;

import com.jakefoot.letsmodreboot.combat.PurpleArmor;
import com.jakefoot.letsmodreboot.materials.ModMaterials;
import com.jakefoot.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModArmor
{
	
	public static int helmetID;
	public static int chestplateID;
	public static int leggingsID;
	public static int bootsID;
	
	
	public static final PurpleArmor purplehelmet = new PurpleArmor(ModMaterials.purplearmormaterial, helmetID, 0);
	public static final PurpleArmor purplechestplate = new PurpleArmor(ModMaterials.purplearmormaterial, chestplateID, 1);
	public static final PurpleArmor purpleleggings = new PurpleArmor(ModMaterials.purplearmormaterial, leggingsID, 2);
	public static final PurpleArmor purpleboots = new PurpleArmor(ModMaterials.purplearmormaterial, bootsID, 3);

	public static void init()
	{
		GameRegistry.registerItem(purplehelmet, "purplehelmet");
		GameRegistry.registerItem(purplechestplate, "purplechestplate");
		GameRegistry.registerItem(purpleleggings, "purpleleggings");
		GameRegistry.registerItem(purpleboots, "purpleboots");
	}

}
