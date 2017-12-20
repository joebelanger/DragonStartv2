import java.awt.*;
/**
 * Write a description of class Scene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int height;
    private int width;
    private Color horizionColor;
    private Color groundColor;
    private Color sunColor;

    /**
     * Constructor for objects of class Scene
     */
    public Scene()
    {
        // initialise instance variables
        x = 50;
        y = 60;
        this.width = width;
        this.height = height;
        horizionColor = Color.CYAN;
        groundColor = Color.GREEN;
        sunColor = Color.YELLOW;
    }

    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
