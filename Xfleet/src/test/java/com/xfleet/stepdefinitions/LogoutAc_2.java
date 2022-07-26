package com.xfleet.stepdefinitions;

import com.xfleet.pages.HomePage;
import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.When;

public class LogoutAc_2 {


    @When("user clicks the step back button")
    public void user_clicks_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }

}
