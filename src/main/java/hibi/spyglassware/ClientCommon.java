package hibi.spyglassware;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientCommon implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Spyglassware");

	@Override
	public void onInitializeClient(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
