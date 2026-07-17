package com.crystal.wizardry.setup.registries;

import com.binaris.wizardry.setup.registries.EBCreativeTabs;
import com.crystal.wizardry.BetterWizardryMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import java.util.function.Function;

/**
 * @see com.binaris.wizardry.setup.registries.EBItems
 */
public final class ModItems {
    // Register Item
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BetterWizardryMod.MOD_ID, Registries.ITEM);
    // More Item
    public static final RegistrySupplier<Item> LOCKED_BOOK = register("locked_book", Item::new, new Item.Properties());

    private static RegistrySupplier<Item> register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        return ITEMS.register(BetterWizardryMod.of(name), () -> factory.apply(properties));
    }
}
