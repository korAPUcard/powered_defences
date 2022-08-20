package net.apucsw.powered_defences.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.apucsw.powered_defences.init.PoweredDefencesModBlocks;

public class FFBH_NeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState floor = Blocks.AIR.defaultBlockState();
		BlockState wall = Blocks.AIR.defaultBlockState();
		wall = PoweredDefencesModBlocks.FORCEFIELD_BARRIER_HORIZONTAL_SINGLE.get().defaultBlockState();
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == wall.getBlock()) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 0.5, y + 0.5, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 0.5, y + 0.5, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.WEST) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 0.5, y + 0.5, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.EAST) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 0.5, y + 0.5, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
