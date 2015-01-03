package com.arisux.avp.util;

import net.minecraft.entity.player.EntityPlayer;

import com.arisux.airi.lib.WorldUtil.Entities.Players.Inventories;
import com.arisux.avp.AliensVsPredator;

public class Common
{
	public static boolean isPlayerWearingArmorSet(EntityPlayer player)
	{
		return Inventories.getHelmSlotItemStack(player) != null && Inventories.getChestSlotItemStack(player) != null  && Inventories.getLegsSlotItemStack(player) != null  && Inventories.getBootSlotItemStack(player) != null;
	}
	
	public static boolean isPlayerWearingCelticArmorSet(EntityPlayer player)
	{
		return isPlayerWearingArmorSet(player) && Inventories.getHelmSlotItemStack(player).getItem() == AliensVsPredator.instance().items.helmTitanium && Inventories.getChestSlotItemStack(player).getItem() == AliensVsPredator.instance().items.plateTitanium  && Inventories.getLegsSlotItemStack(player).getItem() == AliensVsPredator.instance().items.legsTitanium  && Inventories.getBootSlotItemStack(player).getItem() == AliensVsPredator.instance().items.bootsTitanium;
	}
}
