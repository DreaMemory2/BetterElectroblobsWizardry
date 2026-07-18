package com.crystal.wizardry.fabric.datagen;

import com.binaris.wizardry.setup.registries.EBBlocks;
import com.binaris.wizardry.setup.registries.EBItems;
import com.crystal.wizardry.setup.registries.ModItemTags;
import com.crystal.wizardry.setup.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class ModRecipeProvide extends FabricRecipeProvider {

    public ModRecipeProvide(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Astral Diamond
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ASTRAL_DIAMOND.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ASTRAL_DIAMOND_SHARD.get())
                .unlockedBy("has_astral_diamond_shard", has(ModItems.ASTRAL_DIAMOND_SHARD.get()))
                .save(consumer, "astral_diamond_1");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ASTRAL_DIAMOND.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', EBItems.MAGIC_CRYSTAL.get())
                .define('B', Items.DIAMOND)
                .define('C', ModItemTags.SPECTRAL_DUST)
                .define('D', EBItems.MAGIC_CRYSTAL_GRAND.get())
                .unlockedBy("has_magic_crystal_grand", has(EBItems.MAGIC_CRYSTAL_GRAND.get()))
                .save(consumer, "astral_diamond_2");
        // Astral Diamond SHARD
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ASTRAL_DIAMOND_SHARD.get(), 9)
                .requires(EBItems.ASTRAL_DIAMOND.get())
                .unlockedBy("has_astral_diamond", has(EBItems.ASTRAL_DIAMOND.get()))
                .save(consumer, "astral_diamond_shard");
        // 净化圣水 Purifying Elixir
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.PURIFYING_ELIXIR.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', EBItems.MAGIC_CRYSTAL_HEALING.get())
                .define('B', EBItems.SMALL_MANA_FLASK.get())
                .unlockedBy("has_magic_crystal_healing", has(EBItems.MAGIC_CRYSTAL_HEALING.get()))
                .unlockedBy("has_small_mana_flask", has(EBItems.SMALL_MANA_FLASK.get()))
                .save(consumer, "purifying_elixir_1");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.PURIFYING_ELIXIR.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', EBItems.MAGIC_CRYSTAL_HEALING.get())
                .define('B', Items.GOLDEN_APPLE)
                .define('C', Items.GOLDEN_CARROT)
                .define('D', EBItems.ASTRAL_DIAMOND.get())
                .define('E', EBItems.MEDIUM_MANA_FLASK.get())
                .unlockedBy("has_magic_crystal_healing", has(EBItems.MAGIC_CRYSTAL_HEALING.get()))
                .unlockedBy("has_medium_mana_flask", has(EBItems.MEDIUM_MANA_FLASK.get()))
                .save(consumer, "purifying_elixir_2");
        // 缈晶纹绸 Ethereal Crystal Weave
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ETHEREAL_CRYSTAL_WEAVE.get())
                .pattern("AEC")
                .pattern("BDB")
                .pattern("CEA")
                .define('A', EBItems.MAGIC_SILK.get())
                .define('B', EBItems.ASTRAL_DIAMOND.get())
                .define('C', Items.FEATHER)
                .define('D', EBItems.MEDIUM_MANA_FLASK.get())
                .define('E', ModItemTags.SPECTRAL_DUST)
                .unlockedBy("has_astral_diamond", has(EBItems.ASTRAL_DIAMOND.get()))
                .unlockedBy("has_medium_mana_flask", has(EBItems.MEDIUM_MANA_FLASK.get()))
                .save(consumer, "ethereal_crystal_weave_1");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ETHEREAL_CRYSTAL_WEAVE.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', EBItems.MAGIC_SILK.get())
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.FEATHER)
                .define('D', EBItems.CRYSTAL_SILVER_PLATING.get())
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .unlockedBy("has_crystal_silver_plating", has(EBItems.CRYSTAL_SILVER_PLATING.get()))
                .save(consumer, "ethereal_crystal_weave_2");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ETHEREAL_CRYSTAL_WEAVE.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', EBItems.MAGIC_SILK.get())
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.FEATHER)
                .define('D', EBItems.RESPLENDENT_THREAD.get())
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .unlockedBy("has_resplendent_thread", has(EBItems.RESPLENDENT_THREAD.get()))
                .save(consumer, "ethereal_crystal_weave_3");
        // 魔辉丝线 Resplendent Thread
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.RESPLENDENT_THREAD.get())
                .pattern("AEC")
                .pattern("BDB")
                .pattern("CEA")
                .define('A', Items.STRING)
                .define('B', EBItems.ASTRAL_DIAMOND.get())
                .define('C', Items.WHITE_WOOL)
                .define('D', EBItems.MEDIUM_MANA_FLASK.get())
                .define('E', ModItemTags.SPECTRAL_DUST)
                .unlockedBy("has_astral_diamond", has(EBItems.ASTRAL_DIAMOND.get()))
                .unlockedBy("has_medium_mana_flask", has(EBItems.MEDIUM_MANA_FLASK.get()))
                .save(consumer, "resplendent_thread_1");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.RESPLENDENT_THREAD.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', Items.STRING)
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.WHITE_WOOL)
                .define('D', EBItems.ETHEREAL_CRYSTAL_WEAVE.get())
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .unlockedBy("has_ethereal_crystal_weave", has(EBItems.ETHEREAL_CRYSTAL_WEAVE.get()))
                .save(consumer, "resplendent_thread_2");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.RESPLENDENT_THREAD.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', Items.STRING)
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.WHITE_WOOL)
                .define('D', EBItems.CRYSTAL_SILVER_PLATING.get())
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .unlockedBy("has_crystal_silver_plating", has(EBItems.CRYSTAL_SILVER_PLATING.get()))
                .save(consumer, "resplendent_thread_3");
        // 晶银镶板 Crystal Silver Plating
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.CRYSTAL_SILVER_PLATING.get())
                .pattern("AEC")
                .pattern("BDB")
                .pattern("CEA")
                .define('A', Items.IRON_INGOT)
                .define('B', EBItems.ASTRAL_DIAMOND.get())
                .define('C', Items.DIAMOND)
                .define('D', EBItems.MEDIUM_MANA_FLASK.get())
                .define('E', ModItemTags.SPECTRAL_DUST)
                .unlockedBy("has_astral_diamond", has(EBItems.ASTRAL_DIAMOND.get()))
                .unlockedBy("has_medium_mana_flask", has(EBItems.MEDIUM_MANA_FLASK.get()))
                .save(consumer, "crystal_silver_plating_1");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.CRYSTAL_SILVER_PLATING.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', Items.IRON_INGOT)
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.DIAMOND)
                .define('D', EBItems.ETHEREAL_CRYSTAL_WEAVE.get())
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .unlockedBy("has_ethereal_crystal_weave", has(EBItems.ETHEREAL_CRYSTAL_WEAVE.get()))
                .save(consumer, "crystal_silver_plating_2");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.CRYSTAL_SILVER_PLATING.get())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("CBA")
                .define('A', Items.IRON_INGOT)
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.DIAMOND)
                .define('D', EBItems.RESPLENDENT_THREAD.get())
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .unlockedBy("has_resplendent_thread", has(EBItems.RESPLENDENT_THREAD.get()))
                .save(consumer, "crystal_silver_plating_3");
        // 鉴定卷轴 Scroll of Identification
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.IDENTIFICATION_SCROLL.get())
                .requires(EBItems.MEDIUM_MANA_FLASK.get())
                .requires(EBItems.BLANK_SCROLL.get())
                .unlockedBy("has_medium_mana_flask", has(EBItems.MEDIUM_MANA_FLASK.get()))
                .unlockedBy("has_blank_scroll", has(EBItems.BLANK_SCROLL.get()))
                .save(consumer, "identification_scroll_1");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.IDENTIFICATION_SCROLL.get())
                .pattern("ABC")
                .pattern("EDE")
                .pattern("CBA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', EBItems.MAGIC_SILK.get())
                .define('C', ModItemTags.SPECTRAL_DUST)
                .define('D', EBItems.BLANK_SCROLL.get())
                .define('E', EBItems.SPELL_BOOK.get())
                .unlockedBy("has_blank_scroll", has(EBItems.BLANK_SCROLL.get()))
                .save(consumer, "identification_scroll_2");
        // 破损的法术书 Ruined Spell Book
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.RUINED_SPELL_BOOK.get())
                .requires(ModItemTags.SPECTRAL_DUST)
                .requires(Items.FLINT_AND_STEEL)
                .requires(Items.BOOK)
                .requires(Items.BOOK).requires(Items.BOOK).requires(Items.BOOK)
                .requires(Items.BOOK).requires(Items.BOOK).requires(Items.BOOK)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(consumer, "ruined_spell_book");
        // 奥法宝典 Tome of Arcana
        // 新手
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ADVANCED_ARCANE_TOME.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', ModItemTags.SPECTRAL_DUST)
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', EBItems.SPELL_BOOK.get())
                .unlockedBy("has_spectral_dust", has(ModItemTags.SPECTRAL_DUST))
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .save(consumer, "advanced_arcane_tome");
        // 学徒
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.APPRENTICE_ARCANE_TOME.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', ModItemTags.SPECTRAL_DUST)
                .define('B', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('C', EBItems.SPELL_BOOK.get())
                .unlockedBy("has_spectral_dust", has(ModItemTags.SPECTRAL_DUST))
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .save(consumer, "apprentice_arcane_tome");
        // 大师
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.MASTER_ARCANE_TOME.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', ModItemTags.SPECTRAL_DUST)
                .define('B', EBItems.MAGIC_CRYSTAL_GRAND.get())
                .define('C', EBItems.SPELL_BOOK.get())
                .unlockedBy("has_spectral_dust", has(ModItemTags.SPECTRAL_DUST))
                .unlockedBy("has_magic_crystal_grand", has(EBItems.MAGIC_CRYSTAL_GRAND.get()))
                .save(consumer, "master_arcane_tome");
        // 魔力储能升级 Wand Storage Upgrade
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.STORAGE_UPGRADE.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', EBItems.MEDIUM_MANA_FLASK.get())
                .define('C', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_medium_mana_flask", has(EBItems.MEDIUM_MANA_FLASK.get()))
                .save(consumer, "wand_storage_upgrade");
        // 魔力吸取升级 Wand Siphon Upgrade
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.SIPHON_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', Items.GLASS_BOTTLE)
                .define('C', Items.HOPPER)
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_hopper", has(Items.HOPPER))
                .save(consumer, "wand_siphon_upgrade");
        // 魔力凝结升级 Wand Condenser Upgrade
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.CONDENSER_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', ModItemTags.SPECTRAL_DUST)
                .define('C', EBItems.MAGIC_CRYSTAL_GRAND.get())
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_spectral_dust", has(ModItemTags.SPECTRAL_DUST))
                .save(consumer, "wand_condenser_upgrade");
        // 法术距离升级 Wand Range Upgrade
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.RANGE_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', Items.ARROW)
                .define('C', EBItems.MAGIC_CRYSTAL.get())
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_arrow", has(Items.ARROW))
                .save(consumer, "wand_range_upgrade");
        // 法术时长升级 Wand Duration Upgrade
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.DURATION_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', Items.REDSTONE)
                .define('C', Items.CLOCK)
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_clock", has(Items.CLOCK))
                .save(consumer, "wand_duration_upgrade");
        // 法术冷却升级 Wand Cooldown Upgrade
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.COOLDOWN_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.CLOCK)
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_clock", has(Items.CLOCK))
                .save(consumer, "wand_cooldown_upgrade");
        // 法术范围升级 (Wand Blast Upgrade)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.BLAST_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', Items.GLOWSTONE_DUST)
                .define('C', Items.ARROW)
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_arrow", has(Items.ARROW))
                .save(consumer, "wand_blast_upgrade");
        // 法术槽位升级 (Wand Attunement Upgrade)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.ATTUNEMENT_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', EBItems.SPELL_BOOK.get())
                .define('C', ModItemTags.SPECTRAL_DUST)
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_spectral_dust", has(ModItemTags.SPECTRAL_DUST))
                .save(consumer, "wand_attunement_upgrade");
        // 魔杖近战升级 (Wand Melee Upgrade)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.MELEE_UPGRADE.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .define('C', Items.IRON_SWORD)
                .define('D', EBItems.IDENTIFICATION_SCROLL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_iron_sword", has(Items.IRON_SWORD))
                .save(consumer, "wand_melee_upgrade");
        // 大型魔力水晶 (Grand Magic Crystal)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EBItems.MAGIC_CRYSTAL_GRAND.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', EBBlocks.MAGIC_CRYSTAL_BLOCK.get())
                .define('B', EBItems.MAGIC_CRYSTAL.get())
                .unlockedBy("has_magic_crystal_block", has(EBBlocks.MAGIC_CRYSTAL_BLOCK.get()))
                .unlockedBy("has_magic_crystal", has(EBItems.MAGIC_CRYSTAL.get()))
                .save(consumer, "magic_crystal_grand");
    }
}
