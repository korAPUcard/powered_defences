package net.apucsw.powered_defences.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.apucsw.powered_defences.PoweredDefencesMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShowDetailInformationMessage {
	int type, pressedms;

	public ShowDetailInformationMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ShowDetailInformationMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ShowDetailInformationMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ShowDetailInformationMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PoweredDefencesMod.addNetworkMessage(ShowDetailInformationMessage.class, ShowDetailInformationMessage::buffer,
				ShowDetailInformationMessage::new, ShowDetailInformationMessage::handler);
	}
}
