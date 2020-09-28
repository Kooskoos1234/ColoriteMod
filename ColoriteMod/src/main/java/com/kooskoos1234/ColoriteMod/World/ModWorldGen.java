package com.kooskoos1234.ColoriteMod.World;

import java.util.Random;

import com.kooskoos1234.ColoriteMod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider)
	{
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 25.0F);
		generateOre(ModBlocks.AMBER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 22.0F);
		generateOre(ModBlocks.TOPAZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 19.0F);
		generateOre(ModBlocks.MALACHITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 17.0F);
		generateOre(ModBlocks.KYANITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 15.0F);
		generateOre(ModBlocks.AQUAMARINE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 13.0F);
		generateOre(ModBlocks.SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 12.0F);
		generateOre(ModBlocks.AMETHYST_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 10.0F);
		generateOre(ModBlocks.COLORITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 16, random.nextInt(1) + 4, 0.01F);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, float chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
