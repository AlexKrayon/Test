package com.cydeo.test.Day4_findElements_checkBoxs;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_Xpath_cssSelectorPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        // Locate homelink using cssSelector
        WebElement homeLinkEx1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        // Locate homelink using cssSelector syntax2
        WebElement homeLinkEx2 = driver.findElement(By.cssSelector("a.nav-link"));

        // Locate homelink using cssSelector href value
        WebElement homeLinkEx3 = driver.findElement(By.cssSelector("a[href='/']"));

        // "Forgot password" header
        // Locate header using cssSelector: locate parent element and move down to h2
        WebElement headerEx1 = driver.findElement(By.cssSelector("div.example > h2"));

        // locate header using xpath and using web elements text "forgot password"
        WebElement headerEx2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement headerEx2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //email text
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));

        // E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        //tagName[contains(@attribute,'value')]
        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        System.out.println("homeLinkEx1.isDisplayed() = " + homeLinkEx1.isDisplayed());
        System.out.println("headerEx1.isDisplayed() = " + headerEx1.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());


    }
}
