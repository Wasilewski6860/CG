package utils;

import java.awt.*;

public class DrawingUtils {
    enum POSES{

    }
    public static void drawSun(Graphics2D g, int x, int y, int r, int length, int n, Color c) {
        g.setColor(c);
        g.fillOval(x, y, 2*r, 2*r);

        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = r * Math.cos(a) + x + r;
            double y1 = r * Math.sin(a) + y + r;
            double x2 = (r+length) * Math.cos(a) + x + r;
            double y2 = (r+length) * Math.sin(a) + y + r;
            g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }

    }

    public static void drawHorned(Graphics2D g, int  x,int y,int height, int wight, Color skinColor,
                                  Color clothesColor,Color shirtColor,Color shadowColor,boolean flag){

        int maxWight = 19;
        int maxHeight = 52;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(clothesColor);
        g.fillRect(x,y-19*heightBasic,18*wightBasic,16*heightBasic);
        g.fillRect(x+1*wightBasic,y-22*heightBasic,16*wightBasic,20*heightBasic);
        g.fillRect(x+2*wightBasic,y-24*heightBasic,14*wightBasic,5*heightBasic);
        g.fillRect(x+3*wightBasic,y-25*heightBasic,13*wightBasic,5*heightBasic);
        g.fillRect(x+2*wightBasic,y-23*heightBasic,16*wightBasic,19*heightBasic);
        g.fillRect(x+4*wightBasic,y-26*heightBasic,11*wightBasic,3*heightBasic);
        g.fillRect(x+5*wightBasic,y-27*heightBasic,8*wightBasic,3*heightBasic);

        g.fillRect(x+5*wightBasic,y-3*heightBasic,9*heightBasic,2*heightBasic);
        g.fillRect(x+8*wightBasic,y-1*heightBasic,1*heightBasic,1*heightBasic);
        g.fillRect(x+10*wightBasic,y-1*heightBasic,3*heightBasic,1*heightBasic);

        g.fillRect(x+3*wightBasic,y-35*heightBasic,14*wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-37*heightBasic,6*wightBasic,3*heightBasic);
        g.fillRect(x+8*wightBasic,y-39*heightBasic,3*wightBasic,3*heightBasic);


        g.setColor(shirtColor);
        g.fillRect(x+6*wightBasic,y-27*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-26*heightBasic,5*wightBasic,heightBasic);
        g.fillRect(x+12*wightBasic,y-27*heightBasic,wightBasic,heightBasic);

        g.fillRect(x+7*wightBasic,y-17*heightBasic,2*wightBasic,4*heightBasic);

        g.fillRect(x+8*wightBasic,y-4*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-7*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-10*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-20*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-23*heightBasic,wightBasic,heightBasic);

        g.setColor(skinColor);
        g.fillRect(x+6*wightBasic,y-34*heightBasic,6*wightBasic,8*heightBasic);
        g.fillRect(x+10*wightBasic,y-33*heightBasic,3*wightBasic,7*heightBasic);
        g.fillRect(x+12*wightBasic,y-31*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+12*wightBasic,y-31*heightBasic,2*wightBasic,2*heightBasic);


        g.setColor(new Color(201,201,201));
        int i=0;
        if (flag) i=1;
        g.fillRect(x+10*wightBasic,y-(52+i)*heightBasic,wightBasic,52*heightBasic);
        g.fillRect(x+4*wightBasic,y-(46+i)*heightBasic,13*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-(49+i)*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-(48+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+12*wightBasic,y-(48+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-(47+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+13*wightBasic,y-(47+i)*heightBasic,1*wightBasic,heightBasic);

        g.fillRect(x+7*wightBasic,y-(45+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+13*wightBasic,y-(45+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-(44+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+12*wightBasic,y-(44+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-(43+i)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+11*wightBasic,y-(43+i)*heightBasic,1*wightBasic,heightBasic);


        g.setColor(skinColor);

        g.fillRect(x+8*wightBasic,y-17*heightBasic,3*wightBasic,4*heightBasic);
        g.fillRect(x+10*wightBasic,y-17*heightBasic,3*wightBasic,1*heightBasic);
        g.fillRect(x+10*wightBasic,y-15*heightBasic,2*wightBasic,1*heightBasic);

    }


    //Добавить некий флаг в кач-ве пост.зн-я, и в зависимости от его зн-я рисовать священника по разному, пример: с понянтой рукой или без
    public static void drawPriest(Graphics2D g, int  x,int y,int height, int wight, Color skinColor,
                                  Color clothesColor,Color mantleColor,Color shadowColor,boolean isSimplePriest) {

        int maxWight = 11;
        int maxHeight = 25;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(skinColor);
        g.fillRect(x+3*wightBasic,y-25*heightBasic,5*wightBasic,8*heightBasic);
        g.fillRect(x+0*wightBasic,y-10*heightBasic,1*wightBasic,1*heightBasic);
        g.fillRect(x+(maxWight-1)*wightBasic,y-10*heightBasic,1*wightBasic,1*heightBasic);

        g.setColor(clothesColor);
        g.fillRect(x+2*wightBasic,y-17*heightBasic,7*wightBasic,16*heightBasic);
        g.fillRect(x+1*wightBasic,y-16*heightBasic,1*wightBasic,2*heightBasic);
        g.fillRect(x+0*wightBasic,y-15*heightBasic,2*wightBasic,4*heightBasic);
        g.fillRect(x+0*wightBasic,y-12*heightBasic,1*wightBasic,3*heightBasic);

        g.fillRect(x+8*wightBasic,y-18*heightBasic,1*wightBasic,4*heightBasic);
        g.fillRect(x+8*wightBasic,y-16*heightBasic,2*wightBasic,5*heightBasic);
        g.fillRect(x+8*wightBasic,y-14*heightBasic,3*wightBasic,3*heightBasic);
        g.fillRect(x+10*wightBasic,y-14*heightBasic,1*wightBasic,5*heightBasic);

        g.setColor(skinColor);
        g.fillRect(x+0*wightBasic,y-10*heightBasic,1*wightBasic,1*heightBasic);
        g.fillRect(x+(maxWight-1)*wightBasic,y-10*heightBasic,1*wightBasic,1*heightBasic);

        g.setColor(mantleColor);
        g.fillRect(x+2*wightBasic,y-17*heightBasic,2*wightBasic,11*heightBasic);
        g.fillRect(x+6*wightBasic,y-17*heightBasic,2*wightBasic,11*heightBasic);
        g.fillRect(x+7*wightBasic,y-17*heightBasic,1*wightBasic,1*heightBasic);
        g.fillRect(x+8*wightBasic,y-18*heightBasic,1*wightBasic,1*heightBasic);

        //Hairs
        g.setColor(new Color(182,182,182));
        g.fillRect(x+7*wightBasic,y-25*heightBasic,wightBasic,3*heightBasic);

        //Eyes,shoes and arms
        g.setColor(new Color(32,32,32));
        g.fillRect(x+3*wightBasic,y-23*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+5*wightBasic,y-23*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+0*wightBasic,y-11*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+10*wightBasic,y-11*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+2*wightBasic,y-1*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-1*heightBasic,wightBasic,heightBasic);

        //Shadow on face
        g.setColor(new Color(243,190,151));
        g.fillRect(x+7*wightBasic,y-22*heightBasic,wightBasic,5*heightBasic);

        g.setColor(new Color(shadowColor.getRed()+10,shadowColor.getGreen()+10,shadowColor.getBlue()+10));
        g.fillRect(x+7*wightBasic,y-16*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-16*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-17*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-14*heightBasic,wightBasic,13*heightBasic);

        g.setColor(shadowColor);
        g.fillRect(x,y-12*heightBasic,2*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-12*heightBasic,2*wightBasic,heightBasic);

        if (!isSimplePriest){
            g.setColor(clothesColor);
            g.fillRect(x+3*wightBasic,y-27*heightBasic,5*wightBasic,2*heightBasic);
            g.fillRect(x+3*wightBasic,y-30*heightBasic,4*wightBasic,5*heightBasic);
            g.fillRect(x+3*wightBasic,y-31*heightBasic,3*wightBasic,5*heightBasic);
            g.fillRect(x+4*wightBasic,y-32*heightBasic,1*wightBasic,1*heightBasic);
        }

    }


    public static void drawParishioner(Graphics2D g, int  x,int y,int height, int wight, Color skinColor, Color clothesColor,Color hairColor,Color legsColor,Color auxColor ,boolean isHappy) {

        int maxWight = 13;
        int maxHeight = 29;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        if (!isHappy){

            g.setColor(clothesColor);
            g.fillRect(x,y-19*heightBasic,2*wightBasic,11*heightBasic);
            g.fillRect(x,y-19*heightBasic,5*wightBasic,3*heightBasic);
            g.fillRect(x+2*wightBasic,y-20*heightBasic,9*wightBasic,4*heightBasic);
            g.fillRect(x+11*wightBasic,y-19*heightBasic,2*wightBasic,11*heightBasic);

            g.setColor(skinColor);
            g.fillRect(x,y-10*heightBasic,2*wightBasic,2*heightBasic);
            // g.drawRect(x,y-10*heightBasic,2*wightBasic,2*heightBasic);
            g.fillRect(x+11*wightBasic,y-10*heightBasic,2*wightBasic,2*heightBasic);
            //g.drawRect(x+11*wightBasic,y-10*heightBasic,2*wightBasic,2*heightBasic);

            g.setColor(auxColor);
            g.fillRect(x,y-12*heightBasic,2*wightBasic,2*heightBasic);
            g.fillRect(x+11*wightBasic,y-12*heightBasic,2*wightBasic,2*heightBasic);
            //g.drawRect(x,y-12*heightBasic,2*wightBasic,2*heightBasic);
            //g.drawRect(x+11*wightBasic,y-12*heightBasic,2*wightBasic,2*heightBasic);

        }
        else {
            g.setColor(clothesColor);

            g.fillRect(x+2*wightBasic,y-32*heightBasic,2*wightBasic,13*heightBasic);
            g.fillRect(x+3*wightBasic,y-21*heightBasic,2*wightBasic,4*heightBasic);

            g.fillRect(x+11*wightBasic,y-32*heightBasic,2*wightBasic,13*heightBasic);
            g.fillRect(x+10*wightBasic,y-21*heightBasic,2*wightBasic,3*heightBasic);

            g.setColor(auxColor);
            g.fillRect(x+2*wightBasic,y-30*heightBasic,2*wightBasic,2*heightBasic);
            g.fillRect(x+11*wightBasic,y-30*heightBasic,2*wightBasic,2*heightBasic);

            g.setColor(skinColor);
            g.fillRect(x+2*wightBasic,y-32*heightBasic,2*wightBasic,2*heightBasic);
            g.fillRect(x+11*wightBasic,y-32*heightBasic,2*wightBasic,2*heightBasic);
            g.fillRect(x+3*wightBasic,y-33*heightBasic,1*wightBasic,2*heightBasic);
            g.fillRect(x+11*wightBasic,y-33*heightBasic,1*wightBasic,2*heightBasic);



        }
        g.setColor(Color.black);
        g.fillRect(x+wightBasic,y-heightBasic,4*wightBasic,heightBasic);
        g.fillRect(x+3*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);

        g.fillRect(x+8*wightBasic,y-heightBasic,4*wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);

        g.setColor(legsColor);
        g.fillRect(x+3*wightBasic,y-11*heightBasic,2*wightBasic,10*heightBasic);
        g.fillRect(x+8*wightBasic,y-11*heightBasic,2*wightBasic,10*heightBasic);
        g.fillRect(x+3*wightBasic,y-12*heightBasic,7*wightBasic,3*heightBasic);

        g.setColor(clothesColor);
        g.fillRect(x+3*wightBasic,y-19*heightBasic,7*wightBasic,9*heightBasic);



        g.setColor(skinColor);
        g.fillRect(x+6*wightBasic,y-23*heightBasic,3*wightBasic,4*heightBasic);
        g.fillRect(x+5*wightBasic,y-29*heightBasic,5*wightBasic,7*heightBasic);
        g.fillRect(x+4*wightBasic,y-28*heightBasic,7*wightBasic,5*heightBasic);

        g.setColor(hairColor);
        g.fillRect(x+4*wightBasic,y-28*heightBasic,wightBasic,2*heightBasic);
        g.fillRect(x+10*wightBasic,y-28*heightBasic,wightBasic,2*heightBasic);
        g.fillRect(x+5*wightBasic,y-29*heightBasic,5*wightBasic,2*heightBasic);

        g.setColor(auxColor);
        g.fillRect(x+6*wightBasic,y-21*heightBasic,wightBasic,2*heightBasic);
        g.fillRect(x+8*wightBasic,y-21*heightBasic,wightBasic,2*heightBasic);
        //g.drawRect(x+6*wightBasic,y-21*heightBasic,wightBasic,2*heightBasic);
        //g.drawRect(x+8*wightBasic,y-21*heightBasic,wightBasic,2*heightBasic);


        g.setColor(Color.DARK_GRAY);
        g.fillRect(x+6*wightBasic,y-26*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-26*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-24*heightBasic,wightBasic,heightBasic);
    }


    public static void drawBabka(Graphics2D g, int  x,int y,int height, int wight,
                                 Color skinColor, Color clothesColor,Color platockColor,
                                 Color yubkaColor, Color shoesColor,boolean flag) {

        //Platock
        g.setColor(platockColor);
        g.fillRect(x+4*wight/9,y,5*wight/9,2*height/17);
        g.fillRect(x+2*wight/9,y+2*height/17,4*wight/9,3*height/17);
        g.fillRect(x,y+3*height/17,2*wight/9,2*height/17);
        g.fillRect(x+6*wight/9,y+4*height/17,3*wight/9,height/17);
        //Body
        g.setColor(clothesColor);
        g.fillRect(x,y+5*height/17,wight,7*height/17);
        //Skirt
        g.setColor(yubkaColor);
        g.fillRect(x,y+12*height/17,wight,5*height/17);
        //Face
        g.setColor(skinColor);
        g.fillRect(x+wight-3*wight/9,y+2*height/17,3*wight/9,2*height/17);

        if (flag){
            //Legs
            g.setColor(shoesColor);
            g.fillRect(x+wight/9,y+17*height/17,3*wight/9,height/17);
            //Hands
            g.setColor(skinColor);
            g.fillRect(x+8*wight/9,y+6*height/17,2*wight/9,2*height/17);
        }
        else{
            //Legs
            g.setColor(shoesColor);
            g.fillRect(x+5*wight/9,y+17*height/17,3*wight/9,height/17);
            //Hands
            g.setColor(skinColor);
            g.fillRect(x+6*wight/9,y+6*height/17,2*wight/9,2*height/17);
            g.fillRect(x+wight,y+6*height/17,wight/9,2*height/17);
        }


    }

    public static void drawBuilding(Graphics2D g, int  x,int y,int height, int wight,
                                    Color roofColor, Color mainColor){

        int maxWight =25;
        int maxHeight = 27;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(roofColor);
        g.fillRect(x+(12)*heightBasic,y-height,wightBasic,heightBasic);
        g.fillRect(x+11*wightBasic,y-(maxHeight-1)*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-(maxHeight-2)*heightBasic,7*wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-(maxHeight-3)*heightBasic,9*wightBasic,heightBasic);
        g.fillRect(x+6*wightBasic,y-(maxHeight-4)*heightBasic,13*wightBasic,heightBasic);
        g.fillRect(x+5*wightBasic,y-(maxHeight-5)*heightBasic,15*wightBasic,2*heightBasic);
        g.fillRect(x+6*wightBasic,y-(maxHeight-7)*heightBasic,13*wightBasic,heightBasic);
        g.setColor(mainColor);
        g.fillRect(x+7*wightBasic,y-(maxHeight-8)*heightBasic,11*wightBasic,3*heightBasic);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x+4*wightBasic,y-(maxHeight-11)*heightBasic,17*wightBasic,heightBasic);
        g.setColor(mainColor);
        g.fillRect(x+3*wightBasic,y-(maxHeight-12)*heightBasic,19*wightBasic,heightBasic);
        g.fillRect(x+1*wightBasic,y-(maxHeight-13)*heightBasic,23*wightBasic,heightBasic);
        // g.fillRect(x+1*wightBasic,y-(maxHeight-13)*heightBasic,23*wightBasic,heightBasic);
        g.fillRect(x,y-(maxHeight-14)*heightBasic,wight,11*heightBasic);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x+1*wightBasic,y-(maxHeight-15)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+0*wightBasic,y-(maxHeight-16)*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x+0*wightBasic,y-(maxHeight-17)*heightBasic,4*wightBasic,8*heightBasic);

        g.fillRect(x+(maxWight-2)*wightBasic,y-(maxHeight-15)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+(maxWight-3)*wightBasic,y-(maxHeight-16)*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x+(maxWight-4)*wightBasic,y-(maxHeight-17)*heightBasic,4*wightBasic,8*heightBasic);

        g.fillRect(x+11*wightBasic,y-(maxHeight-14)*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x+10*wightBasic,y-(maxHeight-15)*heightBasic,5*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-(maxHeight-16)*heightBasic,7*wightBasic,heightBasic);
        g.fillRect(x+8*wightBasic,y-(maxHeight-17)*heightBasic,9*wightBasic,8*heightBasic);

        g.setColor(Color.GRAY);
        g.fillRect(x+11*wightBasic,y-(maxHeight-15)*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x+10*wightBasic,y-(maxHeight-16)*heightBasic,5*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-(maxHeight-17)*heightBasic,7*wightBasic,8*heightBasic);


    }

    public static void drawColumn(Graphics2D g, int  x,int y,int height, int wight, Color color){

        int maxWight =11;
        int maxHeight = 32;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(Color.GRAY);
        g.fillRect(x,y-heightBasic,wight,heightBasic);
        // g.setColor(Color.GRAY);
        g.fillRect(x+wightBasic,y-2*heightBasic,9*wightBasic,heightBasic);
        g.fillRect(x+2*wightBasic,y-3*heightBasic,7*wightBasic,heightBasic);
        g.setColor(color);
        g.fillRect(x+3*wightBasic,y-29*heightBasic,5*wightBasic,26*heightBasic);
        g.setColor(Color.GRAY);
        g.fillRect(x+2*wightBasic,y-30*heightBasic,7*wightBasic,1*heightBasic);
        g.fillRect(x+1*wightBasic,y-31*heightBasic,9*wightBasic,1*heightBasic);
        g.fillRect(x,y-32*heightBasic,wight,1*heightBasic);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x+4*wightBasic,y-29*heightBasic,wightBasic,26*heightBasic);
        g.fillRect(x+6*wightBasic,y-29*heightBasic,wightBasic,26*heightBasic);

    }

    public static void drawCarpet(Graphics2D g, int  x,int y,int height, int wight, Color color){

        int maxWight =35;
        int maxHeight = 9;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(new Color(255, 215, 0));
        g.fillRect(x,y-9*heightBasic,35*wightBasic,9*heightBasic);
        g.fillRect(x,y-heightBasic,wight,heightBasic);
        g.setColor(color);
        g.fillRect(x,y-8*heightBasic,wight,7*heightBasic);
        g.setColor(new Color(255, 215, 0));
        g.fillRect(x,y-height,wight,heightBasic);
        g.setColor(Color.BLACK);
        g.drawRect(x,y-height,wight,height);

    }

    public static void drawSign(Graphics2D g, int  x,int y,int height, int wight
            , Color mainColor, Color auxColor, Color textColor
    ){

        //hallelujah

        int maxWight =15;
        int maxHeight = 7;

        int stringHeight = 10;
        int stringWight = 10;

        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(auxColor);
       // g.drawLine();

        g.fillArc(x,y-2*heightBasic,2*wightBasic,2*heightBasic,180,90);
        g.fillArc(x,y-maxHeight*heightBasic,2*wightBasic,2*heightBasic,90,90);
        g.fillArc(x+13*wightBasic,y-maxHeight*heightBasic,2*wightBasic,2*heightBasic,0,90);
        g.fillArc(x+13*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic,270,90);

        g.fillRect(x+14*wightBasic,y-6*heightBasic,wightBasic,5*heightBasic);
        g.fillRect(x,y-6*heightBasic,wightBasic,5*heightBasic);
        g.fillRect(x+wightBasic,y-1*heightBasic,13*wightBasic,1*heightBasic);
        g.fillRect(x+wightBasic,y-7*heightBasic,13*wightBasic,1*heightBasic);


        g.setColor(mainColor);
        g.fillRect(x+wightBasic,y-6*heightBasic,13*wightBasic,5*heightBasic);

        g.setColor(auxColor);
        g.fillOval(x+wightBasic,y-6*heightBasic,2*wightBasic,5*heightBasic);
        g.fillOval(x+12*wightBasic,y-6*heightBasic,2*wightBasic,5*heightBasic);

        g.setColor(textColor);
        g.drawOval(x+wightBasic,y-6*heightBasic,2*wightBasic,5*heightBasic);
        g.drawOval(x+12*wightBasic,y-6*heightBasic,2*wightBasic,5*heightBasic);

        drawAlleluia(g,x+4*wightBasic,y-heightBasic,5*heightBasic,8*wightBasic,textColor);

    }


    static void drawAlleluia(Graphics2D g, int x, int y, int height, int wight, Color color){

        int maxWight =27;
        int maxHeight = 10;

        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(color);
        g.fillRect(x,y-9*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+wightBasic,y-maxHeight*heightBasic,3*wightBasic,heightBasic);
        g.fillRect(x,y-6*heightBasic,5*wightBasic,heightBasic);
        g.fillRect(x+6*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+9*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+12*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+12*wightBasic,y-maxHeight*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+12*wightBasic,y-6*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+15*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+19*wightBasic,y-2*heightBasic,2*wightBasic,2*heightBasic);
        g.fillRect(x+22*wightBasic,y-maxHeight*heightBasic,1*wightBasic,1*heightBasic);
        g.fillRect(x+25*wightBasic,y-maxHeight*heightBasic,1*wightBasic,2*heightBasic);
        g.fillRect(x+25*wightBasic,y-5*heightBasic,1*wightBasic,1*heightBasic);

        g.fillRect(x+4*wightBasic,y-9*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+6*wightBasic,y-10*heightBasic,wightBasic,10*heightBasic);
        g.fillRect(x+9*wightBasic,y-10*heightBasic,wightBasic,10*heightBasic);
        g.fillRect(x+12*wightBasic,y-10*heightBasic,wightBasic,10*heightBasic);
        g.fillRect(x+15*wightBasic,y-10*heightBasic,wightBasic,10*heightBasic);
        g.fillRect(x+18*wightBasic,y-10*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+20*wightBasic,y-10*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+22*wightBasic,y-8*heightBasic,wightBasic,8*heightBasic);
        g.fillRect(x+24*wightBasic,y-9*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+26*wightBasic,y-9*heightBasic,wightBasic,9*heightBasic);


    }

    public static void drawWindow(Graphics2D g, int  x,int y,int height, int wight, Color color){

        int maxWight =11;
        int maxHeight = 19;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;

        g.setColor(Color.CYAN);
        g.fillRect(x+wightBasic,y-16*heightBasic,9*wightBasic,15*heightBasic);
        g.fillRect(x+2*wightBasic,y-17*heightBasic,7*wightBasic,3*heightBasic);
        g.fillRect(x+3*wightBasic,y-18*heightBasic,5*wightBasic,3*heightBasic);

        g.setColor(color);
        g.fillRect(x,y-heightBasic,wight,heightBasic);
        g.fillRect(x,y-10*heightBasic,wight,heightBasic);
        g.fillRect(x+wightBasic,y-17*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+2*wightBasic,y-18*heightBasic,wightBasic,heightBasic);

        g.fillRect(x+3*wightBasic,y-19*heightBasic,5*wightBasic,heightBasic);

        g.fillRect(x+8*wightBasic,y-18*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-17*heightBasic,wightBasic,heightBasic);

        g.fillRect(x,y-16*heightBasic,wightBasic,16*heightBasic);
        g.fillRect(x+10*wightBasic,y-17*heightBasic,wightBasic,17*heightBasic);
        g.fillRect(x+5*wightBasic,y-18*heightBasic,wightBasic,17*heightBasic);


    }


    public static void drawPodium(Graphics2D g, int  x,int y,int height, int wight, Color mainColor, Color auxColor){

        int maxWight =15;
        int maxHeight = 19;
        int heightBasic =height/maxHeight;
        int wightBasic = wight/maxWight;


        g.setColor(mainColor);
        g.fillRect(x+1*wightBasic,y-17*heightBasic,19*wightBasic,9*heightBasic);



        g.setColor(auxColor);
        g.fillRect(x,y-17*heightBasic,wightBasic,10*heightBasic);

        g.fillRect(x+wightBasic,y-17*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+2*wightBasic,y-16*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+3*wightBasic,y-15*heightBasic,2*wightBasic,heightBasic);
        g.fillRect(x+5*wightBasic,y-14*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+6*wightBasic,y-13*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-12*heightBasic,2*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-11*heightBasic,1*wightBasic,heightBasic);

        g.fillRect(x+10*wightBasic,y-10*heightBasic,1*wightBasic,10*heightBasic);
        g.fillRect(x+11*wightBasic,y-11*heightBasic,7*wightBasic,1*heightBasic);
        g.fillRect(x+18*wightBasic,y-12*heightBasic,6*wightBasic,1*heightBasic);
        g.fillRect(x+24*wightBasic,y-12*heightBasic,1*wightBasic,11*heightBasic);
        g.fillRect(x+11*wightBasic,y-1*heightBasic,7*wightBasic,1*heightBasic);
        g.fillRect(x+18*wightBasic,y-2*heightBasic,7*wightBasic,1*heightBasic);

        g.fillRect(x+wightBasic,y-(17-10)*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+2*wightBasic,y-(16-10)*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+3*wightBasic,y-(15-10)*heightBasic,2*wightBasic,heightBasic);
        g.fillRect(x+5*wightBasic,y-(14-10)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+6*wightBasic,y-(13-10)*heightBasic,1*wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-(12-10)*heightBasic,2*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-(11-10)*heightBasic,1*wightBasic,heightBasic);

        g.fillRect(x+2*wightBasic,y-18*heightBasic,10*wightBasic,heightBasic);
        g.fillRect(x+12*wightBasic,y-height,7*wightBasic,heightBasic);

        g.fillRect(x+19*wightBasic,y-18*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+20*wightBasic,y-17*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+21*wightBasic,y-16*heightBasic,wightBasic,heightBasic);
        g.fillRect(x+22*wightBasic,y-15*heightBasic,wightBasic,2*heightBasic);
        g.fillRect(x+23*wightBasic,y-13*heightBasic,wightBasic,1*heightBasic);

        g.setColor(mainColor);
        //Сделать циклом
        g.fillRect(x+1*wightBasic,y-16*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+2*wightBasic,y-15*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+3*wightBasic,y-14*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+4*wightBasic,y-14*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+5*wightBasic,y-13*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+6*wightBasic,y-12*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+7*wightBasic,y-11*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+8*wightBasic,y-11*heightBasic,wightBasic,9*heightBasic);
        g.fillRect(x+9*wightBasic,y-10*heightBasic,wightBasic,9*heightBasic);

        g.fillRect(x+11*wightBasic,y-10*heightBasic,7*wightBasic,9*heightBasic);
        g.fillRect(x+18*wightBasic,y-11*heightBasic,6*wightBasic,9*heightBasic);

        g.fillRect(x+12*wightBasic,y-18*heightBasic,7*wightBasic,heightBasic);
        g.fillRect(x+12*wightBasic,y-18*heightBasic,7*wightBasic,6*heightBasic);
        g.fillRect(x+19*wightBasic,y-16*heightBasic,2*wightBasic,4*heightBasic);
        g.fillRect(x+19*wightBasic,y-15*heightBasic,3*wightBasic,3*heightBasic);

        g.fillRect(x+2*wightBasic,y-17*heightBasic,18*wightBasic,heightBasic);
        g.fillRect(x+3*wightBasic,y-16*heightBasic,18*wightBasic,heightBasic);
        g.fillRect(x+5*wightBasic,y-15*heightBasic,17*wightBasic,heightBasic);
        g.fillRect(x+6*wightBasic,y-14*heightBasic,16*wightBasic,heightBasic);
        g.fillRect(x+7*wightBasic,y-13*heightBasic,16*wightBasic,heightBasic);
        g.fillRect(x+9*wightBasic,y-12*heightBasic,9*wightBasic,heightBasic);
        g.fillRect(x+10*wightBasic,y-11*heightBasic,1*wightBasic,heightBasic);


    }

}
