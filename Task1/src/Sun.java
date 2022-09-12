import utils.DrawingUtils;

import java.awt.*;

public class Sun {
    private int x, y, r, length, n;
    private Color c;

    public void draw(Graphics2D g2d) {
        DrawingUtils.drawSun(g2d, x, y, r, length, n, c);
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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Sun(int x, int y, int r, int length, int n, Color c) {

        this.x = x;
        this.y = y;
        this.r = r;
        this.length = length;
        this.n = n;
        this.c = c;
    }
}
