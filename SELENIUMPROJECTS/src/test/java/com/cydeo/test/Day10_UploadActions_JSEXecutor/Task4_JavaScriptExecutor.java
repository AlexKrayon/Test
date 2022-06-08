package com.cydeo.test.Day10_UploadActions_JSEXecutor;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Task4_JavaScriptExecutor {
    @Test
    public void jsExecutor() throws InterruptedException {
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,750)");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,750)");
        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-750)");
        }




    }


}
