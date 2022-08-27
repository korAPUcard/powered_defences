package net.apucsw.powered_defences.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.apucsw.powered_defences.init.PoweredDefencesModBlocks;

import java.util.concurrent.atomic.AtomicInteger;

public class FFBV_TickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (new Object() {
			public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate))).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
				return _retval.get();
			}
		}.getMaxEnergyStored(world, new BlockPos(x, y, z)) == 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("storedEnergy", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate))).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
				return _retval.get();
			}
		}.getMaxEnergyStored(world, new BlockPos(x, y, z)) >= 1) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("storedEnergy", (new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, (new Object() {
									public Direction getDirection(BlockState _bs) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp)
											return _bs.getValue(_dp);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
												? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
												: Direction.NORTH;
									}
								}.getDirection(blockstate))).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
							return _retval.get();
						}
					}.getMaxEnergyStored(world, new BlockPos(x, y, z))));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate))).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
				return _retval.get();
			}
		}.getMaxEnergyStored(world, new BlockPos(x, y, z)) <= 9999) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT
					.get()) == true) {
				world.setBlock(new BlockPos(x, y, z), PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE.get().defaultBlockState(), 3);
			} else if (((world.getBlockState(new BlockPos(x, y, z)))
					.getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT.get()) == true) {
				world.setBlock(new BlockPos(x, y, z), PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE.get().defaultBlockState(), 3);
			}
		} else if (new Object() {
			public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate))).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
				return _retval.get();
			}
		}.getMaxEnergyStored(world, new BlockPos(x, y, z)) >= 10000) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE
					.get()) == true) {
				world.setBlock(new BlockPos(x, y, z),
						PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT.get().defaultBlockState(), 3);
			} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE
					.get()) == true) {
				world.setBlock(new BlockPos(x, y, z),
						PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT.get().defaultBlockState(), 3);
			}
		}
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
