package com.arisux.avp.items.render;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.GlStateManager;
import com.arisux.airi.lib.RenderUtil;
import com.arisux.airi.lib.client.ItemRenderer;
import com.arisux.avp.items.model.ModelM40;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RenderItemM40 extends ItemRenderer
{
	public RenderItemM40(ResourceLocation resourceLocation)
	{
		super(new ModelM40(), resourceLocation);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		super.renderItem(type, item, data);
	}

	@Override
	public void renderThirdPerson(ItemStack item, Object... data)
	{
		float glScale = 1F;

		GlStateManager.rotate(10F, 0F, 0F, 1F);
		GlStateManager.rotate(12F, 0F, 1F, 0F);
		GlStateManager.translate(0.4F, 0.1F, 0.2F);
		GlStateManager.disable(GL11.GL_CULL_FACE);
		GlStateManager.scale(glScale, -glScale, glScale);
		RenderUtil.bindTexture(this.getResourceLocation());
		((ModelM40) this.getModel()).render(RenderUtil.DEFAULT_BOX_TRANSLATION);
	}

	@Override
	public void renderFirstPerson(ItemStack item, Object... data)
	{
		float glScale = 1F;

		if (firstPersonRenderCheck(data[1]))
		{
			GlStateManager.translate(0.4F, 0.6F, 0.2F);
			GlStateManager.rotate(95.0F, 1.0F, 0.0F, 0.0F);
			GlStateManager.rotate(120.0F, 0.0F, 1.0F, 0.0F);
			GlStateManager.rotate(79.0F, 0.0F, 0.0F, 1.0F);
			GlStateManager.disable(GL11.GL_CULL_FACE);
			GlStateManager.scale(glScale, glScale, glScale);
			RenderUtil.bindTexture(this.getResourceLocation());
			((ModelM40) this.getModel()).render(RenderUtil.DEFAULT_BOX_TRANSLATION);
		}
	}

	@Override
	public void renderInInventory(ItemStack item, Object... data)
	{
		float glScale = 19F;
		GlStateManager.translate(8F, 5F, 0F);
		GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
		GlStateManager.translate(1.4F, 0F, 0.7F);
		GlStateManager.rotate(-180F, 0.0F, 1.0F, 0.0F);
		GlStateManager.disable(GL11.GL_CULL_FACE);
		GlStateManager.scale(glScale, glScale, glScale);
		RenderUtil.bindTexture(this.getResourceLocation());
		((ModelM40) this.getModel()).render(RenderUtil.DEFAULT_BOX_TRANSLATION);
	}
	
	@Override
	public void renderInWorld(ItemStack item, Object... data)
	{
		super.renderInWorld(item, data);		
		GlStateManager.scale(1F, -1F, 1F);
		GlStateManager.translate(0F, -0.5F, 0F);
		GlStateManager.rotate(Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime() % 360 * 6, 0.0F, 1.0F, 0.0F);
		GlStateManager.disable(GL11.GL_CULL_FACE);
		RenderUtil.bindTexture(this.getResourceLocation());
		this.getModel().render(RenderUtil.DEFAULT_BOX_TRANSLATION);
	}
}
