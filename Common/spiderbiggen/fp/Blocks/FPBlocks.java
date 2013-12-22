package spiderbiggen.fp.Blocks;

import net.minecraft.block.Block;
import spiderbiggen.fp.lib.IDs;
import spiderbiggen.fp.lib.Reference;

public class FPBlocks {
    
    public static Block tomatoCrop;
    public static Block grillIdle;
    public static Block grillActive;
    public static Block trap;
    
    public static void InitBlocks() {
        tomatoCrop = new TomatoCrop(IDs.TOMATOCROPID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "tomatoCrop").setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
    }
}
