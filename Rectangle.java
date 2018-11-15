import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        super(color, filled);
        
        // Set the size of the point array to 4
        location = new Point[4];
        
        // Assemble the 4 points
        int yDelta = height / 2;
        int xDelta = width / 2;
        
        location[0] = new Point(center.x + yDelta, center.y + xDelta);
        location[1] = new Point(center.x + yDelta, center.y - xDelta);
        location[2] = new Point(center.x - yDelta, center.y + xDelta);
        location[3] = new Point(center.x - yDelta, center.y - xDelta);
    }
}