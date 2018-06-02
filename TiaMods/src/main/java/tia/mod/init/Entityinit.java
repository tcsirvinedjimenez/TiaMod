package tia.mod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import tia.mod.Main;
import tia.mod.entity.EntityAnt;
import tia.mod.entity.EntityBear;
import tia.mod.entity.EntityButter;
import tia.mod.entity.EntityMonster;
import tia.mod.entity.EntityUnicorn;
import tia.mod.util.Reference;

public class Entityinit {
	
	public static void registerEntities()
	{
		registerEntity("monster", EntityMonster.class, Reference.ENTITY_MONSTER, 50, 11437146, 000000);
		registerEntity("ant", EntityAnt.class, Reference.ENTITY_ANT, 50, 11437146, 000000);
		registerEntity("bear", EntityBear.class, Reference.ENTITY_BEAR, 50, 11437146, 000000);
		registerEntity("unicorn", EntityUnicorn.class, 123, 50, 11437146, 000000);
		registerEntity("butter", EntityButter.class, 124, 50, 11437146, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
}
