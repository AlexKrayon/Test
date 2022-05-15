package com.cydeo.test.Day3_TasksContinue;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // expected: reset password
                // tagName[attribute='value']

       // WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));  // using class

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']")); // using value

        String expectedResetPasswordButton = "Reset Password";
        String actualResetPasswordButton = resetPasswordButton.getText();


        if(actualResetPasswordButton.equalsIgnoreCase(expectedResetPasswordButton)){
            System.out.println("Password button text verification PASSED!!");
        }else {
            System.out.println("Password button text verification NOT PASSED!!");
        }






    }
}
