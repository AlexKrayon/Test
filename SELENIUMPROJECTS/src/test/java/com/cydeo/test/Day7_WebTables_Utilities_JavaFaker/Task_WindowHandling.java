package com.cydeo.test.Day7_WebTables_Utilities_JavaFaker;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){
        driver.get("https://www.amazon.com");

        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

        /**  Set<String>allWindowsHandles = driver.getWindowHandles();

         for(String each : allWindowsHandles){
         driver.switchTo().window(each);
         System.out.println("Current URL: "+driver.getCurrentUrl());

         if(driver.getCurrentUrl().contains("etsy")){
         break;
         }

         }
         String actualTitle = driver.getTitle();
         String expectedTitle = "Etsy";

         Assert.assertTrue(actualTitle.contains(expectedTitle));
         **/

    }



}
