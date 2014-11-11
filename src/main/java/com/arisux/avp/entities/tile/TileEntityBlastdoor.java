package com.arisux.avp.entities.tile;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityBlastdoor extends PoweredTileEntity
{
	public float doorOpenProgress;
	
	@Override
	public void onVoltageTick()
	{
		super.onVoltageTick();
		doorOpenProgress = doorOpenProgress < 1.0F ? doorOpenProgress + 0.01F : doorOpenProgress;
	}
	
	@Override
	public void onUnderloadTick()
	{
		super.onUnderloadTick();
		doorOpenProgress = doorOpenProgress > 0.0F ? doorOpenProgress - 0.01F : doorOpenProgress;
	}
	
	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbtTag = new NBTTagCompound();
		this.writeToNBT(nbtTag);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
	{
		this.readFromNBT(packet.func_148857_g());
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
	}
	
	@Override
	public double getMinOperatingVoltage()
	{
		return 0;
	}
	
	@Override
	public double getMaxOperatingVoltage()
	{
		return 10000;
	}
	
	@Override
	public double getMinOperatingAmps()
	{
		return 0;
	}
	
	@Override
	public double getMaxOperatingAmps()
	{
		return 1000;
	}
	
	@Override
	public double getResistance()
	{
		return 5;
	}
	
	@Override
	public boolean canOutputPower()
	{
		return false;
	}
	
	@Override
	public Block getBlockType()
	{
		return Blocks.beacon;
	}
}
