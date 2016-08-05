package sykes8.EnderCrystals.proxy;

import sykes8.EnderCrystals.ModBlocks;
import sykes8.EnderCrystals.ModItems;
import sykes8.EnderCrystals.ModCrafting;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModBlocks.init();
        ModItems.init();
        ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}