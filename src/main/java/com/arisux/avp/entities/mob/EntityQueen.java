package com.arisux.avp.entities.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.interfaces.IHiveSignature;

public class EntityQueen extends EntityXenomorph implements IHiveSignature
{
	public boolean isInStasis;
	private float ovipositorSize;

	public EntityQueen(World var1)
	{
		super(var1);
		this.setSize(4.0F, 8.0F);
		this.isInStasis = true;
		this.experienceValue = 40000;
		this.jumpMovementFactor = 0.1F;
		this.hurtResistantTime = 0;
		this.ignoreFrustumCheck = true;
		this.ovipositorSize = 0F;
		this.setHiveSignature(this.getUniqueID());
		this.dataWatcher.addObject(14, this.ovipositorSize);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(2, new EntityAILeapAtTarget(this, 1F));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityYautja.class, 1.0D, false));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityAnimal.class, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityYautja.class, 0, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityAnimal.class, 0, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityMarine.class, 0, false));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5700000238418579D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		this.motionY += -0.5F;

		if (isJumping)
		{
			this.addVelocity(0, 0.25D, 0);
		}

		if (this.isInStasis)
		{
			this.tasks.taskEntries.clear();
			this.targetTasks.taskEntries.clear();
			this.ovipositorSize = this.ovipositorSize < 1.2F ? this.ovipositorSize += 0.0001F : this.ovipositorSize;
		}

		if (this.getHealth() > this.getMaxHealth() - (this.getMaxHealth() / 4))
		{
			this.heal(0.3F);
		}

		if (this.getHealth() > this.getMaxHealth() / 2)
		{
			this.heal(0.2F);
		}

		if (this.getHealth() > this.getMaxHealth() / 4)
		{
			this.heal(0.1F);
		}
	}

	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected String getHurtSound()
	{
		return AliensVsPredator.properties().SOUND_QUEEN_HURT;
	}

	@Override
	protected String getLivingSound()
	{
		return this.getHealth() > this.getMaxHealth() / 4 ? AliensVsPredator.properties().SOUND_QUEEN_LIVING + ".constant" : AliensVsPredator.properties().SOUND_QUEEN_LIVING;
	}

	@Override
	protected String getDeathSound()
	{
		return AliensVsPredator.properties().SOUND_QUEEN_DEATH;
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt)
	{
		super.readEntityFromNBT(nbt);
		this.setOvipositorSize(nbt.getFloat("ovipositorSize"));
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt)
	{
		super.writeEntityToNBT(nbt);
		nbt.setFloat("ovipositorSize", this.getOvipositorSize());
	}
	
	public float getOvipositorSize()
	{
		return this.dataWatcher.getWatchableObjectFloat(14);
	}
	
	public void setOvipositorSize(float size)
	{
		this.dataWatcher.updateObject(14, size);
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return true;
	}
}
