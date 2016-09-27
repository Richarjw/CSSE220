package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import util.Random;

/**
 * A ball that bounces off the walls.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class AbstractBouncer extends Ball {
	private Color color;
	private double frameWidth;
	private double frameHeight;
	private double x;
	private double y;
	private Point2D point;
	private int velocityX;
	private int velocityY;
	private int diameter;
		


	/**
	 * Constructs a abstract bouncer in the given world.
	 * 
	 * @param world
	 */
	public AbstractBouncer(BallEnvironment world) {
		super(world);
		this.frameWidth=world.getSize().getWidth();
		this.frameHeight= world.getSize().getHeight();
		this.point=world.getCenterPoint();
		this.x=this.point.getX();
		this.y=this.point.getY();
		this.velocityX=Random.randRange(-5, 5);
		this.velocityY=Random.randRange(-5,5);
		
		
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub.
		return this.color;
	}

	@Override
	public void updatePosition() {
		
		this.x=this.x+this.velocityX*1;
		this.y=this.y+this.velocityY*1;

		this.point=new Point2D.Double(this.x, this.y);
		super.setCenterPoint(this.point);
		if (this.x<=0.0 || this.x>=this.frameWidth){
			this.velocityX=-this.velocityX;
		}
		if (this.y<=0.0 || this.y>=this.frameHeight){
			this.velocityY=-this.velocityY;
		}

				
	}

	@Override
	public void updateSize() {
		// ignore;
		
	}

	@Override
	public void updateColor() {
		// ignore
		
	}

	@Override
	public double getDiameter() {
		// TODO Auto-generated method stub.
		return this.diameter;
	}
}
