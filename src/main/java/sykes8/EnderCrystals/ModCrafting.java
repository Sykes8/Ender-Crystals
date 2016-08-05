package sykes8.EnderCrystals;

import sykes8.EnderCrystals.blocks.*;
import sykes8.EnderCrystals.items.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting 
{
	public static void init()
	{
 /*   GameRegistry.addRecipe(new ItemStack(ModBlocks.blockEnderFrame), 
            "ODO",
            "D.D",
            "ODO",
                  'D', Blocks.diamond_ore,
                  'O', Blocks.obsidian);       
  */  
		BlockCrystalizer.setupCrafting();
		BlockEnderFrame.setupCrafting();
		BlockPortalBase.setupCrafting();
		BlockPortalTop.setupCrafting();
		BlockResonator.setupCrafting();
    }

}




