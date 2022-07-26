package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement homepageHeader;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement launchPad;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement ownName;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

}




