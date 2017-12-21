 

import java.util.ArrayList;
import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       
        ArrayList<Integer> bragon = new ArrayList<Integer>(); 
        int currBragon = bragon.get(4);
        for()
        {
            
        }
       
       Dragon jen = new Dragon();
       jen.dragonElement(g);
       jen.drawDragon(g);
       jen.textSpeech(g);
     
       System.out.println(jen);
       
       Dragon joe = new Dragon(300,300,2, Color.GREEN, "Water" , "Hello");
       joe.drawDragon(g);
       joe.dragonElement(g);
       joe.drawDragon(g);
       joe.textSpeech(g);
     
       System.out.println(joe);
       
       
    }
}
