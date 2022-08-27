/*
 *		Originally generated from MCreator.
 *
 *		It's no longer MCreator project.
 *		Because the MCreator is suck.
 *
 */
package net.apucsw.powered_defences.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoweredDefencesModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_loop"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_loop")));
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_touch_loop"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_touch_loop")));
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_activated"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_activated")));
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_deactivated"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_deactivated")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
