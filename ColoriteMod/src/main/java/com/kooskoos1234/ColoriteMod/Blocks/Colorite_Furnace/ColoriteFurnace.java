package com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace;

import com.kooskoos1234.ColoriteMod.Main;
import com.kooskoos1234.ColoriteMod.init.ModBlocks;
import com.kooskoos1234.ColoriteMod.init.ModItems;
import com.kooskoos1234.ColoriteMod.util.IHasModel;
import com.kooskoos1234.ColoriteMod.util.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ColoriteFurnace extends BlockContainer implements IHasModel
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	private final boolean isBurning;
	private static boolean keepInventory;
	
	public ColoriteFurnace(String name, boolean isBurning) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(25.0F);
		setHarvestLevel("pickaxe", 3);
		setResistance(100);
		setCreativeTab(Main.MODDEDRESOURCESTAB);
		setSoundType(SoundType.STONE);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.isBurning = isBurning;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityColoriteFurnace)
            {
                playerIn.openGui(Main.instance, Reference.GUI_COLORITE_FURNACE, worldIn, pos.getX(), pos.getY(), pos.getZ());
                playerIn.addStat(StatList.FURNACE_INTERACTION);
            }

            return true;
        }
    }
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
	{
		this.setDefaultFacing(worldIn, pos, state);
	}
	
	private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            IBlockState iblockstate = worldIn.getBlockState(pos.north());
            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }

            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
    }
	
		public static void setState(boolean active, World worldIn, BlockPos pos)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        keepInventory = true;

        if (active)
        {
            worldIn.setBlockState(pos, ModBlocks.COLORITE_FURNACE_ON.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, ModBlocks.COLORITE_FURNACE_ON.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }
        else
        {
            worldIn.setBlockState(pos, ModBlocks.COLORITE_FURNACE_OFF.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, ModBlocks.COLORITE_FURNACE_OFF.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }

        keepInventory = false;

        if (tileentity != null)
        {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }
		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) 
		{
			return new TileEntityColoriteFurnace();
		}
		
		@Override
		public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
		{
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}
		
		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
		{
			worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()));
			if(stack.hasDisplayName())
			{
				TileEntity tileentity = worldIn.getTileEntity(pos);
				if(tileentity instanceof TileEntityColoriteFurnace)
				{
					((TileEntityColoriteFurnace)tileentity).setCustomInventoryName(stack.getDisplayName());
				}
			}
		}
		
		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 
		{
			if(!keepInventory)
			{
				TileEntityColoriteFurnace tileentity = (TileEntityColoriteFurnace)worldIn.getTileEntity(pos);
				InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
				super.breakBlock(worldIn, pos, state);
			}			
		}
		
		@Override
		public boolean hasComparatorInputOverride(IBlockState state) 
		{
			return true;
		}
		
		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) 
		{
			return Container.calcRedstone(worldIn.getTileEntity(pos));
		}
		
		@Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) 
		{
			return new ItemStack(ModBlocks.COLORITE_FURNACE_OFF);
		}
		
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) 
		{
			return EnumBlockRenderType.MODEL;
		}
		
		@Override
		public IBlockState getStateFromMeta(int meta) 
		{
			EnumFacing enumfacing = EnumFacing.getFront(meta);
			if(enumfacing.getAxis() == EnumFacing.Axis.Y)
			{
				enumfacing = EnumFacing.NORTH;
			}
			return this.getDefaultState().withProperty(FACING, enumfacing);
		}
		
		@Override
		public int getMetaFromState(IBlockState state) 
		{
			return((EnumFacing)state.getValue(FACING)).getIndex();
		}
		
		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) 
		{
			return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
		}
		
		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) 
		{
			return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
		}
		
		@Override
		protected BlockStateContainer createBlockState() 
		{
			return new BlockStateContainer(this, new IProperty[] {FACING});
		}
		
		@Override
		public BlockRenderLayer getBlockLayer() 
		{
			return BlockRenderLayer.CUTOUT;
		}
		
		@Override
		public void registerModels()
		{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		}
}
