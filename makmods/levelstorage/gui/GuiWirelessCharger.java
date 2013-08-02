package makmods.levelstorage.gui;

import org.lwjgl.opengl.GL11;

import makmods.levelstorage.proxy.ClientProxy;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;

public class GuiWirelessCharger extends GuiContainer {

	public GuiWirelessCharger(EntityPlayer ep) {
		super(new ContainerWirelessCharger(ep));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.func_110434_K().func_110577_a(ClientProxy.GUI_NO_SLOTS);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
	}

}
