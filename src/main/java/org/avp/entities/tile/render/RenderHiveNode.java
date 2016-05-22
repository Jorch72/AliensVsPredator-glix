package org.avp.entities.tile.render;

import org.avp.AliensVsPredator;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.arisux.airi.lib.GlStateManager;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderHiveNode extends TileEntitySpecialRenderer
{
    public void doRender(float posX, float posY, float posZ, float renderPartialTicks)
    {
        GlStateManager.pushMatrix();
        {
            GlStateManager.disable(GL11.GL_CULL_FACE);
            GlStateManager.translate(posX + 0.0F, posY + 1.2F, posZ + 0.0F);
            GlStateManager.enable(GL12.GL_RESCALE_NORMAL);
            GlStateManager.scale(-1.0F, -1.0F, 1.0F);
            GlStateManager.enable(GL11.GL_ALPHA_TEST);
            AliensVsPredator.resources().models().HIVE_NODE.draw();
        }
        GlStateManager.popMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double posX, double posY, double posZ, float renderPartialTicks)
    {
        this.doRender((float) posX + 0.5F, (float) (posY + 0.25D) + 0.0625F, (float) posZ + 0.5F, 1.0F);
    }
}
