package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoLoginPage {
    public CydeoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Log In")
    public WebElement loginButton;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/form/div/div[2]/input")
    public WebElement emailBox;

    @FindBy(css = "input[type='password']")
    public WebElement pwBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;






}
