import java.awt.*;

public class Human {

    private int x,y,height,wight;
    private Color skinColor,clothesColor;
    private boolean flag;

    public Human(int x, int y, int height, int wight, Color skinColor, Color clothesColor, boolean flag) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.wight = wight;
        this.skinColor = skinColor;
        this.clothesColor = clothesColor;
        this.flag = flag;
    }

    void draw(Graphics2D g){
        //DrawingUtils.drawParishioner(g,x,y,height,wight,skinColor,clothesColor,);
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

    public Color getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(Color skinColor) {
        this.skinColor = skinColor;
    }

    public Color getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(Color clothesColor) {
        this.clothesColor = clothesColor;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
