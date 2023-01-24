/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessDataBaseCRUD;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class Connect {
    Connection con;
    Statement st;
    public Connect(){
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con = DriverManager.getConnection("jdbc:ucanaccess://F:\\Shaban Cs-2\\OOps\\DataBase\\StudentDB.accdb");
            JOptionPane.showMessageDialog(null,"Connection established successfully");
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connect Failed "+e);
    }
}
    public void openConnection(){
        try{
            st = con.createStatement();
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection open failed "+e);
        }
    }
    public void closeConnection(){
        try{
            st.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection close failed  "+e);
        }
    }   
    public boolean UDI(String query){
        try{
            st.executeUpdate(query);
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"UDI failed "+e);
            return false;
        }
    } 
    public ResultSet Search(String query){
        try{
            ResultSet rs = st.executeQuery(query);
            return rs;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"UDI failed "+e);
            return null;
        }
    }
}