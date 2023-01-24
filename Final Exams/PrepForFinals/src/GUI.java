import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI  implements ActionListener{
    public static void main(String[] args) {
        JFrame f1;
        JPanel P1;
        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2;
        Border br = BorderFactory.createLineBorder(Color.BLUE);

        f1 = new JFrame("LOGIN Form");
        Font fx = new Font("Times New Roman", Font.BOLD, 48);
        Font fy = new Font("Calibari", Font.BOLD, 28);
        P1 = new JPanel();
        P1.setLayout(null);

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField();
        t2 = new JTextField();
        b1= new JButton("Login");
        t1.setBounds(100, 20, 165, 20);
        t2.setBounds(100, 40, 165, 20);

        f1.setSize(560, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        l1.setBounds(10, 20, 170, 20);
        l1.setFont(fx);
        l1.setBorder(br);
        l2.setBounds(10, 40, 70, 20);
        l2.setFont(fy);
        f1.add(P1);
        P1.add(l1);
        P1.add(l2);
        P1.add(t1);
        P1.add(t2);
        P1.add(b1);
        
        b1.setBounds(10, 90, 70, 20);
        b1.addActionListener(new ActionListener(){
       @Override
            public void actionPerformed(ActionEvent e) {
            System.out.println("hooo");
            JOptionPane.showMessageDialog(null,"Heloo");
        }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
    }
}
