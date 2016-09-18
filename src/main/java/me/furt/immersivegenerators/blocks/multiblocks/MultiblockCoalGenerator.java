package me.furt.immersivegenerators.blocks.multiblocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import blusunrize.immersiveengineering.api.MultiblockHandler.IMultiblock;
import blusunrize.immersiveengineering.api.crafting.IngredientStack;
import blusunrize.immersiveengineering.client.ClientUtils;
import blusunrize.immersiveengineering.common.IEContent;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDecoration0;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalMultiblock;

public class MultiblockCoalGenerator implements IMultiblock {
	private static int height = 6,length = 7,width = 4;

	public static MultiblockCoalGenerator instance = new MultiblockCoalGenerator();
	static ItemStack[][][] structure = new ItemStack[height][length][width];
	static{
		for(int h=0;h<height;h++)
			for(int l=0;l<length;l++)
				for(int w=0;w<width;w++)
				{
						
				}
	}
	
	@Override
	public boolean canRenderFormedStructure() {
		return true;
	}

	@Override
	public boolean createStructure(World arg0, BlockPos arg1, EnumFacing arg2,
			EntityPlayer arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getManualScale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack[][][] getStructureManual() {
		return structure;
	}

	static final IngredientStack[] materials = new IngredientStack[]{
		new IngredientStack("scaffoldingSteel", 24),
		new IngredientStack(new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RS_ENGINEERING.getMeta())),
		new IngredientStack(new ItemStack(IEContent.blockMetalDecoration0, 8, BlockTypes_MetalDecoration0.GENERATOR.getMeta())),
		new IngredientStack(new ItemStack(IEContent.blockMetalDecoration0, 23, BlockTypes_MetalDecoration0.LIGHT_ENGINEERING.getMeta())),
		new IngredientStack(new ItemStack(IEContent.blockMetalDecoration0, 5, BlockTypes_MetalDecoration0.RADIATOR.getMeta()))};
	
	@Override
	public IngredientStack[] getTotalMaterials() {
		return materials;
	}

	@Override
	public String getUniqueName() {
		return "IG:CoalGenerator";
	}

	@Override
	public boolean isBlockTrigger(IBlockState arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean overwriteBlockRender(ItemStack arg0, int arg1) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	static ItemStack renderStack;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void renderFormedStructure() {
		if(renderStack==null)
			 renderStack = new ItemStack(IEContent.blockMetalMultiblock,1,1);
		GlStateManager.scale(-5.5, 5.5, 5.5);
		GlStateManager.translate(0, .09375, 0);
		GlStateManager.rotate(225, 0, 1, 0);
		GlStateManager.rotate(-20, 1, 0, 0);

		GlStateManager.disableCull();
		ClientUtils.mc().getRenderItem().renderItem(renderStack, ItemCameraTransforms.TransformType.GUI);
		GlStateManager.enableCull();
	}

}
