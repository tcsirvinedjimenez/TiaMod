package tia.mod.init.tools;

import com.tia.mod.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import tia.mod.interfaces.IHasModel;

public class Pandamonium extends ItemSword implements IHasModel{

	public Pandamonium(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName (name);
		setRegistryName (name);
		setCreativeTab (CreativeTabs.TOOLS);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}