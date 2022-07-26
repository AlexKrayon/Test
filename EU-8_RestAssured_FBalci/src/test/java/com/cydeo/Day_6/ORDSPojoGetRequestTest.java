package com.cydeo.Day_6;

import com.cydeo.Pojo.Region;
import com.cydeo.Pojo.Regions;
import com.cydeo.Pojo.employee;
import com.cydeo.Utilities.HR_Test_Base;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class ORDSPojoGetRequestTest extends HR_Test_Base {

    @Test
    public void regionTest(){
        JsonPath jsonPath = get("/regions").then().statusCode(200).extract().jsonPath();

        Region region1 = jsonPath.getObject("items[0]", Region.class);

        System.out.println(region1);

        System.out.println("region1.getRegion_id() = " + region1.getRegionID());
        System.out.println("region1.getRegion_name() = " + region1.getRN());
        System.out.println("region1.getLinks().get(0).getHref() = " + region1.getLNK().get(0).getHref());


    }
    @DisplayName("Get request for some employee variables")
    @Test
    public void employeeGet(){
        employee employee1 = get("/employees").then().statusCode(200)
                .extract().jsonPath().getObject("items[0]", employee.class);

        System.out.println(employee1);


    }

    @DisplayName("Get request to region only some fields")
    @Test
    public void regionPojoTest(){
        Regions regions = get("/regions").then().statusCode(200).extract().response().as(Regions.class);

        //verify count is 4
        assertThat(regions.getSay(),is(4));

        List<String> regionsNames = new ArrayList<>();
        List<Integer> regionIds = new ArrayList<>();

      List<Region>items =regions.getIT();

      for (Region region : items){
          regionIds.add(region.getRegionID());
          regionsNames.add(region.getRN());
      }

        System.out.println("regionIds = " + regionIds);
        System.out.println("regionsNames = " + regionsNames);

        List<Integer> expectedRegionIds = Arrays.asList(1,2,3,4);
        List<String> expectedRegionNames = Arrays.asList("Europe","Americas", "Asia", "Middle East and Africa");


        assertThat(regionIds, is(expectedRegionIds));
        assertThat(regionsNames, is(equalTo(expectedRegionNames)));
    }


}
