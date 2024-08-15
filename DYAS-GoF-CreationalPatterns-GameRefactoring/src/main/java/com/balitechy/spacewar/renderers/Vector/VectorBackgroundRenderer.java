package com.balitechy.spacewar.renderers.Vector;

import com.balitechy.spacewar.renderers.interfaces.BackgroundRenderer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

public class VectorBackgroundRenderer implements BackgroundRenderer {
    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.GREEN);
        g.drawLine(0, c.getHeight() / 2, c.getWidth(), c.getHeight() / 2);
    }
}
