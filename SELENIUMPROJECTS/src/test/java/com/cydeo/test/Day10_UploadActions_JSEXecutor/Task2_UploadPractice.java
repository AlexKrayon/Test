package com.cydeo.test.Day10_UploadActions_JSEXecutor;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_UploadPractice {

    @Test
    public void upload_test() throws InterruptedException {

        Driver.getDriver().get("https://practice.cydeo.com/upload");

       String path = "C:\\Users\\crayo\\OneDrive\\Masaüstü\\gencler.jpg";

        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        Thread.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@class='button']"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedHeader.isDisplayed());



    }


}
