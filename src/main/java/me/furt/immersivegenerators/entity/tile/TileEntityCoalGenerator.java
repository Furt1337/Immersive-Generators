package me.furt.immersivegenerators.entity.tile;

import java.util.ArrayList;
import java.util.List;

import me.furt.immersivegenerators.recipe.RecipeCoalGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import blusunrize.immersiveengineering.api.MultiblockHandler.IMultiblock;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IAdvancedCollisionBounds;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IAdvancedSelectionBounds;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.ISoundTile;
import blusunrize.immersiveengineering.common.blocks.metal.TileEntityMultiblockMetal;

public class TileEntityCoalGenerator extends TileEntityMultiblockMetal<TileEntityCoalGenerator,RecipeCoalGenerator> implements ISoundTile, IAdvancedSelectionBounds,IAdvancedCollisionBounds{

	public TileEntityCoalGenerator(IMultiblock mutliblockInstance,
			int[] structureDimensions, int energyCapacity,
			boolean redstoneControl) {
		super(mutliblockInstance, structureDimensions, energyCapacity, redstoneControl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float[] getBlockBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AxisAlignedBB> getAdvancedColisionBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AxisAlignedBB> getAdvancedSelectionBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOverrideBox(AxisAlignedBB arg0, EntityPlayer arg1,
			RayTraceResult arg2, ArrayList<AxisAlignedBB> arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shoudlPlaySound(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doGraphicalUpdates(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemStack[] getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSlotLimit(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isStackValid(int arg0, ItemStack arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean additionalCanProcessCheck(
			blusunrize.immersiveengineering.common.blocks.metal.TileEntityMultiblockMetal.MultiblockProcess<RecipeCoalGenerator> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doProcessFluidOutput(FluidStack arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doProcessOutput(ItemStack arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RecipeCoalGenerator findRecipeForInsertion(ItemStack arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getEnergyPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FluidTank[] getInternalTanks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxProcessPerTick() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMinProcessDistance(
			blusunrize.immersiveengineering.common.blocks.metal.TileEntityMultiblockMetal.MultiblockProcess<RecipeCoalGenerator> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getOutputSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getOutputTanks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getProcessQueueMaxLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getRedstonePos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInWorldProcessingMachine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onProcessFinish(
			blusunrize.immersiveengineering.common.blocks.metal.TileEntityMultiblockMetal.MultiblockProcess<RecipeCoalGenerator> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected RecipeCoalGenerator readRecipeFromNBT(NBTTagCompound arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean canDrainTankFrom(int arg0, EnumFacing arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean canFillTankFrom(int arg0, EnumFacing arg1, FluidStack arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected FluidTank[] getAccessibleFluidTanks(EnumFacing arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
