package com.sites.step_defs;

import com.sites.pages.SAPSAFT;
import com.sites.pages.SAPeInvoice;
import io.cucumber.java.en.*;

public class SAPSAFTStepDefs {

    SAPSAFT sapSaft = new SAPSAFT();
    SAPeInvoice sapEInvoice = new SAPeInvoice();
    
    @Then("verify that SAP SAF-T website is opened")
    public void verify_that_sap_saf_t_website_is_opened() {
        sapSaft.verifyPage(sapSaft.textHome);
    }
    @When("the user clicks on {string} on header")
    public void the_user_clicks_on_on_header(String string) {
        sapSaft.clickOnHeader(string);
    }
    @Then("verify that About Us page is opened in SAP SAF-T")
    public void verify_that_about_us_page_is_opened_in_sap_saf_t() {
        sapSaft.verifyPage(sapSaft.textAboutUs);
    }
    @Then("verify that the SAP-eInvoice website is opened on another tab")
    public void verify_that_the_sap_e_invoice_website_is_opened_on_another_tab() {
        sapSaft.verifyPageInTheNewTab(sapEInvoice.textHome);
    }
    @Then("verify that the Austria SAF-T Process page is opened")
    public void verify_that_the_austria_saf_t_process_page_is_opened() {
        sapSaft.verifyPage(sapSaft.textAustria);
    }
    @Then("verify that the SAF-T Process in Norway page is opened")
    public void verify_that_the_saf_t_process_in_norway_page_is_opened() {
        sapSaft.verifyPage(sapSaft.textNorway);
    }
    @Then("verify that the Romania SAF-T Process page is opened")
    public void verify_that_the_romania_saf_t_process_page_is_opened() {
        sapSaft.verifyPage(sapSaft.textRomania);
    }
    @Then("verify that the SAF-T Process in Portugal page is opened")
    public void verify_that_the_saf_t_process_in_portugal_page_is_opened() {
        sapSaft.verifyPage(sapSaft.textPortugal);
    }
    @Then("verify that the Contact page is opened")
    public void verify_that_the_contact_page_is_opened() {
        sapSaft.verifyPage(sapSaft.textContact);
    }
    @When("the user clicks on {string} social media icon")
    public void the_user_clicks_on_social_media_icon(String string) {
        sapSaft.clickOnSocialMediaIcon(string);
    }
    @Then("verify that Facebook page is opened on another tab")
    public void verify_that_facebook_page_is_opened_on_another_tab() {
        sapSaft.verifyPageInTheNewTab(sapSaft.textFacebook);
    }
    @Then("verify that Twitter page is opened on another tab")
    public void verify_that_twitter_page_is_opened_on_another_tab() {
        sapSaft.verifyPageInTheNewTab(sapSaft.textTwitter);
    }
    @Then("verify that YouTube page is opened on another tab")
    public void verify_that_you_tube_page_is_opened_on_another_tab() {
        sapSaft.verifyPageInTheNewTab(sapSaft.textYoutube);
    }
    @Then("verify that Instagram page is opened on another tab")
    public void verify_that_instagram_page_is_opened_on_another_tab() {
        sapSaft.verifyPageInTheNewTab(sapSaft.textInstagram);
    }
    @Then("verify that LinkedIn page is opened on another tab")
    public void verify_that_linked_in_page_is_opened_on_another_tab() {
        sapSaft.verifyPageInTheNewTab(sapSaft.textLinkedIn);
    }
    @Then("the user clicks on READ MORE button for {string}")
    public void the_user_clicks_on_read_more_button_for(String string) {
        sapSaft.navigateCountrysReadMore(string);
    }
}
