package com.crystal.wizardry;

import com.binaris.wizardry.WizardryMainMod;
import com.crystal.wizardry.setup.registries.ModItems;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class BetterWizardryMod {
    public static final String MOD_ID = "better_ebwizardry";
    public static final ResourceKey<CreativeModeTab> WIZARDRY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, WizardryMainMod.location("ebwizardry"));

    public static void init() {
        // Write common init code here.
        ModItems.ITEMS.register();
        // 将物品添加已有的创造物品栏
        CreativeTabRegistry.append(WIZARDRY, ModItems.LOCKED_BOOK);
    }

    public static ResourceLocation of(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
