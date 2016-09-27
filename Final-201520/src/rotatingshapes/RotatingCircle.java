package rotatingshapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * TODO Put here a description of what this class does.
 *
 * @author localmgr.
 *         Created Feb 25, 2015.
 */
public class RotatingCircle extends RotatingShape{
	private static final int WIDTH = 50;
	
	private int centerX;
	private int centerY;
	private Color color;
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param startingX
	 * @param startingY
	 */
	public RotatingCircle(int startingX, int startingY) {
		super(startingX, startingY);
		this.centerX = startingX;
		this.centerY = startingY;
		// TODO Auto-generated constructor stub.
	}
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fill(new Rectangle(centerX - WIDTH/2, centerY - WIDTH/2, WIDTH, WIDTH));
	}

}
