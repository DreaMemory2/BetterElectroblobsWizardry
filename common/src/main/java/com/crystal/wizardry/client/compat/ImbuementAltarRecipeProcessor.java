package com.crystal.wizardry.client.compat;

import com.binaris.wizardry.content.recipe.ImbuementAltarRecipe;
import com.binaris.wizardry.setup.registries.EBRecipeTypes;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariable;
import vazkii.patchouli.api.IVariableProvider;

public class ImbuementAltarRecipeProcessor implements IComponentProcessor {
    private Recipe<?> recipe;

    @Override
    public void setup(Level level, IVariableProvider variables) {
        ResourceLocation recipeId = new ResourceLocation(variables.get("recipe").asString());
        // 获取配方
        this.recipe = level.getRecipeManager()
                .byKey(recipeId)
                .filter(recipe -> recipe.getType() == EBRecipeTypes.IMBUEMENT_ALTAR)
                .orElseThrow();
    }

    @Override
    public @NotNull IVariable process(Level level, String key) {
        if (this.recipe instanceof ImbuementAltarRecipe imbuementAltar) {
            // 输入四个材料
            NonNullList<Ingredient> receptacleIngredients = imbuementAltar.getReceptacleIngredients();
            // 中心的材料
            Ingredient centerIngredient = imbuementAltar.getCenterIngredient();
            // 输出材料
            ItemStack outputStack = imbuementAltar.getResultItem(level.registryAccess());

            switch(key) {
                case "input1" :
                    return IVariable.from(getItem(receptacleIngredients, 0));
                case "input2" :
                    return IVariable.from(getItem(receptacleIngredients, 1));
                case "input3" :
                    return IVariable.from(getItem(receptacleIngredients, 2));
                case "input4" :
                    return IVariable.from(getItem(receptacleIngredients, 3));
                case "center" :
                    ItemStack inputStack = centerIngredient.getItems()[0].copy();
                    return IVariable.from(inputStack);
                case "output" :
                    return IVariable.from(outputStack);
            }
        }
        return null;
    }

    public ItemStack getItem(NonNullList<Ingredient> items, int slot) {
        return items.get(slot).getItems()[0].copy();
    }
}
