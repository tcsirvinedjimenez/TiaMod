package tia.mod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import tia.mod.entity.EntityBear;
import tia.mod.entity.EntityMonster;
import tia.mod.entity.model.ModelBear;
import tia.mod.entity.model.ModelMonster;
import tia.mod.util.Reference;

public class RenderBear extends RenderLiving<EntityBear> {
public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/bear.png");
	
	public RenderBear(RenderManager manager) 
	{
		super(manager, new ModelBear(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBear entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityBear entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
