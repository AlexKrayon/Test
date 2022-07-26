package com.cydeo.Utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public abstract class HR_Test_Base {

    @BeforeAll
    public static void init(){
        baseURI = "http://44.203.67.176:1000/ords/hr";

        String dbUrl= "jdbc:oracle:thin:@44.203.67.176:1521:xe";
        String dbUsername = "hr";
        String dbPassword = "hr";

       // DBUtils.createConnection(dbUrl,dbUsername,dbPassword);
    }

    @AfterAll
    public static void teardown(){

       // DBUtils.destroy();
    }
}
