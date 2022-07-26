package com.sites.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EReconciliation extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Would you like to save time by making your reconci')]")
    public WebElement text_wouldYouLike;

    @FindBy(xpath = "//img[@class='fusion-standard-logo']")
    public WebElement logo;

    @FindBy(xpath = "//span[contains(text(),'Mutabakatlarınızı dijital')]")
    public WebElement text_mutabakatlariniziDijital;

    @FindBy(css = "#slider-1-slide-1-layer-8")
    public WebElement getAQuoteButton;

    @FindBy(xpath = "//p[normalize-space()='Contact']")
    public WebElement text_contact;

    @FindBy(xpath = "//a[@class='fusion-button button-flat button-large button-custom button-1 fusion-button-default-span fusion-button-default-type']")
    public WebElement detailedInfoButton_eDeclaration;

    @FindBy(xpath = "//h1[normalize-space()='What is e-Explicit Consent?']")
    public WebElement text_whatIsAEExplicitConsent;

    @FindBy(xpath = "//a[@class='fusion-button button-flat button-large button-custom button-2 fusion-button-default-span fusion-button-default-type']")
    public WebElement detailedInfoButton_eAccountStatement;

    @FindBy(xpath = "//h1[normalize-space()='Melasoft e-Account Statement']")
    public WebElement text_melasoftEAccountStatement;

    @FindBy(xpath = "//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1574']//a[@class='fusion-bar-highlight']")
    public WebElement eConsentButton;

    @FindBy(xpath = "(//a[@class='fusion-bar-highlight'])[7]")
    public WebElement eAccountStatementButton;

    @FindBy(xpath = "(//a[@class='fusion-bar-highlight'])[12]")
    public WebElement blogButton;

    @FindBy(xpath = "//a[normalize-space()='Notification with BA and BS Forms']")
    public WebElement text_notificationWithBAAndBSForms;

    @FindBy(xpath = "(//a[@class='fusion-bar-highlight'])[13]")
    public WebElement contactUsButton;

    @FindBy(xpath = "(//a[@class='fusion-bar-highlight'])[15]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='E-posta']")
    public WebElement epostaTextbox;

    @FindBy(xpath = "(//a[@class='fusion-bar-highlight'])[14]")
    public WebElement registerButton;

    @FindBy(id = "nf-field-171")
    public WebElement nameField;

    @FindBy(xpath = "(//button[@class='close'])[1]")
    public WebElement closeButton;

    @FindBy(xpath = "(//a[contains(@class,'fusion-bar-highlight')])[16]")
    public WebElement languageSelectionBox;

    @FindBy(xpath = "(//span[@style='margin-left:0.3em;'])[2]")
    public WebElement turkish;

    @FindBy(xpath = "(//span[contains(text(),'Deutsch')])[1]")
    public WebElement deutsch;

    @FindBy(xpath = "//span[contains(text(),'Wollen Sie sich die Zeit sparen, indem Sie Ihre Ma')]")
    public WebElement text_wollenSieSichDieZeitSparen;

}
