package com.sites.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EInvoice extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),\"Turkey's\")]")
    public WebElement text_turkeysEInvoiceInterface;

    @FindBy(xpath = "//span[contains(text(),'Apply now')]")
    public WebElement applyNowButton;

    @FindBy(xpath = "//h3[normalize-space()='Contact Information']")
    public WebElement text_contactInformation;

    @FindBy(xpath = "(//span[@class='fl-button-text'])[1]")
    public WebElement learnMoreButton_developing;

    @FindBy(xpath = "//h5[normalize-space()='What is e-Invoice?']")
    public WebElement text_whatIsEInvoice;

    @FindBy(xpath = "(//span[@class='fl-button-text'])[2]")
    public WebElement learnMoreButton_eInvoice;

    @FindBy(xpath = "//strong[normalize-space()='e-Document for Turkey']")
    public WebElement text_eDocumentForTurkey;

    @FindBy(xpath = "//span[normalize-space()='FAQ']")
    public WebElement FAQButton;

    @FindBy(xpath = "//a[normalize-space()='What is an e-invoice?']")
    public WebElement text_whatIsAnEInvoice;

}
