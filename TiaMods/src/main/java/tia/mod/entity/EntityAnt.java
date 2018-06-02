package tia.mod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityAnt extends EntityCow{

	public EntityAnt(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 2.8F);
		
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) 
	{
		return new EntityAnt(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		
		return super.getHurtSound(source);
	}
	
	@Override 
	protected SoundEvent getDeathSound() 
	{
		
		return super.getDeathSound();
	} 

}
