package com.cydeo.Day_5;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


public class HamcrestMatcherApiTest {

    @DisplayName("OneSpartan with Hamcrest and chaining")
    @Test
    public void test1(){

        given().accept(ContentType.JSON)
                .and().pathParam("id",15)
                .when().get("http://44.203.67.176:8000/api/spartans/:id")
                .then()
                .statusCode(200)
                .and().assertThat()
                .contentType("application/json")
                .and().body("id",equalTo(15),"name",is("Meta"),
                        "gender", is("Female"),
                        "phone", is(1938695106));

    }

    @DisplayName("GET request to all teacher and chaining")
    @Test
    public void test2(){

        given()
                .accept(ContentType.JSON)
                .when().get("http://api.cybertektraining.com/teachers")
                .then()
                .statusCode(200)
                .and()
                .body("_embedded.teachers.firstName",hasItems("Leonel", "Andrii","Breana"));



    }

}
