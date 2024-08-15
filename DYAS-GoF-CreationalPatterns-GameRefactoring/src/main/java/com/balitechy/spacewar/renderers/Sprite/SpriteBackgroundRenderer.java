package com.balitechy.spacewar.renderers.Sprite;

import com.balitechy.spacewar.renderers.interfaces.BackgroundRenderer;
import com.balitechy.spacewar.main.SpritesImageLoader;

import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.image.BufferedImage;

public class SpriteBackgroundRenderer implements BackgroundRenderer {
    private BufferedImage background;

    public SpriteBackgroundRenderer(SpritesImageLoader sprites) {
        this.background = sprites.getImage(0, 0, 640, 480);
    }

    @Override
    public void render(Graphics g, Canvas c) {
        g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
    }
}
