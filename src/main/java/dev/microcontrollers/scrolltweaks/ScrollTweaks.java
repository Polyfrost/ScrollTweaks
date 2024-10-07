package dev.microcontrollers.scrolltweaks;

import dev.microcontrollers.scrolltweaks.config.ScrollTweaksConfig;
//? if fabric {
import net.fabricmc.api.ModInitializer;
//?}
//? if neoforge {
/*import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
*///?}

//? if neoforge
/*@Mod(value = "scrolltweaks", dist = Dist.CLIENT)*/
public class ScrollTweaks /*? if fabric {*/ implements ModInitializer /*?}*/ {
	//? if fabric {
	@Override
	public void onInitialize() {
		ScrollTweaksConfig.CONFIG.load();
	}
	//?}

	//? if neoforge {
    /*public ScrollTweaks() {
        ScrollTweaksConfig.CONFIG.load();
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (client, parent) -> ScrollTweaksConfig.configScreen(parent));
    }
	*///?}
}