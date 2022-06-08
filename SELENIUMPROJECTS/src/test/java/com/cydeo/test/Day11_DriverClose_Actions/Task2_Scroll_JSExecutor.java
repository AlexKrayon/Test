package com.cydeo.test.Day11_DriverClose_Actions;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task2_Scroll_JSExecutor {
    @Test
    public void scrollTest() throws InterruptedException {
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        Thread.sleep(2000);
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);




    }


}
