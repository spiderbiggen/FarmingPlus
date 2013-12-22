package spiderbiggen.fp;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.fp.items.FPItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabFP extends CreativeTabs {
    
    public CreativeTabFP(String par2Str) {
        super(par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return FPItems.tomato.itemID;
    }
    
    @Override
    public String getTranslatedTabLabel() {
        return "Farming Plus";
    }
}
