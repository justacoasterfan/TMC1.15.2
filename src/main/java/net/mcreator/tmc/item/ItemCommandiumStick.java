
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommandiumStick extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commandiumstick")
	public static final Item block = null;

	public ItemCommandiumStick(ElementsToomuchCommander instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commandiumstick", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("commandiumstick");
			setRegistryName("commandiumstick");
			setCreativeTab(TabTooMuchCommander.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}

}
