package com.cydeo.test.Day12_pom_design_explicit_wait;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="//button[.='Start']")
    public WebElement startButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(css = "#username")
    public WebElement inputUsername;

    @FindBy(css = "#pwd")
    public WebElement inputPassword;

    @FindBy(xpath= "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement errorMessage;




}
