import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Adahid");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Method to find Dimension of the screen and store it as a coordinate int.
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int centerX = (int) ((dimension.getWidth() - myFrame.getWidth()) / 2);
	    int centerY = (int) ((dimension.getHeight() - myFrame.getHeight()) / 2);
		
		myFrame.setLocation(centerX -100, centerY -100);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
	

	}
