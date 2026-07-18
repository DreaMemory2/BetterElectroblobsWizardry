package com.crystal.wizardry.setup.registries;

import com.crystal.wizardry.BetterWizardryMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> SPECTRAL_DUST = bind("spectral_dust");

    public static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, BetterWizardryMod.of(name));
    }
}
