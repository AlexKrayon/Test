package com.cydeo.test.Day5_DynamicWebElements;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyRadioBt = driver.findElement(By.xpath("//input[@id='football']"));
        Thread.sleep(2000);
        hockeyRadioBt.click();

        System.out.println("hockeyRadioBt.isSelected() = " + hockeyRadioBt.isSelected());

        if(hockeyRadioBt.isSelected()){
            System.out.println("Button is selected. Verification PASSED");
        }else {
            System.out.println("Button is selected. Verification FAILED");
        }


    }
}
