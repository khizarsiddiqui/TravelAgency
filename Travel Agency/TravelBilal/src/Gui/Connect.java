
package Gui;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    public static java.sql.Connection ConnectDB(){
        try{
            Class.forName( "oracle.jdbc.OracleDriver" );        
            java.sql.Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","travel","travel");
            return conn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return null;
    }
}

