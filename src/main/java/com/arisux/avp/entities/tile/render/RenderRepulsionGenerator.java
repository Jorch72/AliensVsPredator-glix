package com.arisux.avp.entities.tile.render;

import static org.lwjgl.opengl.GL11.*;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL12;

import com.arisux.airi.lib.RenderUtil;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.tile.TileEntityRepulsionGenerator;
import com.arisux.avp.entities.tile.model.ModelRepulsionGenerator;

public class RenderRepulsionGenerator extends TileEntitySpecialRenderer
{
	private ModelRepulsionGenerator model = new ModelRepulsionGenerator();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double posX, double posY, double posZ, float var8)
	{
		TileEntityRepulsionGenerator tile = (TileEntityRepulsionGenerator) tileEntity;

		glPushMatrix();
		{
			glDisable(GL_CULL_FACE);
			glEnable(GL_BLEND);
			glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
			this.bindTexture(AliensVsPredator.resources().REPULSION_GENERATOR);
			glTranslated(posX + 0.5F, posY + 1.5F, posZ + 0.5F);
			glRotatef(tile.rotation * (-90F), 0F, 1F, 0F);
			glEnable(GL12.GL_RESCALE_NORMAL);
			glScalef(1.0F, -1.0F, 1.0F);
			glEnable(GL_ALPHA_TEST);
			this.model.render(tile, RenderUtil.DEFAULT_BOX_TRANSLATION);
		}
		glPopMatrix();
	}
}