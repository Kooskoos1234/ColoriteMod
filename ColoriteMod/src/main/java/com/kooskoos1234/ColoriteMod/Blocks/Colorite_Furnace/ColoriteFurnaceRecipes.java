package com.kooskoos1234.ColoriteMod.Blocks.Colorite_Furnace;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.kooskoos1234.ColoriteMod.init.ModBlocks;
import com.kooskoos1234.ColoriteMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ColoriteFurnaceRecipes
{
	private static final ColoriteFurnaceRecipes COOKING_BASE = new ColoriteFurnaceRecipes();
	private final Map<ItemStack, ItemStack> cookingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static ColoriteFurnaceRecipes instance()
    {
        return COOKING_BASE;
    }
	
	private ColoriteFurnaceRecipes()
	{
		//Modded Recipes
		this.addCookingRecipeForBlock(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY), 10.0F);
		this.addCookingRecipeForBlock(ModBlocks.AMBER_ORE, new ItemStack(ModItems.AMBER), 20.0F);
		this.addCookingRecipeForBlock(ModBlocks.TOPAZ_ORE, new ItemStack(ModItems.TOPAZ), 30.0F);
		this.addCookingRecipeForBlock(ModBlocks.MALACHITE_ORE, new ItemStack(ModItems.MALACHITE), 40.0F);
		this.addCookingRecipeForBlock(ModBlocks.KYANITE_ORE, new ItemStack(ModItems.KYANITE), 50.0F);
		this.addCookingRecipeForBlock(ModBlocks.AQUAMARINE_ORE, new ItemStack(ModItems.AQUAMARINE), 60.0F);
		this.addCookingRecipeForBlock(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE), 70.0F);
		this.addCookingRecipeForBlock(ModBlocks.AMETHYST_ORE, new ItemStack(ModItems.AMETHYST), 80.0F);
		this.addCookingRecipeForBlock(ModBlocks.COLORITE_ORE, new ItemStack(ModItems.COLORITE), 1000.0F);
		this.addCooking(Items.CAKE, new ItemStack(ModItems.CHOCOLATE_CAKE), 5.0F);
		
		//Vanilla Recipes
		this.addCookingRecipeForBlock(Blocks.IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7F);
        this.addCookingRecipeForBlock(Blocks.GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1.0F);
        this.addCookingRecipeForBlock(Blocks.DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1.0F);
        this.addCookingRecipeForBlock(Blocks.SAND, new ItemStack(Blocks.GLASS), 0.1F);
        this.addCooking(Items.PORKCHOP, new ItemStack(Items.COOKED_PORKCHOP), 0.35F);
        this.addCooking(Items.BEEF, new ItemStack(Items.COOKED_BEEF), 0.35F);
        this.addCooking(Items.CHICKEN, new ItemStack(Items.COOKED_CHICKEN), 0.35F);
        this.addCooking(Items.RABBIT, new ItemStack(Items.COOKED_RABBIT), 0.35F);
        this.addCooking(Items.MUTTON, new ItemStack(Items.COOKED_MUTTON), 0.35F);
        this.addCookingRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(Blocks.STONE), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.DEFAULT_META), new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.CRACKED_META), 0.1F);
        this.addCooking(Items.CLAY_BALL, new ItemStack(Items.BRICK), 0.3F);
        this.addCookingRecipeForBlock(Blocks.CLAY, new ItemStack(Blocks.HARDENED_CLAY), 0.35F);
        this.addCookingRecipeForBlock(Blocks.CACTUS, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
        this.addCookingRecipeForBlock(Blocks.LOG, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addCookingRecipeForBlock(Blocks.LOG2, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addCookingRecipeForBlock(Blocks.EMERALD_ORE, new ItemStack(Items.EMERALD), 1.0F);
        this.addCooking(Items.POTATO, new ItemStack(Items.BAKED_POTATO), 0.35F);
        this.addCookingRecipeForBlock(Blocks.NETHERRACK, new ItemStack(Items.NETHERBRICK), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.SPONGE, 1, 1), new ItemStack(Blocks.SPONGE, 1, 0), 0.15F);
        this.addCooking(Items.CHORUS_FRUIT, new ItemStack(Items.CHORUS_FRUIT_POPPED), 0.1F);

        for (ItemFishFood.FishType itemfishfood$fishtype : ItemFishFood.FishType.values())
        {
            if (itemfishfood$fishtype.canCook())
            {
                this.addCookingRecipe(new ItemStack(Items.FISH, 1, itemfishfood$fishtype.getMetadata()), new ItemStack(Items.COOKED_FISH, 1, itemfishfood$fishtype.getMetadata()), 0.35F);
            }
        }
		this.addCookingRecipeForBlock(Blocks.COAL_ORE, new ItemStack(Items.COAL), 0.1F);
        this.addCookingRecipeForBlock(Blocks.REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.7F);
        this.addCookingRecipeForBlock(Blocks.LAPIS_ORE, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), 0.2F);
        this.addCookingRecipeForBlock(Blocks.QUARTZ_ORE, new ItemStack(Items.QUARTZ), 0.2F);
        this.addCooking(Items.CHAINMAIL_HELMET, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.CHAINMAIL_CHESTPLATE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.CHAINMAIL_LEGGINGS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.CHAINMAIL_BOOTS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_PICKAXE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_SHOVEL, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_AXE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_HOE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_SWORD, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_HELMET, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_CHESTPLATE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_LEGGINGS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_BOOTS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.IRON_HORSE_ARMOR, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_PICKAXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_SHOVEL, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_AXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_HOE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_SWORD, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_HELMET, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_CHESTPLATE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_LEGGINGS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_BOOTS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCooking(Items.GOLDEN_HORSE_ARMOR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.WHITE.getMetadata()), new ItemStack(Blocks.WHITE_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.ORANGE.getMetadata()), new ItemStack(Blocks.ORANGE_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.MAGENTA.getMetadata()), new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIGHT_BLUE.getMetadata()), new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.YELLOW.getMetadata()), new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIME.getMetadata()), new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PINK.getMetadata()), new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GRAY.getMetadata()), new ItemStack(Blocks.GRAY_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.SILVER.getMetadata()), new ItemStack(Blocks.SILVER_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.CYAN.getMetadata()), new ItemStack(Blocks.CYAN_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PURPLE.getMetadata()), new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLUE.getMetadata()), new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BROWN.getMetadata()), new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GREEN.getMetadata()), new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.RED.getMetadata()), new ItemStack(Blocks.RED_GLAZED_TERRACOTTA), 0.1F);
        this.addCookingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLACK.getMetadata()), new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA), 0.1F);
	}
	
	public void addCookingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addCooking(Item.getItemFromBlock(input), stack, experience);
    }
	
	public void addCooking(Item input, ItemStack stack, float experience)
    {
        this.addCookingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }
	
	public void addCookingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getCookingResult(input) != ItemStack.EMPTY) 
        { 
        	net.minecraftforge.fml.common.FMLLog.log.info("Ignored cooking recipe with conflicting input: {} = {}", input, stack); return; 
        }
        this.cookingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }
	
	public ItemStack getCookingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.cookingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getCookingList()
    {
        return this.cookingList;
    }

    public float getCookingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
