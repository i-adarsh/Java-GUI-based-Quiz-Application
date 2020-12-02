/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.User;

/**
 *
 * @author adarshkumar
 */
public class UserDAO {
    public static boolean validateUser(User user) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet resultSet = ps.executeQuery();
        return resultSet.next();
    }
    
    public static boolean updatePassword(String userId, String password) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update users set password=? where userid=?");
        preparedStatement.setString(1,password);
        preparedStatement.setString(2,userId);
        int result = preparedStatement.executeUpdate();
        System.out.println(result);
        if (result > 0){
            return true;
        }
        return false;
    }
    
    public static boolean addUsers(User user) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users values(?,?,?)");
        preparedStatement.setString(1, user.getUserId());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getUserType());
        int result = preparedStatement.executeUpdate();
        System.out.println(result);
        if (result > 0){
            return true;
        }
        return false;
    }
}
