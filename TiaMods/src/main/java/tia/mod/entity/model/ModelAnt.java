package tia.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelAnt extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer backleft;
    public ModelRenderer anteaterleftleg;
    public ModelRenderer backright;
    public ModelRenderer anteaterrightleg;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer ear;
    public ModelRenderer head2;
    public ModelRenderer head4;
    public ModelRenderer finalhead;
    public ModelRenderer ear2;

    public ModelAnt() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head4 = new ModelRenderer(this, 0, 0);
        this.head4.setRotationPoint(0.0F, 5.7F, -19.0F);
        this.head4.addBox(-4.0F, 1.8F, -6.0F, 8, 8, 6, 0.0F);
        this.setRotateAngle(head4, 0.18203784098300857F, 0.0F, 0.0F);
        this.finalhead = new ModelRenderer(this, 0, 0);
        this.finalhead.setRotationPoint(0.0F, 4.5F, -8.0F);
        this.finalhead.addBox(-4.0F, 1.8F, -6.0F, 8, 8, 6, 0.0F);
        this.anteaterrightleg = new ModelRenderer(this, 0, 16);
        this.anteaterrightleg.setRotationPoint(-4.0F, 15.0F, -6.0F);
        this.anteaterrightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.backleft = new ModelRenderer(this, 0, 16);
        this.backleft.setRotationPoint(4.0F, 15.0F, 7.0F);
        this.backleft.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head2 = new ModelRenderer(this, 0, 0);
        this.head2.setRotationPoint(0.0F, 5.7F, -12.0F);
        this.head2.addBox(-4.0F, 1.8F, -6.0F, 8, 8, 6, 0.0F);
        this.backright = new ModelRenderer(this, 0, 16);
        this.backright.setRotationPoint(-4.0F, 15.0F, 7.0F);
        this.backright.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.tail2 = new ModelRenderer(this, 18, 4);
        this.tail2.setRotationPoint(-3.0F, 5.3F, 12.1F);
        this.tail2.addBox(0.0F, 0.0F, 0.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(tail2, 0.7285004297824331F, -0.06981317007977318F, 0.0F);
        this.ear2 = new ModelRenderer(this, 0, 0);
        this.ear2.setRotationPoint(2.8F, 3.4F, -8.9F);
        this.ear2.addBox(-4.0F, 1.8F, -6.0F, 8, 8, 6, 0.0F);
        this.tail1 = new ModelRenderer(this, 18, 4);
        this.tail1.setRotationPoint(-3.0F, 5.2F, 6.3F);
        this.tail1.addBox(0.0F, 0.0F, 0.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(tail1, 0.5462880558742251F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 18, 4);
        this.body.setRotationPoint(0.0F, 8.0F, 2.0F);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
        this.ear = new ModelRenderer(this, 0, 0);
        this.ear.setRotationPoint(-2.8F, 3.3F, -8.9F);
        this.ear.addBox(-4.0F, 1.8F, -6.0F, 8, 8, 6, 0.0F);
        this.anteaterleftleg = new ModelRenderer(this, 0, 16);
        this.anteaterleftleg.setRotationPoint(4.0F, 15.0F, -6.0F);
        this.anteaterleftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.head4.offsetX, this.head4.offsetY, this.head4.offsetZ);
        GlStateManager.translate(this.head4.rotationPointX * f5, this.head4.rotationPointY * f5, this.head4.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.5D, 1.3D);
        GlStateManager.translate(-this.head4.offsetX, -this.head4.offsetY, -this.head4.offsetZ);
        GlStateManager.translate(-this.head4.rotationPointX * f5, -this.head4.rotationPointY * f5, -this.head4.rotationPointZ * f5);
        this.head4.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.finalhead.offsetX, this.finalhead.offsetY, this.finalhead.offsetZ);
        GlStateManager.translate(this.finalhead.rotationPointX * f5, this.finalhead.rotationPointY * f5, this.finalhead.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.7D, 1.0D);
        GlStateManager.translate(-this.finalhead.offsetX, -this.finalhead.offsetY, -this.finalhead.offsetZ);
        GlStateManager.translate(-this.finalhead.rotationPointX * f5, -this.finalhead.rotationPointY * f5, -this.finalhead.rotationPointZ * f5);
        this.finalhead.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.anteaterrightleg.offsetX, this.anteaterrightleg.offsetY, this.anteaterrightleg.offsetZ);
        GlStateManager.translate(this.anteaterrightleg.rotationPointX * f5, this.anteaterrightleg.rotationPointY * f5, this.anteaterrightleg.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.anteaterrightleg.offsetX, -this.anteaterrightleg.offsetY, -this.anteaterrightleg.offsetZ);
        GlStateManager.translate(-this.anteaterrightleg.rotationPointX * f5, -this.anteaterrightleg.rotationPointY * f5, -this.anteaterrightleg.rotationPointZ * f5);
        this.anteaterrightleg.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backleft.offsetX, this.backleft.offsetY, this.backleft.offsetZ);
        GlStateManager.translate(this.backleft.rotationPointX * f5, this.backleft.rotationPointY * f5, this.backleft.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.backleft.offsetX, -this.backleft.offsetY, -this.backleft.offsetZ);
        GlStateManager.translate(-this.backleft.rotationPointX * f5, -this.backleft.rotationPointY * f5, -this.backleft.rotationPointZ * f5);
        this.backleft.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.head2.offsetX, this.head2.offsetY, this.head2.offsetZ);
        GlStateManager.translate(this.head2.rotationPointX * f5, this.head2.rotationPointY * f5, this.head2.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.5D, 1.3D);
        GlStateManager.translate(-this.head2.offsetX, -this.head2.offsetY, -this.head2.offsetZ);
        GlStateManager.translate(-this.head2.rotationPointX * f5, -this.head2.rotationPointY * f5, -this.head2.rotationPointZ * f5);
        this.head2.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backright.offsetX, this.backright.offsetY, this.backright.offsetZ);
        GlStateManager.translate(this.backright.rotationPointX * f5, this.backright.rotationPointY * f5, this.backright.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 0.9D);
        GlStateManager.translate(-this.backright.offsetX, -this.backright.offsetY, -this.backright.offsetZ);
        GlStateManager.translate(-this.backright.rotationPointX * f5, -this.backright.rotationPointY * f5, -this.backright.rotationPointZ * f5);
        this.backright.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.tail2.offsetX, this.tail2.offsetY, this.tail2.offsetZ);
        GlStateManager.translate(this.tail2.rotationPointX * f5, this.tail2.rotationPointY * f5, this.tail2.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.3D, 0.8D);
        GlStateManager.translate(-this.tail2.offsetX, -this.tail2.offsetY, -this.tail2.offsetZ);
        GlStateManager.translate(-this.tail2.rotationPointX * f5, -this.tail2.rotationPointY * f5, -this.tail2.rotationPointZ * f5);
        this.tail2.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ear2.offsetX, this.ear2.offsetY, this.ear2.offsetZ);
        GlStateManager.translate(this.ear2.rotationPointX * f5, this.ear2.rotationPointY * f5, this.ear2.rotationPointZ * f5);
        GlStateManager.scale(0.1D, 0.3D, 0.8D);
        GlStateManager.translate(-this.ear2.offsetX, -this.ear2.offsetY, -this.ear2.offsetZ);
        GlStateManager.translate(-this.ear2.rotationPointX * f5, -this.ear2.rotationPointY * f5, -this.ear2.rotationPointZ * f5);
        this.ear2.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.tail1.offsetX, this.tail1.offsetY, this.tail1.offsetZ);
        GlStateManager.translate(this.tail1.rotationPointX * f5, this.tail1.rotationPointY * f5, this.tail1.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.4D, 0.9D);
        GlStateManager.translate(-this.tail1.offsetX, -this.tail1.offsetY, -this.tail1.offsetZ);
        GlStateManager.translate(-this.tail1.rotationPointX * f5, -this.tail1.rotationPointY * f5, -this.tail1.rotationPointZ * f5);
        this.tail1.render(f5);
        GlStateManager.popMatrix();
        this.body.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ear.offsetX, this.ear.offsetY, this.ear.offsetZ);
        GlStateManager.translate(this.ear.rotationPointX * f5, this.ear.rotationPointY * f5, this.ear.rotationPointZ * f5);
        GlStateManager.scale(0.1D, 0.3D, 0.8D);
        GlStateManager.translate(-this.ear.offsetX, -this.ear.offsetY, -this.ear.offsetZ);
        GlStateManager.translate(-this.ear.rotationPointX * f5, -this.ear.rotationPointY * f5, -this.ear.rotationPointZ * f5);
        this.ear.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.anteaterleftleg.offsetX, this.anteaterleftleg.offsetY, this.anteaterleftleg.offsetZ);
        GlStateManager.translate(this.anteaterleftleg.rotationPointX * f5, this.anteaterleftleg.rotationPointY * f5, this.anteaterleftleg.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.anteaterleftleg.offsetX, -this.anteaterleftleg.offsetY, -this.anteaterleftleg.offsetZ);
        GlStateManager.translate(-this.anteaterleftleg.rotationPointX * f5, -this.anteaterleftleg.rotationPointY * f5, -this.anteaterleftleg.rotationPointZ * f5);
        this.anteaterleftleg.render(f5);
        GlStateManager.popMatrix();
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
