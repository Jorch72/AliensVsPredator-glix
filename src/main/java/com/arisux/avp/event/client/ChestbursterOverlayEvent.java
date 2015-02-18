package com.arisux.avp.event.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;

import com.arisux.airi.lib.RenderUtil;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.extended.ExtendedEntityLivingBase;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChestbursterOverlayEvent
{
	private Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
	public void renderTickOverlay(Pre event)
	{
		if (mc.thePlayer != null)
		{
			if (event.type == RenderGameOverlayEvent.ElementType.HOTBAR)
			{
				ExtendedEntityLivingBase livingBaseProperties = (ExtendedEntityLivingBase) mc.thePlayer.getExtendedProperties(ExtendedEntityLivingBase.IDENTIFIER);

				if (livingBaseProperties.doesEntityContainEmbryo())
				{
					if (livingBaseProperties.getEmbryoAge() >= livingBaseProperties.getMaxEmbryoAge())
					{
						RenderUtil.renderOverlay(AliensVsPredator.resources().BLUR_CHESTBURSTER_EMERGE);
					}
				}
			}
		}
	}
}