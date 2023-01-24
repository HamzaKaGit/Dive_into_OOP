/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.Label;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calc {
 JFrame f=new JFrame();
    Label l1=new Label("Enter Number");
    Label l2=new Label("Enter Number");
    Label l3=new Label("Result");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("+");
    Button b2=new Button("-");
    Button b3=new Button("X");
    Button b4=new Button("/");
    
    Calc(){
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,150,100,20);
        l3.setBounds(50,200,100,20);    
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,150,100,20);
        t3.setBounds(200,200,100,20);  
        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(230,250,50,20);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        b4.addActionListener(al);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(460,480);
    }
    
    ActionListener al = new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            int i=Integer.parseInt(t1.getText());
            int j=Integer.parseInt(t2.getText());
//            switch(e.getSource().toString()){
//                case b1.getID():
//                    t3.setText(String.valueOf(i+j));
//                    break;
//                    
//            }
            if(e.getSource()==b1)
            {
                t3.setText(String.valueOf(i+j));
            }
            else if(e.getSource()==b2)
            {
                t3.setText(String.valueOf(i-j));
            }
            else if(e.getSource()==b3)
            {
                t3.setText(String.valueOf(i*j));
            }
            else if(e.getSource()==b4)
            {
                t3.setText(String.valueOf(i/j));
            }
        }
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Calc();
    }
    
}
