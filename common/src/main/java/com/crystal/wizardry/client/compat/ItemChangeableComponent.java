package com.crystal.wizardry.client.compat;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.ItemStack;
import vazkii.patchouli.api.IComponentRenderContext;
import vazkii.patchouli.api.ICustomComponent;
import vazkii.patchouli.api.IVariable;

import java.util.function.UnaryOperator;

public class ItemChangeableComponent implements ICustomComponent {
    private transient int x, y;
    public float scale = 1F;
    public IVariable item;

    private boolean framed;
    private transient ItemStack[] items;

    @Override
    public void build(int componentX, int componentY, int pageNum) {
        x = componentX;
        y = componentY;
    }

    @Override
    public void render(GuiGraphics graphics, IComponentRenderContext context, float pick, int mouseX, int mouseY) {
        if (scale == 0) return;

        if (framed) {
            RenderSystem.enableBlend();
            graphics.setColor(1F, 1F, 1F, 1F);
            graphics.blit(context.getCraftingTexture(), x, y, 20, 102, 26, 26, 128, 256);
        }

        graphics.pose().pushPose();
        graphics.pose().translate(x, y, 0);
        // 物品放大或缩小，默认为100%
        graphics.pose().scale(scale, scale, scale);
        graphics.setColor(1F, 1F, 1F, 1F);
        // 绘制物品
        context.renderItemStack(graphics, x, y, mouseX, mouseY, items[(context.getTicksInBook() / 20) % items.length]);
        graphics.pose().popPose();
    }

    @Override
    public void onVariablesAvailable(UnaryOperator<IVariable> lookup) {
        items = lookup.apply(item).as(ItemStack[].class);
    }
}
