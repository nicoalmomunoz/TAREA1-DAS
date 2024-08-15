package com.balitechy.spacewar.renderers.Sprite;

import com.balitechy.spacewar.gameobjects.Bullet;
import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;
import com.balitechy.spacewar.main.SpritesImageLoader;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpriteBulletRenderer implements BulletRenderer {
    private BufferedImage image;

    public SpriteBulletRenderer(SpritesImageLoader sprites) {
        this.image = sprites.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
    }

    @Override
    public void render(Graphics g, double x, double y) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
