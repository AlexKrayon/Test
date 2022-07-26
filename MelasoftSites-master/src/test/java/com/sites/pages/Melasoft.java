package com.sites.pages;

import com.sites.utilities.BrowserUtilities;
import com.sites.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Melasoft extends BasePage {

    @FindBy(css = ".olark-close-icon")
    public WebElement closeButtonForChat;

    @FindBy(xpath = "//img[@class='fusion-standard-logo']")
    public WebElement logo;

    @FindBy(css = "#cookie_action_close_header")
    public WebElement acceptButtonForCookies;

    @FindBy(xpath = "//span[@id='cookie_hdr_showagain']")
    public WebElement privacyCookiesPolicy;

    @FindBy(xpath = "//span[@class='menu-text'][normalize-space()='Home']")
    public WebElement home;

    @FindBy(xpath = "(//span[@class='fusion-button-text'][normalize-space()='Read More'])[1]")
    public WebElement readMoreButtonETransformation;

    @FindBy(xpath = "(//span[@class='fusion-button-text'][normalize-space()='Read More'])[2]")
    public WebElement readMoreButtonAddOn;

    @FindBy(xpath = "//h1[normalize-space()='What is IFRS?']")
    public WebElement text_whatIsIFRS;

    @FindBy(xpath = "(//span[@class='fusion-button-text'][normalize-space()='Read More'])[3]")
    public WebElement readMoreButtonSecurity;

    @FindBy(xpath = "//h1[normalize-space()='What is e-Invoice?']")
    public WebElement text_whatIsEInvoice;

    @FindBy(xpath = "//h2[contains(text(),'GDPR – KVKK')]")
    public WebElement text_GDPRKVKK;

    @FindBy(xpath = "//h1[normalize-space()='What is e-Archive ?']")
    public WebElement text_whatIsEArchive;

    @FindBy(xpath = "//h1[normalize-space()='What is e-Waybill?']")
    public WebElement text_whatIsEWaybill;

    @FindBy(xpath = "//h1[normalize-space()='What is e-Ledger?']")
    public WebElement text_whatIsELedger;

    @FindBy(xpath = "//h4[normalize-space()='Melasoft SAP e-Accounting Slip']")
    public WebElement text_melasoftSAPEAccountingSlip;

    @FindBy(xpath = "//h1[normalize-space()='What is e-Reconciliation?']")
    public WebElement text_whatIsEReconciliation;

    @FindBy(xpath = "(//div[normalize-space()='Melasoft GEKAP Solution'])[1]")
    public WebElement text_melasoftGEKAPSolution;

    @FindBy(xpath = "//h1[normalize-space()='What is PEPPOL?']")
    public WebElement text_whatIsPEPPOL;

    @FindBy(xpath = "//h1[normalize-space()='What are XRechnung and ZUGFeRD?']")
    public WebElement text_whatAreXRechnungAndZUGFeRD;

    @FindBy(xpath = "//b[normalize-space()='E-Invoice and E-Reporting in France']")
    public WebElement text_eInvoiceAndEReportingInFrance;

    @FindBy(xpath = "//b[normalize-space()='France | Factur-X']")
    public WebElement text_franceFacturX;

    @FindBy(xpath = "//b[normalize-space()='What is RTIR E-Invoice?']")
    public WebElement text_whatIsRTIREInvoice;

    @FindBy(xpath = "//b[normalize-space()='Poland | E-Faktura']")
    public WebElement text_polandEFaktura;

    @FindBy(xpath = "//b[normalize-space()='Portugal | E-Invoice']")
    public WebElement text_portugalEInvoice;

    @FindBy(xpath = "//h1[normalize-space()='Kazakhstan E-Invoice']")
    public WebElement text_kazakhstanEInvoice;

    @FindBy(xpath = "//h1[normalize-space()='Virtual Warehouse']")
    public WebElement text_virtualWarehouse;

    @FindBy(xpath = "//b[normalize-space()='EGYPT E-INVOICE']")
    public WebElement text_egyptEInvoice;

    @FindBy(css = "li[id='menu-item-3164'] i[class='fusion-dropdown-indicator']")
    public WebElement languageDropdownButton;

    @FindBy(xpath = "//p[contains(text(),'DBS Çözümü, e-Mutabakat Çözümü, Gayrimenkul Yöneti')]")
    public WebElement text_DBSCozumu;

    @FindBy(xpath = "(//p[contains(text(),'Anpassung an die')])[1]")
    public WebElement text_anpassungAnDie;

    @FindBy(xpath = "//p[contains(text(),'Capacité à gérer tous les processus et adaptations')]")
    public WebElement text_capaticeAGerer;

    @FindBy(xpath = "//p[contains(text(),'Компания-разработчикпрограммного обеспечения с вид')]")
    public WebElement text_russian;

    @FindBy(xpath = "//span[contains(text(),'بدأت شركة ميلاسوفت لتكنولوجيا المعلومات انشطتها سن')]")
    public WebElement text_arabic;

    @FindBy(xpath = "//p[contains(text(),'Dziś nadal aktywnie uczestniczymy w projektach kra')]")
    public WebElement text_dzisNadal;

    @FindBy(xpath = "//p[contains(text(),'As Melasoft Information Technologies we offer serv')]")
    public WebElement text_asMelasoftInformationTechnologies;

    @FindBy(xpath = "//p[contains(text(),'Melasoft designs the most accurate')]")
    public WebElement text_melasoftDesignsTheMost;

    @FindBy(xpath = "//span[contains(text(),'Within the scope of SAP technical consultancy, we ')]")
    public WebElement text_withinTheScopeOfSAP;

    @FindBy(xpath = "//p[contains(text(),'Product Development is also known as New Product')]")
    public WebElement text_productDevelopmentIsAlsoKnown;

    @FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='About'])[1]")
    public WebElement aboutButton;

    @FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='About'])[1]")
    public WebElement text_whoAreWe;

    @FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='Blog'])[1]")
    public WebElement blogButton;

    @FindBy(xpath = "//strong[normalize-space()='Vendor Invoice Management']")
    public WebElement text_vendorInvoiceManagement;

    @FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='Contact'])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "//h3[normalize-space()='Contact Information']")
    public WebElement text_contactInformation;

    public void clickLanguageDropDown(String string) {
        String locator = "(//span[contains(text(),'" + string + "')])[1]";
        WebElement element = Driver.get().findElement(By.xpath(locator));
        BrowserUtilities.hover(languageDropdownButton);
        element.click();
    }

}
