package com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.Slots;

import com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace.TileEntityColoriteFurnace;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import scala.sys.process.ProcessBuilderImpl.IStreamBuilder;

public class SlotColoriteFurnaceFuel extends Slot
{
	public SlotColoriteFurnaceFuel(IInventory inventoryIn, int slotIndex, int xPosition, int yPosition) 
	{
		super(inventoryIn, slotIndex, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		return TileEntityColoriteFurnace.isItemFuel(stack) || isBucket(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return isBucket(stack) ? 1 : super.getItemStackLimit(stack);
	}
	
	public static boolean isBucket(ItemStack stack)
	{
		return stack.getItem() == Items.BUCKET;
	}
}