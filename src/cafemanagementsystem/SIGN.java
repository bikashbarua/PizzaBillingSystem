/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafemanagementsystem;
import java.sql.*;
//import java.sql.Connection;



public class SIGN {
    Connection con=null;
    Statement stmt;
    ResultSet rs=null;
    
    SIGN()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            stmt=con.createStatement();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
}


