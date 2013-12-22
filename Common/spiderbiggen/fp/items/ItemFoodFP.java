package spiderbiggen.fp.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import spiderbiggen.fp.FarmingPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodFP extends ItemFood {
    
    public ItemFoodFP(int id, int healAmount, boolean isWolfsFav) {
        super(id, healAmount, isWolfsFav);
    }
    
    public ItemFoodFP(int id, int healAmount, float saturationmodifier,
            boolean isWolfsFav) {
        super(id, healAmount, saturationmodifier, isWolfsFav);
        this.setCreativeTab(FarmingPlus.tabFP);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName()
                .substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
}
