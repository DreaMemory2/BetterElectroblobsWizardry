package com.crystal.wizardry.setup.registries;

import com.crystal.wizardry.BetterWizardryMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import java.util.function.Supplier;

/**
 * @see com.binaris.wizardry.setup.registries.EBItems
 */
public final class ModItems {
    // Register Item
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BetterWizardryMod.MOD_ID, Registries.ITEM);
    // More Item
    public static final RegistrySupplier<Item> LOCKED_BOOK = register("locked_book", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> ASTRAL_DIAMOND_SHARD = register("astral_diamond_shard", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> MAGIC_CRYSTAL_SEEDS = register("magic_crystal_seeds", () -> new ItemNameBlockItem(ModBlocks.MAGIC_CRYSTAL_CROP.get(), new Item.Properties()));

    private static RegistrySupplier<Item> register(String name, Supplier<Item> factory) {
        return ITEMS.register(BetterWizardryMod.of(name), factory);
    }
}
