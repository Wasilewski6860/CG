import utils.DrawingUtils;

import java.awt.*;

public class Babka extends Human{

    private Color platockColor, yubkaColor, shoesColor;

    public Babka(int x, int y, int height, int wight, Color skinColor, Color clothesColor, boolean flag, Color platockColor, Color yubkaColor, Color shoesColor) {
        super(x, y, height, wight, skinColor, clothesColor, flag);
        this.platockColor = platockColor;
        this.yubkaColor = yubkaColor;
        this.shoesColor = shoesColor;
    }

    @Override
    void draw(Graphics2D g) {
        super.draw(g);
        DrawingUtils.drawBabka(g,getX(),getY(),getHeight(),getWight(),getSkinColor(),getClothesColor(),getPlatockColor(),getYubkaColor(),getShoesColor(),getFlag());
    }

    public Color getPlatockColor() {
        return platockColor;
    }

    public void setPlatockColor(Color platockColor) {
        this.platockColor = platockColor;
    }

    public Color getYubkaColor() {
        return yubkaColor;
    }

    public void setYubkaColor(Color yubkaColor) {
        this.yubkaColor = yubkaColor;
    }

    public Color getShoesColor() {
        return shoesColor;
    }

    public void setShoesColor(Color shoesColor) {
        this.shoesColor = shoesColor;
    }
}
