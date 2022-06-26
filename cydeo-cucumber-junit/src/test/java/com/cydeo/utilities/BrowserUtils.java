package com.cydeo.utilities;

import com.cydeo.pages.OrderPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    //This method will accept int execute Thread.sleep for given duration

    public static void sleep (int second){
        second*=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void doubleClick(WebElement element){
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();

    }

    public static WebElement waitForVisibility (WebElement element, int timeToWaitInSec){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void switchWindowAndVerify (String expectedInUrl, String expectedInTitle){
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for(String each : allWindowsHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains("etsy")){
                break;
            }

        }
        String actualTitle = Driver.getDriver().getTitle();
        //String expectedTitle = "Etsy";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),10);
        webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static List<String>dropdownOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        List<WebElement>actualOptionsAsWebElement=select.getOptions();

        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptions.add(each.getText());
        }
        return actualOptions;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

       // List<WebElement> cardType= OrderPage.cardType;

        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }

}
