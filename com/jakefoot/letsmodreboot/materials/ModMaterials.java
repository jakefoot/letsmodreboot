package com.jakefoot.letsmodreboot.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials
{
	//Purple Material
	public static ToolMaterial purplematerial = EnumHelper.addToolMaterial("purplematerial", 3, 1300, 10.0f, 8.0f, 10);
	public static ArmorMaterial purplearmormaterial = EnumHelper.addArmorMaterial("purplearmormaterial", 40, new int[]{4, 10, 8, 4}, 10);
	
}
