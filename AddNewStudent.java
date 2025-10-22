package pbl;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class AddNewStudent extends JFrame {
    AddNewStudent()
    {
    	String s1=JOptionPane.showInputDialog(this,"Enter student id");
        String s2=JOptionPane.showInputDialog(this,"Enter Name");
    	String s3=JOptionPane.showInputDialog(this,"Enter DOB");
        String s4=JOptionPane.showInputDialog(this,"Enter Gender");
        String s5=JOptionPane.showInputDialog(this,"Enter Address");
    	String s6=JOptionPane.showInputDialog(this,"Enter Phonenum");
        String s7=JOptionPane.showInputDialog(this,"Enter Email");
    	String s8=JOptionPane.showInputDialog(this,"Enter Branch");
        String s9=JOptionPane.showInputDialog(this,"Enter YearOfStudy");
        String s10 =JOptionPane.showInputDialog(this,"Enter CGPA");
    	String s11=JOptionPane.showInputDialog(this,"Enter PlacementStatus");
        String s12=JOptionPane.showInputDialog(this,"Enter Offers_received");
        if (s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()||s7.isEmpty()||s8.isEmpty()||s9.isEmpty()||s10.isEmpty()||s11.isEmpty()||s12.isEmpty())
        {   
            JOptionPane.showMessageDialog(this,"Please fill all the fields");
        }  
        else
        {    
            try
            {
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcet","root","Naren@123");
                String query = "INSERT INTO studentdetails VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement st = cn.prepareStatement(query);
                st.setString(1, s1);
                st.setString(2, s2);
                st.setString(3, s3);
                st.setString(4, s4);
                st.setString(5, s5);
                st.setString(6, s6);
                st.setString(7, s7);
                st.setString(8, s8);
                st.setString(9, s9);
                st.setFloat(10, Float.parseFloat(s10));
                st.setString(11, s11);
                st.setInt(12, Integer.parseInt(s12));
                st.executeUpdate();
                st.close();cn.close();
                JOptionPane.showMessageDialog(this, "Student Added!","Success", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
     }
}
