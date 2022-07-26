package com.sites.step_defs;

import com.sites.pages.Melasoft;
import com.sites.pages.SAPeInvoice;
import io.cucumber.java.en.*;

public class SAPEInvoiceStepDefs {

    SAPeInvoice sapEInvoice = new SAPeInvoice();
    Melasoft melasoft = new Melasoft();

    @Then("verify that the SAP-eInvoice site is opened")
    public void verify_that_the_sap_e_ınvoice_site_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.logo);
        sapEInvoice.verifyPage(sapEInvoice.textHome);
    }
    @When("the user clicks Read More button for {string}")
    public void the_user_clicks_read_more_button_for(String string) {
        sapEInvoice.navigateToCountry(string);
    }
    @Then("verify that the page which is related with Read More button for TURKEY button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_turkey_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textTurkey);
    }
    @Then("verify that the page which is related with Read More button for EUROPE button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_europe_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textEurope);
    }
    @Then("verify that the page which is related with Read More button for GERMANY button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_germany_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textGermany);
    }
    @Then("verify that the page which is related with Read More button for FRANCE button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_france_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textFrance);
    }
    @Then("verify that the page which is related with Read More button for HUNGARY button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_hungary_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textHungary);
    }
    @Then("verify that the page which is related with Read More button for SERBIA button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_serbia_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textSerbia);
    }
    @Then("verify that the page which is related with Read More button for KAZAKHSTAN button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_kazakhstan_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textKazakhstan);
    }
    @Then("verify that the page which is related with Read More button for EGYPT button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_egypt_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textEgypt);
    }
    @Then("verify that the page which is related with Read More button for PORTUGAL button is opened")
    public void verify_that_the_page_which_is_related_with_read_more_button_for_portugal_button_is_opened() {
        sapEInvoice.verifyPage(sapEInvoice.textPortugal);
    }
    @When("the user clicks {string} icon in SAP-eInvoice homepage")
    public void the_user_clicks_icon_in_sap_e_ınvoice_homepage(String string) {
        sapEInvoice.navigateToSocialMedia(string);
    }
    @Then("verify that Facebook Melasoft page is opened")
    public void verify_that_facebook_melasoft_page_is_opened() {
        sapEInvoice.verifyPageInTheNewTab(sapEInvoice.textFacebook);
    }
    @Then("verify that Twitter Melasoft page is opened")
    public void verify_that_twitter_melasoft_page_is_opened() {
        sapEInvoice.verifyPageInTheNewTab(sapEInvoice.textTwitter);
    }
    @Then("verify that Youtube Melasoft page is opened")
    public void verify_that_youtube_melasoft_page_is_opened() {
        sapEInvoice.verifyPageInTheNewTab(sapEInvoice.textYoutube);
    }
    @Then("verify that Instagram Melasoft page is opened")
    public void verify_that_instagram_melasoft_page_is_opened() {
        sapEInvoice.verifyPageInTheNewTab(sapEInvoice.textInstagram);
    }
    @Then("verify that Linkedin Melasoft page is opened")
    public void verify_that_linkedin_melasoft_page_is_opened() {
        sapEInvoice.verifyPageInTheNewTab(sapEInvoice.textLinkedin);
    }
    @When("the user navigates to {string} - {string} in SAP-eInvoice")
    public void the_user_navigates_to_in_sap_e_ınvoice(String string1, String string2) {
        sapEInvoice.navigatePageSAPeInvoice(string1, string2);
    }
    @Then("verify that Turkey Accounting Slip page is opened in SAP eInvoice website")
    public void verify_that_turkey_accounting_slip_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textTurkeyEAccountingSlip);
    }
    @Then("verify that Turkey E-Archive page is opened in SAP eInvoice website")
    public void verify_that_turkey_e_archive_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textTurkeyEArchive);
    }
    @Then("verify that Turkey E-Invoice page is opened in SAP eInvoice website")
    public void verify_that_turkey_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textTurkeyEInvoice);
    }
    @Then("verify that Turkey E-Ledger page is opened in SAP eInvoice website")
    public void verify_that_turkey_e_ledger_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textTurkeyELedger);
    }
    @Then("verify that Turkey E-Waybill page is opened in SAP eInvoice website")
    public void verify_that_turkey_e_waybill_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textTurkeyEWaybill);
    }
    @Then("verify that Europe PEPPOL page is opened in SAP eInvoice website")
    public void verify_that_europe_peppol_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textEuropePeppol);
    }
    @Then("verify that France eInvoice page is opened in SAP e-Invoice website")
    public void verify_that_france_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textFranceEInvoice);
    }
    @Then("verify that France Factur-X page is opened in SAP e-Invoice website")
    public void verify_that_france_factur_x_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textFranceFacturX);
    }
    @Then("verify that Germany XRechnung and ZUGFeRD page is opened in SAP e-Invoice website")
    public void verify_that_germany_x_rechnung_and_zug_fe_rd_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textGermanyXRechnungZUGFeRD);
    }
    @Then("verify that Hungary RTIR E-Invoice page is opened in SAP e-Invoice website")
    public void verify_that_hungary_rtir_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textHungaryRTIREInvoice);
    }
    @Then("verify that Poland E-Faktura page is opened in SAP e-Invoice website")
    public void verify_that_poland_e_faktura_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textPolandEFaktura);
    }
    @Then("verify that Portugal E-Invoice page is opened in SAP e-Invoice website")
    public void verify_that_portugal_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textPortugalEInvoice);
    }
    @Then("verify that Serbia E-Invoice page is opened in SAP e-Invoice website")
    public void verify_that_serbia_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textSerbiaEInvoice);
    }
    @Then("verify that Kazakhstan E-Invoice page is opened in SAP e-Invoice website")
    public void verify_that_kazakhstan_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textKazakhstanEInvoice);
    }
    @Then("verify that Kazakhstan Virtual Warehouse page is opened in SAP e-Invoice website")
    public void verify_that_kazakhstan_virtual_warehouse_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textKazakhstanVirtualWarehouse);
    }
    @Then("verify that KSA E-Invoice page is opened in SAP e-Invoice website")
    public void verify_that_ksa_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textKSAEInvoice);
    }
    @Then("verify that Egypt E-Invoice page is opened in SAP e-Invoice website")
    public void verify_that_egypt_e_invoice_page_is_opened_in_sap_e_invoice_website() {
        sapEInvoice.verifyPage(sapEInvoice.textEgyptEInvoice);
    }
    @When("the user clicks About Us button")
    public void the_user_clicks_about_us_button() {
        sapEInvoice.clickAboutUs();
    }
    @Then("verify that About Us page is opened in SAP-eInvoice")
    public void verify_that_about_us_page_is_opened_in_sap_e_ınvoice() {
        sapEInvoice.verifyPage(sapEInvoice.textAboutUs);
    }
    @When("the user clicks Blog button in SAP-eInvoice")
    public void the_user_clicks_blog_button_in_sap_e_ınvoice() {
        sapEInvoice.clickBlog();
    }
    @Then("verify that Blog page is opened in SAP-eInvoice")
    public void verify_that_blog_page_is_opened_in_sap_e_ınvoice() {
        sapEInvoice.verifyPage(sapEInvoice.textBlog);
    }
    @When("the user clicks Contact button in SAP-eInvoice")
    public void the_user_clicks_contact_button_in_sap_e_ınvoice() {
        sapEInvoice.clickContact();
    }
    @Then("verify that Contact page is opened in SAP-eInvoice")
    public void verify_that_contact_page_is_opened_in_sap_e_ınvoice() {
        sapEInvoice.verifyPage(sapEInvoice.textContact);
    }
    @When("the user clicks HOME button in SAP-eInvoice")
    public void the_user_clicks_home_button_in_sap_e_invoice() {
        sapEInvoice.clickHome();
    }
    @Then("verify that Home page is opened in SAP-eInvoice")
    public void verify_that_home_page_is_opened_in_sap_e_invoice() {
        sapEInvoice.verifyPage(sapEInvoice.textHome);
    }
    @When("the user changes language {string} into {string} in SAP-eInvoice")
    public void the_user_changes_language_into_in_sap_e_invoice(String string1, String string2) {
        sapEInvoice.changeLanguage(string1, string2);
    }
    @Then("verify that the page is in German in SAP-eInvoice")
    public void verify_that_the_page_is_in_german_in_sap_e_ınvoice() {
        sapEInvoice.verifyPage(sapEInvoice.textGerman);
    }
    @Then("verify that the page is in Arabic in SAP-eInvoice")
    public void verify_that_the_page_is_in_arabic_in_sap_e_ınvoice() {
        sapEInvoice.verifyPage(sapEInvoice.textArabic);
    }


}
