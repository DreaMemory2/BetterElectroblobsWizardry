package com.crystal.wizardry.fabric;

import com.crystal.wizardry.BetterWizardryMod;
import net.fabricmc.api.ModInitializer;

public class BetterWizardryFabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Run our common setup.
        BetterWizardryMod.init();
    }
}
