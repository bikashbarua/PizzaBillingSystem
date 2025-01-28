/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafemanagementsystem;
import java.sql.*;

/**
 *
 * @author HP
 */
public class Bill {
   
    Connection con=null;
    Statement stmt;
    ResultSet rs=null;
    PreparedStatement pst;
    PreparedStatement pst1;
    
    Bill()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager" );
            stmt=con.createStatement();
//            pst = con.preparedStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}


