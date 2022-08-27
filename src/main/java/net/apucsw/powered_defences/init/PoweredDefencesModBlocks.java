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
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalSingleShieldEmitBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalSingleBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalDoubleShieldEmitBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalDoubleBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalBlockBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierHorizontalSingleShieldEmitBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierHorizontalSingleBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierHorizontalDoubleShieldEmitBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierHorizontalDoubleBlock;
import net.apucsw.powered_defences.block.ForcefieldBarrierHorizontalBlockBlock;
import net.apucsw.powered_defences.PoweredDefencesMod;

public class PoweredDefencesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PoweredDefencesMod.MODID);
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_VERTICAL_SINGLE = REGISTRY.register("forcefield_barrier_vertical_single",
			() -> new ForcefieldBarrierVerticalSingleBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_VERTICAL_DOUBLE = REGISTRY.register("forcefield_barrier_vertical_double",
			() -> new ForcefieldBarrierVerticalDoubleBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_VERTICAL_BLOCK = REGISTRY.register("forcefield_barrier_vertical_block",
			() -> new ForcefieldBarrierVerticalBlockBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_VERTICAL_SINGLE_SHIELD_EMIT = REGISTRY
			.register("forcefield_barrier_vertical_single_shield_emit", () -> new ForcefieldBarrierVerticalSingleShieldEmitBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_VERTICAL_DOUBLE_SHIELD_EMIT = REGISTRY
			.register("forcefield_barrier_vertical_double_shield_emit", () -> new ForcefieldBarrierVerticalDoubleShieldEmitBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_HORIZONTAL_SINGLE = REGISTRY.register("forcefield_barrier_horizontal_single",
			() -> new ForcefieldBarrierHorizontalSingleBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE = REGISTRY.register("forcefield_barrier_horizontal_double",
			() -> new ForcefieldBarrierHorizontalDoubleBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_HORIZONTAL_SINGLE_SHIELD_EMIT = REGISTRY
			.register("forcefield_barrier_horizontal_single_shield_emit", () -> new ForcefieldBarrierHorizontalSingleShieldEmitBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_HORIZONTAL_DOUBLE_SHIELD_EMIT = REGISTRY
			.register("forcefield_barrier_horizontal_double_shield_emit", () -> new ForcefieldBarrierHorizontalDoubleShieldEmitBlock());
	public static final RegistryObject<Block> FORCEFIELD_BARRIER_HORIZONTAL_BLOCK = REGISTRY.register("forcefield_barrier_horizontal_block",
			() -> new ForcefieldBarrierHorizontalBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ForcefieldBarrierVerticalSingleBlock.registerRenderLayer();
			ForcefieldBarrierVerticalDoubleBlock.registerRenderLayer();
			ForcefieldBarrierVerticalBlockBlock.registerRenderLayer();
			ForcefieldBarrierVerticalSingleShieldEmitBlock.registerRenderLayer();
			ForcefieldBarrierVerticalDoubleShieldEmitBlock.registerRenderLayer();
			ForcefieldBarrierHorizontalSingleBlock.registerRenderLayer();
			ForcefieldBarrierHorizontalDoubleBlock.registerRenderLayer();
			ForcefieldBarrierHorizontalSingleShieldEmitBlock.registerRenderLayer();
			ForcefieldBarrierHorizontalDoubleShieldEmitBlock.registerRenderLayer();
			ForcefieldBarrierHorizontalBlockBlock.registerRenderLayer();
		}
	}
}
