package com.cydeo.Day_5;

import com.cydeo.Utilities.SpartanTestBase;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class JSONtoJAVATest extends SpartanTestBase {
    @DisplayName("Get one Spartan and deserialize to Map")
    @Test
    public void test1(){

        Response response = given().pathParam("id",15)
                .when().get("/api/spartans/{id}")
                .then().statusCode(200).extract().response();

        Map<String,Object> jsonMap = response.as(Map.class);

        System.out.println(jsonMap.toString());
        String actualName = (String) jsonMap.get("name");
        assertThat(actualName, is("Meta"));

    }

    @DisplayName("Get all Spartans to Java data Structure")
    @Test
    public void test2(){
        Response response = get("/api/spartans").then().statusCode(200).extract().response();

        List<Map<String,Object>> jsonList = response.as(List.class);
        System.out.println("jsonList.get(1).get(\"name\") = " + jsonList.get(1).get("name"));

    }

}
