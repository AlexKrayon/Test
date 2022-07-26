package com.xfleet.stepdefinitions;

import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class LoginAc_3 {

    LoginPage loginPage = new LoginPage();

    @Then("user sees the message of {string}")
    public void user_sees_the_message_of(String string) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(3);
        String message = (String) js.executeScript("return arguments[0].validationMessage;", loginPage.passwordBox);
        System.out.println("message = " + message);
    }
}
