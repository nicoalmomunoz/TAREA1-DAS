package com.balitechy.spacewar.gameobjects;

import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;

import java.awt.Graphics;
import java.util.LinkedList;

public class BulletController {
    private LinkedList<Bullet> bullets = new LinkedList<>();
    private BulletRenderer renderer;

    public BulletController(BulletRenderer renderer) {
        this.renderer = renderer;
    }

    public void tick() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            bullet.tick();

            if (bullet.getY() < 0) {
                bullets.remove(bullet);
            }
        }
    }

    public void render(Graphics g) {
        for (Bullet bullet : bullets) {
            bullet.render(g);
        }
    }

    public void addBullet(Bullet bullet) {
        bullets.add(bullet);
    }

    public LinkedList<Bullet> getBullets() {
        return bullets;
    }
}
