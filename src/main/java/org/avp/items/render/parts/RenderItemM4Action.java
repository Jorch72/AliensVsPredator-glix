package org.avp.items.render.parts;

import org.avp.items.render.ItemRendererGroup;

import com.arisux.airi.lib.GlStateManager;
import com.arisux.airi.lib.client.ModelBaseWrapper;
import com.arisux.airi.lib.client.ModelTexMap;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.item.ItemStack;

public class RenderItemM4Action extends ItemRendererGroup
{
    public RenderItemM4Action(ModelTexMap<? extends ModelBaseWrapper> model, ModelRenderer... modelRenderers)
    {
        super(model, modelRenderers);
    }

    @Override
    public void renderInInventory(ItemStack item, Object... data)
    {
        super.renderInInventory(item, data);

        GlStateManager.pushMatrix();
        {
            float glScale = 32F;
            GlStateManager.translate(8F, 8F, 0F);

            GlStateManager.scale(glScale, glScale, glScale);
            GlStateManager.translate(0.25F, -0.6F, -0F);
            this.renderPart();
        }
        GlStateManager.popMatrix();
    }
}
