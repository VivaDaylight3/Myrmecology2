package com.vivadaylight3.myrmecology.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.vivadaylight3.myrmecology.Myrmecology;
import com.vivadaylight3.myrmecology.reference.Reference;
import com.vivadaylight3.myrmecology.tileentity.TileEntityIncubator;

public class BlockIncubator extends BlockMyrmecology {

    public BlockIncubator() {
	super(Material.iron);
	sidedTextures = true;
	suffixLeft = "_Side";
	suffixRight = "_Side";
	suffixBack = "_Side";
	hasTileEntity = true;
	setHardness(3.5f);
	this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public TileEntity createNewTileEntity(final World p_149915_1_,
	    final int p_149915_2_) {
	// TODO Auto-generated method stub
	return createTileEntity(p_149915_1_, p_149915_2_);
    }

    @Override
    public TileEntity createTileEntity(final World world, final int metadata) {
	// TODO Auto-generated method stub
	return new TileEntityIncubator();
    }

    @Override
    public boolean onBlockActivated(final World world, final int x,
	    final int y, final int z, final EntityPlayer player,
	    final int par6, final float par7, final float par8, final float par9) {
	if (!world.isRemote && !player.isSneaking()) {
	    player.openGui(Myrmecology.instance, Reference.GUI_ID_INCUBATOR,
		    world, x, y, z);
	    return true;
	}
	return false;
    }

}
