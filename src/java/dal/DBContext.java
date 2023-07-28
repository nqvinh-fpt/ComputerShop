package dal;

import DAO.GuaranteeDAO;
import DAO.LoginDAO;
import Entity.Admin;
import Entity.Guarantee;
import Entity.User1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ngo Tung Son
 */
public class DBContext {

    public Connection connection;

    public DBContext() {
        try {
            String user = "sa";
            String pass = "123";
              String url = "jdbc:sqlserver://DESKTOP-5CIKBC3\\THUHA:1433;databaseName=Swp391";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        LoginDAO c = new LoginDAO();
        String Email = "user";
        String Pass = "123456";
        try {    
            System.out.println(c.checkDuplicate("vinh1122k2@gmail.com"));            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
