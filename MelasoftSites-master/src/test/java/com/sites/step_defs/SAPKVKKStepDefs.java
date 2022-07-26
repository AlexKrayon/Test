package com.sites.step_defs;

import com.sites.pages.SAPKVKK;
import com.sites.utilities.BrowserUtilities;
import io.cucumber.java.en.*;

public class SAPKVKKStepDefs {

    SAPKVKK sapkvkk = new SAPKVKK();

    @Then("verify that the SAP-KVKK site is opened")
    public void verify_that_the_SAP_KVKK_site_is_opened() {
        sapkvkk.verifyPage(sapkvkk.text_melasoftGDPRKVKKileKisiselVerilerinKorunmasi);
    }

    @When("the user clicks Hemen Basla button")
    public void the_user_clicks_Hemen_Basla_button() {
        sapkvkk.clickButton(sapkvkk.hemenBaslaButton);
    }

    @Then("verify that the page which is related with Hemen Basla \\(SAP-KVKK) button is opened")
    public void verify_that_the_page_which_is_related_with_Hemen_Basla_SAP_KVKK_button_is_opened() {
        sapkvkk.verifyPage(sapkvkk.text_iletisimBilgileri);
    }

    @When("the user clicks Daha Fazla Bilgi Icin button")
    public void the_user_clicks_Daha_Fazla_Bilgi_Icin_button() {
        sapkvkk.clickButton(sapkvkk.dahaFazlaBilgiIcinButton);
    }

    @Then("verify that the page which is related with Daha Fazla Bilgi Icin button is opened")
    public void verify_that_the_page_which_is_related_with_Daha_Fazla_Bilgi_Icin_button_is_opened() {
        sapkvkk.verifyPage(sapkvkk.text_GDPRKVKK);
    }

    @When("the user clicks Melasoft e-Acik Riza Sistemi button")
    public void the_user_clicks_Melasoft_e_Acik_Riza_Sistemi_button() {
        BrowserUtilities.scrollAndClickButtonWithJS(sapkvkk.melasoftEAcikRizaSistemiButton);
    }

    @Then("verify that the page which is related with Melasoft e-Acik Riza Sistemi button is opened")
    public void verify_that_the_page_which_is_related_with_Melasoft_e_Acik_Riza_Sistemi_button_is_opened() {
        sapkvkk.verifyPageInTheNewTab(sapkvkk.text_kvkknin3uncuMaddesineGore);
    }

    @When("the user clicks SSS \\(down) button")
    public void the_user_clicks_SSS_down_button() {
        sapkvkk.clickButton(sapkvkk.sssButton_down);
    }

    @Then("verify that SSS page is opened")
    public void verify_that_SSS_page_is_opened() {
        sapkvkk.verifyPage(sapkvkk.text_kisiselVerilerinKorunmasi);
    }

    @When("the user clicks Blog \\(KVKK) button")
    public void the_user_clicks_Blog_KVKK_button() {
        sapkvkk.clickButton(sapkvkk.blogButton);
    }

    @Then("verify that Blog \\(KVKK) page is opened")
    public void verify_that_Blog_KVKK_page_is_opened() {
        sapkvkk.clickButton(sapkvkk.text_kisiselVerilerinIslenmesi);
    }

    @When("the user clicks SSS \\(up) button")
    public void the_user_clicks_SSS_up_button() {
        sapkvkk.clickButton(sapkvkk.sssButton_up);
    }
}
