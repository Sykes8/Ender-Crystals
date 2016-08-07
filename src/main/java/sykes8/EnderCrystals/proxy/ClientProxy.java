package sykes8.EnderCrystals.proxy;

<<<<<<< HEAD
import sykes8.EnderCrystals.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.ModelLoader;
=======
>>>>>>> parent of 217bc68... Stupid Textures
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy 
{
    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
       // ModRenderers.preInit();
    }

    @Override
    public void init(FMLInitializationEvent e) 
    {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) 
    {
        super.postInit(e);
    }
}