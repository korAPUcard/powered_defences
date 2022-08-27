package net.apucsw.powered_defences.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.apucsw.powered_defences.init.PoweredDefencesModItems;
import net.apucsw.powered_defences.init.PoweredDefencesModBlocks;

public class FFBV_RightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		BlockState floor = Blocks.AIR.defaultBlockState();
		BlockState wall = Blocks.AIR.defaultBlockState();
		BlockState wall_both = Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == PoweredDefencesModItems.VERTICAL_FORCEFIELD_BARRIER.get()) {
			if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity) || new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
					}
					return false;
				}
			}.checkGamemode(entity)) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_setstack.setCount(
							(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			floor = PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE.get().defaultBlockState();
			wall = PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE.get().defaultBlockState();
			wall_both = PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_DOUBLE.get().defaultBlockState();
			if (direction == Direction.UP) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y + 1, z), floor, 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 0.5, y + 1.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 0.5), (y + 1.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.NORTH) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y, z - 1), wall, 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = new BlockPos(x, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z - 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 0.5), (y + 0.5), (z - 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.SOUTH) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y, z + 1), wall, 3);
					{
						Direction _dir = Direction.SOUTH;
						BlockPos _pos = new BlockPos(x, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 0.5), (y + 0.5), (z + 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.WEST) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x - 1, y, z), wall, 3);
					{
						Direction _dir = Direction.WEST;
						BlockPos _pos = new BlockPos(x - 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x - 1.5, y + 0.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x - 1.5), (y + 0.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.EAST) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x + 1, y, z), wall, 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = new BlockPos(x + 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 1.5, y + 0.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 1.5), (y + 0.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.NORTH && (direction.getOpposite()) == (new Object() {
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
			}.getDirection(new BlockPos(x, y, z)))) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x - 1, y, z), wall_both, 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = new BlockPos(x - 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x - 1.5, y + 0.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x - 1.5), (y + 0.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.WEST && (direction.getOpposite()) == (new Object() {
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
			}.getDirection(new BlockPos(x, y, z)))) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x + 1, y, z), wall_both, 3);
					{
						Direction _dir = Direction.WEST;
						BlockPos _pos = new BlockPos(x + 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 1.5, y + 0.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 1.5), (y + 0.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.UP && direction == Direction.NORTH) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y, z - 1), floor, 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = new BlockPos(x, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z - 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 0.5), (y + 0.5), (z - 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.UP && direction == Direction.SOUTH) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y, z + 1), wall, 3);
					{
						Direction _dir = Direction.SOUTH;
						BlockPos _pos = new BlockPos(x, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 0.5), (y + 0.5), (z + 1.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.UP && direction == Direction.WEST) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x - 1, y, z), wall, 3);
					{
						Direction _dir = Direction.WEST;
						BlockPos _pos = new BlockPos(x - 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x - 1.5, y + 0.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x - 1.5), (y + 0.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			} else if (direction == Direction.UP && direction == Direction.EAST) {
				if (!world.isClientSide()
						&& (world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x + 1, y, z), wall, 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = new BlockPos(x + 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x + 1.5, y + 0.5, z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1);
						} else {
							_level.playLocalSound((x + 1.5), (y + 0.5), (z + 0.5),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.place")), SoundSource.BLOCKS, 1,
									1, false);
						}
					}
				}
			}
		}
	}
}
