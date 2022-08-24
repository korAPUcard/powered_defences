package net.apucsw.powered_defences.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.apucsw.powered_defences.init.PoweredDefencesModBlocks;

public class FFBV_TickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE
				.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE
				.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE
				.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE
				.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y + 1, z)))
				.getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y - 1, z)))
				.getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y + 1, z)))
				.getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (((world.getBlockState(new BlockPos(x, y - 1, z)))
				.getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT.get()) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
				int _amount = 10000;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
