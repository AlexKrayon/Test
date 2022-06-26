package com.cydeo.step_definitions;

import com.cydeo.pages.CydeoLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CydeoLoginStepDefinitions {

    CydeoLoginPage cydeoLoginPage = new CydeoLoginPage();
   Faker faker = new Faker();

    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get("https://cydeo.com/");
    }

    @When("User clicks login button")
    public void userClicksLoginButton() {
        cydeoLoginPage.loginButton.click();
    }

    @And ("User enters email")
    public void user_enters_email() {
            cydeoLoginPage.emailBox.sendKeys(faker.name().username()+"@gmail.com", Keys.ENTER);
    }
    @When("user enters pw")
    public void user_enters_pw() {
            cydeoLoginPage.pwBox.sendKeys(faker.internet().password(),Keys.ENTER);
    }




    @Then("user should see the cydeo main page")
    public void user_should_see_the_cydeo_main_page() {
        String expectedTitle = "Dashboard - Cydeo";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actual);

        //Assert.assertTrue(expectedTitle.equals(actual));
    }


}
