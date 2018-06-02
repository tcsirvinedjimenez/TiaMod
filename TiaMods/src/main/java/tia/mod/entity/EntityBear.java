package tia.mod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityBear extends EntityCow {
	public EntityBear(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 2.8F);
		
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) 
	{
		return new EntityBear(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		//return SoundsHandler.ENTITY_MONSTER_AMBIENT;
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
		//return SoundsHandler.ENTITY_MONSTER_DEATH;
		return super.getDeathSound();
	}


}
