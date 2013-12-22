package spiderbiggen.fp.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeedFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSeedFoodFP extends ItemSeedFood {
    
    public ItemSeedFoodFP(int par1, int par2, float par3, int par4, int par5) {
        super(par1, par2, par3, par4, par5);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
