package org.montamakers.biomes;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Settings;

/**
 * Biomes constant values and registration
 */
public class Biomes 
{
	public static final Biome CUSTOM_BIOME = Registry.register(Registry.BIOME,
			new Identifier("montamakers", "custom_biome"), new CustomBiome(new Settings()));
}
