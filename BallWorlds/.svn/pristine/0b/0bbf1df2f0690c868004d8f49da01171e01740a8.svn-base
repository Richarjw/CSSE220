package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import util.Random;

/**
 * TODO Put here a description of what this class does.
 *
 * @author yangz.
 *         Created Jan 24, 2015.
 */
public class Bouncer extends AbstractBouncer{
	private Color color;
	private Point2D point;
	private int diameter;
	private int velocityX;
	private int velocityY;
	private double x;
	private double y;
	private double frameWidth;
	private double frameHeight;


	public Bouncer(BallEnvironment world) {
		super(world);
		this.color= new Color (0,255,0);
		
		this.point=world.getCenterPoint();
		super.setCenterPoint(this.point);
		this.diameter=50;
		this.velocityX=Random.randRange(-5, 5);
		this.velocityY=Random.randRange(-5,5);
		this.x=this.point.getX();
		this.y=this.point.getY();
		this.frameWidth=world.getSize().getWidth();
		this.frameHeight= world.getSize().getHeight();
		// TODO Auto-generated constructor stub.
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub.
		return this.color;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub.
		super.updatePosition();
		
		
		

		
	}

	@Override
	public void updateSize() {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void updateColor() {
		// TODO Auto-generated method stub.
	}

	@Override
	public double getDiameter() {
		// TODO Auto-generated method stub.
		return this.diameter;
	}

	
}
