package tia.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelIronGolem - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelMonster extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer wait;
    public ModelRenderer leftarm;
    public ModelRenderer rightarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer chickenbody;
    public ModelRenderer chickenhead;
    public ModelRenderer chickenleftwing;
    public ModelRenderer chickennose;
    public ModelRenderer chickenrightwing;
    public ModelRenderer chickenredthing;

    public ModelMonster() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.chickenleftwing = new ModelRenderer(this, 24, 13);
        this.chickenleftwing.setRotationPoint(4.0F, -15.0F, 0.0F);
        this.chickenleftwing.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.chickennose = new ModelRenderer(this, 14, 0);
        this.chickennose.setRotationPoint(0.0F, -13.0F, -4.0F);
        this.chickennose.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
        this.rightarm = new ModelRenderer(this, 60, 21);
        this.rightarm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.rightarm.addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.chest = new ModelRenderer(this, 0, 40);
        this.chest.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.chest.addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F);
        this.chickenhead = new ModelRenderer(this, 0, 0);
        this.chickenhead.setRotationPoint(0.0F, -13.0F, -4.0F);
        this.chickenhead.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.setRotateAngle(chickenhead, 0.0F, 0.017453292519943295F, 0.0F);
        this.leftarm = new ModelRenderer(this, 60, 58);
        this.leftarm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.leftarm.addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.leftleg = new ModelRenderer(this, 60, 0);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.leftleg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.chickenrightwing = new ModelRenderer(this, 24, 13);
        this.chickenrightwing.setRotationPoint(-4.0F, -15.0F, 0.0F);
        this.chickenrightwing.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.rightleg = new ModelRenderer(this, 37, 0);
        this.rightleg.setRotationPoint(-4.0F, 11.0F, 0.0F);
        this.rightleg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.chickenredthing = new ModelRenderer(this, 14, 4);
        this.chickenredthing.setRotationPoint(0.0F, -13.0F, -4.0F);
        this.chickenredthing.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
        this.chickenbody = new ModelRenderer(this, 0, 9);
        this.chickenbody.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.chickenbody.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(chickenbody, 1.5707963267948966F, 0.0F, 0.0F);
        this.wait = new ModelRenderer(this, 0, 70);
        this.wait.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.wait.addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.chickenleftwing.render(f5);
        this.chickennose.render(f5);
        this.rightarm.render(f5);
        this.chest.render(f5);
        this.chickenhead.render(f5);
        this.leftarm.render(f5);
        this.leftleg.render(f5);
        this.chickenrightwing.render(f5);
        this.rightleg.render(f5);
        this.chickenredthing.render(f5);
        this.chickenbody.render(f5);
        this.wait.render(f5);
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
