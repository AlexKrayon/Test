package com.xfleet.pages;

import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    public void goLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    public void loginAsUserType(String userType){

        String password = "";
        String username = "";

        if (userType.equals("Driver")) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }
        else if (userType.equals("Sales Manager")) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }
        else if (userType.equals("Store Manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }

        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }


    public void loginWithCredentials(String username, String password){
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public void inputCredentials(String username, String password){
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);

    }


    public String getPageTitle(){
        return Driver.getDriver().getTitle();
    }


    @FindBy(id = "prependedInput")
    public WebElement userNameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;




    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidCredentialMessage;





    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//h2[.='Forgot Password']")
    public WebElement forgotPasswordHeader;




    @FindBy(xpath= "//*[@id=\"login-form\"]/fieldset/div[2]/label/span[1]")
    public WebElement rememberMeLink;

    @FindBy(xpath= "//*[@id=\"login-form\"]/fieldset/div[2]/label/span[1]" )
    public WebElement rememberMeCheckbox;

    @FindBy (xpath = "//h2[.='Login']")
    public WebElement LoginHeader;
}

