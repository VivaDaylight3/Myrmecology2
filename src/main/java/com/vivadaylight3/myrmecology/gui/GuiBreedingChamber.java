package com.vivadaylight3.myrmecology.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.vivadaylight3.myrmecology.container.ContainerBreedingChamber;
import com.vivadaylight3.myrmecology.reference.Names;
import com.vivadaylight3.myrmecology.reference.Resources;
import com.vivadaylight3.myrmecology.tileentity.TileEntityBreedingChamber;

public class GuiBreedingChamber extends GuiContainer {

    public static final ResourceLocation texture = Resources
	    .getGuiResource(Names.BREEDINGCHAMBER);
    TileEntityBreedingChamber tile;
    int type = 0;

    public GuiBreedingChamber(final InventoryPlayer inventory,
	    final TileEntityBreedingChamber tileEntity) {
	super(new ContainerBreedingChamber(inventory, tileEntity));
	tile = tileEntity;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(final float p_146976_1_,
	    final int p_146976_2_, final int p_146976_3_) {
	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	mc.getTextureManager().bindTexture(texture);
	final int k = (width - xSize) / 2;
	final int l = (height - ySize) / 2;
	drawTexturedModalRect(k, l, 0, 0, xSize, ySize);

	final float time = TileEntityBreedingChamber.progress;
	if (time > 0) {
	    final int progress = tile.getProgressScaled(13);
	    drawTexturedModalRect(k + 29, l + 36, 176, 0, progress + 1, 16);
	}

    }

    @Override
    protected void drawGuiContainerForegroundLayer(final int p_146979_1_,
	    final int p_146979_2_) {
	final String s = tile.getInventoryName();
	fontRendererObj.drawString(s,
		xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
	fontRendererObj.drawString(
		I18n.format("container.inventory", new Object[0]), 8,
		ySize - 96 + 2, 4210752);
    }

}
