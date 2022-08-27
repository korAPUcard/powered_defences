/*
 *		Originally generated from MCreator.
 *
 *		It's no longer MCreator project.
 *		Because the MCreator is suck.
 *
 *		Now this project is will be fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.powered_defences;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.apucsw.powered_defences.init.PoweredDefencesModTabs;
import net.apucsw.powered_defences.init.PoweredDefencesModItems;
import net.apucsw.powered_defences.init.PoweredDefencesModBlocks;
import net.apucsw.powered_defences.init.PoweredDefencesModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("powered_defences")
public class PoweredDefences {
	public static final Logger LOGGER = LogManager.getLogger(PoweredDefences.class);
	public static final String MODID = "powered_defences";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public PoweredDefences() {
		PoweredDefencesModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		PoweredDefencesModBlocks.REGISTRY.register(bus);
		PoweredDefencesModItems.REGISTRY.register(bus);

		PoweredDefencesModBlockEntities.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
