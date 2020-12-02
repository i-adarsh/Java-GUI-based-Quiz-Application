/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

/**
 *
 * @author adarshkumar
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Performance;

public class PerformanceDAO {
   public static void addPerformance(Performance performance) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        preparedStatement.setString(1,performance.getUserId());
        preparedStatement.setString(2, performance.getExamId());
        preparedStatement.setInt(3, performance.getRight());
        preparedStatement.setInt(4, performance.getWrong());
        preparedStatement.setInt(5, performance.getUnAttempted());
        preparedStatement.setDouble(6,performance.getPercentage());
        preparedStatement.setString(7,performance.getLanguage());
        preparedStatement.executeUpdate();
    }
   
   public static ArrayList<String> getAllExamId(String userName) throws SQLException{
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select examid from performance where userid=?");
        preparedStatement.setString(1,userName);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<String> examIdList = new ArrayList<>();
        while (resultSet.next()){
            examIdList.add(resultSet.getString(1));
        }
        return examIdList;
    }

    public static Performance getDetails (String examId, String userId) throws SQLException{
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from performance where examid=? and userid=?");
        preparedStatement.setString(1,examId);
        preparedStatement.setString(2,userId);
        ResultSet resultSet = preparedStatement.executeQuery();
        Performance performance = new Performance();
        resultSet.next();
        performance.setUserId(resultSet.getString(1));
        performance.setExamId(resultSet.getString(2));
        performance.setRight(resultSet.getInt(3));
        performance.setWrong(resultSet.getInt(4));
        performance.setUnAttempted(resultSet.getInt(5));
        performance.setPercentage(resultSet.getDouble(6));
        performance.setLanguage(resultSet.getString(7));
        return performance;
    }
    
    public static ArrayList<String> getAllStudents() throws SQLException{
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where usertype=?");
        preparedStatement.setString(1,"Student");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<String> studentsList = new ArrayList<>();
        while (resultSet.next()){
            String student = resultSet.getString(1);
            studentsList.add(student);
        }
        return studentsList;
    }
    
    public static ArrayList<Performance> getAllData() throws SQLException{
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<Performance> performanceList = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("Select * from performance");
        while(resultSet.next()){
        String userId = resultSet.getString(1);
        String examId = resultSet.getString(2);
        int right = resultSet.getInt(3);
        int wrong = resultSet.getInt(4);
        int unAttempted = resultSet.getInt(5);
        double percentage = resultSet.getDouble(6);
        String language = resultSet.getString(7);
        Performance performance = new Performance(userId, examId, right, wrong, unAttempted, percentage, language);
        performanceList.add(performance);
        }
        return performanceList;
    }
    
}