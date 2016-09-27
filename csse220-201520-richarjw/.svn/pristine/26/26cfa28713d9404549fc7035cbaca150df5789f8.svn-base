import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
/**
 * This class holds all of the methods and constructors for a face. A face has 2 eyes and a mouth.
 * It then can be translated and rotated.
 *
 * @author richarjw.
 *         Created Dec 19, 2014.
 */
public class Face {
	private double radius;
	private Color color;
	private double centerX;
	private double centerY;
	private Color outline;
	private Color eyeColor;
	private double degrees;
	
	/**
	 * This constructor sets the default face.
	 *
	 */
	public Face()
	{
		this.radius = 30;
		this.color = Color.blue;
		this.centerX = 250;
		this.centerY = 200;
		this.eyeColor = Color.red;
		this.outline = Color.green;
		this.degrees = 0;
	}	
	/**
	 * If given Parameters, this constructor sets the face
	 * to the given Parameters.
	 *
	 * @param point
	 * @param radius
	 * @param col
	 */
	
	public Face(double centerX,double centerY, double radius, Color col,Color eyeColor, Color outline,double degrees)
	{
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.color = col;
		this.eyeColor = eyeColor;
		this.outline = outline;
		this.degrees = degrees;
	}

	/**
	 * Creates the face, eyes, and mouth for the entire face. also sets given color and outline and eye color
	 * for each face. 
	 *
	 * @param graphics2
	 */
	public void drawOn(Graphics2D graphics2)
	{

		graphics2.translate(this.centerX, this.centerY);
		graphics2.rotate(this.degrees);
		graphics2.setStroke(new BasicStroke(8.0f));
		graphics2.setColor(this.outline);
		Ellipse2D.Double face = new Ellipse2D.Double(-this.radius,-this.radius,2*this.radius,2*this.radius);
		graphics2.draw(face);
		graphics2.setStroke(new BasicStroke(1.0f));
		graphics2.setColor(this.color);
		graphics2.fill(face);
		graphics2.setStroke(new BasicStroke(3.0f));
		Ellipse2D.Double leftEye = new Ellipse2D.Double(-this.radius+0.3535*this.radius, -this.radius+0.3535*this.radius,2*this.radius*0.28,2*this.radius*0.28);
		graphics2.setColor(this.eyeColor);
		//graphics2.translate(this.centerX,this.centerY);
		graphics2.fill(leftEye);
		Ellipse2D.Double rightEye = new Ellipse2D.Double(-this.radius+0.3535*this.radius+0.7071*this.radius,-this.radius + 0.3535*this.radius,2*this.radius*0.28,2*0.28*this.radius);
		graphics2.fill(rightEye);
		Arc2D.Double mouth = new Arc2D.Double(-this.radius+0.3535*this.radius, -this.radius+0.3535*this.radius,this.radius+0.3535*this.radius,this.radius+0.3535*this.radius,-15,-150,Arc2D.CHORD);
		graphics2.draw(mouth);
		graphics2.rotate(-this.degrees);
		graphics2.translate(-this.centerX,-this.centerY);
	}
	
	/**
	 * Translates the center point of the face by the given x and y values.
	 *
	 * @param translateX
	 * @param translateY
	 */
	public void translate(double translateX, double translateY)
	{
		this.centerX =  this.centerX+ translateX;
		this.centerY = this.centerY +translateY;
	}
	
	/**
	 * This Rotates the face by the given degrees by changing the double value to degrees.
	 *
	 * @param degreesToRotate
	 */
	public void rotate(double degreesToRotate)
	{
		this.degrees = this.degrees + Math.toDegrees(degreesToRotate);
	}
}
