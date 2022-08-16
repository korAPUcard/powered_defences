
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.apucsw.powered_defences.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalBlock;
import net.apucsw.powered_defences.PoweredDefencesMod;

public class PoweredDefencesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PoweredDefencesMod.MODID);
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_VERTICAL = REGISTRY.register("forcefield_barrier_vertical",
			() -> new ForcefieldBarrierVerticalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ForcefieldBarrierVerticalBlock.registerRenderLayer();
		}
	}
}
