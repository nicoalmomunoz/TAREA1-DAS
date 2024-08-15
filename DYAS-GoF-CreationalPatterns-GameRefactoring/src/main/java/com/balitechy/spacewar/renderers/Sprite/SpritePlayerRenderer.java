package com.balitechy.spacewar.renderers.Sprite;

import com.balitechy.spacewar.gameobjects.Player;
import com.balitechy.spacewar.renderers.interfaces.PlayerRenderer;
import com.balitechy.spacewar.main.SpritesImageLoader;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritePlayerRenderer implements PlayerRenderer {
    private BufferedImage image;

    public SpritePlayerRenderer(SpritesImageLoader sprites) {
        this.image = sprites.getImage(219, 304, Player.WIDTH, Player.HEIGHT);
    }

    @Override
    public void render(Graphics g, double x, double y) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
