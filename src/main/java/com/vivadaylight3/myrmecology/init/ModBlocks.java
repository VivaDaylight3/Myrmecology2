package com.vivadaylight3.myrmecology.init;

import com.vivadaylight3.myrmecology.ant.Ants;
import com.vivadaylight3.myrmecology.block.BlockAntHill;
import com.vivadaylight3.myrmecology.block.BlockBreedingChamber;
import com.vivadaylight3.myrmecology.block.BlockFormicarium;
import com.vivadaylight3.myrmecology.block.BlockFormicariumDirt;
import com.vivadaylight3.myrmecology.block.BlockIncubator;
import com.vivadaylight3.myrmecology.block.BlockMyrmecology;
import com.vivadaylight3.myrmecology.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static BlockMyrmecology breedingChamber, formicariumDirt,
	    incubator, formicarium;
    public static BlockAntHill hillForest, hillDesert;

    public static void init() {
	breedingChamber = new BlockBreedingChamber();
	formicariumDirt = new BlockFormicariumDirt();
	incubator = new BlockIncubator();
	formicarium = new BlockFormicarium();

	hillForest = new BlockAntHill(Ants.forest);
	hillDesert = (BlockAntHill) new BlockAntHill(Ants.desert)
		.clearTextureSuffixes();

	addBlock(breedingChamber);
	addBlock(formicariumDirt);
	addBlock(incubator);
	addBlock(formicarium);
	addBlock(hillForest);
	addBlock(hillDesert);
    }

    private static void addBlock(final BlockMyrmecology block) {
	GameRegistry.registerBlock(block, block.name);
    }

}
