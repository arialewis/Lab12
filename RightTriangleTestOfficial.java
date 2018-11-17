
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Right Triangle
 * 
 * @author Stephen and Aria Lewis
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    // Setup
    private static RightTriangle d1 = new RightTriangle(new Point(100, 100), 50, 40, Color.BLACK, true);
       
    private static Point v = new Point(100, 100);
    private static Point b = new Point(100 + 50, 100);
    private static Point h = new Point(100 + 50, 100 - 40); 
    
    private static RightTriangle d2 = new RightTriangle(new Point(150, 150), 50, 40, Color.CYAN, false);
    
    private static Point v2 = new Point(150, 150);
    private static Point b2 = new Point(150 + 50, 150);
    private static Point h2 = new Point(150 + 50, 150 - 40); 

    /**
     * Verify the points defining the RightTriangle are determined correctly
     * The vertex locations, edge length, color, and fill flag
     */
    @Test
    public void testRightTriangleConstructorComputedPoints()
    {
        Point[] pts1 = d1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the RightTriangle is centered "
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, v, 1));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the RightTriangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, b, 1));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the RightTriangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, h, 1));
        
        Point[] pts2 = d2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the RightTriangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, v2, 1));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the RightTriangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, b2, 1));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the RightTriangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, h2, 1));
    }
    
    /**
     * Verify the RightTriangle is appropriately filled or not
     */
    @Test
    public void testRightTriangleConstructorFilled()
    {
        Assert.assertTrue("RightTriangle fill incorrect.", d1.isFilled());
        Assert.assertFalse("RightTriangle fill incorrect.", d2.isFilled());
    }
    
    /**
     * Verify the RightTriangle has been alloted the appropriate color
     */
    @Test
    public void testRConstructorColor()
    {
        Color clr1 = d1.getColor();
        Color clr2 = d2.getColor();
        Assert.assertEquals("RightTriangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("RightTriangle color incorrect.", Color.CYAN, clr2);
    }

}