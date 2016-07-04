package net.minecraft.src;

public class mod_Example extends BaseMod {
	public void load() {
		ModLoader.addRecipe(new ItemStack(Item.diamond, 64), new Object[] { "xxx","xxx","xxx", Character.valueOf('x'), Block.dirt });
	}

	public String getVersion() {
		return "0.0.1";
	}

}
