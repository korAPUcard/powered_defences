
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.apucsw.powered_defences.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PoweredDefencesModTabs {
	public static CreativeModeTab TAB_POWERED_DEFENCES;

	public static void load() {
		TAB_POWERED_DEFENCES = new CreativeModeTab("tabpowered_defences") {
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
