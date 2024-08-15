package com.balitechy.spacewar.renderers.Vector;

import com.balitechy.spacewar.gameobjects.Player;
import com.balitechy.spacewar.renderers.interfaces.PlayerRenderer;

import java.awt.Color;
import java.awt.Graphics;

public class VectorPlayerRenderer implements PlayerRenderer {
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.WHITE);
        g.fillRect((int) x, (int) y, Player.WIDTH, Player.HEIGHT);
    }
}
