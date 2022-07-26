package com.xfleet.stepdefinitions;

import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginAc_2 {

    LoginPage loginPage = new LoginPage();

    @Then("User sees the alert of {string}")
    public void user_sees_the_alert_of(String invalidMessage) {
        BrowserUtils.sleep(3);
        Assert.assertTrue(loginPage.invalidCredentialMessage.getText().equals(invalidMessage));

    }

}
