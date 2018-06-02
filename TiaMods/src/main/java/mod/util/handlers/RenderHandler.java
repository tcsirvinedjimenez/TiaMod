package mod.util.handlers;


import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import tia.mod.entity.EntityAnt;
import tia.mod.entity.EntityBear;
import tia.mod.entity.EntityButter;
import tia.mod.entity.EntityMonster;
import tia.mod.entity.EntityUnicorn;
import tia.mod.entity.render.RenderAnt;
import tia.mod.entity.render.RenderBear;
import tia.mod.entity.render.RenderButter;
import tia.mod.entity.render.RenderMonster;
import tia.mod.entity.render.RenderUnicorn;
public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMonster.class, new IRenderFactory<EntityMonster>()
			{

				@Override
				public Render<? super EntityMonster> createRenderFor(RenderManager manager) {
					
					return new RenderMonster(manager);
				}
				
				
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, new IRenderFactory<EntityAnt>()
		{

			@Override
			public Render<? super EntityAnt> createRenderFor(RenderManager manager) {
				
				return new RenderAnt(manager);
			}
			
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new IRenderFactory<EntityBear>()
		{

			@Override
			public Render<? super EntityBear> createRenderFor(RenderManager manager) {
				
				return new RenderBear(manager);
			}
			
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicorn.class, new IRenderFactory<EntityUnicorn>()
		{

			@Override
			public Render<? super EntityUnicorn> createRenderFor(RenderManager manager) {
				
				return new RenderUnicorn(manager);
				
				
			}
			
			
		});
	
		RenderingRegistry.registerEntityRenderingHandler(EntityButter.class, new IRenderFactory<EntityButter>()
		{

			@Override
			public Render<? super EntityButter> createRenderFor(RenderManager manager) {
				
				return new RenderButter(manager);
			}
			
			
		});
	}
}


