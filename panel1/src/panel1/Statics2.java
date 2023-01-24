/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel1;

import javax.swing.*;
import java.awt.*;

public class Statics2 {
   public static void main(String[] args) { new S2GUI(); }
}

class ColoredJPanel extends JPanel {
   Color color;
   ColoredJPanel(Color color) {
      this.color = color;
   }
   public void paintComponent(Graphics g) {
      g.setColor(color);
      g.fillRect(0, 0, 400, 400);
   }
}

class S2GUI extends JFrame {
   public S2GUI() {
      setTitle("Statics2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 400);
      add(new ColoredJPanel(Color.RED), BorderLayout.NORTH);
      add(new ColoredJPanel(Color.GREEN), BorderLayout.SOUTH);
      add(new ColoredJPanel(Color.BLUE), BorderLayout.WEST);
      add(new ColoredJPanel(Color.YELLOW), BorderLayout.EAST);
      add(new ColoredJPanel(Color.BLACK), BorderLayout.CENTER);
      setVisible(true);
   }
}


   
  