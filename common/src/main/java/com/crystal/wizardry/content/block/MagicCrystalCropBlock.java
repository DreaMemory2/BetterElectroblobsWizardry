package com.crystal.wizardry.content.block;

import com.crystal.wizardry.setup.registries.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import org.jetbrains.annotations.NotNull;

public class MagicCrystalCropBlock extends CropBlock {

    public MagicCrystalCropBlock() {
        super(Properties.copy(Blocks.WHEAT));
    }

    @Override
    protected @NotNull ItemLike getBaseSeedId() {
        return ModItems.MAGIC_CRYSTAL_SEEDS.get();
    }
}
