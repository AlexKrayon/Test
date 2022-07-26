package com.sites.step_defs;

import com.sites.pages.TuscheHome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TuscheHomeStepDefs {

    TuscheHome tuscheHome = new TuscheHome();

    @Then("verify that the tuschehome site is opened")
    public void verify_that_the_tuschehome_site_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_naturalCareComfort);
    }

    @When("the user clicks About button")
    public void the_user_clicks_About_button() {
        tuscheHome.clickButton(tuscheHome.aboutButton);
    }

    @Then("verify that About page is opened")
    public void verify_that_About_page_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_weAreAlwaysClose);
    }

    @When("the user hovers Products button and clicks Towels button")
    public void the_user_hovers_Products_button_and_clicks_Towels_button() {
        tuscheHome.hoverAndClickButton(tuscheHome.productsButton, tuscheHome.towelsButton);
    }

    @Then("verify that Towels page is opened")
    public void verify_that_Towels_page_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_peshkirHandTowels);
    }

    @When("the user hovers Products button and clicks Baby button")
    public void the_user_hovers_Products_button_and_clicks_Baby_button() {
        tuscheHome.hoverAndClickButton(tuscheHome.productsButton, tuscheHome.babyButton);
    }

    @Then("verify that Baby page is opened")
    public void verify_that_Baby_page_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_baby);
    }

    @When("the user hovers Products button and clicks Bathrobes button")
    public void the_user_hovers_Products_button_and_clicks_Bathrobes_button() {
        tuscheHome.hoverAndClickButton(tuscheHome.productsButton, tuscheHome.bathrobesButton);
    }

    @Then("verify that Bathrobes page is opened")
    public void verify_that_Bathrobes_page_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_bathrobes);
    }

    @When("the user clicks Contact button")
    public void the_user_clicks_Contact_button() {
        tuscheHome.clickButton(tuscheHome.contactButton);
    }

    @Then("verify that Contact page is opened")
    public void verify_that_Contact_page_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_ContactUs);
    }

    @When("the user clicks Shop button")
    public void the_user_clicks_Shop_button() {
        tuscheHome.clickButton(tuscheHome.shopButton);
    }

    @Then("verify that Amazon page is opened")
    public void verify_that_Amazon_page_is_opened() {
        tuscheHome.verifyPage(tuscheHome.text_tuscheStrandtuch);
    }

    @When("the user clicks Send Message button")
    public void the_user_clicks_Send_Message_button() {
        tuscheHome.clickButton(tuscheHome.sendMessageButton);
    }

    @Then("verify that Bu alan zorunludur message is displayed")
    public void verify_that_Bu_alan_zorunludur_message_is_displayed() {
        tuscheHome.verifyPage(tuscheHome.text_buAlanZorunludur);
    }


}
