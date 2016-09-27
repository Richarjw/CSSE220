package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import util.Random;

public class Mover extends Ball{
	private Color color;
	private int red;
	private int green;
	private int blue;
	private Point2D point;
	private int diameter;
	private int velocityX;
	private int velocityY;
	private double x;
	private double y;

	public Mover(BallEnvironment world) {
		super(world);
		this.red=Random.randRange(0, 255);
		this.green=Random.randRange(0, 255);
		this.blue=Random.randRange(0, 255);
		this.color= new Color (this.red,this.green,this.blue);
		this.point=world.getCenterPoint();
		super.setCenterPoint(this.point);
		this.diameter=50;
		this.velocityX=Random.randRange(-5, 5);
		this.velocityY=Random.randRange(-5,5);
		this.x=this.point.getX();
		this.y=this.point.getY();
		
		
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void updatePosition() {
		this.x=this.x+this.velocityX*1;
		this.y=this.y+this.velocityY*1;
		this.point=new Point2D.Double(this.x, this.y);
		super.setCenterPoint(this.point);
		
	}

	@Override
	public void updateSize() {
		//**ignore
		
	}

	@Override
	public void updateColor() {
		//**ignore
		
	}

	@Override
	public double getDiameter() {
		return this.diameter;
	}

}
