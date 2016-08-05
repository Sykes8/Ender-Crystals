package sykes8.EnderCrystals;

import sykes8.EnderCrystals.blocks.BlockPortalBase;
import sykes8.EnderCrystals.blocks.BlockPortalTop;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks 
{

    public static BlockPortalBase blockPortalBase;
    public static BlockPortalTop  blockPortalTop;

    public static void init() 
    {
    	blockPortalBase = new BlockPortalBase();
    	blockPortalTop  = new BlockPortalTop();
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() 
    {
    	blockPortalBase.initModel();
    	blockPortalTop.initModel();
    }
}