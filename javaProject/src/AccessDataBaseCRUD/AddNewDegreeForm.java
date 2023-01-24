/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessDataBaseCRUD;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class AddNewDegreeForm extends JFrame {
    JLabel jLabel = new JLabel("Enter Degree Title");
    JTextField jField = new JTextField();
    JButton jButton = new JButton("Add new degree");
    JTable jTable = new JTable();
    JPanel jPanelForm = new JPanel();
    JPanel jPanelTable = new JPanel();
    
    public AddNewDegreeForm(){
        this.setTitle("Add New Degree Form");
        this.setLayout(new GridLayout(2,1,5,15));
        this.JTable();
        
        this.jButton.addActionListener(a1);
        
        this.jPanelForm.setLayout(new GridLayout(2,2,5,10));
        this.jPanelForm.add(this.jLabel);
        this.jPanelForm.add(this.jField);        
        this.jPanelForm.add(this.jButton);

        this.add(this.jPanelForm);
        
        this.jPanelTable.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.jPanelTable.add(this.jTable);
        this.add(this.jPanelTable);
        
        this.pack();
        this.setVisible(true);
    }
    ActionListener a1 = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Connect con = new Connect();
            con.openConnection();
            if(con.UDI("INSERT INTO Degrees (degree_title) VALUES('"+jField.getText()+"')")){
                JTable();
                JOptionPane.showMessageDialog(null,"Degree added successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Degree added not successfully");
            }
            con.closeConnection();
        }
    };
    
    public void JTable(){
        DefaultTableModel model = (DefaultTableModel)this.jTable.getModel();
        model.addColumn("Degree Id");
        model.addColumn("Degree Title");
        String query = "Select * FROM Degrees";
        Connect con = new Connect();
        con.openConnection();
        ResultSet rs = con.Search(query);
        for(int i=this.jTable.getRowCount()-1;i>=0;i--){
            model.removeRow(i);
        }
        try {
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt("degree_id"),rs.getString("degree_title")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewDegreeForm.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.closeConnection();
        }
            
    }
}