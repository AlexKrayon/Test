package dataBaseTestPractice;

import java.sql.*;

public class testConnection {

    public static void main(String[] args) throws SQLException {
        String dbURL="jdbc:oracle:thin:@44.195.19.167:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";

        Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");

        resultSet.next();

        System.out.println(resultSet.getString("region_name"));

        System.out.println(resultSet.getString(2));

        resultSet.close();
        statement.close();
        connection.close();
    }
}
