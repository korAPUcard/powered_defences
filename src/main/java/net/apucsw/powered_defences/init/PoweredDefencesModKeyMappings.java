
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.apucsw.powered_defences.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PoweredDefencesModKeyMappings {
	public static final KeyMapping SHOW_DESCRIPTION = new KeyMapping("key.powered_defences.show_description", GLFW.GLFW_KEY_LEFT_SHIFT,
			"key.categories.powered_defences");
	public static final KeyMapping SHOW_DETAIL_INFORMATION = new KeyMapping("key.powered_defences.show_detail_information", GLFW.GLFW_KEY_Q,
			"key.categories.powered_defences");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(SHOW_DESCRIPTION);
		ClientRegistry.registerKeyBinding(SHOW_DETAIL_INFORMATION);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
			}
		}
	}
}
