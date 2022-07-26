package Utilities;

import java.sql.*;

public class DBUtils {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection(){
        String dbURL="jdbc:oracle:thin:@44.195.19.167:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";
        try {
            connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        } catch (SQLException e) {
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
