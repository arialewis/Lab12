import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen and Aria Lewis
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
    // Setup
    private static Rectangle d1 = new Rectangle(new Point(100, 100), 50, 40, Color.BLACK, true);
    
    private static int delta1 = 25;
    private static int delta2 = 20;
    
    private static Point ur1 = new Point(100 + delta1, 100 + delta2);
    private static Point lr1 = new Point(100 + delta1, 100 - delta2);
    private static Point ll1 = new Point(100 - delta1, 100 - delta2);
    private static Point ul1 = new Point(100 + delta1, 100 + delta2);
    
    private static Rectangle d2 = new Rectangle(new Point(150, 150), 50, 40, Color.CYAN, false);

    private static int delta11 = 25;
    private static int delta22 = 20;
    
    private static Point ur2 = new Point(150 + delta11, 150 + delta22);
    private static Point lr2 = new Point(150 + delta11, 150 - delta22);
    private static Point ll2 = new Point(150 - delta11, 150 - delta22);
    private static Point ul2 = new Point(150 - delta11, 150 + delta22);

    /**
     * Verify the points defining the rectangle are determined correctly
     * The vertex locations, edge length, color, and fill flag
     */
    @Test
    public void testRectangleConstructorComputedPoints()
    {
        Point[] pts1 = d1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered "
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, ur1, 1));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, lr1, 1));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, ll1, 1));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts1, ul1, 1));
        
        Point[] pts2 = d2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, ur2, 1));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, lr2, 1));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, ll2, 1));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the Rectangle is centered."
                + "and uses the diagonalLength correctly.",
                ShapeUtils.pointInSet(pts2, ul2, 1));
    }
    
    /**
     * Verify the rectangle is appropriately filled or not
     */
    @Test
    public void testRectangleConstructorFilled()
    {
        Assert.assertTrue("Rectangle fill incorrect.", d1.isFilled());
        Assert.assertFalse("Rectangle fill incorrect.", d2.isFilled());
    }
    
    /**
     * Verify the rectangle has been alloted the appropriate color
     */
    @Test
    public void testRConstructorColor()
    {
        Color clr1 = d1.getColor();
        Color clr2 = d2.getColor();
        Assert.assertEquals("Rectangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Rectangle color incorrect.", Color.CYAN, clr2);
    }

}