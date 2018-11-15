import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Shape.
 * 
 * @author Aria Lewis
 * @version 2018-11-12
 * Lab 11
 */
public abstract class Shape implements Drawable
{
	/** Array containing the location */
	protected Point location[];
	
	/** Color of the shape */
	private Color color;
	
	/** Boolean with the state of the Shape */
	private boolean filled;


	/**
	 * Constructor for the Shape object
	 * 
	 * @param color Color of the shape
	 * @param filled A boolean, true if the shape is filled else otherwise
	 */
	public Shape(Color color, boolean filled) 
	{
		this.color = color;
		this.filled = filled;
	}

	/**
	 * Method to get the color of the Shape
	 * 
	 * @return Color of the shape
	 */
	public Color getColor()
	{
		return this.color;
	}

	/**
	 * Method to find out whether the shape is filled
	 * 
	 * @return filled A boolean, true if the shape is filled else otherwise
	 */
	public boolean isFilled()
	{
		return this.filled;
	}

	/**
	 * Method to find out the location of the shape
	 * 
	 * @return location A point array of the location of the array
	 */
	public Point[] getLocation()
	{
		return this.location;
	}
	
	
}
