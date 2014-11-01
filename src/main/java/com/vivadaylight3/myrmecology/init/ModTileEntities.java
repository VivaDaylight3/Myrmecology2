package com.vivadaylight3.myrmecology.init;

import com.vivadaylight3.myrmecology.reference.Names;
import com.vivadaylight3.myrmecology.tileentity.TileEntityIncubator;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {

    public static void init() {
	GameRegistry.registerTileEntity(TileEntityIncubator.class,
		Names.INCUBATOR);
    }

}
