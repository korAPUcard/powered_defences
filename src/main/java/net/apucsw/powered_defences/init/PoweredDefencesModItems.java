
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.apucsw.powered_defences.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.apucsw.powered_defences.PoweredDefencesMod;

public class PoweredDefencesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoweredDefencesMod.MODID);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_VERTICAL = block(PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL,
			PoweredDefencesModTabs.TAB_POWERED_DEFENCES);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
