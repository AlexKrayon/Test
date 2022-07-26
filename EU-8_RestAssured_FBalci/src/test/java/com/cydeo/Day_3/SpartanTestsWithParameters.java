package com.cydeo.Day_3;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class SpartanTestsWithParameters {

    @BeforeAll
    public static void init() {
        baseURI = "http://44.203.67.176:8000";
    }

    /*
    Given accept type is json
    And Id parameter value is 5
    When user send GET request to api/spartans/{id}
    Then response status code should be 200
    And response Content Type must be application/json
    And "Blythe" should be in response payload
     */

    @DisplayName("GET request to /api/spartans/{id} with ID 5")
    @Test
    public void test1(){
                Response response = given().
                        accept(ContentType.JSON).and().pathParam("id",5)
                .when().
                        get("api/spartans/{id}");

        assertEquals(200,response.statusCode());

        assertEquals("application/json",response.contentType());

        assertTrue(response.body().asString().contains("Blythe"));
    }

    /*
    Given accept type is json
    And Id parameter value is 500
    When user send GET request to api/spartans/{id}
    Then response status code should be 404
    And response Content Type must be application/json
    And "Not Found" should be in response payload
     */

    @DisplayName("GET request to /api/spartans/{id} Negative test")
    @Test
    public void test2(){

        Response response = given().accept(ContentType.JSON)
                .pathParam("id",500).when().get("api/spartans/{id}");

        assertEquals(404,response.statusCode());

        assertEquals("application/json",response.contentType());

        assertTrue(response.body().asString().contains("Not Found"));

    }

    /*
    Given accept type is json
    And query parameter values are:
    gender/Female
    nameContains/e
    When user send GET request to api/spartans/search
    Then response status code should be 200
    And response Content Type must be application/json
    And "Female" should be in response payload
    And "Janette" should be in response payload
     */

    @DisplayName("GET request to /api/spartans/search with Query Params")
    @Test
    public void test3(){
        Response response = given().log().all().accept(ContentType.JSON)
                .and().queryParam("nameContains","e")
                .and().queryParam("gender","Female")
                .when().get("api/spartans/search");

        assertEquals(200,response.statusCode());

        assertEquals("application/json",response.contentType());

        assertTrue(response.body().asString().contains("Female"));
        assertTrue(response.body().asString().contains("Janette"));

    }
    @DisplayName("GET request to /api/spartans/search with Query Params (MAP)")
    @Test
    public void test4(){
        Map<String,Object>queryMap= new HashMap<>();
        queryMap.put("nameContains","e");
        queryMap.put("gender","Female");

        Response response = given().log().all().accept(ContentType.JSON)
                .and().queryParams(queryMap).when().get("api/spartans/search");

        assertEquals(200,response.statusCode());

        assertEquals("application/json",response.contentType());

        assertTrue(response.body().asString().contains("Female"));
        assertTrue(response.body().asString().contains("Janette"));




    }



}
