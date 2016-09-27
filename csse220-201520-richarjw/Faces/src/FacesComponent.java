import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
/**
 * Displays filled faces, along with testing the methods translate() and rotate()
 * in the face class.
 *
 * @author richarjw.
 *         Created Dec 19, 2014.
 */
public class FacesComponent extends JComponent{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Face test1 = new Face(30,30,25,Color.blue,Color.red,Color.yellow,0);
		for(int i = 0; i < 5;i++)
		{
			test1.translate(50,10);
			test1.drawOn(g2);
			test1.rotate(20);
		}
		Face test3 = new Face(200,300,90,Color.yellow,Color.red,Color.yellow,0);
		test3.drawOn(g2);
		Face test4 = new Face(300,300,90,Color.green,Color.black,Color.white,0);
		test4.drawOn(g2);
		Face test5 = new Face(350,300,70,Color.red,Color.black,Color.yellow,0);
		test5.drawOn(g2);
		
	}
}
