package tia.mod.entity.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import tia.mod.entity.EntityButter;

/**
 * ModelWolf - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelButter extends ModelBase {
    public ModelRenderer topleftfoot;
    public ModelRenderer bodyfur;
    public ModelRenderer wolfbody;
    public ModelRenderer backleftfoot;
    public ModelRenderer backrightfoot;
    public ModelRenderer toprightfoot;
    public ModelRenderer wolftailmid;
    public ModelRenderer wolfhead;
    public ModelRenderer rightear;
    public ModelRenderer leftear;
    public ModelRenderer wolfsnout;
    public ModelRenderer wolftail;

    public ModelButter() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.bodyfur = new ModelRenderer(this, 21, 0);
        this.bodyfur.setRotationPoint(-1.0F, 5.5F, -3.0F);
        this.bodyfur.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
        this.setRotateAngle(bodyfur, 1.5707963267948966F, 0.0F, 0.0F);
        this.rightear = new ModelRenderer(this, 16, 14);
        this.rightear.setRotationPoint(-1.0F, 5.0F, -7.0F);
        this.rightear.addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.leftear = new ModelRenderer(this, 16, 14);
        this.leftear.setRotationPoint(-1.0F, 5.0F, -7.0F);
        this.leftear.addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.wolfhead = new ModelRenderer(this, 0, 0);
        this.wolfhead.setRotationPoint(-1.0F, 5.0F, -7.0F);
        this.wolfhead.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.wolftailmid = new ModelRenderer(this, 9, 18);
        this.wolftailmid.setRotationPoint(-1.0F, -1.4F, 8.0F);
        this.wolftailmid.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(wolftailmid, 0.0F, -0.018675022996339326F, 0.0F);
        this.wolftail = new ModelRenderer(this, 9, 18);
        this.wolftail.setRotationPoint(-1.0F, -3.1F, 9.0F);
        this.wolftail.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(wolftail, -1.5763813804012783F, 0.0F, 0.0F);
        this.topleftfoot = new ModelRenderer(this, 0, 18);
        this.topleftfoot.setRotationPoint(0.5F, 7.5F, -4.0F);
        this.topleftfoot.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfbody = new ModelRenderer(this, 18, 14);
        this.wolfbody.setRotationPoint(0.0F, 5.5F, 2.0F);
        this.wolfbody.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(wolfbody, 1.5707963267948966F, 0.0F, 0.0F);
        this.backleftfoot = new ModelRenderer(this, 0, 18);
        this.backleftfoot.setRotationPoint(0.5F, 7.5F, 7.0F);
        this.backleftfoot.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.backrightfoot = new ModelRenderer(this, 0, 18);
        this.backrightfoot.setRotationPoint(-2.5F, 7.5F, 7.0F);
        this.backrightfoot.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.toprightfoot = new ModelRenderer(this, 0, 18);
        this.toprightfoot.setRotationPoint(-2.5F, 7.5F, -4.0F);
        this.toprightfoot.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfsnout = new ModelRenderer(this, 0, 10);
        this.wolfsnout.setRotationPoint(-1.0F, 5.0F, -7.0F);
        this.wolfsnout.addBox(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bodyfur.render(f5);
        this.rightear.render(f5);
        this.leftear.render(f5);
        this.wolfhead.render(f5);
        this.wolftailmid.render(f5);
        this.wolftail.render(f5);
        this.topleftfoot.render(f5);
        this.wolfbody.render(f5);
        this.backleftfoot.render(f5);
        this.backrightfoot.render(f5);
        this.toprightfoot.render(f5);
        this.wolfsnout.render(f5);
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
    	this.topleftfoot.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.backleftfoot.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.toprightfoot.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.backrightfoot.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.wolfhead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.wolfhead.rotateAngleX = headPitch * 0.017453292F;
    	this.wolfsnout.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.wolfsnout.rotateAngleX = headPitch * 0.017453292F;
    	this.leftear.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.leftear.rotateAngleX = headPitch * 0.017453292F;
    	this.rightear.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.rightear.rotateAngleX = headPitch * 0.017453292F;
    	//Butter's Tail!!! 
    	//this.wolftail.rotateAngleY = ageInTicks;
    	
    }
    /*public float getWagAngle(float partialTickTime, float offset) {
        float f = (this.prevTimeWolfIsHappy + (this.timeWolfIsHappy - this.prevTimeWolfIsHappy) * partialTickTime + offset) / 2.0F;
        if(f < 0.0F) f = 0.0F;
        else if(f > 2.0F) f %= 2.0F;
        return MathHelper.sin(f * (float)Math.PI * 11.0F) * 0.3F * (float)Math.PI;
    }*/
    
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    	EntityButter entitybutter = (EntityButter)entitylivingbaseIn;
    	this.wolftail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.wolftail.setRotationPoint(-1.0F,  12.0F,  8.0F);
    	this.wolftail.rotateAngleZ = entitybutter.getShakeAngle(partialTickTime, -2.F);
    	
    	if ((entitybutter.isSitting() || (entitybutter.motionX == 0.0F)) && entitybutter.getHealth() > 1) {
    		//float wagAngleY = entitybutter.getWagAngle(partialTickTime, 0.0F);
    		float wagAngleY=0.0F;
    		if(wagAngleY == 0.0F)
    				wagAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    		this.wolftail.rotateAngleZ = wagAngleY;
    		this.wolftail.rotateAngleX = wagAngleY;
    	}
    }
}
