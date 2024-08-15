package com.balitechy.spacewar.main;

import com.balitechy.spacewar.renderers.RendererFactory;
import com.balitechy.spacewar.gameobjects.Player;
import com.balitechy.spacewar.gameobjects.BulletController;
import com.balitechy.spacewar.renderers.interfaces.BackgroundRenderer;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

    private boolean running = false;
    private Thread thread;

    private RendererFactory rendererFactory;
    private Player player;
    private BulletController bullets;

    public Game(RendererFactory rendererFactory) {
        this.rendererFactory = rendererFactory;
    }

    public void init() {
        requestFocus();
        rendererFactory.loadResources();

        player = new Player((WIDTH * SCALE - Player.WIDTH) / 2, HEIGHT * SCALE - 50, rendererFactory.createPlayerRenderer());
        bullets = new BulletController(rendererFactory.createBulletRenderer());
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        rendererFactory.createBackgroundRenderer().render(g, this);
        player.render(g);
        bullets.render(g);

        g.dispose();
        bs.show();
    }

    public static final int WIDTH = 320;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "Space War 2D";

    // Other methods like tick(), start(), stop(), run(), main() remain the same...

    void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

