package com.sites.step_defs;

import com.sites.pages.Melasoft;
import com.sites.utilities.BrowserUtilities;
import io.cucumber.java.en.*;

public class MelasoftStepDefs {

    Melasoft melasoft = new Melasoft();

    @Given("the user navigates to {string} website")
    public void the_user_navigates_to_website(String pageName) {
        melasoft.openHomePage(pageName);
    }

    @Then("verify that Now chatting is appeared")
    public void verify_that_Now_chatting_is_appeared() {
        try {
            melasoft.verifyPage(melasoft.nowChatting);
            melasoft.clickButton(melasoft.closeButtonForChat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("the user clicks Accept button for cookies")
    public void the_user_clicks_Accept_button_for_cookies() {
        BrowserUtilities.explicitlyWaitVisible(melasoft.privacyCookiesPolicy);
        melasoft.clickButton(melasoft.privacyCookiesPolicy);
        melasoft.clickButton(melasoft.acceptButtonForCookies);
    }

    @Then("verify that the Melasoft site is opened")
    public void verify_that_the_melasoft_site_is_opened() {
        melasoft.verifyPage(melasoft.logo);
    }

    @When("the user navigates to {string} - {string}")
    public void the_user_navigates_to(String string1, String string2) {
        melasoft.navigatePage(string1, string2);
    }

    @Then("verify that eInvoice page is opened on SAP e-Invoice")
    public void verify_that_eInvoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsEInvoice);
    }

    @Then("verify that eArchive page is opened")
    public void verify_that_eArchive_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsEArchive);
    }

    @Then("verify that eWaybill page is opened")
    public void verify_that_eWaybill_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsEWaybill);
    }

    @Then("verify that eLedger page is opened")
    public void verify_that_eLedger_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsELedger);
    }

    @Then("verify that eAccounting Slip page is opened")
    public void verify_that_eAccounting_Slip_page_is_opened() {
        melasoft.verifyPage(melasoft.text_melasoftSAPEAccountingSlip);
    }

    @Then("verify that eReconcilation Solution page is opened")
    public void verify_that_eReconcilation_Solution_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsEReconciliation);
    }

    @Then("verify that Recycling Contribution Fee Declaration page is opened")
    public void verify_that_Recycling_Contribution_Fee_Declaration_page_is_opened() {
        melasoft.verifyPage(melasoft.text_melasoftGEKAPSolution);
    }

    @Then("verify that PEPPOL page is opened")
    public void verify_that_PEPPOL_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsPEPPOL);
    }

    @Then("verify that Germany XRechnung and ZUGFeRD page is opened")
    public void verify_that_Germany_XRechnung_and_ZUGFeRD_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatAreXRechnungAndZUGFeRD);
    }

    @Then("verify that France eInvoice page is opened on SAP e-Invoice")
    public void verify_that_France_eInvoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_eInvoiceAndEReportingInFrance);
    }

    @Then("verify that France Factur-X page is opened")
    public void verify_that_France_Factur_X_page_is_opened() {
        melasoft.verifyPage(melasoft.text_franceFacturX);
    }

    @Then("verify that Hungary RTIR eInvoice page is opened on SAP e-Invoice")
    public void verify_that_Hungary_RTIR_eInvoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsRTIREInvoice);
    }

    @Then("verify that Poland eInvoice page is opened on SAP e-Invoice")
    public void verify_that_Poland_eInvoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_polandEFaktura);
    }

    @Then("verify that Portugal eInvoice page is opened on SAP e-Invoice")
    public void verify_that_Portugal_eInvoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_portugalEInvoice);
    }

    @Then("verify that Kazakhistan eInvoice page is opened on SAP e-Invoice")
    public void verify_that_Kazakhistan_eInvoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_kazakhstanEInvoice);
    }

    @Then("verify that Kazakhistan Virtual Warehouse page is opened")
    public void verify_that_Kazakhistan_Virtual_Warehouse_page_is_opened() {
        melasoft.verifyPage(melasoft.text_virtualWarehouse);
    }

    @Then("verify that Egypt E-Invoice page is opened")
    public void verify_that_Egypt_E_Invoice_page_is_opened() {
        melasoft.verifyPage(melasoft.text_egyptEInvoice);
    }

    @Then("verify that SAP Functional Consultancy page is opened")
    public void verify_that_SAP_Functional_Consultancy_page_is_opened() {
        melasoft.verifyPage(melasoft.text_asMelasoftInformationTechnologies);
    }

    @Then("verify that SAP Project Consultancy page is opened")
    public void verify_that_SAP_Project_Consultancy_page_is_opened() {
        melasoft.verifyPage(melasoft.text_melasoftDesignsTheMost);
    }

    @Then("verify that SAP Technical Consultancy page is opened")
    public void verify_that_SAP_Technical_Consultancy_page_is_opened() {
        melasoft.verifyPage(melasoft.text_withinTheScopeOfSAP);
    }

    @Then("verify that Product Development page is opened")
    public void verify_that_Product_Development_page_is_opened() {
        melasoft.verifyPage(melasoft.text_productDevelopmentIsAlsoKnown);
    }

    @When("the user clicks About \\(Melasoft) button")
    public void the_user_clicks_About_Melasoft_button() {
        melasoft.clickButton(melasoft.aboutButton);
    }

    @Then("verify that About \\(Melasoft) page is opened")
    public void verify_that_About_Melasoft_page_is_opened() {
        melasoft.verifyPage(melasoft.text_whoAreWe);
    }

    @When("the user clicks Blog \\(Melasoft) button")
    public void the_user_clicks_Blog_Melasoft_button() {
        melasoft.clickButton(melasoft.blogButton);
    }

    @Then("verify that Blog \\(Melasoft) page is opened")
    public void verify_that_Blog_Melasoft_page_is_opened() {
        melasoft.verifyPage(melasoft.text_vendorInvoiceManagement);
    }

    @When("the user clicks Contact \\(Melasoft) button")
    public void the_user_clicks_Contact_Melasoft_button() {
        melasoft.clickButton(melasoft.contactButton);
    }

    @Then("verify that Contact \\(Melasoft) page is opened")
    public void verify_that_Contact_Melasoft_page_is_opened() {
        melasoft.verifyPage(melasoft.text_contactInformation);
    }

    @When("the user clicks Read More \\(SAP e-Transformation Solutions) button")
    public void the_user_clicks_Read_More_SAP_e_Transformation_Solutions_button() {
        melasoft.clickButtonUnderSide(melasoft.readMoreButtonETransformation);
    }

    @Then("verify that the page which is related with Read More \\(SAP e-Transformation Solutions) button is opened")
    public void verify_that_the_page_which_is_related_with_Read_More_SAP_e_Transformation_Solutions_button_is_opened() {
        melasoft.verifyPageLowerSide(melasoft.text_whatIsEInvoice);
    }

    @When("the user clicks Read More \\(SAP Add-On Solutions) button")
    public void the_user_clicks_Read_More_SAP_Add_On_Solutions_button() {
        melasoft.clickButtonUnderSide(melasoft.readMoreButtonAddOn);
    }

    @Then("verify that the page which is related with Read More \\(SAP Add-On Solutions) button is opened")
    public void verify_that_the_page_which_is_related_with_Read_More_SAP_Add_On_Solutions_button_is_opened() {
        melasoft.verifyPage(melasoft.text_whatIsIFRS);

    }

    @When("the user clicks Read More \\(SAP Security Solutions) button")
    public void the_user_clicks_Read_More_SAP_Security_Solutions_button() {
        melasoft.clickButtonUnderSide(melasoft.readMoreButtonSecurity);
    }

    @Then("verify that the page which is related with Read More \\(SAP Security Solutions) button is opened")
    public void verify_that_the_page_which_is_related_with_Read_More_SAP_Security_Solutions_button_is_opened() {
        melasoft.verifyPage(melasoft.text_GDPRKVKK);
    }

    @When("the user selects {string} language")
    public void the_user_selects_language(String string) {
        melasoft.clickLanguageDropDown(string);
    }

    @Then("verify that the page is in Turkish")
    public void verify_that_the_page_is_in_Turkish() {
        melasoft.verifyPageLowerSide(melasoft.text_DBSCozumu);
    }

    @Then("verify that the page is in German")
    public void verify_that_the_page_is_in_German() {
        melasoft.verifyPageLowerSide(melasoft.text_anpassungAnDie);
    }

    @Then("verify that the page is in French")
    public void verify_that_the_page_is_in_French() {
        melasoft.verifyPageLowerSide(melasoft.text_capaticeAGerer);
    }

    @Then("verify that the page is in Russian")
    public void verify_that_the_page_is_in_Russian() {
        melasoft.verifyPage(melasoft.text_russian);
    }

    @Then("verify that the page is in Arabic")
    public void verify_that_the_page_is_in_Arabic() {
        melasoft.verifyPageLowerSide(melasoft.text_arabic);
    }

    @Then("verify that the page is in Polish")
    public void verify_that_the_page_is_in_Polish() {
        melasoft.verifyPageLowerSide(melasoft.text_dzisNadal);
    }

    @And("the user navigates to main page")
    public void the_user_navigates_to_main_page() {
        melasoft.clickButton(melasoft.home);
    }

    @Then("the user goes back the previous page")
    public void the_user_goes_back_the_previous_page() {
        melasoft.goBack();
    }

}
