package com.cydeo.Day_2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class HrGetRequest {
    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "http://44.203.67.176:1000/ords/hr";
    }

    @DisplayName("GET request to /regions")
    @Test
    public void test1(){
        Response response = RestAssured.get("/regions");

        System.out.println(response.statusCode());
    }

    // Given accept type application/json
    // When user sends request to /regions/2
    // Then status code must 200
    // And response Content Type must be application/json
    // And response body contains Americas


    @DisplayName("GET request to /regions/2")
    @Test
    public void test2(){
        Response response = given().accept(ContentType.JSON)
                        .when()
                .get("/regions/2");
        assertEquals(200,response.statusCode());
        assertEquals("application/json", response.contentType());
        response.prettyPrint();

        assertEquals(response.body().asString().contains("Americas"),true);
    }


}
