/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemanagementsystem;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;


/**
 *
 * @author Computer 4
 */
public class Database {
    Connection con=null;
    Statement stmt;
    ResultSet rs=null;
    PreparedStatement pst;
    PreparedStatement pst1;
    
    Database()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager" );
            stmt=con.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
