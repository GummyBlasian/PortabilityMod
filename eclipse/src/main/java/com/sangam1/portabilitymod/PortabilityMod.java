package com.sangam1.portabilitymod;

import com.sangam1.portabilitymod.Proxy.CommonProxy;
import com.sangam1.portabilitymod.References.CreativeTabsList;
import com.sangam1.portabilitymod.References.StartupRef;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = StartupRef.MODID, version = StartupRef.VERSION, updateJSON = StartupRef.UPDATEURL, name = StartupRef.NAME, guiFactory = StartupRef.GUIFACTORY)
public class PortabilityMod {

	@SidedProxy(serverSide = "com.sangam1.portabilitymod.Proxy.CommonProxy", clientSide = "com.sangam1.portabilitymod.Proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance(StartupRef.MODID)
	public static PortabilityMod instance;

	public static final CreativeTabsList creativeTab = new CreativeTabsList();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("InventoryRepair: Pre-Init Complete");
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("InventoryRepair: Init Complete");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		System.out.println("InventoryRepair: Post-Init Complete");
	}
}