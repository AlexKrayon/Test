package com.cydeo.test.Day12_pom_design_explicit_wait;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.DynamicLoad7Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void dynamic_load_7_test() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");


       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
       wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());






    }

    @Test
    public void dynamic_load_1_test() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        dynamicLoad1Page.startButton.click();

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        dynamicLoad1Page.inputPassword.sendKeys("something");

        dynamicLoad1Page.submitButton.click();

        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());




    }
}
