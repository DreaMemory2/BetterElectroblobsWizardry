package com.crystal.wizardry.fabric.datagen;

import com.binaris.wizardry.setup.registries.EBItems;
import com.crystal.wizardry.setup.registries.ModBlocks;
import com.crystal.wizardry.setup.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

/**
 * @see net.minecraft.data.loot.packs.VanillaBlockLoot VanillaBlockLoot
 */
public class ModBlockLootProvide extends FabricBlockLootTableProvider {

    public ModBlockLootProvide(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        LootItemCondition.Builder crop = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.MAGIC_CRYSTAL_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));
        this.createCropDrops(ModBlocks.MAGIC_CRYSTAL_CROP.get(), ModItems.MAGIC_CRYSTAL_SEEDS.get(), EBItems.MAGIC_CRYSTAL.get(), crop);
    }
}
