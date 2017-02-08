import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw Border
//                        
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw Second Border
//                        
//                        g.setColor(Color.red);
//                        g.drawRect(x1 +2, y1 +2, width - 5, height -5);
//                        
//                        //Draw Line 1
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw Line 2
//                        g.setColor(Color.CYAN);
//                        g.drawLine(x1, y2, x2, y1);
//   
                        
                        g.setColor(Color.green);
                        g.fillOval(height, width , 55, 55);
            }
}