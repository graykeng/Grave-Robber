package Screen;

import Constants.Constants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Characters cannot walk through obstacles on the map.
 */
public class Obstacle {
    private int posX;
    private int posY;
    protected BufferedImage _sprite;

    public Obstacle(int posX, int posY){
        this.posX = posX;
        this.posY = posY;

    }

    public void setSprite(char assetSpecifier) {
        this._sprite = getSprite(assetSpecifier);
    }

    /**
     *
     * @param assetSpecifier
     * @return the image for the obstacle
     */
    public BufferedImage getSprite(char assetSpecifier) {

        String imagePath = "";

        switch (assetSpecifier) {
            case Constants.GRAVE_1:
                imagePath = "/mapa/grave_1_128.png";
                break;
            case Constants.GRAVE_2:
                imagePath = "/mapa/grave_2_128.png";
                break;
            case Constants.GRAVE_3_TOP:
                imagePath = "/mapa/grave_3_top_128.png";
                break;
            case Constants.GRAVE_4_BOTTOM:
                imagePath = "/mapa/grave_3_bottom_128.png";
                break;
            case Constants.WALL_HORIZONTAL_1:
                imagePath = "/mapa/wall_horizontal_1_128.png";
                break;
            case Constants.WALL_HORIZONTAL_2:
                imagePath = "/mapa/wall_horizontal_2_128.png";
                break;
            case Constants.WALL_HORIZONTAL_3:
                imagePath = "/mapa/wall_horizontal_3_128.png";
                break;
            case Constants.WALL_HORIZONTAL_4:
                imagePath = "/mapa/wall_horizontal_4_128.png";
                break;
            case Constants.WALL_VERTICAL_1:
                imagePath = "/mapa/wall_top_32.jpg";
                break;
            case Constants.WALL_VERTICAL_2:
                imagePath = "/mapa/wall_middle_32.jpg";
                break;
            case Constants.WALL_VERTICAL_3:
                imagePath = "/mapa/wall_bottom_32.jpg";
                break;
            default:
                return null;
        }

        try {
            this._sprite = ImageIO.read(getClass().getResourceAsStream(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return _sprite;
    }

    /**
     *
     * @return x position on map
     */
    public int getPosX() {
        return posX;
    }

    /**
     *
     * @return y position on map
     */
    public int getPosY(){return posY;}

    public void draw(Graphics2D g2) {
        g2.drawImage(_sprite,posX,posY, Constants.TILE_SIZE, Constants.TILE_SIZE, null);
    }

}
