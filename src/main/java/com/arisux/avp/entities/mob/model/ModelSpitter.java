package com.arisux.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseWrapper;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;

public class ModelSpitter extends ModelBaseWrapper
{
    public ModelRenderer chest, abdomen, rThigh, lThigh, lShin1, rShin1, lShin2, rShin2, lFoot, rFoot, lArm1, rArm1, lClaw1, rArm2, neck, headSpine1, rHead, jaw, jaw2, headSpine2, lArm2, rClaw1, lClaw2, rClaw2, spine1, spine2, spine3, tail1, tail2, tailStabber, tail3, tail4, lHead, spine4, spine5, spine6, spine7, spine8, spine9, spine10, spine11, tail5, spine12, part1, part2, part3, part4, headHornLeft, headPouches, headTop, headBase, headHornRight;

    public ModelSpitter()
    {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.chest = new ModelRenderer(this, 0, 46);
        this.chest.addBox(-4.5F, -2.0F, 0.0F, 9, 8, 10);
        this.chest.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.chest.setTextureSize(256, 128);
        this.chest.mirror = true;
        this.setRotation(this.chest, -0.1919862F, 0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 27);
        this.abdomen.addBox(-3.5F, -5.0F, 8.0F, 7, 6, 12);
        this.abdomen.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.abdomen.setTextureSize(256, 128);
        this.abdomen.mirror = true;
        this.setRotation(this.abdomen, -0.5585054F, 0.0F, 0.0F);
        this.rThigh = new ModelRenderer(this, 59, 45);
        this.rThigh.addBox(-1.5F, -4.0F, -2.5F, 4, 14, 5);
        this.rThigh.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rThigh.setTextureSize(256, 128);
        this.rThigh.mirror = true;
        this.setRotation(this.rThigh, -0.8028515F, 0.2443461F, 0.418879F);
        this.lThigh = new ModelRenderer(this, 40, 45);
        this.lThigh.addBox(-2.5F, -4.0F, -2.5F, 4, 14, 5);
        this.lThigh.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lThigh.setTextureSize(256, 128);
        this.lThigh.mirror = true;
        this.setRotation(this.lThigh, -0.8028515F, -0.2443461F, -0.418879F);
        this.lShin1 = new ModelRenderer(this, 79, 49);
        this.lShin1.addBox(-2.0F, 8.0F, -5.5F, 3, 3, 12);
        this.lShin1.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lShin1.setTextureSize(256, 128);
        this.lShin1.mirror = true;
        this.setRotation(this.lShin1, -0.4014257F, -0.2443461F, -0.418879F);
        this.rShin1 = new ModelRenderer(this, 79, 33);
        this.rShin1.addBox(-1.0F, 8.0F, -5.5F, 3, 3, 12);
        this.rShin1.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rShin1.setTextureSize(256, 128);
        this.rShin1.mirror = true;
        this.setRotation(this.rShin1, -0.4014257F, 0.2443461F, 0.418879F);
        this.lShin2 = new ModelRenderer(this, 113, 40);
        this.lShin2.addBox(-1.5F, 5.5F, 9.0F, 2, 9, 2);
        this.lShin2.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lShin2.setTextureSize(256, 128);
        this.lShin2.mirror = true;
        this.setRotation(this.lShin2, -0.8028515F, -0.2443461F, -0.418879F);
        this.rShin2 = new ModelRenderer(this, 113, 53);
        this.rShin2.addBox(-0.5F, 5.5F, 9.0F, 2, 9, 2);
        this.rShin2.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rShin2.setTextureSize(256, 128);
        this.rShin2.mirror = true;
        this.setRotation(this.rShin2, -0.8028515F, 0.2443461F, 0.418879F);
        this.lFoot = new ModelRenderer(this, 110, 24);
        this.lFoot.addBox(5.0F, 15.0F, -8.0F, 2, 2, 5);
        this.lFoot.setRotationPoint(4.5F, 2.0F, 17.0F);
        this.lFoot.setTextureSize(256, 128);
        this.lFoot.mirror = true;
        this.setRotation(this.lFoot, 0.0F, -0.2443461F, 0.0F);
        this.rFoot = new ModelRenderer(this, 95, 24);
        this.rFoot.addBox(-7.0F, 15.0F, -8.0F, 2, 2, 5);
        this.rFoot.setRotationPoint(-4.5F, 2.0F, 17.0F);
        this.rFoot.setTextureSize(256, 128);
        this.rFoot.mirror = true;
        this.setRotation(this.rFoot, 0.0F, 0.2443461F, 0.0F);
        this.lArm1 = new ModelRenderer(this, 40, 29);
        this.lArm1.addBox(-1.0F, -1.0F, -1.0F, 2, 13, 2);
        this.lArm1.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lArm1.setTextureSize(256, 128);
        this.lArm1.mirror = true;
        this.setRotation(this.lArm1, 0.3665191F, 0.0F, -0.5934119F);
        this.rArm1 = new ModelRenderer(this, 50, 29);
        this.rArm1.addBox(-1.0F, -1.0F, -1.0F, 2, 13, 2);
        this.rArm1.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rArm1.setTextureSize(256, 128);
        this.rArm1.mirror = true;
        this.setRotation(this.rArm1, 0.3665191F, 0.0F, 0.5934119F);
        this.lClaw1 = new ModelRenderer(this, 83, 24);
        this.lClaw1.addBox(-1.0F, 11.0F, -13.5F, 2, 1, 3);
        this.lClaw1.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lClaw1.setTextureSize(256, 128);
        this.lClaw1.mirror = true;
        this.setRotation(this.lClaw1, 0.3665191F, 0.0F, -0.5934119F);
        this.rArm2 = new ModelRenderer(this, 98, 9);
        this.rArm2.addBox(-1.0F, 10.5F, -10.5F, 2, 2, 11);
        this.rArm2.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rArm2.setTextureSize(256, 128);
        this.rArm2.mirror = true;
        this.setRotation(this.rArm2, 0.3665191F, 0.0F, 0.5934119F);
        this.neck = new ModelRenderer(this, 23, 86);
        this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 6, 5);
        this.neck.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.neck.setTextureSize(256, 128);
        this.neck.mirror = true;
        this.setRotation(this.neck, -0.1919862F, 0.0F, 0.0F);
        this.headSpine1 = new ModelRenderer(this, 0, 100);
        this.headSpine1.addBox(-2.5F, -5.0F, -3.0F, 0, 10, 3);
        this.headSpine1.setRotationPoint(2.5F, -9.0F, -6.0F);
        this.headSpine1.setTextureSize(256, 128);
        this.headSpine1.mirror = true;
        this.setRotation(this.headSpine1, -((float) Math.PI / 5F), 0.0F, 0.0F);
        this.rHead = new ModelRenderer(this, 34, 0);
        this.rHead.addBox(-2.51F, 3.0F, -5.0F, 3, 3, 5);
        this.rHead.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.rHead.setTextureSize(256, 128);
        this.rHead.mirror = true;
        this.setRotation(this.rHead, -0.122173F, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 51, 10);
        this.jaw.addBox(-2.5F, 2.8F, -5.0F, 5, 3, 4);
        this.jaw.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.jaw.setTextureSize(256, 128);
        this.jaw.mirror = true;
        this.setRotation(this.jaw, 0.122173F, 0.0F, 0.0F);
        this.jaw2 = new ModelRenderer(this, 52, 20);
        this.jaw2.addBox(-1.5F, 4.1F, -6.1F, 3, 2, 5);
        this.jaw2.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.jaw2.setTextureSize(256, 128);
        this.jaw2.mirror = true;
        this.setRotation(this.jaw2, 0.122173F, 0.0F, 0.0F);
        this.headSpine2 = new ModelRenderer(this, 7, 100);
        this.headSpine2.addBox(-2.5F, -14.0F, -4.2F, 0, 10, 3);
        this.headSpine2.setRotationPoint(2.5F, -9.5F, -6.0F);
        this.headSpine2.setTextureSize(256, 128);
        this.headSpine2.mirror = true;
        this.setRotation(this.headSpine2, -0.9075712F, 0.0F, 0.0F);
        this.lArm2 = new ModelRenderer(this, 71, 9);
        this.lArm2.addBox(-1.0F, 10.5F, -10.5F, 2, 2, 11);
        this.lArm2.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lArm2.setTextureSize(256, 128);
        this.lArm2.mirror = true;
        this.setRotation(this.lArm2, 0.3665191F, 0.0F, -0.5934119F);
        this.rClaw1 = new ModelRenderer(this, 72, 24);
        this.rClaw1.addBox(-1.0F, 11.0F, -13.5F, 2, 1, 3);
        this.rClaw1.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rClaw1.setTextureSize(256, 128);
        this.rClaw1.mirror = true;
        this.setRotation(this.rClaw1, 0.3665191F, 0.0F, 0.5934119F);
        this.lClaw2 = new ModelRenderer(this, 60, 30);
        this.lClaw2.addBox(-2.0F, 11.5F, -16.5F, 3, 0, 6);
        this.lClaw2.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lClaw2.setTextureSize(256, 128);
        this.lClaw2.mirror = true;
        this.setRotation(this.lClaw2, 0.3665191F, 0.0F, -0.5934119F);
        this.rClaw2 = new ModelRenderer(this, 60, 38);
        this.rClaw2.addBox(-1.0F, 11.5F, -16.5F, 3, 0, 6);
        this.rClaw2.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rClaw2.setTextureSize(256, 128);
        this.rClaw2.mirror = true;
        this.setRotation(this.rClaw2, 0.3665191F, 0.0F, 0.5934119F);
        this.spine1 = new ModelRenderer(this, 0, 65);
        this.spine1.addBox(0.0F, -10.0F, 0.0F, 0, 8, 10);
        this.spine1.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.spine1.setTextureSize(256, 128);
        this.spine1.mirror = true;
        this.setRotation(this.spine1, -0.1919862F, 0.0F, 0.0F);
        this.spine2 = new ModelRenderer(this, 23, 65);
        this.spine2.addBox(0.0F, -11.0F, 8.0F, 0, 6, 12);
        this.spine2.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.spine2.setTextureSize(256, 128);
        this.spine2.mirror = true;
        this.setRotation(this.spine2, -0.5585054F, 0.0F, 0.0F);
        this.spine3 = new ModelRenderer(this, 50, 83);
        this.spine3.addBox(-4.0F, -0.5F, 0.0F, 8, 0, 11);
        this.spine3.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine3.setTextureSize(256, 128);
        this.spine3.mirror = true;
        this.setRotation(this.spine3, -0.4014257F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 85, 66);
        this.tail1.addBox(-2.0F, -1.5F, 11.0F, 4, 4, 11);
        this.tail1.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail1.setTextureSize(256, 128);
        this.tail1.mirror = true;
        this.setRotation(this.tail1, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 118, 66);
        this.tail2.addBox(-1.5F, 1.5F, 21.0F, 3, 3, 11);
        this.tail2.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail2.setTextureSize(256, 128);
        this.tail2.mirror = true;
        this.setRotation(this.tail2, -0.2094395F, 0.0F, 0.0F);
        this.tailStabber = new ModelRenderer(this, 205, 66);
        this.tailStabber.addBox(-3.5F, 9.0F, 52.0F, 7, 0, 11);
        this.tailStabber.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tailStabber.setTextureSize(256, 128);
        this.tailStabber.mirror = true;
        this.setRotation(this.tailStabber, -0.0523599F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 149, 66);
        this.tail3.addBox(-1.0F, 4.0F, 31.0F, 2, 2, 11);
        this.tail3.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail3.setTextureSize(256, 128);
        this.tail3.mirror = true;
        this.setRotation(this.tail3, -0.1396263F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 178, 66);
        this.tail4.addBox(-0.5F, 8.5F, 41.0F, 1, 1, 11);
        this.tail4.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail4.setTextureSize(256, 128);
        this.tail4.mirror = true;
        this.setRotation(this.tail4, -0.0523599F, 0.0F, 0.0F);
        this.lHead = new ModelRenderer(this, 53, 0);
        this.lHead.addBox(-0.499F, 3.0F, -5.0F, 3, 3, 5);
        this.lHead.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.lHead.setTextureSize(256, 128);
        this.lHead.mirror = true;
        this.setRotation(this.lHead, -0.122173F, 0.0F, 0.0F);
        this.spine4 = new ModelRenderer(this, 178, 80);
        this.spine4.addBox(-1.5F, 9.0F, 41.0F, 3, 0, 11);
        this.spine4.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine4.setTextureSize(256, 128);
        this.spine4.mirror = true;
        this.setRotation(this.spine4, -0.0523599F, 0.0F, 0.0F);
        this.spine5 = new ModelRenderer(this, 178, 96);
        this.spine5.addBox(0.0F, 7.5F, 41.0F, 0, 3, 11);
        this.spine5.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine5.setTextureSize(256, 128);
        this.spine5.mirror = true;
        this.setRotation(this.spine5, -0.0523599F, 0.0F, 0.0F);
        this.spine6 = new ModelRenderer(this, 149, 96);
        this.spine6.addBox(0.0F, 3.0F, 32.0F, 0, 4, 10);
        this.spine6.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine6.setTextureSize(256, 128);
        this.spine6.mirror = true;
        this.setRotation(this.spine6, -0.1396263F, 0.0F, 0.0F);
        this.spine7 = new ModelRenderer(this, 149, 81);
        this.spine7.addBox(-2.0F, 5.0F, 32.0F, 4, 0, 10);
        this.spine7.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine7.setTextureSize(256, 128);
        this.spine7.mirror = true;
        this.setRotation(this.spine7, -0.1396263F, 0.0F, 0.0F);
        this.spine8 = new ModelRenderer(this, 118, 82);
        this.spine8.addBox(-3.0F, 3.0F, 22.0F, 6, 0, 10);
        this.spine8.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine8.setTextureSize(256, 128);
        this.spine8.mirror = true;
        this.setRotation(this.spine8, -0.2094395F, 0.0F, 0.0F);
        this.spine9 = new ModelRenderer(this, 118, 94);
        this.spine9.addBox(0.0F, 0.0F, 22.0F, 0, 6, 10);
        this.spine9.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine9.setTextureSize(256, 128);
        this.spine9.mirror = true;
        this.setRotation(this.spine9, -0.2094395F, 0.0F, 0.0F);
        this.spine10 = new ModelRenderer(this, 85, 85);
        this.spine10.addBox(-4.0F, 0.5F, 11.0F, 8, 0, 11);
        this.spine10.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine10.setTextureSize(256, 128);
        this.spine10.mirror = true;
        this.setRotation(this.spine10, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.spine11 = new ModelRenderer(this, 90, 93);
        this.spine11.addBox(0.0F, -3.5F, 11.0F, 0, 8, 11);
        this.spine11.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine11.setTextureSize(256, 128);
        this.spine11.mirror = true;
        this.setRotation(this.spine11, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tail5 = new ModelRenderer(this, 50, 66);
        this.tail5.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11);
        this.tail5.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.tail5.setTextureSize(256, 128);
        this.tail5.mirror = true;
        this.setRotation(this.tail5, -0.4014257F, 0.0F, 0.0F);
        this.spine12 = new ModelRenderer(this, 58, 93);
        this.spine12.addBox(0.0F, -4.5F, 0.0F, 0, 8, 11);
        this.spine12.setRotationPoint(0.0F, 1.5F, 18.5F);
        this.spine12.setTextureSize(256, 128);
        this.spine12.mirror = true;
        this.setRotation(this.spine12, -0.4014257F, 0.0F, 0.0F);
        this.part1 = new ModelRenderer(this, 10, 86);
        this.part1.addBox(-4.5F, -11.0F, 7.0F, 2, 9, 2);
        this.part1.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part1.setTextureSize(256, 128);
        this.part1.mirror = true;
        this.setRotation(this.part1, -0.1919862F, 0.0F, -0.1745329F);
        this.part2 = new ModelRenderer(this, 0, 86);
        this.part2.addBox(2.5F, -11.0F, 7.0F, 2, 9, 2);
        this.part2.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part2.setTextureSize(256, 128);
        this.part2.mirror = true;
        this.setRotation(this.part2, -0.1919862F, 0.0F, 0.1745329F);
        this.part3 = new ModelRenderer(this, 9, 86);
        this.part3.addBox(-3.5F, -14.0F, 10.0F, 2, 9, 2);
        this.part3.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part3.setTextureSize(256, 128);
        this.part3.mirror = true;
        this.setRotation(this.part3, -0.5585054F, 0.0F, -0.1745329F);
        this.part4 = new ModelRenderer(this, 0, 86);
        this.part4.addBox(1.5F, -14.0F, 10.0F, 2, 9, 2);
        this.part4.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part4.setTextureSize(256, 128);
        this.part4.mirror = true;
        this.setRotation(this.part4, -0.5585054F, 0.0F, 0.1745329F);
        this.headHornLeft = new ModelRenderer(this, 71, 0);
        this.headHornLeft.addBox(-5.5F, -4.0F, -1.0F, 3, 7, 0);
        this.headHornLeft.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headHornLeft.setTextureSize(256, 128);
        this.headHornLeft.mirror = false;
        this.setRotation(this.headHornLeft, -((float) Math.PI / 5F), 0.0F, 0.0F);
        this.headPouches = new ModelRenderer(this, 125, 10);
        this.headPouches.addBox(-3.5F, -17.0F, -4.2F, 7, 13, 3);
        this.headPouches.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headPouches.setTextureSize(256, 128);
        this.headPouches.mirror = true;
        this.setRotation(this.headPouches, -0.9075712F, 0.0F, 0.0F);
        this.headTop = new ModelRenderer(this, 28, 10);
        this.headTop.addBox(-2.5F, -14.0F, -4.2F, 5, 10, 5);
        this.headTop.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headTop.setTextureSize(256, 128);
        this.headTop.mirror = true;
        this.setRotation(this.headTop, -0.9075712F, 0.0F, 0.0F);
        this.headBase = new ModelRenderer(this, 0, 0);
        this.headBase.addBox(-2.5F, -5.0F, -3.0F, 5, 10, 5);
        this.headBase.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headBase.setTextureSize(256, 128);
        this.headBase.mirror = true;
        this.setRotation(this.headBase, -((float) Math.PI / 5F), 0.0F, 0.0F);
        this.headHornRight = new ModelRenderer(this, 79, 0);
        this.headHornRight.addBox(2.5F, -4.0F, -1.0F, 3, 7, 0);
        this.headHornRight.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headHornRight.setTextureSize(256, 128);
        this.headHornRight.mirror = false;
        this.setRotation(this.headHornRight, -((float) Math.PI / 5F), 0.0F, 0.0F);
    }

    @Override
    protected void render(IRenderObject renderObject, float boxTranslation)
    {
        RenderObject o = (RenderObject) renderObject;
        
        this.lThigh.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev - 0.8028515F;
        this.lShin1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev - 0.4014257F;
        this.lShin2.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev - 0.8028515F;
        this.lFoot.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev;
        this.rThigh.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev - 0.8028515F;
        this.rShin1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev - 0.4014257F;
        this.rShin2.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev - 0.8028515F;
        this.rFoot.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev;
        this.rArm1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rArm2.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rClaw1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rClaw2.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lArm1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lArm2.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lClaw1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lClaw2.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        
        this.chest.render(boxTranslation);
        this.abdomen.render(boxTranslation);
        this.rThigh.render(boxTranslation);
        this.lThigh.render(boxTranslation);
        this.lShin1.render(boxTranslation);
        this.rShin1.render(boxTranslation);
        this.lShin2.render(boxTranslation);
        this.rShin2.render(boxTranslation);
        this.lFoot.render(boxTranslation);
        this.rFoot.render(boxTranslation);
        this.lArm1.render(boxTranslation);
        this.rArm1.render(boxTranslation);
        this.lClaw1.render(boxTranslation);
        this.rArm2.render(boxTranslation);
        this.neck.render(boxTranslation);
        this.headSpine1.render(boxTranslation);
        this.rHead.render(boxTranslation);
        this.jaw.render(boxTranslation);
        this.jaw2.render(boxTranslation);
        this.headSpine2.render(boxTranslation);
        this.lArm2.render(boxTranslation);
        this.rClaw1.render(boxTranslation);
        this.lClaw2.render(boxTranslation);
        this.rClaw2.render(boxTranslation);
        this.spine1.render(boxTranslation);
        this.spine2.render(boxTranslation);
        this.spine3.render(boxTranslation);
        this.tail1.render(boxTranslation);
        this.tail2.render(boxTranslation);
        this.tailStabber.render(boxTranslation);
        this.tail3.render(boxTranslation);
        this.tail4.render(boxTranslation);
        this.lHead.render(boxTranslation);
        this.spine4.render(boxTranslation);
        this.spine5.render(boxTranslation);
        this.spine6.render(boxTranslation);
        this.spine7.render(boxTranslation);
        this.spine8.render(boxTranslation);
        this.spine9.render(boxTranslation);
        this.spine10.render(boxTranslation);
        this.spine11.render(boxTranslation);
        this.tail5.render(boxTranslation);
        this.spine12.render(boxTranslation);
        this.part1.render(boxTranslation);
        this.part2.render(boxTranslation);
        this.part3.render(boxTranslation);
        this.part4.render(boxTranslation);
        this.headHornLeft.render(boxTranslation);
        this.headPouches.render(boxTranslation);
        this.headTop.render(boxTranslation);
        this.headBase.render(boxTranslation);
        this.headHornRight.render(boxTranslation);
    }
}
