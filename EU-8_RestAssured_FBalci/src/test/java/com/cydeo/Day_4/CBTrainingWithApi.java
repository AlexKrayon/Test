package com.cydeo.Day_4;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CBTrainingWithApi {

    @BeforeAll
    public static void init (){
        RestAssured.baseURI="http://api.cybertektraining.com";

    }

    @DisplayName("Get request to individual student")
    @Test
    public void test1(){

        /*
        send a request to student id 32742 as a path parameter and accept header application/json
        verify statuscode 200
        content type = application/json:charset=UTF-8 / Content_Encoding = gzip
        verify date header exist
        assert that
            "firstName": "Vera",
            "lastName": "Jakson",
            "batch": 14,
            "joinDate": "02/02/2020",
            "birthDate": "02/02/1985",
            "password": "123",
            "subject": "string",
            company name
            email address

        using jsonpath
         */
    }

}
