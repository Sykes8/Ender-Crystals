package sykes8.EnderCrystals;

import sykes8.EnderCrystals.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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
    
    public static CreativeTabs tabEnderCrystals = new CreativeTabs("EnderCrystals") 
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() 
        {
            return ModItems.itemEnderCrystal;
        }
    };
}
