package com.arisux.avp.entities.tile.render;

import static org.lwjgl.opengl.GL11.*;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.arisux.airi.engine.RenderEngine;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.tile.TileEntityServer;
import com.arisux.avp.entities.tile.model.ModelServer;

public class RenderServer extends TileEntitySpecialRenderer
{
	private ModelServer model = new ModelServer();
	private static final ResourceLocation resource = new ResourceLocation(AliensVsPredator.properties().TEXTURE_PATH_SERVER);

	@Override
	public void renderTileEntityAt(TileEntity var1, double posX, double posY, double posZ, float var8)
	{
		TileEntityServer tile = (TileEntityServer) var1;

		glPushMatrix();
		{
			glDisable(GL_CULL_FACE);
			this.bindTexture(resource);
			glTranslated(posX + 0.5F, posY + 1.5F, posZ + 0.5F);
			glRotatef(0F, 0F, 1F, 0F);
			glScalef(1.0F, -1.0F, 1.0F);
			this.model.render(tile, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0625F);

			float scale = 0.02F;
			glScalef(scale, scale, scale);
			RenderEngine.glDisableLight();
			RenderEngine.drawString(tile.getVoltage() + "V", -20, 30, 0xFF00FF00);
			RenderEngine.glEnableLight();
		}
		glPopMatrix();
	}
}
