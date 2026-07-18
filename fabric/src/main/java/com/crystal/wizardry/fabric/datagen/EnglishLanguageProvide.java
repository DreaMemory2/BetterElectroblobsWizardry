package com.crystal.wizardry.fabric.datagen;

import com.crystal.wizardry.setup.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLanguageProvide extends FabricLanguageProvider {

    public EnglishLanguageProvide(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        item(builder);
    }

    protected void item(TranslationBuilder builder) {
        builder.add(ModItems.LOCKED_BOOK.get(), "Locked Book");
        builder.add(ModItems.ASTRAL_DIAMOND_SHARD.get(), "Astral Diamond Shard");
    }
}
