 

import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private int width;
    private int height;
    private Color c;
    private String attackType;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.RED; // INS comment here.
        attackType = "Fire";
    }
    public Dragon(int x,int y, int size, Color c, String attackType){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; // You saw nothing.
        this.attackType = attackType;
    }
        
    
   
    public void drawDragon(Graphics g)
    {
        g.setColor(c); // Watermelon Dragon.
        g.fillRect(x, y , size * 25, size * 25); //Draw Head
        g.fillRect(x+size * 25, y + size*25, size *60, size * 50); //Draw Body
        g.fillRect(x+size * 25, (y + size*25) + size * 50, size * 10, size * 50); //Draw Leg #1
        g.fillRect(x+size * 75, (y + size*25) + size * 50, size * 10, size * 50);
    }
    
    private void drawFire(Graphics g)
    {
        g.setColor(Color.RED);
        for(int i = 1; i <= size *5; i++)
        {
            g.fillOval(x + i * -10, y + 2 * 4, size * 25, size * 2 * 4);
        } 
        
    }
    private void drawWater(Graphics g)
    {
        g.setColor(Color.PINK);
        for(int i = 1; i <= size *5; i++)
        {
             g.fillOval(x + i * -10, y + 2 * 4, size * 25, size * 2 * 4);
        }
        
    }

    public void dragonElement(Graphics g)
    {
       if(attackType.equals ("Fire"))
       drawFire(g);
       else if(attackType.equals ("Water"))
       drawWater(g);
    }
    
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}

