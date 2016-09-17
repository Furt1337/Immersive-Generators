package me.furt.immersivegenerators.multistructure;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import blusunrize.immersiveengineering.api.MultiblockHandler.IMultiblock;
import blusunrize.immersiveengineering.api.crafting.IngredientStack;

public class StructureGenerator implements IMultiblock {

	@Override
	public boolean canRenderFormedStructure() {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IngredientStack[] getTotalMaterials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBlockTrigger(IBlockState arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean overwriteBlockRender(ItemStack arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void renderFormedStructure() {
		// TODO Auto-generated method stub
		
	}

}
