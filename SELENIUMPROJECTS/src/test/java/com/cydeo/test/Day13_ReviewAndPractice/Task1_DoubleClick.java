package com.cydeo.test.Day13_ReviewAndPractice;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.DoubleClickPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_DoubleClick {

    @Test void t1_double_click_test(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.aps?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        DoubleClickPage doubleClickPage = new DoubleClickPage();
        //doubleClickPage.textToDoubleClick.click();

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();

        doubleClickPage.textToDoubleClick.getAttribute("style");

        String actualStyleAttributeValue = doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedOne = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedOne));



    }


}
