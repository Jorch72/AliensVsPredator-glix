package com.arisux.avp.entities.mob.model;

import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.GlStateManager;
import com.arisux.airi.lib.RenderUtil;
import com.arisux.airi.lib.client.ModelBaseWrapper;
import com.arisux.avp.AliensVsPredator;
import com.arisux.avp.entities.mob.EntityQueen;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;

public class ModelQueen extends ModelBaseWrapper
{
    public ModelRenderer torso0, torso1, rThigh, lThigh, lShin0, lShin1, lFoot, rShin0, rShin1, rFoot, lArm0, lArm1, lHand, lClaw, rArm0, rArm1, rHand, rClaw, tail0, tail1, tail2, tail3, tail4, tailStabber, bStabber0, bStabber1, bStabber2, bStabber3, bStabber4, bStabber5, bSpines0, bSpines1, bSpines2, bSpines3, bSpines4, bSpines5, bSpines6, lArmMini0, lArmMini1, rArmMini0, rArmMini1, lHandMini, rHandMini, lClawMini, rClawMini, neck, Jaw1, head0, head1, headBase0, headFinL0, headFinL1, headFinL2, headFinR0, headFinR1, headFinR2, headWebL, headSpinesL, headSpinesM, headSpinesR, headWebR, rHip, lHip, lShinSpike, rShinSpike, sack0, sack7, sack1, sack2, sack3, sack4, sack5, sack6;

    public ModelQueen()
    {
        textureWidth = 256;
        textureHeight = 128;

        torso0 = new ModelRenderer(this, 0, 0);
        torso0.addBox(-4.5F, -2F, 0F, 9, 8, 10);
        torso0.setRotationPoint(0F, -13.5F, -1F);
        torso0.setTextureSize(256, 128);
        torso0.mirror = true;
        setRotation(torso0, -0.4363323F, 0F, 0F);
        torso1 = new ModelRenderer(this, 39, 0);
        torso1.addBox(-3.5F, -7F, 8F, 7, 6, 12);
        torso1.setRotationPoint(0F, -6F, -3F);
        torso1.setTextureSize(256, 128);
        torso1.mirror = true;
        setRotation(torso1, -0.2792527F, 0F, 0F);
        rThigh = new ModelRenderer(this, 185, 0);
        rThigh.addBox(-2.5F, -4F, -4.5F, 4, 17, 5);
        rThigh.setRotationPoint(-4.5F, 0F, 16F);
        rThigh.setTextureSize(256, 128);
        rThigh.mirror = true;
        setRotation(rThigh, -0.7330383F, 0.2443461F, 0.418879F);
        lThigh = new ModelRenderer(this, 204, 0);
        lThigh.addBox(-1.5F, -4F, -4.5F, 4, 17, 5);
        lThigh.setRotationPoint(4.5F, 0F, 16F);
        lThigh.setTextureSize(256, 128);
        lThigh.mirror = true;
        setRotation(lThigh, -0.7330383F, -0.2443461F, -0.418879F);
        lShin0 = new ModelRenderer(this, 78, 0);
        lShin0.addBox(-1F, 12F, -4.5F, 3, 3, 14);
        lShin0.setRotationPoint(4.5F, 0F, 16F);
        lShin0.setTextureSize(256, 128);
        lShin0.mirror = true;
        setRotation(lShin0, -0.6981317F, -0.2443461F, -0.418879F);
        lShin1 = new ModelRenderer(this, 148, 0);
        lShin1.addBox(-0.5F, 10F, 11.4F, 2, 13, 2);
        lShin1.setRotationPoint(4.5F, 0F, 16F);
        lShin1.setTextureSize(256, 128);
        lShin1.mirror = true;
        setRotation(lShin1, -0.9599311F, -0.2443461F, -0.418879F);
        lFoot = new ModelRenderer(this, 166, 0);
        lFoot.addBox(10.5F, 20.1F, -13.3F, 3, 2, 6);
        lFoot.setRotationPoint(4.5F, 0F, 16F);
        lFoot.setTextureSize(256, 128);
        lFoot.mirror = true;
        setRotation(lFoot, 0F, 0F, 0F);
        rShin0 = new ModelRenderer(this, 113, 0);
        rShin0.addBox(-2F, 12F, -4.5F, 3, 3, 14);
        rShin0.setRotationPoint(-4.5F, 0F, 16F);
        rShin0.setTextureSize(256, 128);
        rShin0.mirror = true;
        setRotation(rShin0, -0.6981317F, 0.2443461F, 0.418879F);
        rShin1 = new ModelRenderer(this, 157, 0);
        rShin1.addBox(-1.5F, 10F, 11.4F, 2, 13, 2);
        rShin1.setRotationPoint(-4.5F, 0F, 16F);
        rShin1.setTextureSize(256, 128);
        rShin1.mirror = true;
        setRotation(rShin1, -0.9599311F, 0.2443461F, 0.418879F);
        rFoot = new ModelRenderer(this, 166, 9);
        rFoot.addBox(-13.5F, 20.1F, -13.3F, 3, 2, 6);
        rFoot.setRotationPoint(-4.5F, 0F, 16F);
        rFoot.setTextureSize(256, 128);
        rFoot.mirror = true;
        setRotation(rFoot, 0F, 0F, 0F);
        lArm0 = new ModelRenderer(this, 67, 19);
        lArm0.addBox(-1F, -2F, -1F, 2, 13, 2);
        lArm0.setRotationPoint(4.5F, -8F, 1F);
        lArm0.setTextureSize(256, 128);
        lArm0.mirror = true;
        setRotation(lArm0, 0.3665191F, 0F, -0.2443461F);
        lArm1 = new ModelRenderer(this, 123, 19);
        lArm1.addBox(-1F, 9.5F, -10.5F, 2, 2, 11);
        lArm1.setRotationPoint(4.5F, -8F, 1F);
        lArm1.setTextureSize(256, 128);
        lArm1.mirror = true;
        setRotation(lArm1, 0.3665191F, 0F, -0.2443461F);
        lHand = new ModelRenderer(this, 85, 19);
        lHand.addBox(-1F, 10F, -13.5F, 2, 1, 3);
        lHand.setRotationPoint(4.5F, -8F, 1F);
        lHand.setTextureSize(256, 128);
        lHand.mirror = true;
        setRotation(lHand, 0.3665191F, 0F, -0.2443461F);
        lClaw = new ModelRenderer(this, 185, 23);
        lClaw.addBox(-2F, 10.5F, -16.5F, 3, 0, 6);
        lClaw.setRotationPoint(4.5F, -8F, 1F);
        lClaw.setTextureSize(256, 128);
        lClaw.mirror = true;
        setRotation(lClaw, 0.3665191F, 0F, -0.2443461F);
        rArm0 = new ModelRenderer(this, 76, 19);
        rArm0.addBox(-1F, -2F, -1F, 2, 13, 2);
        rArm0.setRotationPoint(-4.5F, -8F, 1F);
        rArm0.setTextureSize(256, 128);
        rArm0.mirror = true;
        setRotation(rArm0, 0.3665191F, 0F, 0.2443461F);
        rArm1 = new ModelRenderer(this, 96, 19);
        rArm1.addBox(-1F, 9.5F, -10.5F, 2, 2, 11);
        rArm1.setRotationPoint(-4.5F, -8F, 1F);
        rArm1.setTextureSize(256, 128);
        rArm1.mirror = true;
        setRotation(rArm1, 0.3665191F, 0F, 0.2443461F);
        rHand = new ModelRenderer(this, 85, 24);
        rHand.addBox(-1F, 10F, -13.5F, 2, 1, 3);
        rHand.setRotationPoint(-4.5F, -8F, 1F);
        rHand.setTextureSize(256, 128);
        rHand.mirror = true;
        setRotation(rHand, 0.3665191F, 0F, 0.2443461F);
        rClaw = new ModelRenderer(this, 204, 23);
        rClaw.addBox(-1F, 10.5F, -16.5F, 3, 0, 6);
        rClaw.setRotationPoint(-4.5F, -8F, 1F);
        rClaw.setTextureSize(256, 128);
        rClaw.mirror = true;
        setRotation(rClaw, 0.3665191F, 0F, 0.2443461F);
        tail0 = new ModelRenderer(this, 175, 47);
        tail0.addBox(-2.5F, -2.5F, 0F, 5, 5, 11);
        tail0.setRotationPoint(0F, -3.5F, 16.5F);
        tail0.setTextureSize(256, 128);
        tail0.mirror = true;
        setRotation(tail0, -0.2792527F, 0F, 0F);
        tail1 = new ModelRenderer(this, 144, 47);
        tail1.addBox(-2F, -3.5F, 8F, 4, 4, 11);
        tail1.setRotationPoint(0F, -0.5F, 18.5F);
        tail1.setTextureSize(256, 128);
        tail1.mirror = true;
        setRotation(tail1, -0.2268928F, 0F, 0F);
        tail2 = new ModelRenderer(this, 115, 47);
        tail2.addBox(-1.5F, 1.5F, 18F, 3, 3, 11);
        tail2.setRotationPoint(0F, -2.5F, 19.5F);
        tail2.setTextureSize(256, 128);
        tail2.mirror = true;
        setRotation(tail2, -0.122173F, 0F, 0F);
        tail3 = new ModelRenderer(this, 88, 47);
        tail3.addBox(-1F, 2F, 28F, 2, 2, 11);
        tail3.setRotationPoint(0F, -0.5F, 18.5F);
        tail3.setTextureSize(256, 128);
        tail3.mirror = true;
        setRotation(tail3, -0.0523599F, 0F, 0F);
        tail4 = new ModelRenderer(this, 63, 47);
        tail4.addBox(-0.5F, 5.5F, 38F, 1, 1, 11);
        tail4.setRotationPoint(0F, -0.5F, 18.5F);
        tail4.setTextureSize(256, 128);
        tail4.mirror = true;
        setRotation(tail4, 0.0349066F, 0F, 0F);
        tailStabber = new ModelRenderer(this, 211, 0);
        tailStabber.addBox(-2F, 6F, 48F, 4, 0, 12);
        tailStabber.setRotationPoint(0F, -0.5F, 18.5F);
        tailStabber.setTextureSize(256, 128);
        tailStabber.mirror = true;
        setRotation(tailStabber, 0.0349066F, 0F, 0F);
        bStabber0 = new ModelRenderer(this, 249, 22);
        bStabber0.addBox(0F, -14F, 0F, 3, 14, 0);
        bStabber0.setRotationPoint(2F, -8.3F, 14F);
        bStabber0.setTextureSize(256, 128);
        bStabber0.mirror = true;
        setRotation(bStabber0, 0.3665191F, -2.007129F, 0.7504916F);
        bStabber1 = new ModelRenderer(this, 235, 13);
        bStabber1.addBox(0F, -17F, 0F, 3, 18, 0);
        bStabber1.setRotationPoint(2F, -9.3F, 10F);
        bStabber1.setTextureSize(256, 128);
        bStabber1.mirror = true;
        setRotation(bStabber1, 0.3316126F, -1.902409F, 0.4537856F);
        bStabber2 = new ModelRenderer(this, 249, 0);
        bStabber2.addBox(0F, -19F, 0F, 3, 21, 0);
        bStabber2.setRotationPoint(3F, -12.3F, 6F);
        bStabber2.setTextureSize(256, 128);
        bStabber2.mirror = true;
        setRotation(bStabber2, 0.2792527F, -1.570796F, 0.3490659F);
        bStabber3 = new ModelRenderer(this, 242, 22);
        bStabber3.addBox(0F, -14F, 0F, 3, 14, 0);
        bStabber3.setRotationPoint(-2F, -8.3F, 14F);
        bStabber3.setTextureSize(256, 128);
        bStabber3.mirror = true;
        setRotation(bStabber3, -0.3665191F, -1.134464F, 0.7504916F);
        bStabber4 = new ModelRenderer(this, 228, 13);
        bStabber4.addBox(0F, -17F, 0F, 3, 18, 0);
        bStabber4.setRotationPoint(-2F, -9.3F, 10F);
        bStabber4.setTextureSize(256, 128);
        bStabber4.mirror = true;
        setRotation(bStabber4, -0.3316126F, -1.239184F, 0.4537856F);
        bStabber5 = new ModelRenderer(this, 242, 0);
        bStabber5.addBox(0F, -20F, 0F, 3, 21, 0);
        bStabber5.setRotationPoint(-3F, -12.3F, 6F);
        bStabber5.setTextureSize(256, 128);
        bStabber5.mirror = true;
        setRotation(bStabber5, -0.2792527F, -1.570796F, 0.3490659F);
        bSpines0 = new ModelRenderer(this, 210, 25);
        bSpines0.addBox(0F, -10F, -2F, 0, 8, 10);
        bSpines0.setRotationPoint(0F, -9.5F, 0F);
        bSpines0.setTextureSize(256, 128);
        bSpines0.mirror = true;
        setRotation(bSpines0, -0.4712389F, 0F, 0F);
        bSpines1 = new ModelRenderer(this, 185, 23);
        bSpines1.addBox(0F, -13F, 6F, 0, 6, 12);
        bSpines1.setRotationPoint(0F, -5F, 0F);
        bSpines1.setTextureSize(256, 128);
        bSpines1.mirror = true;
        setRotation(bSpines1, -0.3141593F, 0F, 0F);
        bSpines2 = new ModelRenderer(this, 162, 24);
        bSpines2.addBox(-1F, -21F, 12F, 0, 5, 11);
        bSpines2.setRotationPoint(1F, 7F, 0F);
        bSpines2.setTextureSize(256, 128);
        bSpines2.mirror = true;
        setRotation(bSpines2, -0.3141593F, 0F, 0F);
        bSpines3 = new ModelRenderer(this, 139, 24);
        bSpines3.addBox(-1F, -17.8F, 25F, 0, 5, 11);
        bSpines3.setRotationPoint(1F, 7F, 0F);
        bSpines3.setTextureSize(256, 128);
        bSpines3.mirror = true;
        setRotation(bSpines3, -0.2268928F, 0F, 0F);
        bSpines4 = new ModelRenderer(this, 118, 25);
        bSpines4.addBox(-1F, -13.8F, 37.4F, 0, 4, 10);
        bSpines4.setRotationPoint(1F, 7F, 0F);
        bSpines4.setTextureSize(256, 128);
        bSpines4.mirror = true;
        setRotation(bSpines4, -0.1396263F, 0F, 0F);
        bSpines5 = new ModelRenderer(this, 97, 25);
        bSpines5.addBox(-1F, -12.2F, 47.8F, 0, 3, 10);
        bSpines5.setRotationPoint(1F, 7F, 0F);
        bSpines5.setTextureSize(256, 128);
        bSpines5.mirror = true;
        setRotation(bSpines5, -0.1047198F, 0F, 0F);
        bSpines6 = new ModelRenderer(this, 74, 24);
        bSpines6.addBox(-1F, -3.2F, 57F, 0, 2, 11);
        bSpines6.setRotationPoint(1F, 6F, 0F);
        bSpines6.setTextureSize(256, 128);
        bSpines6.mirror = true;
        setRotation(bSpines6, 0.0174533F, 0F, 0F);
        lArmMini0 = new ModelRenderer(this, 0, 40);
        lArmMini0.addBox(0F, 0F, 0F, 2, 6, 2);
        lArmMini0.setRotationPoint(1F, -6F, 0F);
        lArmMini0.setTextureSize(256, 128);
        lArmMini0.mirror = true;
        setRotation(lArmMini0, -0.0523599F, 0F, -0.2443461F);
        lArmMini1 = new ModelRenderer(this, 0, 33);
        lArmMini1.addBox(0F, 3.5F, 3.2F, 2, 4, 2);
        lArmMini1.setRotationPoint(1F, -6F, 0F);
        lArmMini1.setTextureSize(256, 128);
        lArmMini1.mirror = true;
        setRotation(lArmMini1, -0.715585F, 0F, -0.2443461F);
        rArmMini0 = new ModelRenderer(this, 9, 40);
        rArmMini0.addBox(-2F, 0F, 0F, 2, 6, 2);
        rArmMini0.setRotationPoint(-1F, -6F, 0F);
        rArmMini0.setTextureSize(256, 128);
        rArmMini0.mirror = true;
        setRotation(rArmMini0, -0.0523599F, 0F, 0.2443461F);
        rArmMini1 = new ModelRenderer(this, 9, 33);
        rArmMini1.addBox(-2F, 3.5F, 3.2F, 2, 4, 2);
        rArmMini1.setRotationPoint(-1F, -6F, 0F);
        rArmMini1.setTextureSize(256, 128);
        rArmMini1.mirror = true;
        setRotation(rArmMini1, -0.715585F, 0F, 0.2443461F);
        lHandMini = new ModelRenderer(this, 0, 49);
        lHandMini.addBox(0F, 6.5F, -7F, 2, 1, 3);
        lHandMini.setRotationPoint(1F, -6F, 0F);
        lHandMini.setTextureSize(256, 128);
        lHandMini.mirror = true;
        setRotation(lHandMini, 0.3665191F, 0F, -0.2443461F);
        rHandMini = new ModelRenderer(this, 0, 54);
        rHandMini.addBox(-2F, 6.5F, -7F, 2, 1, 3);
        rHandMini.setRotationPoint(-1F, -6F, 0F);
        rHandMini.setTextureSize(256, 128);
        rHandMini.mirror = true;
        setRotation(rHandMini, 0.3665191F, 0F, 0.2443461F);
        lClawMini = new ModelRenderer(this, 0, 19);
        lClawMini.addBox(-1F, 7F, -10F, 3, 0, 6);
        lClawMini.setRotationPoint(1F, -6F, 0F);
        lClawMini.setTextureSize(256, 128);
        lClawMini.mirror = true;
        setRotation(lClawMini, 0.3665191F, 0F, -0.2443461F);
        rClawMini = new ModelRenderer(this, 0, 26);
        rClawMini.addBox(-2F, 7F, -10F, 3, 0, 6);
        rClawMini.setRotationPoint(-1F, -6F, 0F);
        rClawMini.setTextureSize(256, 128);
        rClawMini.mirror = true;
        setRotation(rClawMini, 0.3665191F, 0F, 0.2443461F);
        neck = new ModelRenderer(this, 0, 77);
        neck.addBox(-2F, -2F, -4F, 4, 5, 5);
        neck.setRotationPoint(0F, -11.5F, -2F);
        neck.setTextureSize(256, 128);
        neck.mirror = true;
        setRotation(neck, -0.1919862F, 0F, 0F);
        Jaw1 = new ModelRenderer(this, 19, 77);
        Jaw1.addBox(-1.5F, 5.6F, -8.5F, 3, 4, 6);
        Jaw1.setRotationPoint(0F, -13.5F, -6F);
        Jaw1.setTextureSize(256, 128);
        Jaw1.mirror = true;
        setRotation(Jaw1, 0.3490659F, 0F, 0F);
        head0 = new ModelRenderer(this, 19, 19);
        head0.addBox(-3.5F, -5F, -3F, 7, 11, 5);
        head0.setRotationPoint(0F, -13.5F, -6F);
        head0.setTextureSize(256, 128);
        head0.mirror = true;
        setRotation(head0, -0.6283185F, 0F, 0F);
        head1 = new ModelRenderer(this, 44, 19);
        head1.addBox(-2.5F, 4F, -6F, 5, 5, 6);
        head1.setRotationPoint(0F, -13.5F, -5F);
        head1.setTextureSize(256, 128);
        head1.mirror = true;
        setRotation(head1, -0.122173F, 0F, 0F);
        headBase0 = new ModelRenderer(this, 19, 36);
        headBase0.addBox(-3.5F, -23F, -4.2F, 7, 19, 5);
        headBase0.setRotationPoint(0F, -13.5F, -6F);
        headBase0.setTextureSize(256, 128);
        headBase0.mirror = true;
        setRotation(headBase0, -0.9075712F, 0F, 0F);
        headFinL0 = new ModelRenderer(this, 0, 59);
        headFinL0.addBox(0F, -3F, -2.5F, 5, 5, 2);
        headFinL0.setRotationPoint(0F, -13.5F, -6F);
        headFinL0.setTextureSize(256, 128);
        headFinL0.mirror = true;
        setRotation(headFinL0, -0.7853982F, 0.2617994F, 0.8552113F);
        headFinL1 = new ModelRenderer(this, 15, 61);
        headFinL1.addBox(2F, -10F, -3.6F, 4, 6, 2);
        headFinL1.setRotationPoint(0F, -13.5F, -6F);
        headFinL1.setTextureSize(256, 128);
        headFinL1.mirror = true;
        setRotation(headFinL1, -0.9075712F, -0.1570796F, 0.2268928F);
        headFinL2 = new ModelRenderer(this, 44, 31);
        headFinL2.addBox(-3.5F, -23F, -3F, 7, 13, 2);
        headFinL2.setRotationPoint(0F, -13.5F, -6F);
        headFinL2.setTextureSize(256, 128);
        headFinL2.mirror = true;
        setRotation(headFinL2, -0.9250245F, 0.0698132F, 0.3490659F);
        headFinR0 = new ModelRenderer(this, 0, 67);
        headFinR0.addBox(-5F, -3F, -2.5F, 5, 5, 2);
        headFinR0.setRotationPoint(0F, -13.5F, -6F);
        headFinR0.setTextureSize(256, 128);
        headFinR0.mirror = true;
        setRotation(headFinR0, -0.7853982F, -0.2617994F, -0.8552113F);
        headFinR1 = new ModelRenderer(this, 28, 61);
        headFinR1.addBox(-5.8F, -10F, -3.6F, 4, 6, 2);
        headFinR1.setRotationPoint(0F, -13.5F, -6F);
        headFinR1.setTextureSize(256, 128);
        headFinR1.mirror = true;
        setRotation(headFinR1, -0.9075712F, 0.1570796F, -0.2268928F);
        headFinR2 = new ModelRenderer(this, 44, 47);
        headFinR2.addBox(-3.5F, -23F, -3F, 7, 13, 2);
        headFinR2.setRotationPoint(0F, -13.5F, -6F);
        headFinR2.setTextureSize(256, 128);
        headFinR2.mirror = true;
        setRotation(headFinR2, -0.9250245F, -0.0698132F, -0.3490659F);
        headWebL = new ModelRenderer(this, 15, 70);
        headWebL.addBox(1.8F, -5F, -1.2F, 3, 6, 0);
        headWebL.setRotationPoint(0F, -13.5F, -6F);
        headWebL.setTextureSize(256, 128);
        headWebL.mirror = true;
        setRotation(headWebL, -0.6283185F, -0.122173F, 0.2268928F);
        headSpinesL = new ModelRenderer(this, 63, 18);
        headSpinesL.addBox(1F, -6F, -1F, 0, 4, 24);
        headSpinesL.setRotationPoint(0F, -13.5F, -6F);
        headSpinesL.setTextureSize(256, 128);
        headSpinesL.mirror = true;
        setRotation(headSpinesL, 0.6981317F, 0F, 0.296706F);
        headSpinesM = new ModelRenderer(this, 112, 18);
        headSpinesM.addBox(0F, -6F, -1F, 0, 4, 24);
        headSpinesM.setRotationPoint(0F, -13.5F, -6F);
        headSpinesM.setTextureSize(256, 128);
        headSpinesM.mirror = true;
        setRotation(headSpinesM, 0.6981317F, 0F, 0F);
        headSpinesR = new ModelRenderer(this, 161, 18);
        headSpinesR.addBox(-1F, -6F, -1F, 0, 4, 24);
        headSpinesR.setRotationPoint(0F, -13.5F, -6F);
        headSpinesR.setTextureSize(256, 128);
        headSpinesR.mirror = true;
        setRotation(headSpinesR, 0.6981317F, 0F, -0.296706F);
        headWebR = new ModelRenderer(this, 22, 70);
        headWebR.addBox(-4.8F, -5F, -1.2F, 3, 6, 0);
        headWebR.setRotationPoint(0F, -13.5F, -6F);
        headWebR.setTextureSize(256, 128);
        headWebR.mirror = true;
        setRotation(headWebR, -0.6283185F, 0.122173F, -0.2268928F);
        rHip = new ModelRenderer(this, 167, 18);
        rHip.addBox(0F, -9F, -2.5F, 0, 5, 4);
        rHip.setRotationPoint(-4.5F, 0F, 16F);
        rHip.setTextureSize(256, 128);
        setRotation(rHip, -0.296706F, 0F, 0F);
        rHip.mirror = false;
        lHip = new ModelRenderer(this, 176, 18);
        lHip.addBox(0F, -9F, -2.5F, 0, 5, 4);
        lHip.setRotationPoint(4.5F, 0F, 16F);
        lHip.setTextureSize(256, 128);
        lHip.mirror = true;
        setRotation(lHip, -0.296706F, 0F, 0F);
        lShinSpike = new ModelRenderer(this, 150, 17);
        lShinSpike.addBox(0.5F, 8F, -12F, 0, 3, 5);
        lShinSpike.setRotationPoint(4.5F, 0F, 16F);
        lShinSpike.setTextureSize(256, 128);
        lShinSpike.mirror = true;
        setRotation(lShinSpike, 0.8028515F, -0.2443461F, -0.418879F);
        rShinSpike = new ModelRenderer(this, 150, 26);
        rShinSpike.addBox(-0.5F, 8F, -12F, 0, 3, 5);
        rShinSpike.setRotationPoint(-4.5F, 0F, 16F);
        rShinSpike.setTextureSize(256, 128);
        rShinSpike.mirror = true;
        setRotation(rShinSpike, 0.8028515F, 0.2443461F, 0.418879F);
        sack0 = new ModelRenderer(this, 229, 64);
        sack0.addBox(-3F, -10F, 2F, 6, 6, 7);
        sack0.setRotationPoint(0F, 0F, 11F);
        sack0.setTextureSize(256, 128);
        sack0.mirror = true;
        setRotation(sack0, -0.9599311F, 0F, 0F);
        sack7 = new ModelRenderer(this, 42, 64);
        sack7.addBox(-1.5F, -52F, 35F, 3, 3, 7);
        sack7.setRotationPoint(0F, 0F, 11F);
        sack7.setTextureSize(256, 128);
        sack7.mirror = true;
        setRotation(sack7, -1.151917F, 0F, 0F);
        sack1 = new ModelRenderer(this, 192, 64);
        sack1.addBox(-4F, -5F, 9F, 8, 8, 10);
        sack1.setRotationPoint(0F, 0F, 11F);
        sack1.setTextureSize(256, 128);
        sack1.mirror = true;
        setRotation(sack1, -0.3665191F, 0F, 0F);
        sack2 = new ModelRenderer(this, 149, 64);
        sack2.addBox(-5F, -2.5F, 18F, 10, 10, 11);
        sack2.setRotationPoint(0F, 0F, 11F);
        sack2.setTextureSize(256, 128);
        sack2.mirror = true;
        setRotation(sack2, -0.1919862F, 0F, 0F);
        sack3 = new ModelRenderer(this, 104, 64);
        sack3.addBox(-5.5F, -1.5F, 28F, 11, 11, 11);
        sack3.setRotationPoint(0F, 0F, 11F);
        sack3.setTextureSize(256, 128);
        sack3.mirror = true;
        setRotation(sack3, -0.1396263F, 0F, 0F);
        sack4 = new ModelRenderer(this, 63, 64);
        sack4.addBox(-4.5F, 2.5F, 37F, 9, 9, 11);
        sack4.setRotationPoint(0F, 0F, 11F);
        sack4.setTextureSize(256, 128);
        sack4.mirror = true;
        setRotation(sack4, -0.0349066F, 0F, 0F);
        sack5 = new ModelRenderer(this, 223, 47);
        sack5.addBox(-3.5F, 6F, 47.2F, 7, 7, 9);
        sack5.setRotationPoint(0F, 0F, 11F);
        sack5.setTextureSize(256, 128);
        sack5.mirror = true;
        setRotation(sack5, 0.0349066F, 0F, 0F);
        sack6 = new ModelRenderer(this, 38, 75);
        sack6.addBox(-2.5F, -17F, 54F, 5, 6, 7);
        sack6.setRotationPoint(0F, 0F, 11F);
        sack6.setTextureSize(256, 128);
        sack6.mirror = true;
        setRotation(sack6, -0.4014257F, 0F, 0F);
    }

    @Override
    protected void render(IRenderObject renderObject, float boxTranslation)
    {
        RenderObject o = (RenderObject) renderObject;

        this.lThigh.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 0.8F * o.swingProgressPrev - 0.6028515F;
        this.lShin0.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 0.8F * o.swingProgressPrev - 0.6028515F;
        this.lShin1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 0.8F * o.swingProgressPrev - 0.8028515F;
        this.lShinSpike.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 0.8F * o.swingProgressPrev + 0.8028515F;
        this.lFoot.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 0.8F * o.swingProgressPrev;

        this.rThigh.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 0.8F * o.swingProgressPrev - 0.6028515F;
        this.rShin0.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 0.8F * o.swingProgressPrev - 0.6028515F;
        this.rShin1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 0.8F * o.swingProgressPrev - 0.8028515F;
        this.rShinSpike.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 0.8F * o.swingProgressPrev + 0.8028515F;
        this.rFoot.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 0.8F * o.swingProgressPrev;

        this.lArm0.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lArm1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lHand.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lClaw.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;

        this.rArm0.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rArm1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rHand.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rClaw.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;

        this.rArmMini0.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.0665191F;
        this.rHandMini.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.rArmMini1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev - 0.6065191F;
        this.rClawMini.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev + 0.3665191F;

        this.lArmMini0.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.0665191F;
        this.lHandMini.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;
        this.lArmMini1.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev - 0.6065191F;
        this.lClawMini.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev + 0.3665191F;

        GlStateManager.enableCullFace();
        this.torso0.render(boxTranslation);
        this.torso1.render(boxTranslation);
        this.rThigh.render(boxTranslation);
        this.lThigh.render(boxTranslation);
        this.lShin0.render(boxTranslation);
        this.lShin1.render(boxTranslation);
        this.lFoot.render(boxTranslation);
        this.rShin0.render(boxTranslation);
        this.rShin1.render(boxTranslation);
        this.rFoot.render(boxTranslation);
        this.lArm0.render(boxTranslation);
        this.lArm1.render(boxTranslation);
        this.lHand.render(boxTranslation);
        this.lClaw.render(boxTranslation);
        this.rArm0.render(boxTranslation);
        this.rArm1.render(boxTranslation);
        this.rHand.render(boxTranslation);
        this.rClaw.render(boxTranslation);
        this.tail0.render(boxTranslation);
        this.tail1.render(boxTranslation);
        this.tail2.render(boxTranslation);
        this.tail3.render(boxTranslation);
        this.tail4.render(boxTranslation);
        this.bStabber0.render(boxTranslation);
        this.bStabber1.render(boxTranslation);
        this.bStabber2.render(boxTranslation);
        this.bStabber3.render(boxTranslation);
        this.bStabber4.render(boxTranslation);
        this.bStabber5.render(boxTranslation);
        this.bSpines0.render(boxTranslation);
        this.bSpines1.render(boxTranslation);
        this.bSpines2.render(boxTranslation);
        this.bSpines3.render(boxTranslation);
        this.bSpines4.render(boxTranslation);
        this.bSpines5.render(boxTranslation);
        this.bSpines6.render(boxTranslation);
        this.lArmMini0.render(boxTranslation);
        this.lArmMini1.render(boxTranslation);
        this.rArmMini0.render(boxTranslation);
        this.rArmMini1.render(boxTranslation);
        this.lHandMini.render(boxTranslation);
        this.rHandMini.render(boxTranslation);
        this.lClawMini.render(boxTranslation);
        this.rClawMini.render(boxTranslation);
        this.neck.render(boxTranslation);

        GlStateManager.pushMatrix();
        GlStateManager.disableCullFace();
        GlStateManager.scale(1F, 1F, -1F);
        GlStateManager.translate(0F, 0.01F, -9.1F);
        this.tailStabber.render(boxTranslation);
        GlStateManager.enableCullFace();
        GlStateManager.popMatrix();

        GlStateManager.pushMatrix();
        {
            GlStateManager.rotate(((float) Math.toRadians(o.headYaw) + o.swingProgressPrev) * 30F, 0, 1, 0);
            this.Jaw1.render(boxTranslation);
            this.head0.render(boxTranslation);
            this.head1.render(boxTranslation);
            this.headBase0.render(boxTranslation);
            this.headFinL0.render(boxTranslation);
            this.headFinL1.render(boxTranslation);
            this.headFinL2.render(boxTranslation);
            this.headFinR0.render(boxTranslation);
            this.headFinR1.render(boxTranslation);
            this.headFinR2.render(boxTranslation);
            this.headWebL.render(boxTranslation);
            this.headSpinesL.render(boxTranslation);
            this.headSpinesM.render(boxTranslation);
            this.headSpinesR.render(boxTranslation);
            this.headWebR.render(boxTranslation);
        }
        GlStateManager.popMatrix();

        this.rHip.render(boxTranslation);
        this.lHip.render(boxTranslation);
        this.lShinSpike.render(boxTranslation);
        this.rShinSpike.render(boxTranslation);


        if (o.getEntity() != null)
        {
            EntityQueen queen = (EntityQueen) o.getEntity();

            if (queen.isInStasis)
            {
                ModelOvamorph ovamorph = new ModelOvamorph();

                RenderUtil.bindTexture(AliensVsPredator.resources().OVAMORPH);
                ovamorph.render();

                GlStateManager.pushMatrix();
                {
                    GlStateManager.translate(0, -0.05F, 1F - queen.getOvipositorSize());
                    GlStateManager.scale(queen.getOvipositorSize(), queen.getOvipositorSize(), queen.getOvipositorSize());
                    GlStateManager.enableBlend();
                    GlStateManager.disableCullFace();
                    GlStateManager.blendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_DST_COLOR);
                    RenderUtil.bindTexture(AliensVsPredator.resources().XENOQUEEN_MASK);
                    sack0.render(boxTranslation);
                    sack7.render(boxTranslation);
                    sack1.render(boxTranslation);
                    sack2.render(boxTranslation);
                    sack3.render(boxTranslation);
                    sack4.render(boxTranslation);
                    sack5.render(boxTranslation);
                    sack6.render(boxTranslation);
                    GlStateManager.enableCullFace();
                    GlStateManager.blendClear();
                }
                GlStateManager.popMatrix();
            }
        }
    }
}
