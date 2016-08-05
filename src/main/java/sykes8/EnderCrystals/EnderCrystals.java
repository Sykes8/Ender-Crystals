package sykes8.EnderCrystals;

import sykes8.EnderCrystals.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = EnderCrystals.MODID, name = EnderCrystals.MODNAME, version = EnderCrystals.VERSION)
public class EnderCrystals
{
	
    public static final String MODID = "EnderCrystals";
    public static final String MODNAME = "Ender Crystals";
    public static final String VERSION = "0.1";
    
    @SidedProxy(clientSide = "sykes8.EnderCrystals.proxy.ClientProxy", serverSide = "sykes8.EnderCrystals.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static EnderCrystals instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
        proxy.postInit(event);
    }
}
