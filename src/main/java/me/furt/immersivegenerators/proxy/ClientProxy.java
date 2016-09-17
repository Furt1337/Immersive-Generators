package me.furt.immersivegenerators.proxy;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import me.furt.immersivegenerators.blocks.multiblocks.MultiblockCoalGenerator;
import me.furt.immersivegenerators.client.render.TileRenderCoalGenerator;
import me.furt.immersivegenerators.entity.tile.TileEntityCoalGenerator;
import blusunrize.immersiveengineering.api.ManualHelper;
import blusunrize.immersiveengineering.api.ManualPageMultiblock;
import blusunrize.lib.manual.ManualPages;

public class ClientProxy implements IProxy {

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoalGenerator.class, new TileRenderCoalGenerator());
		
	}

	@Override
	public void postInit() {
		
		ManualHelper.addEntry("coalgen", ManualHelper.CAT_ENERGY,
				new ManualPages.Text(ManualHelper.getManual(), "coalgen0"),
				new ManualPageMultiblock(ManualHelper.getManual(), "coalgen1", MultiblockCoalGenerator.instance),
				new ManualPages.Text(ManualHelper.getManual(), "coalgen2")
		);
		
	}

}
