package dataBaseTestPractice;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class Examples {
    String dbURL="jdbc:oracle:thin:@44.195.19.167:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";

    @Test
    public void test1() throws SQLException {
        Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM DEPARTMENTS");

        resultSet.next();

        System.out.println(resultSet.getString(2));

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" - "+resultSet.getString(2)+" - "
                    +resultSet.getInt(3)+" - "+resultSet.getInt(4));
        }



        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void test2() throws SQLException {
        Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM DEPARTMENTS");

        resultSet.last();
        int rowcount = resultSet.getRow();
        System.out.println(rowcount);

        resultSet.beforeFirst();

        while (resultSet.next()){
            System.out.println(resultSet.getString(2));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }


    @Test
    public void test3() throws SQLException {
        Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM DEPARTMENTS");

        DatabaseMetaData dbMetaData = connection.getMetaData();
        System.out.println("dbMetaData.getUserName() = " + dbMetaData.getUserName());
        System.out.println("dbMetaData.getDatabaseProductName() = " + dbMetaData.getDatabaseProductName());
        System.out.println("dbMetaData.getDatabaseProductVersion() = " + dbMetaData.getDatabaseProductVersion());
        System.out.println("dbMetaData.getDriverName() = " + dbMetaData.getDriverName());
        System.out.println("dbMetaData.getDriverVersion() = " + dbMetaData.getDriverVersion());


        ResultSetMetaData rsMetaData = resultSet.getMetaData();

        int colCount = rsMetaData.getColumnCount();
        System.out.println(colCount);

        System.out.println("rsMetaData.getColumnName(1) = " + rsMetaData.getColumnName(1));
        System.out.println(rsMetaData.getColumnName(2));

        for (int i = 1; i <= colCount;i++){
            System.out.println(rsMetaData.getColumnName(i));
        }


        resultSet.close();
        statement.close();
        connection.close();

    }
}
