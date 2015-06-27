package com.arisux.avp.entities.mob.model;

import com.arisux.airi.lib.client.ModelBaseExtension;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrilobite extends ModelBaseExtension
{
	ModelRenderer body;
	ModelRenderer lFrontTenticle2;
	ModelRenderer lMiddleTenticle1;
	ModelRenderer shape3;
	ModelRenderer lFrontTenticle1;
	ModelRenderer lFrontTenticle3;
	ModelRenderer lBackTneticle1;
	ModelRenderer tail;
	ModelRenderer lFrontTenticle4;
	ModelRenderer lFrontTenticle5;
	ModelRenderer lFrontClaw;
	ModelRenderer rFrontTenticle1;
	ModelRenderer rMiddleTenticle1;
	ModelRenderer rBackTenticle1;
	ModelRenderer rFrontTenticle2;
	ModelRenderer rFrontTenticle3;
	ModelRenderer rFrontTenticle4;
	ModelRenderer rFrontTenticle6;
	ModelRenderer rFrontClaw;
	ModelRenderer tail2;
	ModelRenderer lMiddleTenticle2;
	ModelRenderer lBackTenticle2;
	ModelRenderer rMiddleTenticle2;
	ModelRenderer rBackTenticle2;
	ModelRenderer lMiddleTenticle3;
	ModelRenderer lMiddleTenticle4;
	ModelRenderer lMiddleTenticle5;
	ModelRenderer lMiddleClaw;
	ModelRenderer rMiddleTenticle3;
	ModelRenderer rMiddleTenticle4;
	ModelRenderer rFrontTenticle5;
	ModelRenderer rMiddleClaw;
	ModelRenderer lBackTenticle3;
	ModelRenderer lBackTenticle4;
	ModelRenderer lBackTenticle5;
	ModelRenderer lBackClaw;
	ModelRenderer rBackTenticle3;
	ModelRenderer rBackTenticle4;
	ModelRenderer rBackTenticle5;
	ModelRenderer rBackClaw;
	ModelRenderer tail3;
	ModelRenderer tail4;
	ModelRenderer tail5;
	ModelRenderer tailClaw;
	ModelRenderer lJaw;
	ModelRenderer rJaw;
	ModelRenderer rFrontPetal1;
	ModelRenderer rFrontPetal2;
	ModelRenderer lMiddlePetal;
	ModelRenderer lBackPetal;
	ModelRenderer tailPetal;
	ModelRenderer rMiddlePetal;
	ModelRenderer rBackPetal;
	ModelRenderer ovipositor;
	ModelRenderer lFrontGrossTenticle;
	ModelRenderer rFrontGrossTenticle;
	ModelRenderer lMiddleGrossTenticle;
	ModelRenderer lBackGrossTenticle1;
	ModelRenderer rMiddleGrossTenticle;
	ModelRenderer lBackGrossTenticle2;
	ModelRenderer tailGrossTenticle;

	public ModelTrilobite() 
	{
		textureWidth = 128;
		textureHeight = 64;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(0F, 6F, 0F, 6, 3, 6);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		lFrontTenticle2 = new ModelRenderer(this, 0, 15);
		lFrontTenticle2.addBox(3F, 6.5F, -1.8F, 5, 2, 4);
		lFrontTenticle2.setRotationPoint(6F, 0F, 0F);
		lFrontTenticle2.setTextureSize(128, 64);
		lFrontTenticle2.mirror = true;
		setRotation(lFrontTenticle2, 0F, 0.715585F, 0.3490659F);
		lMiddleTenticle1 = new ModelRenderer(this, 46, 0);
		lMiddleTenticle1.addBox(1F, 6.5F, -0.5F, 4, 2, 2);
		lMiddleTenticle1.setRotationPoint(6F, 0F, 3F);
		lMiddleTenticle1.setTextureSize(128, 64);
		lMiddleTenticle1.mirror = true;
		setRotation(lMiddleTenticle1, 0F, -0.2094395F, 0.2792527F);
		shape3 = new ModelRenderer(this, 25, 0);
		shape3.addBox(0.5F, 4.5F, 7F, 5, 2, 4);
		shape3.setRotationPoint(0F, 0F, 0F);
		shape3.setTextureSize(128, 64);
		shape3.mirror = true;
		setRotation(shape3, -0.3316126F, 0F, 0F);
		lFrontTenticle1 = new ModelRenderer(this, 0, 10);
		lFrontTenticle1.addBox(1F, 6.5F, -0.9F, 2, 2, 2);
		lFrontTenticle1.setRotationPoint(6F, 0F, 0F);
		lFrontTenticle1.setTextureSize(128, 64);
		lFrontTenticle1.mirror = true;
		setRotation(lFrontTenticle1, 0F, 0.715585F, 0.3490659F);
		lFrontTenticle3 = new ModelRenderer(this, 0, 22);
		lFrontTenticle3.addBox(9.5F, 3.3F, -1.2F, 5, 2, 3);
		lFrontTenticle3.setRotationPoint(6F, 0F, 0F);
		lFrontTenticle3.setTextureSize(128, 64);
		lFrontTenticle3.mirror = true;
		setRotation(lFrontTenticle3, 0F, 0.715585F, 0.7330383F);
		lBackTneticle1 = new ModelRenderer(this, 86, 0);
		lBackTneticle1.addBox(1F, 7F, 0F, 4, 2, 2);
		lBackTneticle1.setRotationPoint(6F, 0F, 6F);
		lBackTneticle1.setTextureSize(128, 64);
		lBackTneticle1.mirror = true;
		setRotation(lBackTneticle1, 0F, -0.5585054F, 0.2792527F);
		tail = new ModelRenderer(this, 0, 49);
		tail.addBox(2F, 7.5F, 2F, 2, 2, 2);
		tail.setRotationPoint(0F, 0F, 9F);
		tail.setTextureSize(128, 64);
		tail.mirror = true;
		setRotation(tail, -0.3665191F, 0F, 0F);
		lFrontTenticle4 = new ModelRenderer(this, 0, 28);
		lFrontTenticle4.addBox(14.5F, -2.5F, -1.1F, 5, 2, 3);
		lFrontTenticle4.setRotationPoint(6F, 0F, 0F);
		lFrontTenticle4.setTextureSize(128, 64);
		lFrontTenticle4.mirror = true;
		setRotation(lFrontTenticle4, 0F, 0.715585F, 1.134464F);
		lFrontTenticle5 = new ModelRenderer(this, 0, 34);
		lFrontTenticle5.addBox(18F, -6F, -0.5F, 5, 1, 2);
		lFrontTenticle5.setRotationPoint(6F, 0F, 0F);
		lFrontTenticle5.setTextureSize(128, 64);
		lFrontTenticle5.mirror = true;
		setRotation(lFrontTenticle5, 0F, 0.715585F, 1.343904F);
		lFrontClaw = new ModelRenderer(this, 0, 38);
		lFrontClaw.addBox(9F, 21.7F, -0.5F, 0, 3, 2);
		lFrontClaw.setRotationPoint(6F, 0F, 0F);
		lFrontClaw.setTextureSize(128, 64);
		lFrontClaw.mirror = true;
		setRotation(lFrontClaw, 0F, 0.715585F, -0.0698132F);
		rFrontTenticle1 = new ModelRenderer(this, 19, 10);
		rFrontTenticle1.addBox(1F, 8F, -4.7F, 2, 2, 2);
		rFrontTenticle1.setRotationPoint(-6F, 0F, 0F);
		rFrontTenticle1.setTextureSize(128, 64);
		rFrontTenticle1.mirror = true;
		setRotation(rFrontTenticle1, 0F, -0.715585F, -0.3490659F);
		rMiddleTenticle1 = new ModelRenderer(this, 65, 0);
		rMiddleTenticle1.addBox(0F, 8F, 1.2F, 5, 2, 2);
		rMiddleTenticle1.setRotationPoint(-6F, 0F, 3F);
		rMiddleTenticle1.setTextureSize(128, 64);
		rMiddleTenticle1.mirror = true;
		setRotation(rMiddleTenticle1, 0F, 0.2094395F, -0.2792527F);
		rBackTenticle1 = new ModelRenderer(this, 105, 0);
		rBackTenticle1.addBox(0F, 8.5F, 3.5F, 4, 2, 2);
		rBackTenticle1.setRotationPoint(-6F, 0F, 6F);
		rBackTenticle1.setTextureSize(128, 64);
		rBackTenticle1.mirror = true;
		setRotation(rBackTenticle1, 0F, 0.5585054F, -0.2792527F);
		rFrontTenticle2 = new ModelRenderer(this, 19, 15);
		rFrontTenticle2.addBox(-3.5F, 8F, -5.5F, 5, 2, 4);
		rFrontTenticle2.setRotationPoint(-6F, 0F, 0F);
		rFrontTenticle2.setTextureSize(128, 64);
		rFrontTenticle2.mirror = true;
		setRotation(rFrontTenticle2, 0F, -0.715585F, -0.3490659F);
		rFrontTenticle3 = new ModelRenderer(this, 19, 22);
		rFrontTenticle3.addBox(-11F, 6.4F, -5F, 5, 2, 3);
		rFrontTenticle3.setRotationPoint(-6F, 0F, 0F);
		rFrontTenticle3.setTextureSize(128, 64);
		rFrontTenticle3.mirror = true;
		setRotation(rFrontTenticle3, 0F, -0.715585F, -0.7330383F);
		rFrontTenticle4 = new ModelRenderer(this, 19, 28);
		rFrontTenticle4.addBox(-17.5F, 1.7F, -5F, 5, 2, 3);
		rFrontTenticle4.setRotationPoint(-6F, 0F, 0F);
		rFrontTenticle4.setTextureSize(128, 64);
		rFrontTenticle4.mirror = true;
		setRotation(rFrontTenticle4, 0F, -0.715585F, -1.134464F);
		rFrontTenticle5 = new ModelRenderer(this, 19, 34);
		rFrontTenticle5.addBox(-22F, -1.5F, -4.5F, 5, 1, 2);
		rFrontTenticle5.setRotationPoint(-6F, 0F, 0F);
		rFrontTenticle5.setTextureSize(128, 64);
		rFrontTenticle5.mirror = true;
		setRotation(rFrontTenticle5, 0F, -0.715585F, -1.343904F);
		rFrontClaw = new ModelRenderer(this, 19, 38);
		rFrontClaw.addBox(-4.5F, 21F, -4.5F, 0, 3, 2);
		rFrontClaw.setRotationPoint(-6F, 0F, 0F);
		rFrontClaw.setTextureSize(128, 64);
		rFrontClaw.mirror = true;
		setRotation(rFrontClaw, 0F, -0.715585F, 0.0698132F);
		tail2 = new ModelRenderer(this, 9, 49);
		tail2.addBox(1F, 7.5F, 3.5F, 4, 2, 5);
		tail2.setRotationPoint(0F, 0F, 9F);
		tail2.setTextureSize(128, 64);
		tail2.mirror = true;
		setRotation(tail2, -0.3665191F, 0F, 0F);
		lMiddleTenticle2 = new ModelRenderer(this, 46, 5);
		lMiddleTenticle2.addBox(6.4F, 5F, -1.5F, 5, 2, 4);
		lMiddleTenticle2.setRotationPoint(6F, 0F, 3F);
		lMiddleTenticle2.setTextureSize(128, 64);
		lMiddleTenticle2.mirror = true;
		setRotation(lMiddleTenticle2, 0F, -0.2094395F, 0.5410521F);
		lBackTenticle2 = new ModelRenderer(this, 86, 5);
		lBackTenticle2.addBox(5F, 6.3F, -0.8F, 5, 2, 4);
		lBackTenticle2.setRotationPoint(6F, 0F, 6F);
		lBackTenticle2.setTextureSize(128, 64);
		lBackTenticle2.mirror = true;
		setRotation(lBackTenticle2, 0F, -0.5585054F, 0.418879F);
		rMiddleTenticle2 = new ModelRenderer(this, 65, 5);
		rMiddleTenticle2.addBox(-6.9F, 7.7F, 0.3F, 5, 2, 4);
		rMiddleTenticle2.setRotationPoint(-6F, 0F, 3F);
		rMiddleTenticle2.setTextureSize(128, 64);
		rMiddleTenticle2.mirror = true;
		setRotation(rMiddleTenticle2, 0F, 0.2094395F, -0.5410521F);
		rBackTenticle2 = new ModelRenderer(this, 105, 5);
		rBackTenticle2.addBox(-5.5F, 8.5F, 2.7F, 5, 2, 4);
		rBackTenticle2.setRotationPoint(-6F, 0F, 6F);
		rBackTenticle2.setTextureSize(128, 64);
		rBackTenticle2.mirror = true;
		setRotation(rBackTenticle2, 0F, 0.5585054F, -0.418879F);
		lMiddleTenticle3 = new ModelRenderer(this, 46, 12);
		lMiddleTenticle3.addBox(12F, 0.5F, -1F, 5, 2, 3);
		lMiddleTenticle3.setRotationPoint(6F, 0F, 3F);
		lMiddleTenticle3.setTextureSize(128, 64);
		lMiddleTenticle3.mirror = true;
		setRotation(lMiddleTenticle3, 0F, -0.2094395F, 0.9250245F);
		lMiddleTenticle4 = new ModelRenderer(this, 46, 18);
		lMiddleTenticle4.addBox(16F, -4.3F, -1F, 5, 2, 3);
		lMiddleTenticle4.setRotationPoint(6F, 0F, 3F);
		lMiddleTenticle4.setTextureSize(128, 64);
		lMiddleTenticle4.mirror = true;
		setRotation(lMiddleTenticle4, 0F, -0.2094395F, 1.22173F);
		lMiddleTenticle5 = new ModelRenderer(this, 46, 24);
		lMiddleTenticle5.addBox(19F, -8F, -0.5F, 5, 1, 2);
		lMiddleTenticle5.setRotationPoint(6F, 0F, 3F);
		lMiddleTenticle5.setTextureSize(128, 64);
		lMiddleTenticle5.mirror = true;
		setRotation(lMiddleTenticle5, 0F, -0.2094395F, 1.43117F);
		lMiddleClaw = new ModelRenderer(this, 46, 28);
		lMiddleClaw.addBox(9.1F, 21.7F, 0.5F, 0, 3, 2);
		lMiddleClaw.setRotationPoint(6F, 0F, 3F);
		lMiddleClaw.setTextureSize(128, 64);
		lMiddleClaw.mirror = true;
		setRotation(lMiddleClaw, 0F, -0.122173F, -0.0698132F);
		rMiddleTenticle3 = new ModelRenderer(this, 65, 12);
		rMiddleTenticle3.addBox(-14F, 4.7F, 0.7F, 5, 2, 3);
		rMiddleTenticle3.setRotationPoint(-6F, 0F, 3F);
		rMiddleTenticle3.setTextureSize(128, 64);
		rMiddleTenticle3.mirror = true;
		setRotation(rMiddleTenticle3, 0F, 0.2094395F, -0.9250245F);
		rMiddleTenticle4 = new ModelRenderer(this, 65, 18);
		rMiddleTenticle4.addBox(-19.7F, 0.5F, 0.7F, 5, 2, 3);
		rMiddleTenticle4.setRotationPoint(-6F, 0F, 3F);
		rMiddleTenticle4.setTextureSize(128, 64);
		rMiddleTenticle4.mirror = true;
		setRotation(rMiddleTenticle4, 0F, 0.2094395F, -1.22173F);
		rFrontTenticle6 = new ModelRenderer(this, 65, 24);
		rFrontTenticle6.addBox(-24F, -3F, 1.2F, 5, 1, 2);
		rFrontTenticle6.setRotationPoint(-6F, 0F, 3F);
		rFrontTenticle6.setTextureSize(128, 64);
		rFrontTenticle6.mirror = true;
		setRotation(rFrontTenticle6, 0F, 0.2094395F, -1.43117F);
		rMiddleClaw = new ModelRenderer(this, 65, 28);
		rMiddleClaw.addBox(-4F, 22F, 1.7F, 0, 3, 2);
		rMiddleClaw.setRotationPoint(-6F, 0F, 3F);
		rMiddleClaw.setTextureSize(128, 64);
		rMiddleClaw.mirror = true;
		setRotation(rMiddleClaw, 0F, 0.122173F, 0.0698132F);
		lBackTenticle3 = new ModelRenderer(this, 86, 12);
		lBackTenticle3.addBox(11.4F, 0.8F, -0.5F, 5, 2, 3);
		lBackTenticle3.setRotationPoint(6F, 0F, 6F);
		lBackTenticle3.setTextureSize(128, 64);
		lBackTenticle3.mirror = true;
		setRotation(lBackTenticle3, 0F, -0.5585054F, 0.9250245F);
		lBackTenticle4 = new ModelRenderer(this, 86, 18);
		lBackTenticle4.addBox(15.7F, -4F, -0.5F, 5, 2, 3);
		lBackTenticle4.setRotationPoint(6F, 0F, 6F);
		lBackTenticle4.setTextureSize(128, 64);
		lBackTenticle4.mirror = true;
		setRotation(lBackTenticle4, 0F, -0.5585054F, 1.22173F);
		lBackTenticle5 = new ModelRenderer(this, 86, 24);
		lBackTenticle5.addBox(19F, -8F, 0F, 5, 1, 2);
		lBackTenticle5.setRotationPoint(6F, 0F, 6F);
		lBackTenticle5.setTextureSize(128, 64);
		lBackTenticle5.mirror = true;
		setRotation(lBackTenticle5, 0F, -0.5585054F, 1.43117F);
		lBackClaw = new ModelRenderer(this, 86, 28);
		lBackClaw.addBox(9.2F, 21.7F, 1F, 0, 3, 2);
		lBackClaw.setRotationPoint(6F, 0F, 6F);
		lBackClaw.setTextureSize(128, 64);
		lBackClaw.mirror = true;
		setRotation(lBackClaw, 0F, -0.4712389F, -0.0698132F);
		rBackTenticle3 = new ModelRenderer(this, 105, 12);
		rBackTenticle3.addBox(-14F, 5F, 3F, 5, 2, 3);
		rBackTenticle3.setRotationPoint(-6F, 0F, 6F);
		rBackTenticle3.setTextureSize(128, 64);
		rBackTenticle3.mirror = true;
		setRotation(rBackTenticle3, 0F, 0.5585054F, -0.9250245F);
		rBackTenticle4 = new ModelRenderer(this, 105, 18);
		rBackTenticle4.addBox(-19.7F, 0.8F, 3F, 5, 2, 3);
		rBackTenticle4.setRotationPoint(-6F, 0F, 6F);
		rBackTenticle4.setTextureSize(128, 64);
		rBackTenticle4.mirror = true;
		setRotation(rBackTenticle4, 0F, 0.5585054F, -1.22173F);
		rBackTenticle5 = new ModelRenderer(this, 105, 24);
		rBackTenticle5.addBox(-24F, -2.9F, 3.5F, 5, 1, 2);
		rBackTenticle5.setRotationPoint(-6F, 0F, 6F);
		rBackTenticle5.setTextureSize(128, 64);
		rBackTenticle5.mirror = true;
		setRotation(rBackTenticle5, 0F, 0.5585054F, -1.43117F);
		rBackClaw = new ModelRenderer(this, 105, 28);
		rBackClaw.addBox(-4F, 21.7F, 4F, 0, 3, 2);
		rBackClaw.setRotationPoint(-6F, 0F, 6F);
		rBackClaw.setTextureSize(128, 64);
		rBackClaw.mirror = true;
		setRotation(rBackClaw, 0F, 0.4712389F, 0.0698132F);
		tail3 = new ModelRenderer(this, 28, 49);
		tail3.addBox(1.5F, 4F, 10F, 3, 2, 5);
		tail3.setRotationPoint(0F, 0F, 9F);
		tail3.setTextureSize(128, 64);
		tail3.mirror = true;
		setRotation(tail3, -0.7504916F, 0F, 0F);
		tail4 = new ModelRenderer(this, 45, 49);
		tail4.addBox(1.5F, -2F, 15F, 3, 2, 5);
		tail4.setRotationPoint(0F, 0F, 9F);
		tail4.setTextureSize(128, 64);
		tail4.mirror = true;
		setRotation(tail4, -1.151917F, 0F, 0F);
		tail5 = new ModelRenderer(this, 62, 49);
		tail5.addBox(2F, 18F, 7F, 2, 5, 1);
		tail5.setRotationPoint(0F, 0F, 9F);
		tail5.setTextureSize(128, 64);
		tail5.mirror = true;
		setRotation(tail5, 0.0872665F, 0F, 0F);
		tailClaw = new ModelRenderer(this, 69, 49);
		tailClaw.addBox(2F, 21F, 9.5F, 2, 3, 0);
		tailClaw.setRotationPoint(0F, 0F, 9F);
		tailClaw.setTextureSize(128, 64);
		tailClaw.mirror = true;
		setRotation(tailClaw, 0F, 0F, 0F);
		lJaw = new ModelRenderer(this, 30, 43);
		lJaw.addBox(-0.2F, 9F, 1.5F, 1, 1, 2);
		lJaw.setRotationPoint(0F, 0F, 0F);
		lJaw.setTextureSize(128, 64);
		lJaw.mirror = true;
		setRotation(lJaw, 0F, -0.0872665F, -0.3839724F);
		rJaw = new ModelRenderer(this, 37, 43);
		rJaw.addBox(4.8F, 6.7F, 2F, 1, 1, 2);
		rJaw.setRotationPoint(0F, 0F, 0F);
		rJaw.setTextureSize(128, 64);
		rJaw.mirror = true;
		setRotation(rJaw, 0F, 0.0872665F, 0.3839724F);
		rFrontPetal1 = new ModelRenderer(this, 97, 37);
		rFrontPetal1.addBox(7.2F, 4.9F, 3F, 4, 1, 2);
		rFrontPetal1.setRotationPoint(0F, 0F, 0F);
		rFrontPetal1.setTextureSize(128, 64);
		rFrontPetal1.mirror = true;
		setRotation(rFrontPetal1, 0F, 0.715585F, 0.6457718F);
		rFrontPetal2 = new ModelRenderer(this, 81, 37);
		rFrontPetal2.addBox(-7.5F, 7.6F, -0.8F, 4, 1, 2);
		rFrontPetal2.setRotationPoint(0F, 0F, 0F);
		rFrontPetal2.setTextureSize(128, 64);
		rFrontPetal2.mirror = true;
		setRotation(rFrontPetal2, 0F, -0.715585F, -0.6457718F);
		lMiddlePetal = new ModelRenderer(this, 97, 41);
		lMiddlePetal.addBox(9.8F, 2.3F, 2F, 3, 1, 2);
		lMiddlePetal.setRotationPoint(0F, 0F, 0F);
		lMiddlePetal.setTextureSize(128, 64);
		lMiddlePetal.mirror = true;
		setRotation(lMiddlePetal, 0F, -0.0698132F, 0.7330383F);
		lBackPetal = new ModelRenderer(this, 97, 45);
		lBackPetal.addBox(11F, 1.3F, 0F, 3, 1, 2);
		lBackPetal.setRotationPoint(0F, 0F, 0F);
		lBackPetal.setTextureSize(128, 64);
		lBackPetal.mirror = true;
		setRotation(lBackPetal, 0F, -0.7853982F, 0.7330383F);
		tailPetal = new ModelRenderer(this, 89, 50);
		tailPetal.addBox(2F, -2F, 11.7F, 2, 1, 2);
		tailPetal.setRotationPoint(0F, 0F, 0F);
		tailPetal.setTextureSize(128, 64);
		tailPetal.mirror = true;
		setRotation(tailPetal, -1.012291F, 0F, 0F);
		rMiddlePetal = new ModelRenderer(this, 81, 41);
		rMiddlePetal.addBox(-8.5F, 6.1F, 3F, 3, 1, 2);
		rMiddlePetal.setRotationPoint(0F, 0F, 0F);
		rMiddlePetal.setTextureSize(128, 64);
		rMiddlePetal.mirror = true;
		setRotation(rMiddlePetal, 0F, 0.0698132F, -0.7330383F);
		rBackPetal = new ModelRenderer(this, 81, 45);
		rBackPetal.addBox(-11.2F, 3.7F, 4.3F, 3, 1, 2);
		rBackPetal.setRotationPoint(0F, 0F, 0F);
		rBackPetal.setTextureSize(128, 64);
		rBackPetal.mirror = true;
		setRotation(rBackPetal, 0F, 0.7853982F, -0.7330383F);
		ovipositor = new ModelRenderer(this, 55, 34);
		ovipositor.addBox(2.5F, 9F, 2F, 1, 9, 1);
		ovipositor.setRotationPoint(0F, 0F, 0F);
		ovipositor.setTextureSize(128, 64);
		ovipositor.mirror = true;
		setRotation(ovipositor, 0F, 0F, 0F);
		lFrontGrossTenticle = new ModelRenderer(this, 110, 42);
		lFrontGrossTenticle.addBox(2F, 8.7F, 3F, 1, 7, 1);
		lFrontGrossTenticle.setRotationPoint(0F, 0F, 0F);
		lFrontGrossTenticle.setTextureSize(128, 64);
		lFrontGrossTenticle.mirror = true;
		setRotation(lFrontGrossTenticle, -0.2443461F, 0F, -0.1745329F);
		rFrontGrossTenticle = new ModelRenderer(this, 110, 42);
		rFrontGrossTenticle.addBox(3F, 8F, 3F, 1, 7, 1);
		rFrontGrossTenticle.setRotationPoint(0F, 0F, 0F);
		rFrontGrossTenticle.setTextureSize(128, 64);
		rFrontGrossTenticle.mirror = true;
		setRotation(rFrontGrossTenticle, -0.2443461F, 0F, 0.1745329F);
		lMiddleGrossTenticle = new ModelRenderer(this, 110, 42);
		lMiddleGrossTenticle.addBox(3F, 9F, 3F, 1, 7, 1);
		lMiddleGrossTenticle.setRotationPoint(0F, 0F, 0F);
		lMiddleGrossTenticle.setTextureSize(128, 64);
		lMiddleGrossTenticle.mirror = true;
		setRotation(lMiddleGrossTenticle, 0F, 0F, -0.1745329F);
		lBackGrossTenticle1 = new ModelRenderer(this, 110, 42);
		lBackGrossTenticle1.addBox(1.5F, 10F, 2.5F, 1, 7, 1);
		lBackGrossTenticle1.setRotationPoint(0F, 0F, 0F);
		lBackGrossTenticle1.setTextureSize(128, 64);
		lBackGrossTenticle1.mirror = true;
		setRotation(lBackGrossTenticle1, 0.2443461F, 0F, -0.1745329F);
		rMiddleGrossTenticle = new ModelRenderer(this, 110, 42);
		rMiddleGrossTenticle.addBox(2F, 8F, 3.5F, 1, 7, 1);
		rMiddleGrossTenticle.setRotationPoint(0F, 0F, 0F);
		rMiddleGrossTenticle.setTextureSize(128, 64);
		rMiddleGrossTenticle.mirror = true;
		setRotation(rMiddleGrossTenticle, 0F, 0F, 0.1745329F);
		lBackGrossTenticle2 = new ModelRenderer(this, 110, 42);
		lBackGrossTenticle2.addBox(2.2F, 9F, 3F, 1, 7, 1);
		lBackGrossTenticle2.setRotationPoint(0F, 0F, 0F);
		lBackGrossTenticle2.setTextureSize(128, 64);
		lBackGrossTenticle2.mirror = true;
		setRotation(lBackGrossTenticle2, 0.2443461F, 0F, 0.1745329F);
		tailGrossTenticle = new ModelRenderer(this, 110, 42);
		tailGrossTenticle.addBox(2.5F, 10F, 4F, 1, 7, 1);
		tailGrossTenticle.setRotationPoint(0F, 0F, 0F);
		tailGrossTenticle.setTextureSize(128, 64);
		tailGrossTenticle.mirror = true;
		setRotation(tailGrossTenticle, 0.2443461F, 0F, 0F);
	}
	
	@Override
	public void render(Entity entity, float swingProgress, float swingProgressPrev, float idleProgress, float headYaw, float headPitch, float boxTranslation)
	{
		super.render(entity, swingProgress, swingProgressPrev, idleProgress, headYaw, headPitch, boxTranslation);
		
		body.render(boxTranslation);
		lFrontTenticle2.render(boxTranslation);
		lMiddleTenticle1.render(boxTranslation);
		shape3.render(boxTranslation);
		lFrontTenticle1.render(boxTranslation);
		lFrontTenticle3.render(boxTranslation);
		lBackTneticle1.render(boxTranslation);
		tail.render(boxTranslation);
		lFrontTenticle4.render(boxTranslation);
		lFrontTenticle5.render(boxTranslation);
		lFrontClaw.render(boxTranslation);
		rFrontTenticle1.render(boxTranslation);
		rMiddleTenticle1.render(boxTranslation);
		rBackTenticle1.render(boxTranslation);
		rFrontTenticle2.render(boxTranslation);
		rFrontTenticle3.render(boxTranslation);
		rFrontTenticle4.render(boxTranslation);
		rFrontTenticle5.render(boxTranslation);
		rFrontClaw.render(boxTranslation);
		tail2.render(boxTranslation);
		lMiddleTenticle2.render(boxTranslation);
		lBackTenticle2.render(boxTranslation);
		rMiddleTenticle2.render(boxTranslation);
		rBackTenticle2.render(boxTranslation);
		lMiddleTenticle3.render(boxTranslation);
		lMiddleTenticle4.render(boxTranslation);
		lMiddleTenticle5.render(boxTranslation);
		lMiddleClaw.render(boxTranslation);
		rMiddleTenticle3.render(boxTranslation);
		rMiddleTenticle4.render(boxTranslation);
		rFrontTenticle6.render(boxTranslation);
		rMiddleClaw.render(boxTranslation);
		lBackTenticle3.render(boxTranslation);
		lBackTenticle4.render(boxTranslation);
		lBackTenticle5.render(boxTranslation);
		lBackClaw.render(boxTranslation);
		rBackTenticle3.render(boxTranslation);
		rBackTenticle4.render(boxTranslation);
		rBackTenticle5.render(boxTranslation);
		rBackClaw.render(boxTranslation);
		tail3.render(boxTranslation);
		tail4.render(boxTranslation);
		tail5.render(boxTranslation);
		tailClaw.render(boxTranslation);
		lJaw.render(boxTranslation);
		rJaw.render(boxTranslation);
		rFrontPetal1.render(boxTranslation);
		rFrontPetal2.render(boxTranslation);
		lMiddlePetal.render(boxTranslation);
		lBackPetal.render(boxTranslation);
		tailPetal.render(boxTranslation);
		rMiddlePetal.render(boxTranslation);
		rBackPetal.render(boxTranslation);
		ovipositor.render(boxTranslation);
		lFrontGrossTenticle.render(boxTranslation);
		rFrontGrossTenticle.render(boxTranslation);
		lMiddleGrossTenticle.render(boxTranslation);
		lBackGrossTenticle1.render(boxTranslation);
		rMiddleGrossTenticle.render(boxTranslation);
		lBackGrossTenticle2.render(boxTranslation);
		tailGrossTenticle.render(boxTranslation);
	}
}