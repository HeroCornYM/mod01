package hero.fmltutor.item;

import hero.fmltutor.FMLTutor;
import net.minecraft.item.Item;

public class ItemDirtBall extends Item
{
    public ItemDirtBall()
    {
        this.setUnlocalizedName(FMLTutor.MODID + ".dirtBall");
        this.setRegistryName("dirt_ball");
        this.setMaxStackSize(16);
    }
}
