package net.apucsw.powered_defences.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.apucsw.powered_defences.init.PoweredDefencesModTabs;

import java.util.List;

public class NetheritePlateItem extends Item {
	public NetheritePlateItem() {
		super(new Item.Properties().tab(PoweredDefencesModTabs.TAB_POWERED_DEFENCES).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if(Screen.hasShiftDown()) {
			list.add(new TranslatableComponent("description.powered_defences.item.netherite_plate"));
		} else {
			list.add(new TranslatableComponent("description.powered_defences.tooltip.key.show_description"));
		}
	}
}
