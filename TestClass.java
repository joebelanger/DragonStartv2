 

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
       
       vals.add(new Integer(31)); // List now: 31 
       vals.add(new Integer(41)); // List now: 31 41
       
       x = vals.get(0);  // Assigns 31 to x
       x = vals.get(1);  // Assigns 41
       x = vals.get(2);  // Assigns 59
       x = vals.get(3);  // Error: No such element
       
       // List originally: 31 41 59 
       vals.set(1, new Integer(119));  // List now 31 119 59
       
       Scene day = new Scene();
       
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
