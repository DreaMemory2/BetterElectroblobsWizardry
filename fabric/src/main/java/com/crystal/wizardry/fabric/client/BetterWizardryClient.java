package com.crystal.wizardry.fabric.client;

import com.crystal.wizardry.setup.registries.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class BetterWizardryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGIC_CRYSTAL_CROP.get(), RenderType.cutout());
    }
}
