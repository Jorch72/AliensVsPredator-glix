package com.arisux.avp.entities.mob;

import java.util.UUID;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import com.arisux.airi.engine.WorldEngine;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.EntityAcidPool;
import com.arisux.avp.interfaces.IHiveSignature;
import com.arisux.avp.packets.client.PacketKillCountClientUpdate;

public abstract class EntitySpeciesAlien extends EntityMob implements IMob, IHiveSignature
{
	private Class<? extends EntitySpeciesAlien> entityEvolveTo;
	private UUID signature;
	protected int killedEntities;
	protected int minKillsToEvolve;

	public EntitySpeciesAlien(World world)
	{
		super(world);
		this.jumpMovementFactor = 0.2F;
		this.killedEntities = 0;
		this.setEvolveTo(null, 0);
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
	}

	public void setEvolveTo(Class<? extends EntitySpeciesAlien> entityEvolveTo, int minKillsToEvolve)
	{
		this.entityEvolveTo = entityEvolveTo;
		this.minKillsToEvolve = minKillsToEvolve;
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt)
	{
		super.writeEntityToNBT(nbt);

		nbt.setInteger("killedEntities", this.killedEntities);

		if (signature != null)
		{
			nbt.setString("hiveSignature", this.signature.toString());
		}
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt)
	{
		super.readEntityFromNBT(nbt);

		this.killedEntities = nbt.getInteger("killedEntities");
		this.signature = UUID.fromString(nbt.getString("hiveSignature"));
	}

	@Override
	public void onKillEntity(EntityLivingBase par1EntityLivingBase)
	{
		super.onKillEntity(par1EntityLivingBase);

		this.killedEntities++;
		AliensVsPredator.instance().network.sendToAll(new PacketKillCountClientUpdate(this.getKilledEntities(), Integer.valueOf(this.getEntityId())));

		if (!this.worldObj.isRemote && entityEvolveTo != null && minKillsToEvolve != 0 && this.killedEntities >= minKillsToEvolve)
		{
			EntitySpeciesAlien entity = (EntitySpeciesAlien) WorldEngine.Entities.constructEntity(this.worldObj, this.entityEvolveTo);
			entity.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
			this.worldObj.spawnEntityInWorld(entity);
			this.setDead();
		}
	}

	@Override
	protected boolean canDespawn()
	{
		return !(this.getKilledEntities() > 1);
	}

	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public void onDeath(DamageSource par1DamageSource)
	{
		super.onDeath(par1DamageSource);

		if (!this.worldObj.isRemote)
		{
			EntityAcidPool entity = new EntityAcidPool(this.worldObj);
			entity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
			this.worldObj.spawnEntityInWorld(entity);
		}
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	public int getKilledEntities()
	{
		return killedEntities;
	}

	public void setKilledEntities(int kills)
	{
		this.killedEntities = kills;
	}

	@Override
	public UUID getHiveSignature()
	{
		return this.signature;
	}

	@Override
	public void setHiveSignature(UUID signature)
	{
		this.signature = signature;
	}
}
