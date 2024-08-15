package com.balitechy.spacewar.gameobjects;

import com.balitechy.spacewar.renderers.interfaces.BulletRenderer;

import java.awt.Graphics;

public class Bullet {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private double x, y;
    private BulletRenderer renderer;

    public Bullet(double x, double y, BulletRenderer renderer) {
        this.x = x;
        this.y = y;
        this.renderer = renderer;
    }

    public void tick() {
        y -= 5; // Bullet movement logic
    }

    public void render(Graphics g) {
        renderer.render(g, x, y);
    }

    int getY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
