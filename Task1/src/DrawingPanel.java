import buildings.Building;
import buildings.Column;
import utils.DrawingUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.util.Random;

import java.awt.event.MouseEvent;

public class DrawingPanel extends JPanel {

    private static final Color GROUND_COLOR1 = new Color(118, 169, 86);
    private static final Color PRIEST_SKIN_COLOR = new Color(255,197,157);
    private static final Color ARCHIPRIEST_CLOTHES_COLOR = new Color(232,232,232);
    private static final Color PRIEST_CLOTHES_COLOR = new Color(232,232,232);
    private static final Color ARCHIPRIEST_MANTLE_COLOR = new Color(245,255,156);
    private static final Color PRIEST_MANTLE_COLOR = new Color(245,255,156);
    private static final Color ARCHIPRIEST_SHADOW_COLOR = new Color(205,205,205);
    private static final Color PRIEST_SHADOW_COLOR = new Color(25,25,25);

    private int oldHeight,oldWight;

    private Sun s;
    private Priest priest;
    private Horned horned;

    private Parishioner human;

    private Priest[] priests;
    private Column[] columns;
    private Parishioner[] parishioners;

    private Timer t;
    private Timer t2;
    private Building church;

    int wight;

    private final Random rnd = new Random();

    public DrawingPanel(){

        oldHeight=getHeight();
        oldWight=getWidth();
        setSize(1920,1080);
        priest = new Priest(6*getWidth()/7,11*getHeight()/15,getHeight()/3,getWidth()/10,PRIEST_SKIN_COLOR, ARCHIPRIEST_CLOTHES_COLOR,
                ARCHIPRIEST_MANTLE_COLOR, ARCHIPRIEST_SHADOW_COLOR,false);
        horned = new Horned(0,6*getHeight()/7,getHeight()/2,getWidth()/8,
                PRIEST_SKIN_COLOR,Color.black,Color.white,Color.gray,false);

        church = new Building(300,300,300,100,Color.YELLOW,Color.white);


        priests = new Priest[3];
        for (int i = 0; i< priests.length; i++){
              priests[i]=new Priest(9*getWidth()/16+i*getWidth()/12,13*getHeight()/15+i*getHeight()/15,getHeight()/3,getWidth()/10,PRIEST_SKIN_COLOR,
                     PRIEST_CLOTHES_COLOR,PRIEST_MANTLE_COLOR,PRIEST_SHADOW_COLOR,true);
        }

        columns = new Column[4];
        for (int i = 0; i< columns.length; i++){

            columns[i]=new Column(i * (getWidth() / columns.length),getHeight()/2,getHeight()/2,getWidth()/8,Color.GRAY,Color.ORANGE);
        }
        parishioners = new Parishioner[10];
        for (int i = 0; i< parishioners.length; i++){

            parishioners[i]=new Parishioner(i * (getWidth() / parishioners.length) + getWidth()/100* rnd.nextInt(10),
                    getHeight()/2+ getWidth()/100* rnd.nextInt(10),getHeight()/6,getWidth()/14,
                    PRIEST_SKIN_COLOR,new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)),
                    true,new Color(170+rnd.nextInt(20),80+rnd.nextInt(30),0),new Color(rnd.nextInt(255),
                    rnd.nextInt(255),rnd.nextInt(255)),new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
        }

        t = new Timer(100, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {


             //   s.setX(s.getX()+2);
               // priest.setX(priest.getX()+1);
                if (horned.getX()<=7*getWidth()/16) horned.setX(horned.getX()+1);

                repaint();
            }
        });
        t2 = new Timer(500, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //priest.setFlag(!priest.getFlag());
                horned.setFlag(!horned.getFlag());
 //               human.setFlag(!human.getFlag());

               for (Parishioner parishioner : parishioners){
                   int random = rnd.nextInt(2);
                   if (random==1){
                       parishioner.setFlag(!parishioner.getFlag());
                   }
               }


                repaint();
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (t.isRunning()){

                    t.stop();
                }
                else {
                    t.start();
                }

                if (t2.isRunning()){

                    t2.stop();
                }
                else {
                    t2.start();
                }
            }
        });
    }




    @Override
    protected void paintComponent(Graphics g) {

        if (oldHeight ==0 && oldWight==0){
            oldHeight=getHeight();
            oldWight=getWidth();
        }

        if (getHeight()!=oldHeight || getWidth()!= oldWight){

          //  priest = new Priest(5*getWidth()/6,12*getHeight()/15,getHeight()/3,getWidth()/10,new Color(255,197,157),new Color(2

//            priest.setX(5*getWidth()/6);
//            priest.setY(12*getHeight()/15);
//            priest.setHeight(getHeight()/3);
//            priest.setWight(getWidth()/10);

            priest.resize(getWidth(),getHeight());

//            priest.resize(oldWight,oldHeight,getWidth(),getHeight());

            for (int i = 0; i< priests.length; i++){
              //  priests[i]=new Priest(9*getWidth()/16+i*getWidth()/12,13*getHeight()/15+i*getHeight()/15,getHeight()/3,getWidth()/10,new Color(255,197,157),
               //         new Color(38,38,38),new Color(245,255,156),new Color(25,25,25),true);

                priests[i].setX(9*getWidth()/16+i*getWidth()/12);
                priests[i].setY(13*getHeight()/15+i*getHeight()/15);
                priests[i].setHeight(getHeight()/3);
                priests[i].setWight(getWidth()/10);

              //  priests[i].resize(getWidth(),getHeight());

            }

            for (int i = 0; i< parishioners.length; i++){

//                parishioners[i]=new Parishioner(i * (getWidth() / parishioners.length) + getWidth()/100* rnd.nextInt(10),
//                        getHeight()/2+ getWidth()/100* rnd.nextInt(10),getHeight()/8,getWidth()/16,
//                        new Color(255,198,155),new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)),
//                        true,new Color(170+rnd.nextInt(20),80+rnd.nextInt(30),0),new Color(rnd.nextInt(255),
//                        rnd.nextInt(255),rnd.nextInt(255)),new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));

                parishioners[i].setX(i * (getWidth() / parishioners.length) + getWidth()/100* rnd.nextInt(10));
                parishioners[i].setY(getHeight()/2+ getWidth()/100* rnd.nextInt(10));
                parishioners[i].setHeight(getHeight()/6);
                parishioners[i].setWight(getWidth()/12);

           //     parishioners[i].resize(oldWight,oldHeight,getWidth(),getHeight());
            }

            for (int i = 0; i< columns.length; i++){


                columns[i].setX(i * (getWidth() / columns.length));
                columns[i].setY(getHeight()/2);
                columns[i].setHeight(getHeight()/2);
                columns[i].setWight(getWidth()/8);
            }

            horned.setX(  ( (int)(((double)getWidth()/oldWight) * horned.getWight()) )   ) ;
            horned.setY(  ( (int)(((double)getHeight()/oldHeight) * horned.getHeight()) )   );
            horned.setWight(  ( (int)(((double)getWidth()/oldWight) * horned.getWight()) )   );
            horned.setHeight(  ( (int)(((double)getHeight()/oldHeight) * horned.getHeight()) )   );

            System.out.printf("NewHeight"+horned.getHeight());
            oldHeight=getHeight();
            oldWight=getWidth();

        }


        Graphics2D g2d = (Graphics2D) g;
     //   System.out.println(getWidth()+" "+getHeight())  ;



      //  DrawingUtils.drawSun(g2d, 550, 90, 40, 150, 80, Color.ORANGE);
       // s.draw(g2d);


        g2d.setColor(Color.BLACK);
        g2d.drawRect(0, getHeight()/2, getWidth(), getHeight());
        g2d.setColor(new Color(254,233,180));
        g2d.fillRect(0, getHeight()/2, getWidth(), getHeight());
      //  church.draw(g2d);


        DrawingUtils.drawCarpet(g2d,0,getHeight(),getHeight()/3,getWidth(),Color.ORANGE);


        g2d.setColor(new Color(175,116,88));
        g2d.fillRect(0,0, getWidth(), getHeight()/2);
       // s.draw(g2d);

        DrawingUtils.drawWindow(g2d,3*getWidth()/20,2*getHeight()/5,getHeight()/5,getWidth()/10,Color.BLACK);
        DrawingUtils.drawWindow(g2d,8*getWidth()/20,2*getHeight()/5,getHeight()/5,getWidth()/10,Color.BLACK);
        DrawingUtils.drawWindow(g2d,13*getWidth()/20,2*getHeight()/5,getHeight()/5,getWidth()/10,Color.BLACK);

        DrawingUtils.drawPodium(g2d,3*getWidth()/4,getHeight(),getHeight()/3,getWidth()/4,new Color(185,122,87),Color.DARK_GRAY);

        for (Column col : columns){
            col.draw(g2d);
        }

        for (Parishioner parishioner : parishioners){
            parishioner.draw(g2d);
        }

       horned.draw(g2d);

      //  human.draw(g2d);

        priest.draw(g2d);


        for (Priest priest1 : priests){
            priest1.draw(g2d);
        }

        DrawingUtils.drawSign(g2d,500,500,100,400,Color.green,Color.red,Color.black);

    }
}