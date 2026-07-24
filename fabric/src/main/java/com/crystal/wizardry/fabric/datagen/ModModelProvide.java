package com.crystal.wizardry.fabric.datagen;

import com.crystal.wizardry.setup.registries.ModBlocks;
import com.crystal.wizardry.setup.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.CropBlock;

public class ModModelProvide extends FabricModelProvider {

    public ModModelProvide(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModel) {
        blockModel.createCropBlock(ModBlocks.MAGIC_CRYSTAL_CROP.get(), CropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModel) {
        itemModel.generateFlatItem(ModItems.LOCKED_BOOK.get(), ModelTemplates.FLAT_ITEM);
        itemModel.generateFlatItem(ModItems.ASTRAL_DIAMOND_SHARD.get(), ModelTemplates.FLAT_ITEM);
    }
}
