package com.crystal.wizardry.forge;

import com.binaris.wizardry.client.WizardryForgeClient;
import com.crystal.wizardry.forge.client.WizardryClientForgeMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import com.crystal.wizardry.BetterWizardryMod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterWizardryMod.MOD_ID)
public class WizardryForgeMod {
    public static final IEventBus MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public WizardryForgeMod() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(BetterWizardryMod.MOD_ID, MOD_BUS);
        // 注册事件
        MOD_BUS.addListener(WizardryClientForgeMod::clientSetup);

        // Run our common setup.
        BetterWizardryMod.init();
    }
}
