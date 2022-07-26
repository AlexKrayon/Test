package com.xfleet.stepdefinitions;

import com.xfleet.pages.HomePage;
import com.xfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutAc_1 {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("user enters the userName")
    public void user_enters_the_user_name() {
        loginPage.userNameBox.sendKeys("user1");
    }
    @When("user enters the password")
    public void user_enters_the_password() {
       loginPage.passwordBox.sendKeys("UserUser123");
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }
    @When("user clicks the profile button")
    public void user_clicks_the_profile_button() {
       homePage.ownName.click();
    }
    @When("user clicks the logout button")
    public void user_clicks_the_logout_button() {
        homePage.logoutButton.click();
    }
    @Then("user should be able to see login header")
    public void user_should_be_able_to_see_login_header() {
        Assert.assertEquals("Login", loginPage.LoginHeader.getText());
    }



}
