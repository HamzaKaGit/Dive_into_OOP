/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel3;
import javax.swing.*;
import java.awt.*;

public class Statics3 {
   public static void main(String[] args) { new S3GUI(); }
}

class S3GUI extends JFrame {
   static final int DIM = 25;
   static final int SIZE = 12;
   static final int GAP = 1;

   public S3GUI() {
      setTitle("Statics3");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(new GridLayout(DIM, DIM, GAP, GAP));
      for (int i = 0; i < DIM * DIM; i++) add(new MyPanel());
      pack();
      setVisible(true);
   }
   
   class MyPanel extends JPanel {
      MyPanel() { setPreferredSize(new Dimension(SIZE, SIZE)); }
      public void paintComponent(Graphics g) {
         float gradient =
            1f - ((float)Math.abs(getX() - getY()))/(float)((SIZE + GAP) * DIM);
         g.setColor(new Color(0f, 0f, gradient));
         g.fillRect(0, 0, getWidth(), getHeight());
      }
   }
}



    

