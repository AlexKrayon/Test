package com.cydeo.Day_4;

import com.cydeo.Utilities.HR_Test_Base;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class ORDSApiTestPath extends HR_Test_Base {
    @DisplayName("Get request to countries with path method")
    @Test
    public void test1() {

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("q", "{\"region_id\":2}")
                .when().get("/countries");

        assertEquals(200,response.statusCode());

        System.out.println("response.path(\"limit\") = " + response.path("limit"));

        System.out.println("response.path(\"hasMore\") = " + response.path("hasMore"));
        
        String firstCountryId = response.path("items[0].country_id");
        System.out.println("firstCountryId = " + firstCountryId);

        String secondCountryName = response.path("items[1].country_name");
        System.out.println("secondCountryName = " + secondCountryName);

        String thirdCountryUrl = response.path("items[2].links[0].href");
        System.out.println("thirdCountryUrl = " + thirdCountryUrl);

        //get all country names
        List<String> countryNames = response.path("items.country_name");
        System.out.println("countryNames = " + countryNames);


    }

    @DisplayName("Get request to countries with path method")
    @Test
    public void test2(){

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("q","{\"job_id\":\"IT_PROG\"}")
                .when().get("/employees");

        assertEquals(200,response.statusCode());
        assertEquals("application/json", response.header("Content-Type"));
        assertTrue(response.body().asString().contains("IT_PROG"));

        List<String>allJobIds = response.path("items.job_id");

        for (String jobID : allJobIds){
            System.out.println("jobID = " + jobID);
            assertEquals("IT_PROG",jobID);
        }
        
        //print each name of IT_PROG

        JsonPath jsonPath = response.jsonPath();
        List<String>allNames = jsonPath.getList("items.findAll {it.job_id==\"IT_PROG\"}.first_name");
        System.out.println(allNames);
        



    }
}
