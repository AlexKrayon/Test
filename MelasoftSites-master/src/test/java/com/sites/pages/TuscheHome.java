package com.sites.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TuscheHome extends BasePage{

    @FindBy(xpath = "//em[normalize-space()='Natural Care&Comfort']")
    public WebElement text_naturalCareComfort;

    @FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='ABOUT'])[1]")
    public WebElement aboutButton;

    @FindBy(xpath = "(//span[contains(text(),'We are always close to you')])[1]")
    public WebElement text_weAreAlwaysClose;

    @FindBy(xpath = "(//span[normalize-space()='PRODUCTS'])[1]")
    public WebElement productsButton;

    @FindBy(xpath = "//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1249 fusion-megamenu-submenu fusion-megamenu-submenu-notitle menu-item-has-link fusion-megamenu-columns-3 col-lg-4 col-md-4 col-sm-4']//a[@class='awb-justify-title fusion-megamenu-title-disabled'][normalize-space()='TOWELS']")
    public WebElement towelsButton;

    @FindBy(xpath = "//h1[normalize-space()='Peshkir Hand Towels']")
    public WebElement text_peshkirHandTowels;

    @FindBy(xpath = "//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1254 fusion-megamenu-submenu fusion-megamenu-submenu-notitle menu-item-has-link fusion-megamenu-columns-3 col-lg-4 col-md-4 col-sm-4']//a[@class='awb-justify-title fusion-megamenu-title-disabled'][normalize-space()='BABY']")
    public WebElement babyButton;

    @FindBy(xpath = "//h1[normalize-space()='Baby']")
    public WebElement text_baby;

    @FindBy(xpath = "//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1253 fusion-megamenu-submenu fusion-megamenu-submenu-notitle menu-item-has-link fusion-megamenu-columns-3 col-lg-4 col-md-4 col-sm-4']//a[@class='awb-justify-title fusion-megamenu-title-disabled'][normalize-space()='BATHROBES']")
    public WebElement bathrobesButton;

    @FindBy(xpath = "//h1[normalize-space()='Bathrobes']")
    public WebElement text_bathrobes;

    @FindBy(xpath = "(//span[normalize-space()='CONTACT'])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "//span[normalize-space()='CONTACT US']")
    public WebElement text_ContactUs;

    @FindBy(xpath = "(//span[normalize-space()='Shop'])[1]")
    public WebElement shopButton;

    @FindBy(xpath = "//h1[@class='a-size-large a-spacing-none']")
    public WebElement text_tuscheStrandtuch;

    @FindBy(xpath = "//input[@class='wpcf7-form-control has-spinner wpcf7-submit']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "(//span[normalize-space()='Bu alan zorunludur.'])[1]")
    public WebElement text_buAlanZorunludur;

}
