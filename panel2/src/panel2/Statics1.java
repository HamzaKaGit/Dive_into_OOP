/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel2;

import javax.swing.*;
import java.awt.*;

public class Statics1 {
   public static void main(String[] args) {
      new S1GUI();
   }
}

class S1GUI {
   private JFrame f;

   public S1GUI() {
      f = new JFrame("Statics1");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(500, 200);
      f.setLayout(new FlowLayout(FlowLayout.LEFT));
      for (int b = 1; b < 9; b++)
         f.add(new JButton("Button " + b));
      f.setVisible(true);
   }
}


