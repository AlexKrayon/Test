package com.cydeo.Review;

import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZipPathTest extends ZipBase {

    @Test
    public void pathTest(){

        Response response = given().accept(ContentType.JSON)
                .pathParam("zip",84102)
                .when()
                .get("/{zip}");

        response.prettyPrint();

        assertEquals("United States",response.path("country"));
        assertEquals("Salt Lake City", response.path("places[0].\'place name\'")); //index number burada da olabilir
        assertEquals("Utah",response.path("places.state[0]")); // burada da
    }
    @Test
    public void pathTest2(){

        JsonPath jsonPath = given().accept(ContentType.JSON)
                .and().pathParam("places", "a")
                .when().get("/us/")
                .then().statusCode(200)
                .extract().jsonPath();

    }

}
