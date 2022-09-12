package buildings;

import utils.DrawingUtils;

import java.awt.*;

public class Building {
    private int x,y,height,wight;
    private Color auxColor,mainColor;

    public Building(int x, int y, int height, int wight, Color roofColor, Color mainColor) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.wight = wight;
        this.auxColor = roofColor;
        this.mainColor = mainColor;
    }

    public void draw(Graphics2D graphics2D){

        DrawingUtils.drawBuilding(graphics2D,x,y,height,wight, auxColor,mainColor);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public Color getAuxColor() {
        return auxColor;
    }

    public void setAuxColor(Color auxColor) {
        this.auxColor = auxColor;
    }

    public Color getMainColor() {
        return mainColor;
    }

    public void setMainColor(Color mainColor) {
        this.mainColor = mainColor;
    }
}
