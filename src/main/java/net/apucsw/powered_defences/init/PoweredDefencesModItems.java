
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

import net.apucsw.powered_defences.item.VerticalForcefieldBarrierItem;
import net.apucsw.powered_defences.item.NetheritePlateItem;
import net.apucsw.powered_defences.item.HorizontalForcefieldBarrierItem;
import net.apucsw.powered_defences.PoweredDefencesMod;

public class PoweredDefencesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoweredDefencesMod.MODID);
	public static final RegistryObject<Item> NETHERITE_PLATE = REGISTRY.register("netherite_plate", () -> new NetheritePlateItem());
	public static final RegistryObject<Item> VERTICAL_FORCEFIELD_BARRIER = REGISTRY.register("vertical_forcefield_barrier",
			() -> new VerticalForcefieldBarrierItem());
	public static final RegistryObject<Item> HORIZONTAL_FORCEFIELD_BARRIER = REGISTRY.register("horizontal_forcefield_barrier",
			() -> new HorizontalForcefieldBarrierItem());
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_VERTICAL_SINGLE = block(PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE,
			null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_VERTICAL_DOUBLE = block(PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE,
			null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_VERTICAL_BLOCK = block(PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_BLOCK,
			null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT = block(
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT, null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT = block(
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT, null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_HORIZONTAL_SINGLE = block(
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_SINGLE, null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE = block(
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE, null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_HORIZONTAL_SINGLE_SHIELD_EMIT = block(
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_SINGLE_SHIELD_EMIT, null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE_SHIELD_EMIT = block(
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE_SHIELD_EMIT, null);
	public static final RegistryObject<Item> FORCEFIELD_BARRIER_HORIZONTAL_BLOCK = block(PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_BLOCK,
			null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
