package spiderbiggen.fp.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import spiderbiggen.fp.lib.IDs;
import spiderbiggen.fp.lib.Reference;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
    public static void init(File file) {
        Configuration config = new Configuration(file);
        
        try {
            config.load();
            
            // Blocks
            IDs.TOMATOCROPID = config.getBlock("crops", "tomatoCrop", IDs.BLOCKDEFAULT).getInt();
            
            // Items
            IDs.BOILEDEGGID = config.getItem("foods/crops", "boiledEgg", IDs.ITEMDEFAULT).getInt();
            IDs.CHEESEID = config.getItem("foods/crops", "cheese", IDs.ITEMDEFAULT + 1).getInt();
            IDs.EGGSALADID = config.getItem("foods/crops", "eggSalad", IDs.ITEMDEFAULT + 4).getInt();
            IDs.POTATOSALADID = config.getItem("foods/crops", "potatoSalad", IDs.ITEMDEFAULT + 7).getInt();
            IDs.SALMONSALADID = config.getItem("foods/crops", "salmonSalad", IDs.ITEMDEFAULT + 8).getInt();
            IDs.TOMATOID = config.getItem("foods/crops", "tomato", IDs.ITEMDEFAULT + 9).getInt();
            
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID.toLowerCase() + " has a problem loading the config file");
        } finally {
            config.save();
        }
    }
}
