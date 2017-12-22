 
import java.util.Scanner;
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
       
        ArrayList<Dragon> bragon = new ArrayList<Dragon>(); 
        int num;
        do
        {
            System.out.print("how many :");
            num = input.nextInt();
        }
        while(num <= 6);
        
          for(int i = 1; i <= num; i++){
              Dragon temp = new Dragon(90*i +25, 90*i = 50,1 , new Color(50*i, 50*i, 50*i), "#" + i);
              dragon.add(temp);
          }
          for(int i = 0; i < dragon.size(); i++){
             dragon.get(i).drawdragon(g);
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
