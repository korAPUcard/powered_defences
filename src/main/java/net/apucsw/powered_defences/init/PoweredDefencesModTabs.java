/*
 *		Originally generated from MCreator.
 *
 *		It's no longer MCreator project.
 *		Because the MCreator is suck.
 *
 */
package net.apucsw.powered_defences.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PoweredDefencesModTabs {
	public static CreativeModeTab TAB_POWERED_DEFENCES;

	public static void load() {
		TAB_POWERED_DEFENCES = new CreativeModeTab("tab_powered_defences") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PoweredDefencesModItems.VERTICAL_FORCEFIELD_BARRIER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
