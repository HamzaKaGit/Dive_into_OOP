import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.util.*;
import java.sql.*;
public class Lm {
    public static void main(String[] args) {
        
JFrame f=new JFrame("Hello World");
JPanel p=new JPanel();
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");

p.setLayout(new FlowLayout(FlowLayout.LEFT));
f.getContentPane().add(p);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);

//f.add(p);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
f.setSize(300,300);



    }
}
