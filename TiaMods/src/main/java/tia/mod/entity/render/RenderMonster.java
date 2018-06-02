package tia.mod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import tia.mod.entity.EntityMonster;
import tia.mod.entity.model.ModelMonster;
import tia.mod.util.Reference;

public class RenderMonster extends RenderLiving<EntityMonster> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/monster.png");
	
	public RenderMonster(RenderManager manager) 
	{
		super(manager, new ModelMonster(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMonster entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityMonster entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
