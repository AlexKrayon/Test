package com.cydeo.test.Day11_DriverClose_Actions;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_DragAndDrop {
    @Test
    public void testDragDrop() {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement cookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookiesButton.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).moveToElement(bigCircle).perform();

        String actualText = bigCircle.getText();
        String expectedText = "Drag the small circle here.";
        Assert.assertEquals(actualText,expectedText);



    }
}
