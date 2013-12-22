package spiderbiggen.fp.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoupFP extends ItemFoodFP {
    
    public ItemSoupFP(int id, int healAmount, boolean isWolfsFav) {
        super(id, healAmount, isWolfsFav);
    }
    
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
            EntityPlayer par3EntityPlayer) {
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Item.bowlEmpty);
    }
    
}
