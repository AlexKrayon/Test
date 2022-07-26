package com.xfleet.stepdefinitions;

import com.xfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAc_4 {

    LoginPage loginPage = new LoginPage();

    @When("User clicks the Forgot your password button")
    public void user_clicks_the_forgot_your_password_button() {
        loginPage.forgotPasswordButton.click();
    }
    @Then("User land on the {string} page")
    public void user_land_on_the_page(String string) {
       loginPage.forgotPasswordHeader.getAttribute("ForgotPassword");
    }

}
