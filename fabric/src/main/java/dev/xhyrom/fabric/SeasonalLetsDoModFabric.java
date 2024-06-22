package dev.xhyrom.fabric;

import dev.xhyrom.SeasonalLetsDoMod;
import net.fabricmc.api.ModInitializer;

public final class SeasonalLetsDoModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SeasonalLetsDoMod.init();
    }
}
