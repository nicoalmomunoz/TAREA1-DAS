package com.balitechy.spacewar.renderers.Vector;

import com.balitechy.spacewar.renderers.RendererFactory;
import com.balitechy.spacewar.renderers.interfaces.PlayerRenderer;
import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;
import com.balitechy.spacewar.renderers.interfaces.BackgroundRenderer;

public class VectorRendererFactory implements RendererFactory {
    @Override
    public void loadResources() {
        // No resources to load for vector rendering
    }

    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new VectorPlayerRenderer();
    }

    @Override
    public BulletRenderer createBulletRenderer() {
        return new VectorBulletRenderer();
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new VectorBackgroundRenderer();
    }
}
