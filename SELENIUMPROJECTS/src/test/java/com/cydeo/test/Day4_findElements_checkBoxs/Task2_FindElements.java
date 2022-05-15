package com.cydeo.test.Day4_findElements_checkBoxs;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2_FindElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Provide extra wait time before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        //Locate all links--- alt+enter (press enter again)
        List <WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        //iter yazınca for each olusuyor.
        for (WebElement each : allLinks) {
            System.out.println("Text of Link: "+each.getText());
            System.out.println("HREF Values: "+each.getAttribute("href"));
        }



    }
}
