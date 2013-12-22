package spiderbiggen.fp.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import spiderbiggen.fp.FarmingPlus;
import spiderbiggen.fp.Blocks.FPBlocks;
import spiderbiggen.fp.lib.IDs;
import spiderbiggen.fp.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class FPItems {
    
    public static Item eggSalad;
    public static Item potatoSalad;
    public static Item salmonSalad;
    public static Item boiledEgg;
    public static Item cheese;
    public static Item tomato;
    
    public static void addRecipes() {
        
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[] { new ItemStack(Item.bucketMilk, 0, 3) });
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", 'p', Item.bakedPotato, 'b', Item.bowlEmpty, 'g', Block.tallGrass);
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", 'e', boiledEgg, 'p', Item.bakedPotato, 'b', Item.bowlEmpty);
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);
    }
    
    public static void InitItems() {
        boiledEgg = new ItemFoodFP(IDs.BOILEDEGGID - 256, 1, 0.7F, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "boiledEgg").setCreativeTab(FarmingPlus.tabFP);
        eggSalad = new ItemSoupFP(IDs.EGGSALADID - 256, 4, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "eggSalad").setCreativeTab(FarmingPlus.tabFP);
        potatoSalad = new ItemSoupFP(IDs.POTATOSALADID - 256, 5, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "potatoSalad").setCreativeTab(FarmingPlus.tabFP);
        salmonSalad = new ItemSoupFP(IDs.SALMONSALADID - 256, 4, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "salmonSalad").setCreativeTab(FarmingPlus.tabFP);
        cheese = new ItemFoodFP(IDs.CHEESEID - 256, 2, 1.1F, true).setUnlocalizedName(Reference.RESOURCE_PREFIX + "cheese").setCreativeTab(FarmingPlus.tabFP);
        tomato = new ItemSeedFoodFP(IDs.TOMATOID - 256, 3, 0.3F, FPBlocks.tomatoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "tomato").setCreativeTab(FarmingPlus.tabFP);
        
    }
}
