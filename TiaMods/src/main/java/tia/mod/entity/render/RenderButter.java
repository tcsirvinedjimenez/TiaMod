package tia.mod.entity.render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import tia.mod.entity.EntityButter;
import tia.mod.entity.EntityUnicorn;
import tia.mod.entity.model.ModelButter;
import tia.mod.entity.model.ModelUnicorn;
import tia.mod.util.Reference;
public class RenderButter extends RenderLiving<EntityButter> {
 
 public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/butter.png");
 
 public RenderButter(RenderManager manager)
 {
  super(manager, new ModelButter(), 0.5F);
 }
 
 @Override
 protected ResourceLocation getEntityTexture(EntityButter entity)
 {
  return TEXTURES;
 }
 @Override
 protected void applyRotations(EntityButter entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
 {
  super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
 }
}

