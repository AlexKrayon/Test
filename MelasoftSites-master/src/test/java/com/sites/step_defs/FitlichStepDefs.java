package com.sites.step_defs;

import com.sites.pages.Fitlich;
import com.sites.pages.Melasoft;
import io.cucumber.java.en.*;

public class FitlichStepDefs {

    Fitlich fitlich = new Fitlich();
    Melasoft melasoft = new Melasoft();

    @Then("verify that the fitlich site is opened")
    public void verify_that_the_fitlich_site_is_opened() {
        fitlich.verifyPagewithJS(fitlich.text_challengeYourselfAndYourFriends);
    }

    @When("the user clicks OK button for cookies on bottom")
    public void the_user_clicks_OK_button_for_cookies_on_bottom() {
        fitlich.clickButton(fitlich.okButtonOnBottom);
    }

    @Then("verify that cookies bar doesn't appear")
    public void verify_that_cookies_bar_doesnt_appear() {
        fitlich.verifyPageDoesntAppear(fitlich.cookiesBar);
    }

    @When("the user clicks App Store button")
    public void the_user_clicks_App_Store_button() {
        fitlich.clickButtonWithJS(fitlich.appStoreButton);
    }

    @When("the user clicks App Store button \\(bottom of the page)")
    public void the_user_clicks_App_Store_button_bottom_of_the_page() {
        fitlich.clickButtonWithJS(fitlich.appStoreButton2);
    }

    @Then("verify that App Store page is opened")
    public void verify_that_App_Store_page_is_opened() {
        fitlich.verifyPage(fitlich.text_challengeYourFriends);
    }

    @When("the user clicks Google Play button \\(bottom of the page)")
    public void the_user_clicks_Google_Play_button_bottom_of_the_page() {
        fitlich.clickButtonWithJS(fitlich.googlePlayButton2);
    }

    @When("the user clicks Google Play button")
    public void the_user_clicks_Google_Play_button() {
        fitlich.clickButtonWithJS(fitlich.googlePlayButton);
    }

    @Then("verify that Google Play page is opened")
    public void verify_that_Google_Play_page_is_opened() {
        fitlich.verifyPage(fitlich.text_fitlich);
    }

    @When("the user clicks FITLICH BLOG button")
    public void the_user_clicks_FITLICH_BLOG_button() {
        fitlich.clickButton(fitlich.fitlichBlogButton);
    }

    @Then("verify that FITLICH BLOG page is opened")
    public void verify_that_FITLICH_BLOG_page_is_opened() {
        fitlich.verifyPage(fitlich.text_blog);
    }

    @When("the user clicks Privacy Policy")
    public void theUserClicksPrivacyPolicy() {
        fitlich.clickButton(fitlich.privacyPolicy);
    }

    @Then("verify that Privacy Policy page is opened")
    public void verifyThatPrivacyPolicyPageIsOpened() {
        fitlich.verifyPage(fitlich.text_privacyPolicy);
    }

    @When("the user clicks melasoft logo")
    public void theUserClicksMelasoftGmbH() {
        fitlich.clickButtonUnderSide(fitlich.melasoftIcon);
    }

    @Then("verify that the Melasoft site is opened in Fitlich")
    public void verify_that_the_melasoft_site_is_opened_in_fitlich() {
        fitlich.verifyPageInTheNewTab(melasoft.logo);
    }

    @When("the user clicks Facebook icon")
    public void theUserClicksFacebookIcon() {
        fitlich.clickButton(fitlich.facebookIcon);
    }

    @Then("verify that Facebook Fitlich page is opened")
    public void verifyThatFacebookFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnFacebook);
    }

    @When("the user clicks Twitter icon GmbH")
    public void theUserClicksTwitterIconGmbH() {
        fitlich.clickButton(fitlich.twitterIcon);
    }

    @Then("verify that Twitter Fitlich page is opened")
    public void verifyThatTwitterFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnTwitter);
    }

    @When("the user clicks Instagram icon")
    public void theUserClicksInstagramIcon() {
        fitlich.clickButton(fitlich.instagramIcon);
    }

    @Then("verify that Instagram Fitlich page is opened")
    public void verifyThatInstagramFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnInstagram);
    }

    @When("the user clicks Youtube icon")
    public void theUserClicksYoutubeIcon() {
        fitlich.clickButton(fitlich.youtubeIcon);
    }

    @Then("verify that Youtube Fitlich page is opened")
    public void verifyThatYoutubeFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnYoutube);
    }

    @When("the user clicks Telegram icon")
    public void theUserClicksTelegramIcon() {
        fitlich.clickButton(fitlich.telegramIcon);
    }

    @Then("verify that Telegram Fitlich page is opened")
    public void verifyThatTelegramFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnTelegram);
    }

    @When("the user clicks Discord icon")
    public void theUserClicksDiscordIcon() {
        fitlich.clickButton(fitlich.discordIcon);
    }

    @Then("verify that Discord Fitlich page is opened")
    public void verifyThatDiscordFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnDiscord);
    }

    @When("the user clicks Blogger icon")
    public void theUserClicksBloggerIcon() {
        fitlich.clickButton(fitlich.bloggerIcon);
    }

    @Then("verify that Blogger Fitlich page is opened")
    public void verifyThatBloggerFitlichPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.fitlichTitleOnBlogger);
    }

    @When("the user clicks Wilhelm-Leuschner-Straße 10, 60329 Frankfurt am Main Deutschland")
    public void theUserClicksWilhelmLeuschnerStraße1060329FrankfurtAmMainDeutschland() {
        fitlich.clickButton(fitlich.location);
    }

    @Then("verify that location of Melasoft Information Technologies page is opened")
    public void verifyThatLocationOfMelasoftInformationTechnologiesPageIsOpened() {
        fitlich.verifyPageInTheNewTab(fitlich.locationTextOfMaps);
    }


}
