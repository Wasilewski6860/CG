import utils.DrawingUtils;

import java.awt.*;

public class Parishioner extends Human{

    Color hairColor,legsColor,auxColor;

    public Parishioner(int x, int y, int height, int wight, Color skinColor, Color clothesColor, boolean flag, Color hairColor, Color legsColor, Color auxColor) {
        super(x, y, height, wight, skinColor, clothesColor, flag);
        this.hairColor = hairColor;
        this.legsColor = legsColor;
        this.auxColor = auxColor;
    }

    void draw(Graphics2D g){
        DrawingUtils.drawParishioner(g,getX(),getY(),getHeight(),getWight(),getSkinColor(),getClothesColor(),hairColor,legsColor,auxColor,getFlag());
    }

    void resize(int oldWidth,int oldHeight, int newWidth, int newHeight){
        setX(  ( (int)(((double)newWidth/oldWidth) * getWight()) )   ) ;
        setY(  ( (int)(((double)getHeight()/oldHeight) * getHeight()) )   );
        setWight(  ( (int)(((double)newWidth/oldWidth) * getWight()) )   );
        setHeight(  ( (int)(((double)newHeight/oldHeight) * getHeight()) )   );
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Color getLegsColor() {
        return legsColor;
    }

    public void setLegsColor(Color legsColor) {
        this.legsColor = legsColor;
    }

    public Color getAuxColor() {
        return auxColor;
    }

    public void setAuxColor(Color auxColor) {
        this.auxColor = auxColor;
    }
}
