package com.balitechy.spacewar.renderers.Sprite;

import com.balitechy.spacewar.renderers.RendererFactory;
import com.balitechy.spacewar.renderers.interfaces.PlayerRenderer;
import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;
import com.balitechy.spacewar.renderers.interfaces.BackgroundRenderer;
import com.balitechy.spacewar.main.SpritesImageLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpritesRendererFactory implements RendererFactory {
    private SpritesImageLoader sprites;

    @Override
    public void loadResources() {
        sprites = new SpritesImageLoader("/sprites.png");
        try {
            sprites.loadImage();
        } catch (IOException ex) {
            Logger.getLogger(SpritesRendererFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new SpritePlayerRenderer(sprites);
    }

    @Override
    public BulletRenderer createBulletRenderer() {
        return new SpriteBulletRenderer(sprites);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new SpriteBackgroundRenderer(sprites);
    }
}
