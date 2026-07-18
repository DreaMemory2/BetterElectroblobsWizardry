package com.crystal.wizardry.fabric.datagen;

import com.binaris.wizardry.setup.registries.EBItems;
import com.crystal.wizardry.setup.registries.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvide extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvide(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.getOrCreateTagBuilder(ModItemTags.SPECTRAL_DUST)
                .add(EBItems.SPECTRAL_DUST_EARTH.get())
                .add(EBItems.SPECTRAL_DUST_FIRE.get())
                .add(EBItems.SPECTRAL_DUST_HEALING.get())
                .add(EBItems.SPECTRAL_DUST_ICE.get())
                .add(EBItems.SPECTRAL_DUST_LIGHTNING.get())
                .add(EBItems.SPECTRAL_DUST_NECROMANCY.get())
                .add(EBItems.SPECTRAL_DUST_SORCERY.get());
    }
}
