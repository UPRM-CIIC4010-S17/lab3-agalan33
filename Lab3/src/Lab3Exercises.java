import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Adahid");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// setting the location relative to null will put the window in the center by default, regardless of the screen size//
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
}