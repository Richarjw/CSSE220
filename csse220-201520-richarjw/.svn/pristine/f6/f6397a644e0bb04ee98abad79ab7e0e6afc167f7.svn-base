import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ResponsiveCircleMain {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 300;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 300;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		ResponsiveCircleComponent c = new ResponsiveCircleComponent();
		c.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		c.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void actionPerformed(MouseEvent e){
				System.out.println("asdf"));
			}
			
		});
		frame.add(c);
		JButton button = new JButton("Change Color");
		button.addActionListener(new ActionListener(){	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked!");
				ResponsiveCircleComponent a = new ResponsiveCircleComponent();
				a.setPreferredSize(new Dimension(WIDTH,HEIGHT));
				a.
				frame.add(a);
	
		}
			});
		panel.add(button);
		frame.add(panel,BorderLayout.SOUTH);
		
		frame.setTitle("A Circle");
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
}
