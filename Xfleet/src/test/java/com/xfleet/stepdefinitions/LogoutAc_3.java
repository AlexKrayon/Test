package com.xfleet.stepdefinitions;

import com.xfleet.pages.HomePage;
import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutAc_3 {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Then("user should close the tab")
    public void user_should_close_the_tab() {
        BrowserUtils.closeSpecificTab("Quick Launchpad");
      //Driver.getDriver().quit();
    }
    @Then("user open the same page for home page")
    public void user_open_the_same_page_for_home_page() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
        //Assert.assertEquals("Login", loginPage.LoginHeader.getText());
       // BrowserUtils.sleep(2);
      //  boolean login = loginPage.LoginHeader.getText().equals("Login");
        //BrowserUtils.closeSpecificTab("");
        String unexpectedTitle="Login";
        String actualTitle=Driver.getDriver().getTitle();
       BrowserUtils.sleep(2);
        Assert.assertNotEquals(unexpectedTitle,actualTitle);

        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //homePage.launchPad.getText().equals("Quick Launchpad");
        //loginPage.LoginHeader.getText().equals("Login");
       // Driver.getDriver().get("https://qa.xfleetsolutions.com/");
    }

/*
    String window1;
    String window2;
    @When("User opens two homepage tab")
    public void user_opens_two_homepage_tab() {
        BrowserUtils.openNewTab(ConfigurationReader.getProperty("url"));
        BrowserUtils.openNewTab("");
    }



    @When("User closes all the open tabs")
    public void user_closes_all_the_open_tabs() {
        BrowserUtils.closeSpecificTab("Dashboard");
        BrowserUtils.closeSpecificTab("Dashboard");
    }



    @When("User reopen the url")
    public void user_reopen_the_url() {
        //BrowserUtils.sleep(5);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.closeSpecificTab("");
    }

    @Then("User can not land on the homepage")
    public void user_can_not_land_on_the_homepage() {
        String unexpectedTitle="Dashboard";
        String actualTitle=Driver.getDriver().getTitle();
        BrowserUtils.sleep(2);
        Assert.assertNotEquals(unexpectedTitle,actualTitle);
    }*/
}
