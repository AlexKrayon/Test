package com.cydeo.Day_5;

import com.cydeo.Utilities.DBUtils;
import com.cydeo.Utilities.SpartanTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class SpartanAPIvsDB extends SpartanTestBase {

    @DisplayName("Get Spartan from api and db")
    @Test
    public void DB1(){

        String query = "select spartan_id, name, gender, phone from spartans\n" +
                "where spartan_id = 15";

        // Burada DBUtils de eksikliklerimiz olduğu için doğrulatamadık.
       // Map<String,Object> dbMap = DBUtils.getRowCount(query);

        //System.out.println(dbMap);

        Map<String,Object> apiMap = given().accept(ContentType.JSON)
                .pathParam("id",15)
                .when().get("/api/spartans/{id}")
                .then().statusCode(200)
                .and().contentType("application/json")
                .extract().response().as(Map.class);

        System.out.println(apiMap);

        //Şu Şekilde de olabilir.
        Response response = given().accept(ContentType.JSON)
                .pathParam("id",15)
                .when().get("/api/spartans/{id}")
                .then().statusCode(200)
                .and().contentType("application/json")
                .extract().response();

        Map<String,Object> apiMap2= response.as(Map.class);
        System.out.println(apiMap2);

        //ayrıca şu şekilde de comparison yapılabilir

       //assertThat(String.valueOf(apiMap.get("id")),equals(15));
      // assertThat(apiMap2.get("name"),is(toString("Meta")));

    }


}
