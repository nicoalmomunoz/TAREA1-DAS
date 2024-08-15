package com.balitechy.spacewar.renderers;

import com.balitechy.spacewar.renderers.interfaces.PlayerRenderer;
import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;
import com.balitechy.spacewar.renderers.interfaces.BackgroundRenderer;

public interface RendererFactory {
    void loadResources();
    PlayerRenderer createPlayerRenderer();
    BulletRenderer createBulletRenderer();
    BackgroundRenderer createBackgroundRenderer();
}
