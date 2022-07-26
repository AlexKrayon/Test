package com.sites.step_defs;

import com.sites.pages.EInvoice;
import io.cucumber.java.en.*;

public class EInvoiceStepDefs {

    EInvoice eInvoice = new EInvoice();

    @Then("verify that the e-Invoice site is opened")
    public void verify_that_the_e_Invoice_site_is_opened() {
        eInvoice.verifyPage(eInvoice.text_turkeysEInvoiceInterface);
    }

    @When("the user clicks APPLY NOW button")
    public void the_user_clicks_APPLY_NOW_button() {
        eInvoice.clickButton(eInvoice.applyNowButton);
    }

    @Then("verify that the page which is related with APPLY NOW button is opened")
    public void verify_that_the_page_which_is_related_with_APPLY_NOW_button_is_opened() {
        eInvoice.verifyPage(eInvoice.text_contactInformation);
    }

    @When("the user clicks Learn More button \\(Developing your Business ideas)")
    public void the_user_clicks_Learn_More_button_Developing_your_Business_ideas() {
        eInvoice.clickButton(eInvoice.learnMoreButton_developing);
    }

    @Then("verify that the page which is related with Learn More \\(Developing your Business ideas) button is opened")
    public void verify_that_the_page_which_is_related_with_Learn_More_Developing_your_Business_ideas_button_is_opened() {
        eInvoice.verifyPage(eInvoice.text_whatIsEInvoice);
    }

    @When("the user clicks Learn More button \\(e-Invoice for Turkey)")
    public void the_user_clicks_Learn_More_button_e_Invoice_for_Turkey() {
        eInvoice.clickButton(eInvoice.learnMoreButton_eInvoice);
    }

    @Then("verify that the page which is related with Learn More \\(e-Invoice for Turkey) button is opened")
    public void verify_that_the_page_which_is_related_with_Learn_More_e_Invoice_for_Turkey_button_is_opened() {
        eInvoice.verifyPage(eInvoice.text_eDocumentForTurkey);
    }

    @When("the user clicks FAQ \\(e-Invoice) button")
    public void the_user_clicks_FAQ_e_Invoice_button() {
        eInvoice.clickButton(eInvoice.FAQButton);
    }

    @Then("verify that the page which is related with FAQ \\(e-Invoice) button is opened")
    public void verify_that_the_page_which_is_related_with_FAQ_e_Invoice_button_is_opened() {
        eInvoice.verifyPage(eInvoice.text_whatIsAnEInvoice);
    }
}
