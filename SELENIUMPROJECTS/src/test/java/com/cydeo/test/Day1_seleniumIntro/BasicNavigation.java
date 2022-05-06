package com.cydeo.test.Day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1- Setting up the "browser driver"
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Selenium WebDriver
        // This is the line openning an empty browser
        WebDriver driver = new ChromeDriver();

        // 3- Test if the driver is working as expected (Go to "https://www.tesla.com")
        driver.get("https://www.tesla.com");  // adreste https yazılmazsa hata verir. Fakat www yazılmazsa bazen çalışır

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();
        // driver.navigate().wait();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to();
        driver.navigate().to("https://www.melasoft.com");

        // get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        //driver.close();

        //driver.quit();


    }

}
