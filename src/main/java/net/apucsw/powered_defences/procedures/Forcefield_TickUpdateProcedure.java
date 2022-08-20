package net.apucsw.powered_defences.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Forcefield_TickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 0.5),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("powered_defences:forcefield_barrier_loop")),
							SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("powered_defences:forcefield_barrier_loop")),
							SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}
