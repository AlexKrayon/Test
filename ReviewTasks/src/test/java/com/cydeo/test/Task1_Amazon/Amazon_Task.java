package com.cydeo.test.Task1_Amazon;

import com.cydeo.Utility.BrowserUtilities;
import com.cydeo.Utility.ConfReader;
import com.cydeo.Utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Task {

    @Test
    public void amazonTest(){
        Driver.getDriver().get("https://www.amazon.com");
/*
        WebElement searchButton = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        searchButton.sendKeys(ConfReader.getProperty("searchValue")+ Keys.ENTER);

        WebElement firstHat = Driver.getDriver().findElement(By.xpath("(//img[@class='s-image'])[1]"));
        firstHat.click();

        WebElement quantity =Driver.getDriver().findElement(By.xpath("//span[@class='a-dropdown-label']"));
        Select select = new Select(quantity);
        select.selectByValue("1");

        WebElement addToChartButton = Driver.getDriver().findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToChartButton.click();

        WebElement goToChart = Driver.getDriver().findElement(By.xpath("//span[@id='sw-gtc']"));
        goToChart.click();
/*
        WebElement priceWholeHat = Driver.getDriver().findElement("");
        WebElement priceDecimalPart = Driver.getDriver().findElement("");
        Double priceHat = Double.parseDouble(priceWholeHat.getText()+" : "+priceDecimalPart.getText());

        WebElement priceWholeHat2 = Driver.getDriver().findElement("");
        WebElement priceDecimalPart2 = Driver.getDriver().findElement("");

        Double totalPrice = Double.parseDouble(priceDecimalPart2.getText()+" : "+priceWholeHat2.getText());

        Assert.assertEquals(totalPrice,priceHat*2);

        WebElement quantityInChart = Driver.getDriver().findElement("");
        String actualQuantity = quantityInChart.getText();
        String expectedQuantity = "2 items";
        Assert.assertTrue(actualQuantity.contains(expectedQuantity));


        Select select2 = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='quantity']")));
        select2.selectByVisibleText("1");

        BrowserUtilities.sleep(3);

        WebElement wholePriceTotal2 = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
        WebElement decimalPriceTotal2 = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-fraction'])[3]"));
        totalPrice=Double.parseDouble(wholePriceTotal2.getText()+"."+decimalPriceTotal2.getText());

        Assert.assertEquals(totalPrice,priceHat);

        Driver.closeDriver();

*/

    }


    /*
     * For the Tasks bellow create a new Maven Project, use the latest topics you have learned,
     *like Page Object Modeling, singleton Driver class.
     * Share your project on GitHub, create a commit history.
     * Also for each different task create a branch, then merge it when the task is over.
     * (Optional; share you project Github Link at Tasks and Solutions Channel on Discord.)
     *
     * Task 1: The task consists on the next steps:
     * 1.	Go to https://www.amazon.com
     * 2.	Search for "hats for men" (Call from Configuration.properties file)
     * 3.	Add the first hat appearing to Cart with quantity 2
     * 4.	Open cart and assert that the total price and quantity are correct
     * 5.	Reduce the quantity from 2 to 1 in Cart for the item selected in the step 3
     * 6.	Assert that the total price and quantity has been correctly changed
     * The goal of this test is to check if you are able to automate a test of a given website,
     * but we'd like you to also demonstrate the coding quality, structure,
     * and style of the deliverables.
     */

}
