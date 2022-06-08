package com.cydeo.test.StudyGroup;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 {

    public WebDriver driver;

   @BeforeMethod
public void setupMethod(){
       driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          }

         @Test
            public void test1(){
            driver.get("https://www.facebook.com/");
             WebElement header = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
            // WebElement header = driver.findElement(By.tagName("h2"));
            String expected = "Facebook helps you connect and share with the people in your life.";
            String actual = header.getText();

             Assert.assertEquals(expected,actual);

         }

         @AfterMethod
        public void tearDown(){
       driver.close();
         }



    /**

    TC #3: Facebook header verification
1. Open Chrome browser
2. Go to https://www.facebook.com/
            3. Verify header text is as expected:
    Expected: “Facebook helps you connect and share with the people in your life.”
 **/
}
