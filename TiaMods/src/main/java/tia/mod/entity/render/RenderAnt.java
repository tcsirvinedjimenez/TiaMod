package tia.mod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import tia.mod.entity.EntityAnt;
import tia.mod.entity.EntityMonster;
import tia.mod.entity.model.ModelAnt;
import tia.mod.entity.model.ModelMonster;
import tia.mod.util.Reference;

public class RenderAnt extends RenderLiving<EntityAnt> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/ant.png");
	
	public RenderAnt(RenderManager manager) 
	{
		super(manager, new ModelAnt(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityAnt entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityAnt entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	} 

}
