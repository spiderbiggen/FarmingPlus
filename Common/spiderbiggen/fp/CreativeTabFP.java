package spiderbiggen.fp;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabFP extends CreativeTabs {
    
    public CreativeTabFP(String par2Str) {
        super(par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return 0;
    }
    
    @Override
    public String getTranslatedTabLabel() {
        return "Farming Plus";
    }
}
