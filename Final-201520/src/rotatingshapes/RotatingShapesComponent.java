package rotatingshapes;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class RotatingShapesComponent extends JComponent implements Runnable {
	private long pause;
	private RotatingSquare square1;
	private RotatingCircle circle1;

	// To see a video of the final version of this project in action, go here:
	// http://youtu.be/GyK3twPGR0M

	public RotatingShapesComponent(JFrame frame) {

		square1 = new RotatingSquare(0, 0);
		circle1 = new RotatingCircle(300, 300);
		// HINT: If you want to add a keyboard listener,
		// add it to the frame not this component
		// frame.addKeyListener(square1);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		square1.draw(g2);
		circle1.draw(g2);

	}

	@Override
	public void run() {
		while (true) {
			square1.updatePosition(5, 5);
			circle1.updatePosition(3, 3);
			this.repaint();
			try {
				Thread.sleep(1000 / 3);
			} catch (InterruptedException exception) {
				// TODO Auto-generated catch-block stub.
				exception.printStackTrace();
			}
		}
	}

}
