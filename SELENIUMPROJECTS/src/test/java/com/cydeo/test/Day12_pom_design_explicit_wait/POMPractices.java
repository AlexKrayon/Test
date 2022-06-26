package com.cydeo.test.Day12_pom_design_explicit_wait;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.LibraryLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test() {

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

    }

    @Test
    public void invalid_email_error_message(){

        libraryLoginPage.inputUserName.sendKeys("somethingwrong");

        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test(){

        libraryLoginPage.inputUserName.sendKeys("asdffg@vbd.com");
        libraryLoginPage.inputPassword.sendKeys("nghfbdfv");

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();

    }

}
