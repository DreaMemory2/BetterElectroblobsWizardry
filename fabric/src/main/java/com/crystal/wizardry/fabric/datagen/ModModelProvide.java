package com.crystal.wizardry.fabric.datagen;

import com.crystal.wizardry.setup.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class ModModelProvide extends FabricModelProvider {

    public ModModelProvide(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModel) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModel) {
        itemModel.generateFlatItem(ModItems.LOCKED_BOOK.get(), ModelTemplates.FLAT_ITEM);
    }
}
