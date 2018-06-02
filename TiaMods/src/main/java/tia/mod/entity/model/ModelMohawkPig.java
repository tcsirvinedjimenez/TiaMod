package tia.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelPig - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelMohawkPig extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer field_78150_a0;
    public ModelRenderer field_78150_a1;
    public ModelRenderer field_78146_d_1;

    public ModelMohawkPig() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, 28, 8);
        this.Body.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.Body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78146_d_1 = new ModelRenderer(this, 0, 16);
        this.field_78146_d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78146_d_1.addBox(0.7F, -1.3F, -30.9F, 4, 6, 14, 0.0F);
        this.field_78149_c = new ModelRenderer(this, 0, 16);
        this.field_78149_c.setRotationPoint(-3.0F, 18.0F, 7.0F);
        this.field_78149_c.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78150_a0 = new ModelRenderer(this, 0, 0);
        this.field_78150_a0.setRotationPoint(0.0F, 12.0F, -6.0F);
        this.field_78150_a0.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.field_78150_a1 = new ModelRenderer(this, 16, 16);
        this.field_78150_a1.setRotationPoint(0.0F, 12.0F, -6.0F);
        this.field_78150_a1.addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 0, 16);
        this.field_78147_e.setRotationPoint(-3.0F, 18.0F, -5.0F);
        this.field_78147_e.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78144_f = new ModelRenderer(this, 0, 16);
        this.field_78144_f.setRotationPoint(3.0F, 18.0F, -5.0F);
        this.field_78144_f.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78146_d = new ModelRenderer(this, 0, 16);
        this.field_78146_d.setRotationPoint(3.0F, 18.0F, 7.0F);
        this.field_78146_d.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78146_d_1.offsetX, this.field_78146_d_1.offsetY, this.field_78146_d_1.offsetZ);
        GlStateManager.translate(this.field_78146_d_1.rotationPointX * f5, this.field_78146_d_1.rotationPointY * f5, this.field_78146_d_1.rotationPointZ * f5);
        GlStateManager.scale(0.2D, 1.8D, 0.4D);
        GlStateManager.translate(-this.field_78146_d_1.offsetX, -this.field_78146_d_1.offsetY, -this.field_78146_d_1.offsetZ);
        GlStateManager.translate(-this.field_78146_d_1.rotationPointX * f5, -this.field_78146_d_1.rotationPointY * f5, -this.field_78146_d_1.rotationPointZ * f5);
        this.field_78146_d_1.render(f5);
        GlStateManager.popMatrix();
        this.field_78149_c.render(f5);
        this.field_78150_a0.render(f5);
        this.field_78150_a1.render(f5);
        this.field_78147_e.render(f5);
        this.field_78144_f.render(f5);
        this.field_78146_d.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
