/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class DBConnection {
    public static Connection getConnection (){
    String url="jdbc:mysql://localhost/codefest";
     String userName = "root";
        String pwd = "";
        Connection con = null;
        try {
            forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, userName, pwd);
       } catch (Exception ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        return con;
    }
    
}
