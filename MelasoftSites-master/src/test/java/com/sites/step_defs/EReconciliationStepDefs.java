package com.sites.step_defs;

import com.sites.pages.EReconciliation;
import io.cucumber.java.en.*;

public class EReconciliationStepDefs {

    EReconciliation eReconciliation = new EReconciliation();

    @Then("verify that the e-Reconciliation site is opened")
    public void verify_that_the_e_Reconciliation_site_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_wouldYouLike);
    }

    @When("the user clicks Get a Quote button")
    public void the_user_clicks_Get_a_Quote_button() {
        eReconciliation.clickButtonWithJS(eReconciliation.getAQuoteButton);
    }

    @Then("verify that the page which is related with Get a Quote button is opened")
    public void verify_that_the_page_which_is_related_with_Get_a_Quote_button_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_contact);
    }

    @When("the user clicks Detailed Info \\(e-declaration) button")
    public void the_user_clicks_Detailed_Info_e_declaration_button() {
        eReconciliation.clickButtonWithJS(eReconciliation.detailedInfoButton_eDeclaration);
    }

    @Then("verify that the page which is related with Detailed Info \\(e-declaration) button is opened")
    public void verify_that_the_page_which_is_related_with_Detailed_Info_e_declaration_button_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_whatIsAEExplicitConsent);
    }

    @When("the user clicks Detailed Info \\(e-account) button")
    public void the_user_clicks_Detailed_Info_e_account_button() {
        eReconciliation.clickButtonWithJS(eReconciliation.detailedInfoButton_eAccountStatement);
    }

    @Then("verify that the page which is related with Detailed Info \\(e-account) button is opened")
    public void verify_that_the_page_which_is_related_with_Detailed_Info_e_account_button_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_melasoftEAccountStatement);
    }

    @When("the user clicks e-Consent button")
    public void the_user_clicks_e_Consent_button() {
        eReconciliation.clickButton(eReconciliation.eConsentButton);
    }

    @Then("verify that e-Consent page is opened")
    public void verify_that_e_Consent_page_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_whatIsAEExplicitConsent);
    }

    @When("the user clicks e-Account Statement button")
    public void the_user_clicks_e_Account_Statement_button() {
        eReconciliation.clickButton(eReconciliation.eAccountStatementButton);
    }

    @Then("verify that e-Account Statement page is opened")
    public void verify_that_e_Account_Statement_page_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_melasoftEAccountStatement);
    }

    @When("the user clicks Blog button")
    public void the_user_clicks_Blog_button() {
        eReconciliation.clickButton(eReconciliation.blogButton);
    }

    @Then("verify that Blog page is opened")
    public void verify_that_Blog_page_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_notificationWithBAAndBSForms);
    }

    @When("the user clicks Contact Us button")
    public void the_user_clicks_Contact_Us_button() {
        eReconciliation.clickButton(eReconciliation.contactUsButton);
    }

    @Then("verify that Contact Us page is opened")
    public void verify_that_Contact_Us_page_is_opened() {
        eReconciliation.verifyPage(eReconciliation.text_contact);
    }

    @When("the user clicks Login button")
    public void the_user_clicks_Login_button() {
        eReconciliation.clickButton(eReconciliation.loginButton);
    }

    @Then("verify that Login page is opened")
    public void verify_that_Login_page_is_opened() {
        eReconciliation.verifyPage(eReconciliation.epostaTextbox);
    }

    @When("the user clicks Register button")
    public void the_user_clicks_Register_button() {
        eReconciliation.clickButton(eReconciliation.registerButton);
    }

    @Then("verify that Register popup is opened")
    public void verify_that_Register_popup_is_opened() {
        eReconciliation.verifyPage(eReconciliation.nameField);
        //BrowserUtils.clickElementInFrame();
    }

    @Then("the user closes Register popup")
    public void the_user_closes_Register_popup() {
        eReconciliation.clickButton(eReconciliation.closeButton);
    }

    @When("the user clicks Turkce button")
    public void the_user_clicks_Turkce_button() {
        eReconciliation.hoverAndClickButtonWithJS(eReconciliation.languageSelectionBox, eReconciliation.turkish);
    }

    @Then("verify that the page is converted into Turkish language")
    public void verify_that_the_page_is_converted_into_Turkish_language() {
        eReconciliation.verifyPage(eReconciliation.text_mutabakatlariniziDijital);
    }

    @When("the user clicks Deutsch button")
    public void the_user_clicks_Deutsch_button() {
        eReconciliation.hoverAndClickButtonWithJS(eReconciliation.languageSelectionBox, eReconciliation.deutsch);
    }

    @Then("verify that the page is converted into German language")
    public void verify_that_the_page_is_converted_into_German_language() {
        eReconciliation.verifyPage(eReconciliation.text_wollenSieSichDieZeitSparen);
    }
}
