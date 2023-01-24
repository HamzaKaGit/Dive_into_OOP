import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.security.cert.TrustAnchor;
import java.util.*;
import java.util.concurrent.Flow;
import java.sql.*;

class InnerLoginPage {

 //Frames
JFrame f1 = new JFrame("Login Page") ;
JFrame f2 = new JFrame() ;
 
//Panel
JPanel p1 = new JPanel() ;

//Border
Border br = BorderFactory.createLineBorder(Color.GREEN);
//Labels
JLabel l1 = new JLabel("Login Page") ;
JLabel l2 = new JLabel("Username") ;
JLabel l3 = new JLabel("Password") ;
 
//TextFields
JTextField t1 = new JTextField(20) ;

JTextField t2 = new JTextField(20) ;
 
//Buttons
JButton b1 = new JButton("Login") ;
JButton b2 = new JButton("Click ME") ;
JButton b3 = new JButton("Reset") ;

//List

DefaultListModel <String> str =new DefaultListModel<>();
JList <String> li=new JList<>(str);



//Font
Font fx=new Font("Times New Roman",Font.BOLD,48);
Font fy=new Font("Calibari",Font.BOLD,28);

InnerLoginPage()
{
    //Operations
    f1.setSize(560,500);
    
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setVisible(true);
    f1.setResizable(true);
    l1.setBorder(br);
    l1.setBounds(300   , 0, 30, 15);
    l1.setFont(fx);
    l2.setFont(fy);
    l3.setFont(fy);
    p1.setBackground(Color.CYAN);
    b1.setFont(fx);
    b2.setFont(fx);
    b3.setFont(fx);
    b1.setSize(50,20);
    b2.setPreferredSize(new DimensionUIResource(30,10));
    b3.setPreferredSize(new DimensionUIResource(50, 10));
    p1.setLayout(null);
//Adding

p1.add(l1,BorderLayout.CENTER);
p1.add(l2);
p1.add(t1);
p1.add(l3);
p1.add(t2);
p1.add(b1);
p1.add(b2);
p1.add(b3);
f1.add(p1);

//Action Listener

// InnerLoginPage_1 ip= new InnerLoginPage_1();

// b1.addActionListener();
// b2.addActionListener(ip);
// b3.addActionListener(ip);





}
    
}

public class LoginPage {
    public static void main(String[] args) {
InnerLoginPage a1 = new InnerLoginPage();
    }
}
