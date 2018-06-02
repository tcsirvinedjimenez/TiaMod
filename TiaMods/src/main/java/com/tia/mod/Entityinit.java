package com.tia.mod;

import net.minecraft.entity.Entity;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.EntityRegistry;



public class Entityinit 

{

	public static void registerEntities()

	{

		// Where We Put entities

	}

	

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)

	{

		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);

	}

}
