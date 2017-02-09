import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

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
                        g.setColor(Color.WHITE);
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
//                        //Draw Oval 
//                        
//                        g.setColor(Color.BLUE);
//                        g.fillOval( ((this.getWidth())/2) -27 , ((this.getHeight())/2) -27, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                  //Draw the rectangle of the flag 
                  g.setColor(Color.BLACK);
                  g.drawRect(x1+10, y1+10, x1+210, y1+150);
                  
                  //RedFrames
                  g.setColor(Color.RED);
                  g.fillRect(x1+10, y1+10, x1+210, (y1+150)/5);
                  g.fillRect(x1+10, y1+70, x1+210, (y1+150)/5);
                  g.fillRect(x1+10, y1+130, x1+210, (y1+150)/5);
                  
                  //BlueTriangle
                  
                  Polygon triangle = new Polygon();
                  triangle.addPoint(x1+10, y1+10);
                  triangle.addPoint(x1+10, y1+160);
                  triangle.addPoint(x1+115, y1+85);
                  g.setColor(Color.BLUE);
                  g.fillPolygon(triangle);
                  
                  Polygon estrella = new Polygon();
                  estrella.addPoint(x1 + 25, y1 + 73);
                  estrella.addPoint(x1 + 41, y1 + 73);
                  estrella.addPoint(x1 + 47, y1 + 58);
                  estrella.addPoint(x1 + 53, y1 + 73);
                  estrella.addPoint(x1 + 69, y1 + 73);
                  estrella.addPoint(x1 + 56, y1 + 83);
                  estrella.addPoint(x1 + 61, y1 + 98);
                  estrella.addPoint(x1 + 47, y1 + 88);
                  estrella.addPoint(x1 + 34, y1 + 98);
                  estrella.addPoint(x1 + 38, y1 + 83);
                  g.setColor(Color.WHITE);
                  g.fillPolygon(estrella);
                  
            }
}
