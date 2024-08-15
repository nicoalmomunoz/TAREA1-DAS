package com.balitechy.spacewar.gameobjects;

import com.balitechy.spacewar.renderers.interfaces.PlayerRenderer;

import java.awt.Graphics;

public class Player {
    public static final int WIDTH = 32;
    public static final int HEIGHT = 32;
    private double x, y;
    private PlayerRenderer renderer;

    public Player(double x, double y, PlayerRenderer renderer) {
        this.x = x;
        this.y = y;
        this.renderer = renderer;
    }

    public void tick() {
        // Game logic for player
    }

    public void render(Graphics g) {
        renderer.render(g, x, y);
    }
}
