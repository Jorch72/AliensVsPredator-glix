package com.arisux.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseWrapper;
import com.arisux.avp.entities.mob.EntityFacehugger;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelFacehugger extends ModelBaseWrapper
{
    public ModelRenderer spine;
    public ModelRenderer spine2;
    public ModelRenderer bodyMain;
    public ModelRenderer lLeg1a;
    public ModelRenderer lLeg2a;
    public ModelRenderer lLeg3a;
    public ModelRenderer lAirSac;
    public ModelRenderer rAirSac;
    public ModelRenderer tail01;
    public ModelRenderer lLeg4a;
    public ModelRenderer rLeg1a;
    public ModelRenderer rLeg2a;
    public ModelRenderer rLeg3a;
    public ModelRenderer rLeg4a;
    public ModelRenderer lLeg1b;
    public ModelRenderer lLeg1c;
    public ModelRenderer lLeg1d;
    public ModelRenderer lLeg2b;
    public ModelRenderer lLeg2c;
    public ModelRenderer lLeg2d;
    public ModelRenderer lLeg3b;
    public ModelRenderer lLeg3c;
    public ModelRenderer lLeg3d;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer tail05;
    public ModelRenderer tail06;
    public ModelRenderer tail07;
    public ModelRenderer tail08;
    public ModelRenderer tail09;
    public ModelRenderer tail10;
    public ModelRenderer tail11;
    public ModelRenderer tail12;
    public ModelRenderer tail13;
    public ModelRenderer tail14;
    public ModelRenderer tail15;
    public ModelRenderer lLeg4b;
    public ModelRenderer lLeg4c;
    public ModelRenderer lLeg4d;
    public ModelRenderer rLeg1b;
    public ModelRenderer rLeg1c;
    public ModelRenderer rLeg1d;
    public ModelRenderer rLeg2b;
    public ModelRenderer rLeg2c;
    public ModelRenderer rLeg2d;
    public ModelRenderer rLeg3b;
    public ModelRenderer rLeg3c;
    public ModelRenderer rLeg3d;
    public ModelRenderer rLeg4b;
    public ModelRenderer rLeg4c;
    public ModelRenderer rLeg4d;

    public ModelFacehugger()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.lLeg1a = new ModelRenderer(this, 19, 0);
        this.lLeg1a.setRotationPoint(0.6F, 20.7F, -1.5F);
        this.lLeg1a.addBox(-0.4F, -0.3F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotation(lLeg1a, 0.0F, -0.5585053606381855F, 0.0F);
        this.rLeg4b = new ModelRenderer(this, 49, 3);
        this.rLeg4b.setRotationPoint(-1.6F, 0.3F, 0.0F);
        this.rLeg4b.addBox(-2.8F, -0.6F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotation(rLeg4b, 0.0F, 0.0F, 0.5462880558742251F);
        this.lLeg1b = new ModelRenderer(this, 18, 4);
        this.lLeg1b.setRotationPoint(0.0F, 0.2F, -1.1F);
        this.lLeg1b.addBox(-0.4F, -0.4F, -3.2F, 1, 1, 3, 0.0F);
        this.setRotation(lLeg1b, -0.43214352279379603F, 0.0F, 0.0F);
        this.rLeg4d = new ModelRenderer(this, 52, 11);
        this.rLeg4d.setRotationPoint(-5.6F, 1.3F, 0.0F);
        this.rLeg4d.addBox(0.0F, 0.3F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotation(rLeg4d, 0.0F, 0.0F, 0.17453292519943295F);
        this.rLeg3a = new ModelRenderer(this, 49, 0);
        this.rLeg3a.setRotationPoint(-0.6F, 20.7F, 0.3F);
        this.rLeg3a.addBox(-1.8F, -0.3F, -0.4F, 2, 1, 1, 0.0F);
        this.setRotation(rLeg3a, 0.0F, -0.13962634015954636F, 0.0F);
        this.lLeg2c = new ModelRenderer(this, 29, 6);
        this.lLeg2c.setRotationPoint(3.9F, -0.7F, -0.1F);
        this.lLeg2c.addBox(-0.1F, -0.7F, -0.2F, 1, 4, 1, 0.0F);
        this.setRotation(lLeg2c, 0.0F, 0.0F, -0.5585053606381855F);
        this.lLeg4a = new ModelRenderer(this, 27, 0);
        this.lLeg4a.setRotationPoint(0.4F, 20.7F, 1.3F);
        this.lLeg4a.addBox(-0.1F, -0.3F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotation(lLeg4a, 0.0F, -0.13962634015954636F, 0.0F);
        this.rLeg3c = new ModelRenderer(this, 51, 6);
        this.rLeg3c.setRotationPoint(-4.1F, -0.8F, 0.0F);
        this.rLeg3c.addBox(-0.3F, -0.7F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotation(rLeg3c, 0.0F, 0.0F, 0.5585053606381855F);
        this.tail09 = new ModelRenderer(this, 28, 21);
        this.tail09.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail09.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.rLeg4c = new ModelRenderer(this, 51, 6);
        this.rLeg4c.setRotationPoint(-3.6F, -0.9F, -0.1F);
        this.rLeg4c.addBox(-0.5F, -0.5F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotation(rLeg4c, 0.0F, 0.0F, 0.5585053606381855F);
        this.bodyMain = new ModelRenderer(this, 0, 14);
        this.bodyMain.setRotationPoint(-0.5F, 20.0F, -1.0F);
        this.bodyMain.addBox(-1.0F, 0.7F, -1.1F, 3, 1, 5, 0.0F);
        this.lLeg4c = new ModelRenderer(this, 29, 6);
        this.lLeg4c.setRotationPoint(3.6F, -0.9F, -0.1F);
        this.lLeg4c.addBox(-0.3F, -0.5F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotation(lLeg4c, 0.0F, 0.0F, -0.5585053606381855F);
        this.lLeg4d = new ModelRenderer(this, 30, 11);
        this.lLeg4d.setRotationPoint(5.6F, 1.3F, 0.0F);
        this.lLeg4d.addBox(0.3F, 0.3F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotation(lLeg4d, 0.0F, 0.0F, -0.17453292519943295F);
        this.lAirSac = new ModelRenderer(this, 0, 22);
        this.lAirSac.mirror = true;
        this.lAirSac.setRotationPoint(-0.5F, 20.0F, 1.0F);
        this.lAirSac.addBox(1.6F, 0.7F, 0.3F, 3, 1, 2, 0.0F);
        this.setRotation(lAirSac, 0.0F, -0.3490658503988659F, 0.0F);
        this.lLeg4b = new ModelRenderer(this, 27, 3);
        this.lLeg4b.setRotationPoint(1.6F, 0.3F, 0.0F);
        this.lLeg4b.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotation(lLeg4b, 0.0F, 0.0F, -0.5585053606381855F);
        this.spine = new ModelRenderer(this, 0, 4);
        this.spine.setRotationPoint(-0.5F, 20.0F, -1.0F);
        this.spine.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotation(spine, 0.08726646259971647F, 0.0F, 0.0F);
        this.tail02 = new ModelRenderer(this, 28, 21);
        this.tail02.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.tail02.addBox(-0.4F, -0.5F, 0.4F, 1, 1, 1, 0.0F);
        this.rLeg2c = new ModelRenderer(this, 51, 6);
        this.rLeg2c.setRotationPoint(-3.9F, -0.7F, -0.1F);
        this.rLeg2c.addBox(-0.2F, -1.1F, -0.6F, 1, 4, 1, 0.0F);
        this.setRotation(rLeg2c, 0.0F, 0.0F, 0.5585053606381855F);
        this.tail14 = new ModelRenderer(this, 28, 21);
        this.tail14.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail14.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.tail08 = new ModelRenderer(this, 28, 21);
        this.tail08.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail08.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.rLeg1c = new ModelRenderer(this, 38, 9);
        this.rLeg1c.setRotationPoint(0.0F, -0.9F, -3.7F);
        this.rLeg1c.addBox(-0.4F, -0.5F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotation(rLeg1c, -0.5061454830783556F, 0.0F, 0.0F);
        this.rAirSac = new ModelRenderer(this, 0, 22);
        this.rAirSac.setRotationPoint(-0.5F, 20.0F, 1.0F);
        this.rAirSac.addBox(-3.6F, 0.7F, 0.6F, 3, 1, 2, 0.0F);
        this.setRotation(rAirSac, 0.0F, 0.3490658503988659F, 0.0F);
        this.lLeg3b = new ModelRenderer(this, 27, 3);
        this.lLeg3b.setRotationPoint(1.3F, 0.1F, 0.1F);
        this.lLeg3b.addBox(0.1F, -0.3F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotation(lLeg3b, 0.0F, 0.0F, -0.5462880558742251F);
        this.tail05 = new ModelRenderer(this, 28, 21);
        this.tail05.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail05.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.rLeg1b = new ModelRenderer(this, 38, 4);
        this.rLeg1b.setRotationPoint(0.0F, 0.2F, -1.1F);
        this.rLeg1b.addBox(-0.4F, -0.4F, -3.2F, 1, 1, 3, 0.0F);
        this.setRotation(rLeg1b, -0.43214352279379603F, 0.0F, 0.0F);
        this.lLeg3d = new ModelRenderer(this, 30, 11);
        this.lLeg3d.setRotationPoint(5.3F, 1.8F, 0.0F);
        this.lLeg3d.addBox(0.7F, 0.0F, -0.4F, 0, 2, 1, 0.0F);
        this.setRotation(lLeg3d, 0.0F, 0.0F, -0.17453292519943295F);
        this.rLeg1a = new ModelRenderer(this, 38, 0);
        this.rLeg1a.setRotationPoint(-0.7F, 20.7F, -1.3F);
        this.rLeg1a.addBox(-0.4F, -0.3F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotation(rLeg1a, 0.0F, 0.5585053606381855F, 0.0F);
        this.lLeg2a = new ModelRenderer(this, 27, 0);
        this.lLeg2a.setRotationPoint(0.1F, 20.7F, -0.5F);
        this.lLeg2a.addBox(0.2F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
        this.setRotation(lLeg2a, 0.0F, 0.40072759625789806F, 0.0F);
        this.tail11 = new ModelRenderer(this, 28, 21);
        this.tail11.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail11.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.rLeg1d = new ModelRenderer(this, 38, 15);
        this.rLeg1d.setRotationPoint(0.0F, 1.5F, -5.6F);
        this.rLeg1d.addBox(-0.4F, 0.4F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotation(rLeg1d, -0.17453292519943295F, 0.0F, 0.0F);
        this.rLeg2b = new ModelRenderer(this, 49, 3);
        this.rLeg2b.setRotationPoint(-1.6F, 0.2F, 0.1F);
        this.rLeg2b.addBox(-2.5F, -0.7F, -0.8F, 3, 1, 1, 0.0F);
        this.setRotation(rLeg2b, 0.0F, 0.0F, 0.5462880558742251F);
        this.lLeg3c = new ModelRenderer(this, 29, 6);
        this.lLeg3c.setRotationPoint(4.1F, -0.8F, 0.0F);
        this.lLeg3c.addBox(-0.7F, -0.7F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotation(lLeg3c, 0.0F, 0.0F, -0.5585053606381855F);
        this.tail06 = new ModelRenderer(this, 28, 21);
        this.tail06.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail06.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.rLeg2a = new ModelRenderer(this, 49, 0);
        this.rLeg2a.setRotationPoint(-0.8F, 20.7F, -0.5F);
        this.rLeg2a.addBox(-1.5F, -0.3F, -0.7F, 2, 1, 1, 0.0F);
        this.setRotation(rLeg2a, 0.0F, -0.40072759625789806F, 0.0F);
        this.tail12 = new ModelRenderer(this, 28, 21);
        this.tail12.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail12.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.lLeg2b = new ModelRenderer(this, 27, 3);
        this.lLeg2b.setRotationPoint(1.6F, 0.2F, 0.1F);
        this.lLeg2b.addBox(0.3F, -0.3F, -0.4F, 3, 1, 1, 0.0F);
        this.setRotation(lLeg2b, 0.0F, 0.0F, -0.5462880558742251F);
        this.tail15 = new ModelRenderer(this, 28, 21);
        this.tail15.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail15.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.rLeg2d = new ModelRenderer(this, 52, 11);
        this.rLeg2d.setRotationPoint(-5.6F, 1.6F, 0.0F);
        this.rLeg2d.addBox(0.2F, 0.0F, -0.7F, 0, 2, 1, 0.0F);
        this.setRotation(rLeg2d, 0.0F, 0.0F, 0.17941984710501704F);
        this.rLeg3b = new ModelRenderer(this, 49, 3);
        this.rLeg3b.setRotationPoint(-1.3F, 0.1F, 0.1F);
        this.rLeg3b.addBox(-3.1F, -0.3F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotation(rLeg3b, 0.0F, 0.0F, 0.5462880558742251F);
        this.tail13 = new ModelRenderer(this, 28, 21);
        this.tail13.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail13.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.lLeg1c = new ModelRenderer(this, 20, 9);
        this.lLeg1c.setRotationPoint(0.0F, -0.9F, -3.7F);
        this.lLeg1c.addBox(-0.4F, -0.5F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotation(lLeg1c, -0.5061454830783556F, 0.0F, 0.0F);
        this.lLeg3a = new ModelRenderer(this, 27, 0);
        this.lLeg3a.setRotationPoint(0.6F, 20.7F, 0.3F);
        this.lLeg3a.addBox(-0.1F, -0.3F, -0.4F, 2, 1, 1, 0.0F);
        this.setRotation(lLeg3a, 0.0F, 0.13962634015954636F, 0.0F);
        this.tail10 = new ModelRenderer(this, 28, 21);
        this.tail10.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail10.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.lLeg1d = new ModelRenderer(this, 21, 15);
        this.lLeg1d.setRotationPoint(0.0F, 1.5F, -5.6F);
        this.lLeg1d.addBox(-0.4F, 0.4F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotation(lLeg1d, -0.17453292519943295F, 0.0F, 0.0F);
        this.rLeg4a = new ModelRenderer(this, 49, 0);
        this.rLeg4a.setRotationPoint(-0.4F, 20.7F, 1.3F);
        this.rLeg4a.addBox(-1.6F, -0.3F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotation(rLeg4a, 0.0F, 0.13962634015954636F, 0.0F);
        this.tail03 = new ModelRenderer(this, 28, 21);
        this.tail03.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tail03.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.tail04 = new ModelRenderer(this, 28, 21);
        this.tail04.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail04.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.lLeg2d = new ModelRenderer(this, 30, 11);
        this.lLeg2d.setRotationPoint(5.6F, 1.6F, 0.0F);
        this.lLeg2d.addBox(0.7F, 0.0F, -0.3F, 0, 2, 1, 0.0F);
        this.setRotation(lLeg2d, 0.0F, 0.0F, -0.17453292519943295F);
        this.tail07 = new ModelRenderer(this, 28, 21);
        this.tail07.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.tail07.addBox(-0.4F, -0.5F, 0.5F, 1, 1, 1, 0.0F);
        this.spine2 = new ModelRenderer(this, 0, 10);
        this.spine2.setRotationPoint(-0.5F, 20.0F, -1.0F);
        this.spine2.addBox(-0.0F, -0.3F, 1.9F, 1, 1, 2, 0.0F);
        this.tail01 = new ModelRenderer(this, 28, 21);
        this.tail01.setRotationPoint(-0.1F, 20.6F, 2.9F);
        this.tail01.addBox(-0.4F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.rLeg3d = new ModelRenderer(this, 52, 11);
        this.rLeg3d.setRotationPoint(-5.3F, 1.8F, 0.0F);
        this.rLeg3d.addBox(-0.7F, 0.0F, -0.4F, 0, 2, 1, 0.0F);
        this.setRotation(rLeg3d, 0.0F, 0.0F, 0.17453292519943295F);
        this.rLeg4a.addChild(this.rLeg4b);
        this.lLeg1a.addChild(this.lLeg1b);
        this.rLeg4a.addChild(this.rLeg4d);
        this.lLeg2a.addChild(this.lLeg2c);
        this.rLeg3a.addChild(this.rLeg3c);
        this.tail08.addChild(this.tail09);
        this.rLeg4a.addChild(this.rLeg4c);
        this.lLeg4a.addChild(this.lLeg4c);
        this.lLeg4a.addChild(this.lLeg4d);
        this.lLeg4a.addChild(this.lLeg4b);
        this.tail01.addChild(this.tail02);
        this.rLeg2a.addChild(this.rLeg2c);
        this.tail13.addChild(this.tail14);
        this.tail07.addChild(this.tail08);
        this.rLeg1a.addChild(this.rLeg1c);
        this.lLeg3a.addChild(this.lLeg3b);
        this.tail04.addChild(this.tail05);
        this.rLeg1a.addChild(this.rLeg1b);
        this.lLeg3a.addChild(this.lLeg3d);
        this.tail10.addChild(this.tail11);
        this.rLeg1a.addChild(this.rLeg1d);
        this.rLeg2a.addChild(this.rLeg2b);
        this.lLeg3a.addChild(this.lLeg3c);
        this.tail05.addChild(this.tail06);
        this.tail11.addChild(this.tail12);
        this.lLeg2a.addChild(this.lLeg2b);
        this.tail14.addChild(this.tail15);
        this.rLeg2a.addChild(this.rLeg2d);
        this.rLeg3a.addChild(this.rLeg3b);
        this.tail12.addChild(this.tail13);
        this.lLeg1a.addChild(this.lLeg1c);
        this.tail09.addChild(this.tail10);
        this.lLeg1a.addChild(this.lLeg1d);
        this.tail02.addChild(this.tail03);
        this.tail03.addChild(this.tail04);
        this.lLeg2a.addChild(this.lLeg2d);
        this.tail06.addChild(this.tail07);
        this.rLeg3a.addChild(this.rLeg3d);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swingProgress, float swingProgressPrev, float partialTickTime)
    {
        float yRot = -0.0585F;

        this.tail01.rotateAngleY = (MathHelper.cos(swingProgress * 0.6662F + (float) Math.PI) * swingProgressPrev * 0.25F);
        this.tail02.rotateAngleY = yRot;
        this.tail03.rotateAngleY = yRot;
        this.tail04.rotateAngleY = yRot;
        this.tail05.rotateAngleY = yRot;
        this.tail06.rotateAngleY = yRot;
        this.tail07.rotateAngleY = yRot;
        this.tail08.rotateAngleY = yRot;
        this.tail09.rotateAngleY = yRot;
        this.tail10.rotateAngleY = yRot;
        this.tail11.rotateAngleY = yRot;
        this.tail12.rotateAngleY = yRot;
        this.tail13.rotateAngleY = yRot;
        this.tail14.rotateAngleY = yRot;
        this.tail15.rotateAngleY = yRot;

        if (entity != null)
        {
            EntityFacehugger facehugger = (EntityFacehugger) entity;

            if (facehugger.isFertile())
            {
                float tailSpeed = entity.isSprinting() ? 0.75F : 0.15F;
                float distMulti = 0.075F;
                float distAdd = 0.05F;
                float progress = getIdleProgress(entity, partialTickTime) + swingProgress;
                this.tail01.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail02.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail03.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail04.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail05.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail06.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail07.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail08.rotateAngleY += MathHelper.sin(progress * tailSpeed) * distMulti + distAdd;
                this.tail09.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
                this.tail10.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
                this.tail11.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
                this.tail12.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
                this.tail13.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
                this.tail14.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
                this.tail15.rotateAngleY += MathHelper.cos(progress * tailSpeed) * distMulti + distAdd;
            }

            float angle1 = MathHelper.sin(swingProgress * 1.1662F + (float) Math.PI) * 30F;
            float angle2 = MathHelper.cos(swingProgress * 1.1662F + (float) Math.PI) * 30F;

            float lLegMovement1 = (float) Math.toRadians(angle1);
            float lLegMovement2 = (float) Math.toRadians(-angle2);
            float rLegMovement1 = (float) Math.toRadians(angle1);
            float rLegMovement2 = (float) Math.toRadians(-angle2);

            float speed = 0.5F;

            this.lLeg1a.rotateAngleZ = lLegMovement1 * speed;
            this.lLeg2a.rotateAngleZ = lLegMovement2 * speed;
            this.lLeg3a.rotateAngleZ = lLegMovement1 * speed;
            this.lLeg4a.rotateAngleZ = lLegMovement2 * speed;

            this.rLeg2a.rotateAngleZ = rLegMovement1 * speed;
            this.rLeg1a.rotateAngleZ = rLegMovement2 * speed;
            this.rLeg3a.rotateAngleZ = rLegMovement2 * speed;
            this.rLeg4a.rotateAngleZ = rLegMovement1 * speed;

            this.lLeg1a.rotateAngleX = lLegMovement1;
            this.lLeg2a.rotateAngleX = lLegMovement2;
            this.lLeg3a.rotateAngleX = lLegMovement1;
            this.lLeg4a.rotateAngleX = lLegMovement2;

            this.rLeg2a.rotateAngleX = -rLegMovement1;
            this.rLeg1a.rotateAngleX = -rLegMovement2;
            this.rLeg3a.rotateAngleX = -rLegMovement2;
            this.rLeg4a.rotateAngleX = -rLegMovement1;
        }
    }

    @Override
    protected void render(IRenderObject renderObject, float boxTranslation)
    {
        this.bodyMain.render(boxTranslation);
        this.lAirSac.render(boxTranslation);
        this.rAirSac.render(boxTranslation);
        this.lLeg1a.render(boxTranslation);
        this.rLeg3a.render(boxTranslation);
        this.lLeg4a.render(boxTranslation);
        this.spine.render(boxTranslation);
        this.rLeg1a.render(boxTranslation);
        this.lLeg2a.render(boxTranslation);
        this.rLeg2a.render(boxTranslation);
        this.lLeg3a.render(boxTranslation);
        this.rLeg4a.render(boxTranslation);
        this.spine2.render(boxTranslation);
        this.tail01.render(boxTranslation);
    }
}
