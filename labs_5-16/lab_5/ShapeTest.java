//file ShapeTest.java
package lab_5;

import javax.swing.*;
import java.awt.*;


public class ShapeTest extends JFrame{
    public ShapeTest(){
        setSize(1300,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String a[]){
        new ShapeTest();
    }

    public void paint(Graphics g){

        for (int i = 0; i < 10; i++){
            Color col1 = new Color((int)(Math.random()*1000%256), (int)(Math.random()*1000%256), (int)(Math.random()*1000%256));
            g.setColor(col1);
            int number = (int)(Math.random()*10%3);
            switch (number){
                case 0:
                    Circle c1 = new Circle((int)(Math.random()*40+20));
                    g.fillOval((int)(Math.random()*1200), (int)(Math.random()*600), (int)(c1.getRadius()*2), (int)(c1.getRadius()*2));
                    break;
                case 1:
                    Rectangle r1 = new Rectangle((int)(Math.random()*60+30),(int)(Math.random()*60+30));
                    g.fillRect((int)(Math.random()*1200), (int)(Math.random()*600), (int)r1.getWidth(), (int)r1.getLength());
                    break;
                case 2:
                    Square s1 = new Square((int)(Math.random()*60+30));
                    g.fillRect((int)(Math.random()*1200), (int)(Math.random()*600), (int)s1.getSide(), (int)s1.getSide());
                    break;
            }
        }

    }
}
