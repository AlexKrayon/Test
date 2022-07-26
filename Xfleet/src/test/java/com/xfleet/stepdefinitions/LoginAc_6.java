package com.xfleet.stepdefinitions;

import com.xfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAc_6 {

    LoginPage loginPage = new LoginPage();

    @When("User enters the password")
    public void user_enters_the_password() {
        loginPage.passwordBox.sendKeys("UserUser123");
    }

    @Then("User sees the password in bullet signs")
    public void user_sees_the_password_in_bullet_signs() {
        String actual = loginPage.passwordBox.getAttribute("type");
        String expected = "password";
        Assert.assertEquals(expected, actual);


    }

}
