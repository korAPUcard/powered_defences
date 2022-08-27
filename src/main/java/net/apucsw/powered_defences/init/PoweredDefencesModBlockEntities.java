/*
 *		Originally generated from MCreator.
 *
 *		It's no longer MCreator project.
 *		Because the MCreator is suck.
 *
 */
package net.apucsw.powered_defences.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.apucsw.powered_defences.block.entity.ForcefieldBarrierVerticalSingleShieldEmitBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierVerticalSingleBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierVerticalDoubleShieldEmitBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierVerticalDoubleBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierHorizontalSingleShieldEmitBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierHorizontalSingleBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierHorizontalDoubleShieldEmitBlockEntity;
import net.apucsw.powered_defences.block.entity.ForcefieldBarrierHorizontalDoubleBlockEntity;
import net.apucsw.powered_defences.PoweredDefencesMod;

public class PoweredDefencesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			PoweredDefencesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_VERTICAL_SINGLE = register("forcefield_barrier_vertical_single",
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE, ForcefieldBarrierVerticalSingleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_VERTICAL_DOUBLE = register("forcefield_barrier_vertical_double",
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE, ForcefieldBarrierVerticalDoubleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT = register(
			"forcefield_barrier_vertical_single_shield_emit", PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT,
			ForcefieldBarrierVerticalSingleShieldEmitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT = register(
			"forcefield_barrier_vertical_double_shield_emit", PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT,
			ForcefieldBarrierVerticalDoubleShieldEmitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_HORIZONTAL_SINGLE = register("forcefield_barrier_horizontal_single",
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_SINGLE, ForcefieldBarrierHorizontalSingleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE = register("forcefield_barrier_horizontal_double",
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE, ForcefieldBarrierHorizontalDoubleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_HORIZONTAL_SINGLE_SHIELD_EMIT = register(
			"forcefield_barrier_horizontal_single_shield_emit", PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_SINGLE_SHIELD_EMIT,
			ForcefieldBarrierHorizontalSingleShieldEmitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE_SHIELD_EMIT = register(
			"forcefield_barrier_horizontal_double_shield_emit", PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE_SHIELD_EMIT,
			ForcefieldBarrierHorizontalDoubleShieldEmitBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
