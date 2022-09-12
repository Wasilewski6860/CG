package buildings;

import java.awt.*;

public class Column extends Building{
    public Column(int x, int y, int height, int wight, Color roofColor, Color mainColor) {
        super(x, y, height, wight, roofColor, mainColor);
    }
    public void draw(Graphics2D g){
        utils.DrawingUtils.drawColumn(g,getX(),getY(),getHeight(),getWight(),getMainColor());
    }
}
