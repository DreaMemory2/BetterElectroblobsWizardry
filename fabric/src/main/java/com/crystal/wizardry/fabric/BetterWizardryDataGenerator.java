package com.crystal.wizardry.fabric;

import com.crystal.wizardry.fabric.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BetterWizardryDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator output) {
        FabricDataGenerator.Pack pack = output.createPack();
        pack.addProvider(ChineseLanguageProvide::new);
        pack.addProvider(EnglishLanguageProvide::new);
        pack.addProvider(ModModelProvide::new);
        pack.addProvider(ModRecipeProvide::new);
        pack.addProvider(ModAdvancementProvide::new);
        pack.addProvider(ModItemTagProvide::new);
        pack.addProvider(ModBlockLootProvide::new);
    }
}
