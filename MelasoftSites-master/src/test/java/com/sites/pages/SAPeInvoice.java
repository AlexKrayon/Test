package com.sites.pages;

import com.sites.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SAPeInvoice extends BasePage {

    @FindBy(xpath = "//img[@class='fusion-standard-logo']")
    public WebElement logo;
    @FindBy(xpath = "//rs-layer[text()='Your global partner for E-Compliance Solutions ']")
    public WebElement textHome;
    @FindBy(xpath = "//rs-layer[text()='شريكك العالمي لحلول الامتثال الإلكتروني ']")
    public WebElement textArabic;
    @FindBy(xpath = "//rs-layer[text()='Ihr globaler Partner für E-Compliance-Lösungen ']")
    public WebElement textGerman;
    @FindBy(xpath = "//li[@id='menu-item-2343']//span[@class='menu-text'][normalize-space()='HOME']")
    public WebElement home;
    @FindBy(xpath = "//h1[normalize-space()='Turkey']")
    public WebElement textTurkey;
    @FindBy(xpath = "//b[normalize-space()='E-Invoice with PEPPOL Access Point']")
    public WebElement textEurope;
    @FindBy(xpath = "//b[normalize-space()='What are XRechnung and ZUGFeRD?']")
    public WebElement textGermany;
    @FindBy(xpath = "//b[normalize-space()='E-Invoice and E-Reporting in France']")
    public WebElement textFrance;
    @FindBy(xpath = "//b[normalize-space()='What is an RTIR E-Invoice?']")
    public WebElement textHungary;
    @FindBy(xpath = "//p[contains(text(),'Like other EU countries, Portugal has also regulat')]")
    public WebElement textPortugal;
    @FindBy(xpath = "//b[normalize-space()='eInvoicing in Serbia']")
    public WebElement textSerbia;
    @FindBy(xpath = "//span[contains(text(),'The e-invoice, which saves labor and paper and off')]")
    public WebElement textEgypt;
    @FindBy(xpath = "//p[contains(text(),'Meet with Melasoft’s digital compliance solutions ')]")
    public WebElement textKazakhstan;
    @FindBy(xpath = "//h1[normalize-space()='Melasoft Information Technologies']")
    public WebElement textFacebook;
    @FindBy(xpath = "//span[contains(text(),'We develop your business ideas!')]")
    public WebElement textTwitter;
    @FindBy(xpath = "//div[@id='inner-header-container']//yt-formatted-string[text()='Melasoft Information Technologies']")
    public WebElement textYoutube;
    @FindBy(xpath = "//h2[normalize-space()='melasoftinformation']")
    public WebElement textInstagram;
    @FindBy(xpath = "//h1[@id='ember29']//span[@dir='ltr'][normalize-space()='MELASOFT']")
    public WebElement textLinkedin;
    @FindBy(xpath = "//b[normalize-space()='What is Melasoft SAP E-Accounting Slip?']")
    public WebElement textTurkeyEAccountingSlip;
    @FindBy(xpath = "//b[normalize-space()='What is an e-Archive?']")
    public WebElement textTurkeyEArchive;
    @FindBy(xpath = "//b[normalize-space()='What is an e-invoice?']")
    public WebElement textTurkeyEInvoice;
    @FindBy(xpath = "//b[normalize-space()='What is E-Ledger?']")
    public WebElement textTurkeyELedger;
    @FindBy(xpath = "//b[normalize-space()='What is e-Waybill?']")
    public WebElement textTurkeyEWaybill;
    @FindBy(xpath = "//b[normalize-space()='E-Invoice with PEPPOL Access Point']")
    public WebElement textEuropePeppol;
    @FindBy(xpath = "//b[normalize-space()='E-Invoice and E-Reporting in France']")
    public WebElement textFranceEInvoice;
    @FindBy(xpath = "//p[contains(text(),'French agency for financial informatics (AIFE-Agen')]")
    public WebElement textFranceFacturX;
    @FindBy(xpath = "//b[normalize-space()='What are XRechnung and ZUGFeRD?']")
    public WebElement textGermanyXRechnungZUGFeRD;
    @FindBy(xpath = "//b[normalize-space()='What is an RTIR E-Invoice?']")
    public WebElement textHungaryRTIREInvoice;
    @FindBy(xpath = "//p[contains(text(),'The law implementing the e-billing directive (2014')]")
    public WebElement textPolandEFaktura;
    @FindBy(xpath = "//p[contains(text(),'Like other EU countries, Portugal has also regulat')]")
    public WebElement textPortugalEInvoice;
    @FindBy(xpath = "//span[contains(text(),'The introduction of electronic invoicing in Serbia')]")
    public WebElement textSerbiaEInvoice;
    @FindBy(xpath = "//p[contains(text(),'All taxpayers in Kazakhstan are required to issue ')]")
    public WebElement textKazakhstanEInvoice;
    @FindBy(xpath = "//p[contains(text(),'Companies in the Kazakh e-invoicing system must re')]")
    public WebElement textKazakhstanVirtualWarehouse;
    @FindBy(xpath = "//b[@data-fusion-font='true']")
    public WebElement textKSAEInvoice;
    @FindBy(xpath = "//span[contains(text(),'The e-invoice, which saves labor and paper and off')]")
    public WebElement textEgyptEInvoice;
    @FindBy(xpath = "//li[@id='menu-item-2008']//span[@class='menu-text'][normalize-space()='ABOUT US']")
    public WebElement aboutUs;
    @FindBy(xpath = "//p[contains(text(),'Melasoft Information Technologies, a software comp')]")
    public WebElement textAboutUs;
    @FindBy(xpath = "//li[@id='menu-item-2630']//span[@class='menu-text'][normalize-space()='BLOG']")
    public WebElement blog;
    @FindBy(xpath = "//h1[normalize-space()='Blog']")
    public WebElement textBlog;
    @FindBy(xpath = "//li[@id='menu-item-2039']//span[@class='menu-text'][normalize-space()='CONTACT']")
    public WebElement contact;
    @FindBy(xpath = "//h2[contains(text(),'Let’s work together')]")
    public WebElement textContact;

    public void navigateToCountry(String string) {
        String locator = "//b[contains(text(),'" + string + "')]/../../../../../..//*[contains(text(),'READ MORE')]";

        WebElement element = Driver.get().findElement(By.xpath(locator));

        element.click();
    }

    public void navigateToSocialMedia(String string) {
        String locator = "//div[@class='fusion-social-networks']//a[@class='fusion-social-network-icon fusion-tooltip fusion-" + string + " awb-icon-" + string + "']";
        WebElement element = Driver.get().findElement(By.xpath(locator));
        element.click();
    }


    public void navigatePageSAPeInvoice(String string1, String string2) {

        String locator1 = "(//span[@class='menu-text'][normalize-space()='" + string1 + "'])[1]";
        String locator2 = "(//ul[@class='sub-menu']//span[contains(text(),'" + string2 + "')])[1]";

        WebElement element1 = Driver.get().findElement(By.xpath(locator1));
        WebElement element2 = Driver.get().findElement(By.xpath(locator2));

        hoverAndClickButton(element1,element2);
    }

    public void clickAboutUs() {
        aboutUs.click();
    }
    public void clickBlog() {
        blog.click();
    }
    public void clickContact() {
        contact.click();
    }
    public void clickHome() {
        home.click();
    }
    public void changeLanguage(String string1, String string2) {
        String locator1 = "(//span[@class='menu-text'][normalize-space()='" + string1 + "'])[1]";
        String locator2 = "(//ul[@class='sub-menu']//span[contains(text(),'" + string2 + "')])[1]";
        WebElement element1 = Driver.get().findElement(By.xpath(locator1));
        WebElement element2 = Driver.get().findElement(By.xpath(locator2));
        hoverAndClickButton(element1,element2);
    }
}
