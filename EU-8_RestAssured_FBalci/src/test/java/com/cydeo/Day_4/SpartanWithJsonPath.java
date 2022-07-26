package com.cydeo.Day_4;

import com.cydeo.Utilities.SpartanTestBase;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class SpartanWithJsonPath extends SpartanTestBase {
    @DisplayName("Get one Spartan with path method")
    @Test
    public void test1(){
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("id",10)
                               .when().get("/api/spartans/10");

        assertEquals(200,response.statusCode());

        assertEquals("application/json",response.contentType());

        System.out.println(response.path("name").toString());

        //System.out.println("response.path(\"name\") = " + response.path("name"));

        JsonPath jsonPath = response.jsonPath();

        int id = jsonPath.getInt("id");
        String name = jsonPath.getString("name");
        String gender = jsonPath.getString("gender");
        long number = jsonPath.getLong("phone");

        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("number = " + number);


    }
}
