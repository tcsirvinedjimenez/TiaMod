package com.tia.mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Main 

{
	//This starts the OP mod
	@Instance

	public static Main instance;

	
	//This is so my mods work on servers
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)

	public static CommonProxy proxy;

	

	//public static final CreativeTabs TUTORIAL = new TutorialTab("tutorialtab");

	

	@EventHandler

	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}

	@EventHandler

	public static void init(FMLInitializationEvent event) {}

	@EventHandler

	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}

}
