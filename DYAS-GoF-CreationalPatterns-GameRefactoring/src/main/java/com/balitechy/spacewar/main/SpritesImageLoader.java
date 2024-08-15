package com.balitechy.spacewar.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpritesImageLoader {

    private String path;
    private BufferedImage image;

    public SpritesImageLoader(String path) {
        this.path = path;
    }

    public BufferedImage loadImage() throws IOException {
        // Asegúrate de que la ruta es la correcta
        image = ImageIO.read(getClass().getResource(path));
        return image;
    }

    public BufferedImage getImage(int top, int left, int width, int height) {
        if (image == null) {
            throw new IllegalStateException("Image has not been loaded.");
        }
        return image.getSubimage(left, top, width, height);
    }
}
