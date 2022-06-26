package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class orderStepDefinitions {

    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
       webTableLoginPage.login();
       basePage.order.click();
    }
    @When("user selected product type {string}")
    public void user_selected_product_type(String string) {
        Select select= new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }
    @When("user enter quantity {string}")
    public void user_enter_quantity(String string) {
       // OrderPage.inputQuantity.clear(); veya şu şekilde de olabilir.
        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        orderPage.inputQuantity.sendKeys("2");
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.inputName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.inputStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.inputCity.sendKeys(string);
    }
    @When("user enters zip {string}")
    public void user_enters_zip(String string) {
        orderPage.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardTypes) {
        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardTypes);

    }
    @When("user enters credit card number\"{int}\"")
    public void user_enters_credit_card_number(Integer int1) {

    }
    @When("user enters expired date {string}")
    public void user_enters_expired_date(String string) {

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {

    }
    @Then("user should see {string} in the first row of the web table")
    public void user_should_see_in_the_first_row_of_the_web_table(String string) {

    }


}
