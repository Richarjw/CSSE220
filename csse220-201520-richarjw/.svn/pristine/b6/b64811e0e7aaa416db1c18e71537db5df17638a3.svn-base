import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Point;

/**
 * Draw a spaceship
 * 
 * This is the class that you should change.
 * 
 * @author you (and Buffalo)
 *
 */
public class DrawingSpaceship {

	private static final int WIDTH = 20;
	private static final int HEIGHT = 40;
	private static final Color SHIP_COLOR = Color.blue;
	private int xVal = 0;
	private int yVal = 0;
	Graphics2D g;
	Polygon py = new Polygon();
	/**
	 * This is the constructor for a spaceship. It gives the spaceship
	 * its x and y coordinates
	 *
	 * @param x
	 * @param y
	 */
	public DrawingSpaceship(int x, int y)
	{
		this.xVal = x;
		this.yVal = y;
	}
	
	/**
	 * Draws the spaceship
	 * 
	 * @param g the graphics object to draw on
	 */
	public void drawOn() {

		// just an example, to give your a feel how to draw the spaceship
		// you'll have to modify this code heavily
		py.addPoint(this.xVal, this.yVal-HEIGHT/2);
		py.addPoint(this.xVal-WIDTH/2,this.yVal+HEIGHT/2);
		py.addPoint(this.xVal+WIDTH/2, this.yVal+HEIGHT/2);
		g.setColor(SHIP_COLOR);
		g.fill(py);
		
	}
	/**
	 * SetRotation is supposed to rotate the polygon created
	 * and rotate it clockwise given the degrees. I ran out of time
	 * when I noticed that I actually had to create the translation
	 * rather than look for multiple 
	 *
	 * @param degrees
	 */
	public void setRotation( double degrees)
	{
		py.addPoint(this.xVal, this.yVal-HEIGHT/2);
		py.addPoint(this.xVal-WIDTH/2,this.yVal+HEIGHT/2);
		py.addPoint(this.xVal+WIDTH/2, this.yVal+HEIGHT/2);
		g.setColor(SHIP_COLOR);
		g.fill(py);
		py.rotate(degrees);
	}
	
	/**
	 * This method moves the polygon to the next space. the method itself
	 * works in theory, but I couldn't figure out how to get it to take
	 * a point.... 
	 *
	 */
	public void moveTo(Point p = new Point())
	{
		int tempX = this.xVal;
		int tempY = this.yVal;
		this.xVal = point.getX();
		this.yVal = point.getY();
		py.drawOn();
		g.drawLine(tempX,tempY,xVal,yVal);
	}
	
	
}
