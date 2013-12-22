package spiderbiggen.fp;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.fp.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class FarmingPlus {
    
    @Instance(Reference.MOD_ID)
    public static FarmingPlus instance;
    
    public static CreativeTabs tabFP = new CreativeTabFP("tabFP");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
