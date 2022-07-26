package com.cydeo.Day_5;

import com.cydeo.Utilities.HR_Test_Base;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


public class ORDSHamcrestTest extends HR_Test_Base {

    @Test
    public void employeeTest1(){

        Response response = given().accept(ContentType.JSON)  //JsonPath jsonPath = (bu da yazılabilir.
                .and().queryParam("q","{\"job_id\":\"IT_PROG\"}")
                .when()
                .get("/employees")
                .then()
                .statusCode(200)
                .body("items.job_id", everyItem(equalTo("IT_PROG")))
                .log().all()
                .extract().response(); // o zaman response yerine jsonPath() yazılır

        response.prettyPrint();

          }
}
