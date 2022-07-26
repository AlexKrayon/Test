package com.cydeo.Day_4;

import com.cydeo.Utilities.HR_Test_Base;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class ORDSApiWithJsonPath extends HR_Test_Base {

    @DisplayName("Get request to countries")
    @Test
    public void test1(){

        Response response = get("/countries");

        JsonPath jsonPath = response.jsonPath();
        String secondCountryName = jsonPath.getString("items[1].country_name");
        System.out.println("secondCountryName = " + secondCountryName);
        
        //get all countries id
        List<String> allCountriesIds = jsonPath.getList("items.country_id");
        System.out.println("allCountriesIds = " + allCountriesIds);
        
        
        List<String> countriesNameWithId2 = jsonPath.getList("items.findAll {it.region_id==2}.country_name");
        System.out.println("countriesNameWithId2 = " + countriesNameWithId2);
        
        
    }

    @DisplayName("Get request to employees with query param")
    @Test
    public void test2(){
        Response response = given().queryParam("limit",107).when().get("/employees");
        
        //get all email addresses who is working as IT-PROG
        JsonPath jsonPath = response.jsonPath();
        
        List<String> emails = jsonPath.getList("items.findAll{it.job_id==\"IT_PROG\"}.email");
        System.out.println("emails = " + emails);

        //get first name who is making more than 10000
        List<String> empNames = jsonPath.getList("items.findAll{it.salary>10000}.first_name");
        System.out.println(empNames);

        //get the max salary firstname
        String maxSalaryName = jsonPath.getString("items.max {it.salary}.first_name");
        String nameWithPathMethod = response.path("items.max {it.salary}.first_name");
        System.out.println("maxSalaryName = " + maxSalaryName);
        System.out.println("nameWithPathMethod = " + nameWithPathMethod);
        //System.out.println(maxSalaryName);
        
    }
}
