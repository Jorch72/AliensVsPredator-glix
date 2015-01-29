package com.arisux.avp.world;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.arisux.airi.lib.WorldUtil;
import com.arisux.airi.lib.WorldUtil.Blocks.CoordData;
import com.arisux.avp.AliensVsPredator;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random seed, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		this.generateSurface(world, seed, chunkX * 16, chunkZ * 16);
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		CoordData chunkCoords = new CoordData(chunkX, 0, chunkZ);

		for (int x = 0; x <= 1; x++)
		{
			CoordData genCoords = new CoordData(chunkCoords.posX + rand.nextInt(16), 0 + rand.nextInt(128), chunkCoords.posZ + rand.nextInt(16), world);

			if (genCoords.getBlock() == Blocks.grass)
			{
				AliensVsPredator.schematics().schematicTest.generate(world, genCoords);
			}
		}
		
		for (int x = 0; x <= 1; x++)
		{
			CoordData genCoords = new CoordData(chunkCoords.posX + rand.nextInt(16), 0 + rand.nextInt(128), chunkCoords.posZ + rand.nextInt(16), world);

			if (genCoords.getBlock() == Blocks.grass)
			{
//				AliensVsPredator.schematics().derelict.generate(world, genCoords);
			}
		}

		WorldUtil.generateBlockInChunk(world, AliensVsPredator.instance().blocks.oreCopper, rand, 3, 4, 16, 48, chunkCoords);
		WorldUtil.generateBlockInChunk(world, AliensVsPredator.instance().blocks.oreSilicon, rand, 2, 3, 0, 32, chunkCoords);
		WorldUtil.generateBlockInChunk(world, AliensVsPredator.instance().blocks.oreLithium, rand, 3, 1, 0, 16, chunkCoords, new BiomeGenBase[] { BiomeGenBase.ocean });
		WorldUtil.generateBlockInChunk(world, AliensVsPredator.instance().blocks.oreBauxite, rand, 4, 8, 16, 64, chunkCoords);
	}
}
