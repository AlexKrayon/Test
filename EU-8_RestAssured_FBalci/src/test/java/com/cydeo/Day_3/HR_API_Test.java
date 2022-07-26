package com.cydeo.Day_3;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class HR_API_Test {

    @BeforeAll
    public static void init() {
        baseURI = "http://44.203.67.176:1000/ords/hr";
    }

    /*
    Given accept type is Json
    And parameters: q={"region_id":2}
    When user send GET request to "/countries"
    Then response status code should be 200
    And response Content Type must be application/json
    And payload should contain "United States of America"
     */

    @DisplayName("GET request to /countries with Query Param")
    @Test
    public void test1(){
        Response response = given().log().all().accept(ContentType.JSON)
                .and().queryParam("q","{\"region_id\":2}")
                .when()
                .get("/countries");

        assertEquals(200,response.statusCode());
        assertEquals("application/json",response.header("Content-Type"));
        assertTrue(response.body().asString().contains("United States of America"));
        response.prettyPrint();

    }

    @DisplayName("GET request to /employees with Query Param")
    @Test
    public void test2(){
        Response response = given().log().all().accept(ContentType.JSON)
                .and().queryParam("q","{\"job_id\":\"IT_PROG\"}")
                .when()
                .get("/employees");

        assertEquals(200,response.statusCode());
        assertEquals("application/json",response.header("Content-Type"));
        assertTrue(response.body().asString().contains("IT_PROG"));
        response.prettyPrint();

    }



}
