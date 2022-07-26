package com.sites.step_defs;

import com.sites.pages.FBute;
import com.sites.pages.Melasoft;
import io.cucumber.java.en.*;

public class FButeStepDefs {

    FBute fbute = new FBute();
    Melasoft melasoft = new Melasoft();

    @Then("verify that the FBUTE site is opened")
    public void verify_that_the_fbute_site_is_opened() {
        fbute.verifyPage(fbute.downloadFitlichBtn);
    }

    @When("the user clicks on DOWNLOAD FITLICH button")
    public void the_user_clicks_on_download_fitlich_button() {
        fbute.clickOnDownloadFitlichBtn();
    }

    @Then("verify that the Fitlich mobil app site is opened")
    public void verify_that_the_fitlich_mobil_app_site_is_opened() {
        fbute.verifyPageInTheNewTab(fbute.textFitlichMobile);
    }

    @When("the user clicks on Services")
    public void the_user_clicks_on_services() {
        fbute.clickOnServicesBtn();
    }

    @Then("verify that Services related part is opened")
    public void verify_that_services_related_part_is_opened() {
        fbute.verifyPage(fbute.textServices);
    }

    @When("the user clicks on Road Map")
    public void the_user_clicks_on_road_map() {
        fbute.clickOnRoadMapBtn();
    }

    @Then("verify that Road Map related part is opened")
    public void verify_that_road_map_related_part_is_opened() {
        fbute.verifyPage(fbute.textRoadMap);
    }

    @When("the user clicks on Token")
    public void the_user_clicks_on_token() {
        fbute.clickOnTokenBtn();
    }

    @Then("verify that Token related part is opened")
    public void verify_that_token_related_part_is_opened() {
        fbute.verifyPage(fbute.textToken);
    }

    @When("the user clicks on WhitePapers")
    public void the_user_clicks_on_whitepapers() {
        fbute.clickOnWhitePapersBtn();
    }

    @Then("verify that WhitePapers related part is opened")
    public void verify_that_white_papers_related_part_is_opened() {
        fbute.verifyPage(fbute.white_PapersBtn);
    }

    @When("the user clicks on White Papers button")
    public void the_user_clicks_on_white_papers_button() {
        fbute.clickOnWhite_PapersBtn();
    }

    @Then("verify that the documentation is opened on another tab")
    public void verify_that_the_documentation_is_opened_on_another_tab() {
        fbute.verifyURLInTheNewTab("https://fbute.com/white-paper.pdf");
    }

    @When("the user clicks on Fitlich logo")
    public void the_user_clicks_on_fitlich_logo() {
        fbute.clickOnFitlichLogo();
    }

    @Then("verify that the Fitlich site is opened on another tab")
    public void verify_that_the_fitlich_site_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textFitlichMobile);
    }

    @When("the user clicks on Melasoft logo")
    public void the_user_clicks_on_melasoft_logo() {
        fbute.clickOnMelasoftLogo();
    }

    @Then("verify that the Melasoft site is opened on another tab")
    public void verify_that_the_melasoft_site_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(melasoft.logo);
    }

    @When("the user clicks on {string} social media icon on FBUTE")
    public void theUserClicksOnSocialMediaIconOnFBUTE(String arg0) {
        fbute.clickOnSocialMediaIconOnFBUTE(arg0);
    }

    @Then("verify that Twitter related part is opened on another tab")
    public void verify_that_twitter_related_part_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textTwitter);
    }

    @Then("verify that Telegram related part is opened on another tab")
    public void verify_that_telegram_related_part_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textTelegram);
    }

    @Then("verify that Youtube related part is opened on another tab")
    public void verify_that_youtube_related_part_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textYoutube);
    }

    @Then("verify that Reddit related part is opened on another tab")
    public void verify_that_reddit_related_part_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textReddit);
    }

    @Then("verify that Discord related part is opened on another tab")
    public void verify_that_discord_related_part_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textDiscord);
    }

    @Then("verify that Medium related part is opened on another tab")
    public void verify_that_medium_related_part_is_opened_on_another_tab() {
        fbute.verifyPageInTheNewTab(fbute.textMedium);
    }

}
