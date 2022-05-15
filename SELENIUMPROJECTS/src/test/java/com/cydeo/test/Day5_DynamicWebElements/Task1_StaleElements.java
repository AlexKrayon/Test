package com.cydeo.test.Day5_DynamicWebElements;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1_StaleElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(2000);
        addElementBtn.click();

        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

        deleteBtn.click();

        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());




    }
}
