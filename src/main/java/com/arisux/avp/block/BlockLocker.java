package com.arisux.avp.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.arisux.airi.lib.BlockTypes.HookedBlock;
import com.arisux.avp.entities.tile.TileEntityLocker;

public class BlockLocker extends HookedBlock
{
	public BlockLocker(Material material)
	{
		super(material);
		setTickRandomly(true);
		this.setRenderNormal(false);
		this.setOpaque(false);
		this.setBlockBounds(0, 0, 0, 1, 2, 1);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int posX, int posY, int posZ)
	{
		return super.canPlaceBlockAt(world, posX, posY, posZ);
	}

	@Override
	public boolean onBlockActivated(World world, int posX, int posY, int posZ, EntityPlayer player, int side, float blockX, float blockY, float blockZ)
	{
		TileEntity tileEntity = world.getTileEntity(posX, posY, posZ);
		
		if(tileEntity != null && tileEntity instanceof TileEntityLocker)
		{
			TileEntityLocker tileEntityLocker = (TileEntityLocker) tileEntity;
			
			if (!player.isSneaking())
			{
				tileEntityLocker.openGui(player);
			}
			else
			{
				tileEntityLocker.setOpen(!tileEntityLocker.isOpen());
			}
		}
		
		return true;
	}

	@Override
	public void onBlockPlacedBy(World world, int posX, int posY, int posZ, EntityLivingBase placer, ItemStack itemstack)
	{
		TileEntity tile = world.getTileEntity(posX, posY, posZ);

		if (tile != null && tile instanceof TileEntityLocker && placer != null)
		{
			TileEntityLocker locker = (TileEntityLocker) tile;
			locker.setDirection(getFacing(placer));
		}
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileEntityLocker();
	}

	@Override
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}

	@Override
	public int getRenderType()
	{
		return -1;
	}

	public static ForgeDirection getFacing(Entity entity)
	{
		int dir = MathHelper.floor_double((entity.rotationYaw / 90) + 0.5) & 3;
		return ForgeDirection.VALID_DIRECTIONS[Direction.directionToFacing[dir]];
	}
}