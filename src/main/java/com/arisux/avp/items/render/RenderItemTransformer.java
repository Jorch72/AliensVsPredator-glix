package com.arisux.avp.items.render;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.GlStateManager;
import com.arisux.airi.lib.RenderUtil;
import com.arisux.airi.lib.client.ItemRenderer;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.tile.model.ModelTransformer;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

public class RenderItemTransformer extends ItemRenderer
{
	public RenderItemTransformer()
	{
		super(new ModelTransformer(), AliensVsPredator.resources().TRANSFORMER);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		super.renderItem(type, item, data);
	}

	@Override
	public void renderThirdPerson(ItemStack item, Object... data)
	{
		float glScale = 1.6F;
		GL11.glPushMatrix();
		{
			GlStateManager.scale(glScale, glScale, glScale);
			GlStateManager.rotate(90F, 0F, 0F, 1F);
			GlStateManager.translate(0F, -1.3F, 0.4F);
			GlStateManager.disable(GL11.GL_CULL_FACE);
			RenderUtil.bindTexture(this.getResourceLocation());
			this.getModel().render(RenderUtil.DEFAULT_BOX_TRANSLATION);
		}
		GL11.glPopMatrix();
	}

	@Override
	public void renderFirstPerson(ItemStack item, Object... data)
	{
		float glScale = 0.8F;
		GL11.glPushMatrix();
		{
			if (firstPersonRenderCheck(data[1]))
			{
				GlStateManager.scale(glScale, -glScale, glScale);
				GlStateManager.translate(0F, -1.6F, 0.2F);
				GlStateManager.rotate(-45.0F, 0.0F, 0.0F, 1.0F);
				GlStateManager.disable(GL11.GL_CULL_FACE);
				RenderUtil.bindTexture(this.getResourceLocation());
				this.getModel().render(RenderUtil.DEFAULT_BOX_TRANSLATION);
			}
		}
		GL11.glPopMatrix();
	}

	@Override
	public void renderInInventory(ItemStack item, Object... data)
	{
		float glScale = 11F;
		GL11.glPushMatrix();
		{
			GlStateManager.scale(glScale, glScale, glScale);
			GlStateManager.translate(0.72F, -0.15F, 0F);
			GlStateManager.rotate(-30, 1.0F, 0.0F, 0.0F);
			GlStateManager.rotate(Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 6, 0.0F, 1.0F, 0.0F);
			GlStateManager.translate(0F, 0F, 0F);
			GlStateManager.disable(GL11.GL_CULL_FACE);
			GL11.glEnable(GL11.GL_BLEND);
			RenderUtil.bindTexture(this.getResourceLocation());
			this.getModel().render(RenderUtil.DEFAULT_BOX_TRANSLATION);
		}
		GL11.glPopMatrix();
	}

	@Override
	public void renderInWorld(ItemStack item, Object... data)
	{
		super.renderInWorld(item, data);
		GL11.glPushMatrix();
		{
			GlStateManager.rotate(Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 6, 0.0F, 1.0F, 0.0F);
			GlStateManager.disable(GL11.GL_CULL_FACE);
			RenderUtil.bindTexture(this.getResourceLocation());
			this.getModel().render(RenderUtil.DEFAULT_BOX_TRANSLATION);
			GlStateManager.enableLight();
		}
		GL11.glPopMatrix();
	}
}
