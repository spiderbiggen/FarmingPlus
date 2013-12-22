package spiderbiggen.fp;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.fp.Blocks.FPBlocks;
import spiderbiggen.fp.config.ConfigurationHandler;
import spiderbiggen.fp.items.FPItems;
import spiderbiggen.fp.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class FarmingPlus {
    
    @Instance(value = Reference.MOD_ID)
    public static FarmingPlus instance;
    
    @SidedProxy(clientSide="spiderbiggen.fp.client.ClientProxy", serverSide="spiderbiggen.fp.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs tabFP = new CreativeTabFP("tabFP");
    
    public void GameRegistry() {
        // blocks
        GameRegistry.registerBlock(FPBlocks.tomatoCrop, "TomatoCrop");
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FPBlocks.InitBlocks();
        FPItems.InitItems();
        FPItems.addRecipes();
        GameRegistry();
        
    }
}
