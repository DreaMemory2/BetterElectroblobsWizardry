package com.crystal.wizardry.setup.registries;

import com.crystal.wizardry.BetterWizardryMod;
import com.crystal.wizardry.content.block.MagicCrystalCropBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public final class ModBlocks {
    // Register Block
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BetterWizardryMod.MOD_ID, Registries.BLOCK);
    // Mod Block
    public static final RegistrySupplier<Block> MAGIC_CRYSTAL_CROP = register("magic_crystal_crop", MagicCrystalCropBlock::new);

    public static RegistrySupplier<Block> register(String name, Supplier<Block> block) {
        return BLOCKS.register(BetterWizardryMod.of(name), block);
    }
}
