package com.cydeo.test.Day2_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED");
        }else {
            System.out.println("Header text verification FAILED");
        }

        WebElement firstName = driver.findElement(By.name("firstname"));
        String expectedHolder = "first name";
        String actualHolder = firstName.getAttribute("placeholder");

        if(actualHolder.equals(expectedHolder)){
            System.out.println("Holder text verification PASSED");
        }else {
            System.out.println("Holder text verification FAILED");
        }

        driver.close();




    }
}
