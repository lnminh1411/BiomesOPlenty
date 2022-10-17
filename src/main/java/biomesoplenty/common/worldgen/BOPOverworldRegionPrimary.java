/*******************************************************************************
 * Copyright 2022, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package biomesoplenty.common.worldgen;

import biomesoplenty.common.biome.BOPOverworldBiomeBuilder;
import biomesoplenty.core.BiomesOPlenty;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class BOPOverworldRegionPrimary extends Region
{
    public static final ResourceLocation LOCATION = new ResourceLocation(BiomesOPlenty.MOD_ID, "overworld_primary");

    public BOPOverworldRegionPrimary(int weight)
    {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        (new BOPOverworldBiomeBuilder()).addBiomes(registry, mapper);
    }
}