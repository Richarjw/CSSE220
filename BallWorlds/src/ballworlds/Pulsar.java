package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import util.Random;

public class Pulsar extends Ball {
	private Color color;
	private int diameter;
	private boolean determineColor;
	private double x;
	private double y;
	private Point2D.Double point;

	public Pulsar(BallEnvironment world) {
		super(world);
		this.color = Color.white;
		this.diameter = 50;
		this.determineColor = true;
		this.x = Random.randRange(0, world.getSize().width);
		this.y = Random.randRange(0, world.getSize().height);
		this.point = new Point2D.Double(this.x, this.y);
		super.setCenterPoint(this.point);
	}

	@Override
	public Color getColor() {
		return this.color;

	}

	@Override
	public void updatePosition() {
		// **ignored

	}

	@Override
	public void updateSize() {
		// **ignored
	}

	@Override
	public void updateColor() {
		if (this.color.equals(Color.white))
			this.determineColor = true;

		if (this.color.equals(Color.black))
			this.determineColor = false;

		if (this.determineColor == false)
			this.color = new Color(this.color.getRed() + 1,
					this.color.getGreen() + 1, this.color.getBlue() + 1);

		if (this.determineColor == true)
			this.color = new Color(this.color.getRed() - 1,
					this.color.getGreen() - 1, this.color.getBlue() - 1);

	}

	@Override
	public double getDiameter() {
		return this.diameter;
	}

}
