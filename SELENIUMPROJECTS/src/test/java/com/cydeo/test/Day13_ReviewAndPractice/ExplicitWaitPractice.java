package com.cydeo.test.Day13_ReviewAndPractice;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import com.cydeo.pages.DynamicControlPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractice {

    DynamicControlPage dynamicControlPage;
    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlPage = new DynamicControlPage();

    }

    @Test
    public void remove_button_test() {
    dynamicControlPage.removeButton.click();

       //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),10);
        //webDriverWait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);

        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!dynamicControlPage.checkBox.isDisplayed());
            Assert.assertFalse(dynamicControlPage.checkBox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }



        Assert.assertTrue(dynamicControlPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's gone!"));
    }

    @Test
    public void enable_button_test(){
        dynamicControlPage.enableButton.click();

        System.out.println("dynamicControlPage.inputBox.isEnabled() = "
                + dynamicControlPage.inputBox.isEnabled());

        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);

        System.out.println("dynamicControlPage.inputBox.isEnabled() = "
                + dynamicControlPage.inputBox.isEnabled());

        Assert.assertTrue(dynamicControlPage.inputBox.isEnabled());

        Assert.assertTrue(dynamicControlPage.message.isDisplayed());

        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's enabled!"));


    }
}
