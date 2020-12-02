/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adarshkumar
 */
public class DBConnection {
    private static Connection conn;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java_Project", "Java_Project", "adarsh");
            System.out.println("Connection Successfully Opened !");
            JOptionPane.showMessageDialog(null, "Connected Successfully to the Database","Success",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot Connect with DB"+ex,"Error !!!",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Disconnected Successfully with the DB");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Dusconnecting from the DB");
            ex.printStackTrace();
            System.out.println("Exception is : "+ex);
        }
    }

}


