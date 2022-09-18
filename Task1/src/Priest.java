import utils.DrawingUtils;

import java.awt.*;

public class Priest extends Human {


//    public Priest(int x, int y, int height, int wight, Color skinColor, Color clothesColor,boolean flag) {
//
//        this.x = x;
//        this.y = y;
//        this.height = height;
//        this.wight = wight;
//        this.skinColor = skinColor;
//        this.clothesColor = clothesColor;
//        this.flag=flag;
//
//    }
    private Color mantleColor,shadowColor;

    public Priest(int x, int y, int height, int wight, Color skinColor, Color clothesColor,Color mantleColor, Color shadowColor, boolean flag) {
        super(x, y, height, wight, skinColor, clothesColor, flag);
        this.mantleColor = mantleColor;
        this.shadowColor = shadowColor;
    }

    @Override
    void draw(Graphics2D graphics2D){
        DrawingUtils.drawPriest(graphics2D,getX(),getY(),getHeight(),getWight(),getSkinColor(),getClothesColor(),mantleColor,shadowColor, getFlag());
    }




    public Color getMantleColor() {
        return mantleColor;
    }

    public void setMantleColor(Color mantleColor) {
        this.mantleColor = mantleColor;
    }

    void resize(int newWidth, int newHeight){
        setX(5*newWidth/6);
        setY(12*newHeight/15);
        setHeight(newHeight/3);
        setWight(newWidth/10);
    }
    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }
}
