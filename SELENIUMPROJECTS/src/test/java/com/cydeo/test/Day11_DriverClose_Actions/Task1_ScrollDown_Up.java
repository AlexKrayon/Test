package com.cydeo.test.Day11_DriverClose_Actions;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task1_ScrollDown_Up {

    @Test
    public void test(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLinkButton = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLinkButton).perform();

        actions.sendKeys(Keys.PAGE_UP).perform();



    }
}
