package com.cydeo.Day_2;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SpartanNegativeGetTest {
    @BeforeAll
    public static void init() {
        baseURI = "http://44.203.67.176:8000";
    }

    /*Task
    Given Accept type application/xml
    When user send GET request to api/spartans/10 end point
    Then status code must 406
    And response Content Type must be application/xml;charset=UTF-8
     */

    @DisplayName("GET request to/api/spartans/10")
    @Test
    public void test1(){
        Response response = given().accept(ContentType.XML).when().get("api/spartans/10");
        assertEquals(406,response.statusCode());
        assertEquals("application/xml;charset=UTF-8",response.contentType());


    }

}
