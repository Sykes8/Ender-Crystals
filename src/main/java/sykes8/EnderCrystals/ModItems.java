package sykes8.EnderCrystals;

import sykes8.EnderCrystals.items.ItemEnderCrystal;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems 
{

    public static ItemEnderCrystal itemEnderCrystal;

    public static void init() 
    {
    	itemEnderCrystal = new ItemEnderCrystal();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() 
    {
    	itemEnderCrystal.initModel();
    }

}