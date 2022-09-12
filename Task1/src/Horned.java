import utils.DrawingUtils;

import java.awt.*;

public class Horned extends Priest{


    public Horned(int x, int y, int height, int wight, Color skinColor, Color clothesColor, Color mantleColor, Color shadowColor, boolean flag) {
        super(x, y, height, wight, skinColor, clothesColor, mantleColor, shadowColor, flag);
    }

    void draw(Graphics2D g){
        DrawingUtils.drawHorned(g,getX(),getY(),getHeight(),getWight(),getSkinColor(),getClothesColor(),getMantleColor(),getShadowColor(),getFlag());
    }
}
