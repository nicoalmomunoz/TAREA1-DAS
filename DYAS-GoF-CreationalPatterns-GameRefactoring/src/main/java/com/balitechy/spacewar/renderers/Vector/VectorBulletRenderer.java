package com.balitechy.spacewar.renderers.Vector;

import com.balitechy.spacewar.gameobjects.Bullet;
import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;

import java.awt.Color;
import java.awt.Graphics;

public class VectorBulletRenderer implements BulletRenderer {
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.RED);
        g.fillRect((int) x, (int) y, Bullet.WIDTH, Bullet.HEIGHT);
    }
}
