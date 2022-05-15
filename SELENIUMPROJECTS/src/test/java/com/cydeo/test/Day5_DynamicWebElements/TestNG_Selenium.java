package com.cydeo.test.Day5_DynamicWebElements;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    @Test
    public void selenium_test(){

        // Do the browser driver setup
       WebDriver driver= WebDriverFactory.getDriver("chrome");
        //open browser
        //Maximize the page
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Get "https://google.com"
        driver.get("https://google.com");
        //Assert: title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        //Assert.assertEquals(driver.getTitle(),"Google");
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");


    }



}
