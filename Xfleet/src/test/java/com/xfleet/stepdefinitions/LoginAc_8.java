package com.xfleet.stepdefinitions;

import com.xfleet.pages.HomePage;
import com.xfleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class LoginAc_8 {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();



    @Then("User should be able to see {string} in the profile menu")
    public void user_should_be_able_to_see_in_the_profile_menu(String OwnUsername) {
        Assert.assertEquals(homePage.ownName.getText(), OwnUsername);


    }

}
