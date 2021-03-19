
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommanderBoneDust extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commanderbonedust")
	public static final Item block = null;

	public ItemCommanderBoneDust(ElementsToomuchCommander instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commanderbonedust", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("commanderbonedust");
			setRegistryName("commanderbonedust");
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
