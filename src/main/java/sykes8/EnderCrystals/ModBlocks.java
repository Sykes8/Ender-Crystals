package sykes8.EnderCrystals;

import sykes8.EnderCrystals.blocks.*;
//import sykes8.EnderCrystals.blocks.BlockPortalBase;
//import sykes8.EnderCrystals.blocks.BlockPortalTop;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks 
{

	public static BlockCrystalizer blockCrystalizer;
	public static BlockEnderFrame  blockEnderFrame;
    public static BlockPortalBase  blockPortalBase;
    public static BlockPortalTop   blockPortalTop;
    public static BlockResonator   blockResonator;

    public static void init() 
    {
    	blockCrystalizer = new BlockCrystalizer();
    	blockEnderFrame  = new BlockEnderFrame();
    	blockPortalBase  = new BlockPortalBase();
    	blockPortalTop   = new BlockPortalTop();
    	blockResonator   = new BlockResonator();
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() 
    {
    	blockCrystalizer.initModel();
    	blockEnderFrame.initModel();
    	blockPortalBase.initModel();
    	blockPortalTop.initModel();
    	blockResonator.initModel();
    }
}