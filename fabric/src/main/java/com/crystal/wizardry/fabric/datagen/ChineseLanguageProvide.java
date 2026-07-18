package com.crystal.wizardry.fabric.datagen;

import com.crystal.wizardry.setup.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ChineseLanguageProvide extends FabricLanguageProvider {

    public ChineseLanguageProvide(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        item(builder);
        builder.add("text.ebwizardry.book.title", "巫师手札——【更好巫术学】");
        builder.add("text.ebwizardry.book.landing", "这本书介绍了数种魔法类别以及操纵这些元素的方法。我必须提醒你，这本书并不只是像现在这样看起来十分普通——当你在探索这个世界时，书中新的内容会不断地具现出来。");
    }

    protected void item(TranslationBuilder builder) {
        builder.add(ModItems.LOCKED_BOOK.get(), "上锁的书");
        builder.add(ModItems.ASTRAL_DIAMOND_SHARD.get(), "星芒宝钻碎片");
    }
}
