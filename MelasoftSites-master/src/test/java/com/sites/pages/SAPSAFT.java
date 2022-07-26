package com.sites.pages;

import com.sites.utilities.BrowserUtilities;
import com.sites.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SAPSAFT extends BasePage{

    @FindBy(xpath = "//rs-module[@id='rev_slider_1_1']")
    public WebElement textHome;

    @FindBy(xpath = "//p[contains(text(),'Melasoft Information Technologies, a software comp')]")
    public WebElement textAboutUs;

    @FindBy(xpath = "//h2[normalize-space()='Austria SAF-T Process']")
    public WebElement textAustria;

    @FindBy(xpath = "//h2[normalize-space()='SAF-T Process in Norway']")
    public WebElement textNorway;

    @FindBy(xpath = "//h2[normalize-space()='Romania SAF-T Process']")
    public WebElement textRomania;

    @FindBy(xpath = "//h2[normalize-space()='SAF-T Process in Portugal']")
    public WebElement textPortugal;

    @FindBy(xpath = "//p[contains(text(),'Wilhelm-Leuschner-Straße 10, 60329 Frankfurt am Ma')]")
    public WebElement textContact;

    @FindBy(xpath = "//h1[normalize-space()='Melasoft Information Technologies']")
    public WebElement textFacebook;

    @FindBy(xpath = "//yt-formatted-string[contains(text(),'Melasoft Information Technologies')]")
    public WebElement textYoutube;

    @FindBy(xpath = "//h2[normalize-space()='melasoftinformation']")
    public WebElement textInstagram;

    @FindBy(xpath = "//span[contains(text(),'Melasoft Information Technologies, a software comp')]")
    public WebElement textLinkedIn;

    @FindBy(xpath = "//span[contains(text(),'We develop your business ideas!')]")
    public WebElement textTwitter;

    public void clickOnHeader(String string) {
        String locator = "(//span[@class='menu-text'][normalize-space()='" + string + "'])[1]";
        WebElement element = Driver.get().findElement(By.xpath(locator));
        BrowserUtilities.explicitlyWaitVisible(element);
        element.click();
    }

    public void clickOnSocialMediaIcon(String string) {
        String locator = "//a[@data-original-title='" + string + "']";
        WebElement element = Driver.get().findElement(By.xpath(locator));
        element.click();
    }

    public void navigateCountrysReadMore(String string) {
        String locator = "//b[normalize-space()='" + string + "']/../../../../../../..//*[contains(text(),'READ MORE')]";
        WebElement element = Driver.get().findElement(By.xpath(locator));
        element.click();
    }
}
