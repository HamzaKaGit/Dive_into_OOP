import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;




public class Array {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
      int []count ={1,2,3,4,5};
      count[1]= (count[2]== 3)? count[3]:99;
      System.out.println(count[1]);

    }
}
