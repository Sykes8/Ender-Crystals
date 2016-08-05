package sykes8.EnderCrystals.blocks;

import sykes8.EnderCrystals.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockResonator extends Block 
{

	public BlockResonator() 
	{
        super(Material.ROCK);
        setUnlocalizedName("Resonator");
        setRegistryName("Resonator");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
	}
	
	@SideOnly(Side.CLIENT)
    public void initModel() 
	{
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
	public static void setupCrafting()
	{
    GameRegistry.addRecipe(new ItemStack(ModBlocks.blockResonator), 
            "SPS",
            "PFP",
            "SRS",
                  'S', Blocks.STONE,
                  'P', Items.ENDER_PEARL,
                  'R', Blocks.REDSTONE_BLOCK,
                  'F', ModBlocks.blockEnderFrame);     
    }
}