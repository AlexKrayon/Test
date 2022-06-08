package com.cydeo.test.StudyGroup;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3 {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test1(){
    driver.get("https://practice.cydeo.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> dropdownOption = select.getOptions();
        for (WebElement element : dropdownOption) {
            System.out.println(element.getText());
        }

    }

/**
 C #8: Selecting value from multiple select dropdown
 1. Open Chrome browser
 2. Go to https://practice.cydeo.com/dropdown
 3. Select all the options from multiple select dropdown.
 4. Print out all selected values.
 5. Deselect all values.
 */


}
