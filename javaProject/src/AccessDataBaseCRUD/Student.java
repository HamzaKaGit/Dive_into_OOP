/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessDataBaseCRUD;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Student {
    private int id,rollNumber;
    private String name,phoneNumber,gender,degree;
    private Connect con = new Connect();
    
    public Student(){
        
    }
    
    public Student(String name,int rollNumber,String phoneNumber,String gender,String degree){
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.degree = degree;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the rollNumber
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * @param rollNumber the rollNumber to set
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public boolean addStudent(){
        try{
            con.openConnection();
            String query = "Insert into students(student_name,student_roll_number,student_phone_number,student_gender,student_degree) VALUES ('"+this.name+"',"+this.rollNumber+",'"+this.phoneNumber+"','"+this.gender+"','"+this.degree+"')";
            return con.UDI(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Add Student Failed "+e);
            return false;
        }
        finally{
            con.closeConnection();
        }
    }
    public boolean deleteStudent(){
        try{
            con.openConnection();
            String query ="Delete from students where student_roll_number = "+this.getRollNumber()+"";
            boolean check = con.UDI(query);
            con.closeConnection();
            return check;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Delete Student Failed "+e);
            return false;
        }           
        }
    public boolean updateStudent(){
        try{
        String query ="Update students set student_name='"+this.name+"',student_roll_number='"+this.rollNumber+"',student_gender='"+this.gender+"',student_degree='"+this.degree+"'where student_roll_number='"+this.rollNumber+"'";
        con.openConnection();
        boolean check = con.UDI(query);
        con.closeConnection();
        return check;        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Update Student Failed "+e);
        return false;
        }
    }
}
 

