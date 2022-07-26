package com.sites.pages;


import com.sites.utilities.BrowserUtilities;
import com.sites.utilities.ConfigReader;
import com.sites.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".olark-top-bar-text")
    public WebElement nowChatting;


    public void openHomePage(String pageName) {
        Driver.get().get(ConfigReader.get(pageName));
    }

    public void clickButton(WebElement buttonName) {
        BrowserUtilities.explicitlyWaitVisible(buttonName);
        buttonName.click();
    }

    public void goBack() {
        BrowserUtilities.forward();
    }

    public void verifyPage(WebElement element) {
        BrowserUtilities.explicitlyWaitVisible(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyPageDoesntAppear(WebElement element) {
        //BrowserUtils.explicitlyWaitVisible(element);
        Assert.assertFalse(element.isDisplayed());
    }

    public void hoverAndClickButton(WebElement elementHover, WebElement elementClick) {
        BrowserUtilities.explicitlyWaitVisible(elementHover);
        Actions action = new Actions(Driver.get());
        action.moveToElement(elementHover).perform();
        elementClick.click();
    }

    public void hoverAndClickButtonWithJS(WebElement elementHover, WebElement elementClick) {
        BrowserUtilities.explicitlyWaitVisible(elementHover);
        Actions action = new Actions(Driver.get());
        action.moveToElement(elementHover).perform();
        clickButtonWithJS(elementClick);
    }

    public void clickButtonWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", element);
    }

    public void verifyPagewithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", element);
    }

    public void verifyPageInTheNewTab(WebElement element) {
        BrowserUtilities.switchToWindow(1);
        Driver.get().manage().window().setSize(new Dimension(1920,1080));
        verifyPage(element);
        Driver.get().close();
        BrowserUtilities.switchToWindow(0);
    }

    public void navigatePage(String string1, String string2) {

        if(string1.equals("Compliance Solutions")){
        String str1="", str2="",subElement="";

        if(string2.contains("|")){
            str1 = string2.substring(0,string2.indexOf('|'));
            str2 = string2.substring(string2.indexOf('|')+2,string2.length());
            subElement = "//*[contains(text(),'" + str1 + "') and contains(text(),'" + str2+ "')]";
        }else {
            subElement = "//span[@class='fusion-megamenu-icon fusion-megamenu-image']/../..//*[contains(normalize-space(text()),'"+ string2 +"')]";
        }

        String mainElement = "//span[@class='menu-text'][text()='"+ string1 +"']";

        WebElement element1 = Driver.get().findElement(By.xpath(mainElement));
        WebElement element2 = Driver.get().findElement(By.xpath(subElement));

        hoverAndClickButton(element1,element2);
        }else if(string1.equals("Our Services")){
            String mainElement = "//span[@class='menu-text'][text()='"+ string1 +"']";
            String subElement = "//span[contains(text(),'"+ string2 +"')]";

            WebElement element1 = Driver.get().findElement(By.xpath(mainElement));
            WebElement element2 = Driver.get().findElement(By.xpath(subElement));

            hoverAndClickButton(element1,element2);
        }
    }

    public void clickButtonUnderSide(WebElement element) {
        BrowserUtilities.scrollToElement(element);
        BrowserUtilities.explicitlyWaitVisible(element);
        element.click();
    }

    public void verifyPageLowerSide(WebElement element) {
        BrowserUtilities.scrollToElement(element);
        BrowserUtilities.explicitlyWaitVisible(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyURLInTheNewTab(String url) {
        BrowserUtilities.switchToWindow(1);
        Assert.assertEquals(url, BrowserUtilities.getURL());
        Driver.get().close();
        BrowserUtilities.switchToWindow(0);
    }
}
