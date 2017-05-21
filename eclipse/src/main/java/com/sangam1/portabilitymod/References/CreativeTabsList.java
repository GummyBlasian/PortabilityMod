package com.sangam1.portabilitymod.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabsList extends CreativeTabs{

	public CreativeTabsList() {
		super(StartupRef.MODID);
		//setBackgroundImageName("tutorialmod.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Blocks.CRAFTING_TABLE); //shown icon on creative tab
	}
	
	 @Override
	 public boolean hasSearchBar() {
		 return true; // return false if you don't want search bar
	 }

}