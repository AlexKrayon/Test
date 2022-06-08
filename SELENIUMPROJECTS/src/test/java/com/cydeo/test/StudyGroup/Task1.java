package com.cydeo.test.StudyGroup;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1<driver> {
public WebDriver driver;

@BeforeMethod
public void setupMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.facebook.com");
}

    @Test
    public void titleVerification(){


       String expectedTitle = "Facebook – log in or sign up";

       String actualTitle = driver.getTitle();

       if(expectedTitle.equals(actualTitle)){
           System.out.println("It is PASSED");
       }else {
           System.out.println("It is FAİLED");
       }


    }

    @Test
    public void changeTitle() throws InterruptedException {

    Thread.sleep(3000);
        WebElement locateEmail = driver.findElement(By.xpath("//input[@id='email']"));
        locateEmail.sendKeys("xxxxxx@araba.com");

        Thread.sleep(3000);
        WebElement locatePassword = driver.findElement(By.xpath("//input[@id='pass']"));
        locatePassword.sendKeys("12345");

        Thread.sleep(3000);
        WebElement locateSignIn = driver.findElement(By.xpath("//button[@name='login']"));
        locateSignIn.click();


        String expectedTitle= "Log in to Facebook";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAİLED");
        }





    }




}
