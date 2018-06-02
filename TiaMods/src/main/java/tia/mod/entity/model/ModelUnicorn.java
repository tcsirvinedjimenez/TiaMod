package tia.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelUnicorn extends ModelBase {
    public ModelRenderer bottomearleft;
    public ModelRenderer topearleft;
    public ModelRenderer topface;
    public ModelRenderer bottomearright;
    public ModelRenderer topearright;
    public ModelRenderer toplefthoof;
    public ModelRenderer sideneckstickleft;
    public ModelRenderer sideneckstickright;
    public ModelRenderer rightnostril;
    public ModelRenderer backleftankle;
    public ModelRenderer leftbackhoof;
    public ModelRenderer frontleftthigh;
    public ModelRenderer frontrightthigh;
    public ModelRenderer frontleftankle;
    public ModelRenderer frontrightankle;
    public ModelRenderer horsehead;
    public ModelRenderer horsebody;
    public ModelRenderer toptail;
    public ModelRenderer backleftthigh;
    public ModelRenderer leftnostril;
    public ModelRenderer horseneck;
    public ModelRenderer horsemane;
    public ModelRenderer tailnub;
    public ModelRenderer bottomtail;
    public ModelRenderer backrightthigh;
    public ModelRenderer backrightankle;
    public ModelRenderer backrighthoof;
    public ModelRenderer toprighthoof;
    public ModelRenderer horn;
    public ModelRenderer snout;
    public ModelRenderer mouth;

    public ModelUnicorn() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.topearleft = new ModelRenderer(this, 0, 12);
        this.topearleft.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.topearleft.addBox(-2.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(topearleft, 0.5235987755982988F, 0.0F, 0.2617993877991494F);
        this.sideneckstickright = new ModelRenderer(this, 44, 5);
        this.sideneckstickright.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.sideneckstickright.addBox(-2.6F, -6.0F, -6.0F, 0, 3, 16, 0.0F);
        this.topface = new ModelRenderer(this, 0, 0);
        this.topface.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.topface.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(topface, 0.5235987755982988F, 0.0F, 0.0F);
        this.frontrightthigh = new ModelRenderer(this, 60, 29);
        this.frontrightthigh.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frontrightthigh.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.frontleftthigh = new ModelRenderer(this, 44, 29);
        this.frontleftthigh.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.frontleftthigh.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.horseneck = new ModelRenderer(this, 0, 12);
        this.horseneck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.horseneck.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(horseneck, 0.5235987755982988F, 0.0F, 0.0F);
        this.toplefthoof = new ModelRenderer(this, 44, 51);
        this.toplefthoof.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.toplefthoof.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.backleftankle = new ModelRenderer(this, 78, 43);
        this.backleftankle.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backleftankle.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.horsebody = new ModelRenderer(this, 0, 34);
        this.horsebody.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.horsebody.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.horn = new ModelRenderer(this, 4, 77);
        this.horn.setRotationPoint(-0.4F, -13.3F, -18.2F);
        this.horn.addBox(0.0F, 0.0F, 0.0F, 3, 9, 1, 0.0F);
        this.setRotateAngle(horn, 0.5113814708343385F, 0.0F, 0.0F);
        this.horsehead = new ModelRenderer(this, 80, 12);
        this.horsehead.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.horsehead.addBox(-2.5F, -10.1F, -7.0F, 5, 5, 12, 0.2F);
        this.setRotateAngle(horsehead, 0.5235987755982988F, 0.0F, 0.0F);
        this.mouth = new ModelRenderer(this, 24, 27);
        this.mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mouth.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.frontleftankle = new ModelRenderer(this, 44, 41);
        this.frontleftankle.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontleftankle.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.bottomearright = new ModelRenderer(this, 0, 0);
        this.bottomearright.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.bottomearright.addBox(-2.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(bottomearright, 0.5235987755982988F, 0.0F, 0.0F);
        this.bottomtail = new ModelRenderer(this, 24, 3);
        this.bottomtail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.bottomtail.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(bottomtail, -1.5707963267948966F, 0.0F, 0.0F);
        this.horsemane = new ModelRenderer(this, 58, 0);
        this.horsemane.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.horsemane.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(horsemane, 0.5235987755982988F, 0.0F, 0.0F);
        this.leftbackhoof = new ModelRenderer(this, 78, 51);
        this.leftbackhoof.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.leftbackhoof.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.backrightankle = new ModelRenderer(this, 96, 43);
        this.backrightankle.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backrightankle.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.toprighthoof = new ModelRenderer(this, 60, 51);
        this.toprighthoof.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.toprighthoof.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.frontrightankle = new ModelRenderer(this, 60, 41);
        this.frontrightankle.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontrightankle.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.snout = new ModelRenderer(this, 24, 18);
        this.snout.setRotationPoint(0.0F, 0.02F, 0.02F);
        this.snout.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.bottomearleft = new ModelRenderer(this, 0, 0);
        this.bottomearleft.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.bottomearleft.addBox(0.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(bottomearleft, 0.5235987755982988F, 0.0F, 0.0F);
        this.sideneckstickleft = new ModelRenderer(this, 44, 10);
        this.sideneckstickleft.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.sideneckstickleft.addBox(2.6F, -6.0F, -6.0F, 0, 3, 16, 0.0F);
        this.leftnostril = new ModelRenderer(this, 74, 13);
        this.leftnostril.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.leftnostril.addBox(1.5F, -8.0F, -4.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(leftnostril, 0.5235987755982988F, 0.0F, 0.0F);
        this.tailnub = new ModelRenderer(this, 44, 0);
        this.tailnub.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailnub.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tailnub, -1.3089969389957472F, 0.0F, 0.0F);
        this.backrighthoof = new ModelRenderer(this, 96, 51);
        this.backrighthoof.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backrighthoof.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.topearright = new ModelRenderer(this, 0, 12);
        this.topearright.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.topearright.addBox(0.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(topearright, 0.5235987755982988F, 0.0F, -0.2617993877991494F);
        this.toptail = new ModelRenderer(this, 38, 7);
        this.toptail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.toptail.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(toptail, -1.3089969389957472F, 0.0F, 0.0F);
        this.rightnostril = new ModelRenderer(this, 74, 13);
        this.rightnostril.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.rightnostril.addBox(-2.5F, -8.0F, -4.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rightnostril, 0.5235987755982988F, 0.0F, 0.0F);
        this.backleftthigh = new ModelRenderer(this, 78, 29);
        this.backleftthigh.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.backleftthigh.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.backrightthigh = new ModelRenderer(this, 96, 29);
        this.backrightthigh.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.backrightthigh.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.topface.addChild(this.mouth);
        this.topface.addChild(this.snout);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.topearleft.render(f5);
        this.sideneckstickright.render(f5);
        this.topface.render(f5);
        this.frontrightthigh.render(f5);
        this.frontleftthigh.render(f5);
        this.horseneck.render(f5);
        this.toplefthoof.render(f5);
        this.backleftankle.render(f5);
        this.horsebody.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.horn.offsetX, this.horn.offsetY, this.horn.offsetZ);
        GlStateManager.translate(this.horn.rotationPointX * f5, this.horn.rotationPointY * f5, this.horn.rotationPointZ * f5);
        GlStateManager.scale(0.3D, 1.0D, 1.0D);
        GlStateManager.translate(-this.horn.offsetX, -this.horn.offsetY, -this.horn.offsetZ);
        GlStateManager.translate(-this.horn.rotationPointX * f5, -this.horn.rotationPointY * f5, -this.horn.rotationPointZ * f5);
        this.horn.render(f5);
        GlStateManager.popMatrix();
        this.horsehead.render(f5);
        this.frontleftankle.render(f5);
        this.bottomearright.render(f5);
        this.bottomtail.render(f5);
        this.horsemane.render(f5);
        this.leftbackhoof.render(f5);
        this.backrightankle.render(f5);
        this.toprighthoof.render(f5);
        this.frontrightankle.render(f5);
        this.bottomearleft.render(f5);
        this.sideneckstickleft.render(f5);
        this.leftnostril.render(f5);
        this.tailnub.render(f5);
        this.backrighthoof.render(f5);
        this.topearright.render(f5);
        this.toptail.render(f5);
        this.rightnostril.render(f5);
        this.backleftthigh.render(f5);
        this.backrightthigh.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.toplefthoof.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.leftbackhoof.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.toprighthoof.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.backrighthoof.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	//this.frontleftthigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	//this.backleftthigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	//this.frontrightthigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	//this.backrightthigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.frontleftankle.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.backleftankle.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.frontrightankle.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.backrightankle.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	//this.horsehead.rotateAngleY = netHeadYaw * 0.017453292F;
    	//this.horsehead.rotateAngleX = headPitch * 0.017453292F;
    	//this.rightnostril.rotateAngleY = netHeadYaw * 0.017453292F;
    	//this.rightnostril.rotateAngleX = headPitch * 0.017453292F;
    	//this.leftnostril.rotateAngleY = netHeadYaw * 0.017453292F;
    	/*this.leftnostril.rotateAngleX = headPitch * 0.017453292F;
    	this.bottomearright.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.bottomearright.rotateAngleX = headPitch * 0.017453292F;
    	this.bottomearleft.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.bottomearleft.rotateAngleX = headPitch * 0.017453292F;
    	this.topearleft.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.topearleft.rotateAngleX = headPitch * 0.017453292F;
    	this.topearright.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.topearright.rotateAngleX = headPitch * 0.017453292F;
    	this.horn.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.horn.rotateAngleX = headPitch * 0.017453292F;*/




    }
}
