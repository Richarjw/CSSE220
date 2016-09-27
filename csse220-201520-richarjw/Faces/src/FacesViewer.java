import javax.swing.JFrame;
/**
 * This Class makes the window.Constructs and makes visible a 500 by 400 JFrame
 * that has on it a JComponent that draws Face objects.
 *
 * @author richarjw. Created Dec 19, 2014.
 */
public class FacesViewer {
	/**
	 * The main method for FacesViewer. Creates the JFrame and draws
	 * face components
	 *
	 */
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(500,400);
		frame.setTitle("FACES");
		frame.add(new FacesComponent());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
