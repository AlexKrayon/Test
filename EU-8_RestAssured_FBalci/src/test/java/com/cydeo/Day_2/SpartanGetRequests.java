package com.cydeo.Day_2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SpartanGetRequests {

    String url = "http://44.203.67.176:8000";

    // Given accept type application/json
    // When user send GET request to api/spartans end point
    // Then status code must 200
    // And response Content Type must be application/json
    // And response body should include spartan result

    @Test
    public void test1(){
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when()
                .get(url+"/api/spartans");

        System.out.println("response.statusCode() = " + response.statusCode());

        System.out.println("response.contentType() = " + response.contentType());

        response.prettyPrint();

        //how to do API testing?

        Assertions.assertEquals(response.statusCode(),200);

        Assertions.assertEquals(response.contentType(),"application/json");

    }

    // Given accept type application/json
    // When user send GET request to api/spartans/3
    // Then status code must be 200
    // And response Content Type must be application/json
    // And response body should contain Fidole

    @DisplayName("Get one spartan /api/spartans/3 and verify")
    @Test
    public void test2(){
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get(url+"/api/spartans/3");

        Assertions.assertEquals(response.statusCode(),200);

        Assertions.assertEquals(response.contentType(),"application/json");


        Assertions.assertTrue(response.body().asString().contains("Fidole"));

    }

    // Given no headers provided
    // When user send GET request to /api/hello
    // Then status code should be 200
    // And Content Type header should be "text/plain;charset=UTF-8"
    // And header should contain date
    // And Content - Length should be 17
    // And body should be "Hello from Sparta"

    @DisplayName("GET request to /api/hello")
    @Test
    public void test3(){
        Response response = RestAssured.when().get(url+"/api/hello");

        Assertions.assertEquals(200, response.statusCode());

        Assertions.assertEquals("text/plain;charset=UTF-8",response.contentType());

        Assertions.assertTrue(response.headers().hasHeaderWithName("Date"));

        System.out.println("response.header(\"Content-Length\") = " + response.header("Content-Length"));
        System.out.println("response.header(\"Date\") = " + response.header("Date"));

        Assertions.assertEquals("17",response.header("Content-Length"));

        Assertions.assertEquals("Hello from Sparta",response.body().asString());

    }

}
