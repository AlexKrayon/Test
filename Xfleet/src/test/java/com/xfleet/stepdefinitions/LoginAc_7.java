package com.xfleet.stepdefinitions;

import com.xfleet.pages.HomePage;
import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginAc_7 {

LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("User enters the username")
    public void user_enters_the_username() {
        loginPage.userNameBox.sendKeys("user1");
    }
    @When("User enters the password and use Enter keyword")
    public void user_enters_the_password_and_use_enter_keyword() {
       loginPage.passwordBox.sendKeys("UserUser123"+Keys.ENTER);

    }
    @Then("user should be able to see the Quick Launchpad in the home page")
    public void user_should_be_able_to_see_the_quick_launchpad_in_the_home_page() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(homePage.launchPad.getText().equals("Quick Launchpad"));
    }


}
