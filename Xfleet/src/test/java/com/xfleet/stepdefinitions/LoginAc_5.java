package com.xfleet.stepdefinitions;

import com.xfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAc_5 {

    LoginPage loginPage = new LoginPage();

    @When("User sees the Remember Me link on the login page")
    public void user_sees_the_remember_me_link_on_the_login_page() {
       loginPage.rememberMeLink.isDisplayed();
    }
    @Then("User can click the Remember Me checkbox")
    public void user_can_click_the_remember_me_checkbox() {
       loginPage.rememberMeCheckbox.click();
    }

}
