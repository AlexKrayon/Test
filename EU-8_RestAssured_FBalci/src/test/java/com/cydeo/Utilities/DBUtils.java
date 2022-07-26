package com.cydeo.Utilities;

import java.sql.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection(){
        String dbUrl= "jdbc:oracle:thin:@3.80.189.73:1521:xe";
        String dbUsername = "hr";
        String dbPassword = "hr";

        try {
            connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void createConnection(String dbUrl, String dbUsername, String dbPassword){
        try {
            connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void destroy(){
        try {
            if(resultSet !=null){
                resultSet.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
