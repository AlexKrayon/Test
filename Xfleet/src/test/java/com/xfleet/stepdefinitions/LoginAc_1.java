package com.xfleet.stepdefinitions;

import com.xfleet.pages.HomePage;
import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAc_1 {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();




    @Given("User is on the XFleet Login page")
    public void user_is_on_the_x_fleet_login_page() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
    }
    @When("User enters the username {string}")
    public void user_enters_the_username(String userNameBox) {
        loginPage.userNameBox.sendKeys(userNameBox);
    }
    @When("User enters the password {string}")
    public void user_enters_the_password(String passwordBox) {
        loginPage.passwordBox.sendKeys(passwordBox);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User sees {string}")
    public void user_sees(String header) {
        BrowserUtils.sleep(2);
        Assert.assertTrue(homePage.homepageHeader.getText().equals(header));
    }
}
