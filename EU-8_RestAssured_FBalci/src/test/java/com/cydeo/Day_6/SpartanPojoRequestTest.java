package com.cydeo.Day_6;

import com.cydeo.Pojo.Search;
import com.cydeo.Pojo.Spartan;
import com.cydeo.Utilities.SpartanTestBase;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class SpartanPojoRequestTest extends SpartanTestBase {

    @DisplayName("Get one Spartan and convert it to Spartan Object")
    @Test
    public void oneSpartanPojo(){

                Response response = given().accept(ContentType.JSON)
                        .and().pathParam("id",15)
                        .when().get("/api/spartans/{id}")
                        .then().statusCode(200)
                        .extract().response();

        // deserialize JSON to POJO
        // There are two different ways
        // 1- Using as() method
        // 2- Using jsonpath object getter like getObject

        Spartan spartan15 = response.as(Spartan.class);
        System.out.println(spartan15);
        System.out.println("spartan15.getGender() = " + spartan15.getGender());
        System.out.println("spartan15.getId() = " + spartan15.getId());
        System.out.println("spartan15.getName() = " + spartan15.getName());
        System.out.println("spartan15.getPhone() = " + spartan15.getPhone());

        // 2- Using jsonpath object getter like getObject

            }

    @DisplayName("Get one Spartan from search endpoint result and use Pojo")
    @Test
    public void spartanSearchWithPojo(){

        JsonPath jsonPath = given().accept(ContentType.JSON)
                .and().queryParams("nemaContains","a",
                        "gender", "Male")
                .when().get("/api/spartans/search")
                .then().statusCode(200)
                    .extract().jsonPath();

        Spartan s1 = jsonPath.getObject("content[0]", Spartan.class);

        System.out.println("s1 = " + s1);
        System.out.println("s1.getName() = " + s1.getName());
        System.out.println("s1.getId() = " + s1.getId());
        System.out.println("s1.getGender() = " + s1.getGender());
    }

    @Test
    public void test1() {

        Response response = given().accept(ContentType.JSON)
                .and().queryParams("nemaContains", "a",
                        "gender", "Male")
                .when().get("/api/spartans/search")
                .then().statusCode(200)
                .extract().response();

        Search searchResult = response.as(Search.class);

        //System.out.println("searchResult.getContent().get(0).getName() = " + searchResult.getContent().get(0).getName());

        System.out.println(searchResult.getContent().get(0).getName());

    }

    @Test
    public void test2(){

        List<Spartan>spartanList = given()
                .accept(ContentType.JSON)
                .and().queryParams("nemaContains", "a",
                        "gender", "Male")
                .when().get("/api/spartans/search")
                .then().statusCode(200)
                .extract().jsonPath().getList("content",Spartan.class);
        System.out.println(spartanList.get(1).getName());
        System.out.println(spartanList.get(1).getId());

    }


}
