package com.tia.mod;






import net.minecraft.block.Block;

import net.minecraft.item.Item;

import net.minecraft.world.WorldType;

import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraftforge.event.RegistryEvent;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.common.registry.GameRegistry;



@EventBusSubscriber

public class RegistryHandler 

{

	@SubscribeEvent

	public static void onItemRegister(RegistryEvent.Register<Item> event)

	{

		//event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));

	}

	

	@SubscribeEvent

	public static void onBlockRegister(RegistryEvent.Register<Block> event)

	{

		//event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));

	}

	

	@SubscribeEvent

	public static void onModelRegister(ModelRegistryEvent event)

	{

		
	}

	

	public static void preInitRegistries()

	{

		
		

	}

	

	public static void initRegistries()

	{

		

	}

	

	public static void postInitRegistries()

	{

		

	}

}