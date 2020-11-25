package Online_Examination_System;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Login_Register_Interface {

    public static Connection ConnecrDb() 
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_project","root","");
        System.out.println("Connected!!!");
        return conn;
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
    
}
