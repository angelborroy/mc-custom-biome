package org.montamakers.mods;

import org.montamakers.biomes.Biomes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;

/**
 * Add Custom Biome to world generation.
 */
public class BiomeMod implements ModInitializer
{

	@Override
	public void onInitialize() {
		
        // Adding Biome with 8x chance to be generated
        OverworldBiomes.addContinentalBiome(Biomes.CUSTOM_BIOME, OverworldClimate.DRY, 8D);
		OverworldBiomes.addContinentalBiome(Biomes.CUSTOM_BIOME, OverworldClimate.TEMPERATE, 8D);
        OverworldBiomes.addContinentalBiome(Biomes.CUSTOM_BIOME, OverworldClimate.COOL, 8D);
        OverworldBiomes.addContinentalBiome(Biomes.CUSTOM_BIOME, OverworldClimate.SNOWY, 8D);
        
        // Add Biome as spawning biome
        FabricBiomes.addSpawnBiome(Biomes.CUSTOM_BIOME);
	
	}

}
