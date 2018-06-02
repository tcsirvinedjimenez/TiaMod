package tia.mod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tia.mod.init.Entityinit;
import tia.mod.interfaces.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		// items get registered
		//event.getRegistry().registerAll(Iteminit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		//blocks get registered
		//event.getRegistry().registerAll(Blockinit.BLOCKS.toArray(new Block[0]));
	}
	
	//subscribe event to register models need
	
	public static void preInitRegistries()
	{
		
		
		
		Entityinit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	public static void initRegistries()
	{
		//SoundsHandler.registerSounds();
	}
	
	public static void postInitRegistries()
	{
		
	}
}
