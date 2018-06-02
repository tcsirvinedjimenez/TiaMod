package tia.mod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityUnicorn extends EntityCow{

	public EntityUnicorn(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 2.8F);
		
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) 
	{
		return new EntityUnicorn(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		//return SoundsHandler.ENTITY_UNICORN-AMBIENT;
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		//return SoundsHandler.ENTITY_MONSTER_HURT;
		return super.getHurtSound(source);
	}
	
	@Override 
	protected SoundEvent getDeathSound() 
	{
		//return SoundsHandler.ENTITY_UNICORN_DEATH;
		return super.getDeathSound();
	}
	 @Override
		protected void initEntityAI() 
	 {
		 this.tasks.addTask(0, new EntityAISwimming(this));
	     this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
	     this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	     this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.GOLDEN_APPLE, false));
	     this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
	     this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
	     this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	     this.tasks.addTask(7, new EntityAILookIdle(this));
	 }
}
