package com.cydeo.test.Day3_TasksContinue;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getAttributeCSSSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //WebElement signInButton = driver.findElement(By.className("login-btn"));

        //Locating with using different attribute values. tagName[attribute='value']
        //#1 Using with class attribute
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //#2 Using with type attribute
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //#3 Using with value attribute
        WebElement signInButton = driver.findElement(By.cssSelector("input[value ='Log In']"));

        String expectedButtonText = "Log In";

        String actualButtonText = signInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);

        if(actualButtonText.equalsIgnoreCase(expectedButtonText)){
            System.out.println("Log In button text verification PASSED!!");
        }else {
            System.out.println("Log In button text verification NOT PASSED!!");
        }


    }
}
