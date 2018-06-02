package tia.mod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import tia.mod.entity.EntityUnicorn;
import tia.mod.entity.model.ModelUnicorn;
import tia.mod.util.Reference;

public class RenderUnicorn extends RenderLiving<EntityUnicorn> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/unicorn.png");
	
	public RenderUnicorn(RenderManager manager) 
	{
		super(manager, new ModelUnicorn(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityUnicorn entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityUnicorn entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
