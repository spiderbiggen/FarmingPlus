package spiderbiggen.fp.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import spiderbiggen.fp.FarmingPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFP extends Item {
    
    public ItemFP(int par1) {
        super(par1);
        this.setCreativeTab(FarmingPlus.tabFP);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName()
                .substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
}
