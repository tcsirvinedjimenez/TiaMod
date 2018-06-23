package mod.util.handlers;

import com.tia.mod.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {

		public static SoundEvent ENTITY_UNICORN_AMBIENT, ENTITY_UNICORN_HURT, ENTITY_UNICORN_DEATH;
	
		public static void registerSounds ()
		{
			ENTITY_UNICORN_AMBIENT = registerSound("entity.unicorn.ambient");
			ENTITY_UNICORN_HURT = registerSound("entity.unicorn.hurt");
			ENTITY_UNICORN_DEATH = registerSound("entity.unicorn.death");
		}
		
		public static SoundEvent registerSound(String name)
		{
			ResourceLocation location = new ResourceLocation(Reference.MODID, name);
			SoundEvent event = new SoundEvent(location);
			event.setRegistryName(name);
			ForgeRegistries.SOUND_EVENTS.register(event);
			return event;
		}
}
