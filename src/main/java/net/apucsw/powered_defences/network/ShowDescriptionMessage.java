package net.apucsw.powered_defences.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.apucsw.powered_defences.PoweredDefencesMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShowDescriptionMessage {
	int type, pressedms;

	public ShowDescriptionMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ShowDescriptionMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ShowDescriptionMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ShowDescriptionMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PoweredDefencesMod.addNetworkMessage(ShowDescriptionMessage.class, ShowDescriptionMessage::buffer, ShowDescriptionMessage::new,
				ShowDescriptionMessage::handler);
	}
}
