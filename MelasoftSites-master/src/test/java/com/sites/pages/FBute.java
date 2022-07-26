package com.sites.pages;

import com.sites.utilities.BrowserUtilities;
import com.sites.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBute extends BasePage {

    @FindBy(xpath = "//a[@class='menu__link'][normalize-space()='Services']")
    public WebElement services;
    @FindBy(xpath = "//a[@class='menu__link'][normalize-space()='Road Map']")
    public WebElement roadMap;
    @FindBy(xpath = "//a[@class='menu__link'][normalize-space()='Token']")
    public WebElement token;
    @FindBy(xpath = "//a[@class='menu__link'][normalize-space()='WhitePapers']")
    public WebElement whitePapers;
    @FindBy(xpath = "//a[@class='btn btn--orange btn--big']")
    public WebElement downloadFitlichBtn;
    @FindBy(xpath = "//p[contains(text(),'Fitlich app has been developed for you to always s')]")
    public WebElement textFitlichMobile;
    @FindBy(xpath = "//h4[contains(text(),'THINK OF IT AS AN ADDED INCENTIVE, A WAY TO BRING ')]")
    public WebElement textServices;
    @FindBy(xpath = "//h2[normalize-space()='MISSION']")
    public WebElement textRoadMap;
    @FindBy(xpath = "//h2[normalize-space()='FBUTE DETAILS']")
    public WebElement textToken;
    @FindBy(css = ".vc_general.vc_btn3.vc_btn3-size-lg.vc_btn3-shape-rounded.vc_btn3-style-custom")
    public WebElement white_PapersBtn;
    @FindBy(xpath = "//img[@title='4444']")
    public WebElement fitlichLogo;
    @FindBy(xpath = "//a[@href='https://www.melasoft.com/en/home/']//img[@class='vc_single_image-img ']")
    public WebElement melasoftLogo;
    @FindBy(xpath = "//div[@class='css-901oao r-1awozwy r-18jsvk2 r-6koalj r-37j5jr r-adyw6z r-1vr29t4 r-135wba7 r-bcqeeo r-1udh08x r-qvutc0']//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'][normalize-space()='FBute Token']")
    public WebElement textTwitter;
    @FindBy(xpath = "//span[@dir='auto']")
    public WebElement textTelegram;
    @FindBy(xpath = "//div[@id='inner-header-container']//yt-formatted-string[@id='text']")
    public WebElement textYoutube;
    @FindBy(xpath = "//h1[normalize-space()='FbuteCoin']")
    public WebElement textReddit;
    @FindBy(xpath = "//h3[normalize-space()='Fitlich']")
    public WebElement textDiscord;
    @FindBy(xpath = "//span[@class='bn gr gs gt gu gv gw gx gy gz ha hb hc hd he hf hg hh hi hj hk hl hm hn ho hp hq hr hs ht']")
    public WebElement textMedium;
    @FindBy(xpath = "//embed[@name='E1D6BAA9D4C55D46D61EB48DAA056F64']")
    public WebElement textWhitePaper;

    public void clickOnDownloadFitlichBtn() {
        downloadFitlichBtn.click();
    }
    public void clickOnServicesBtn() {
        services.click();
    }
    public void clickOnRoadMapBtn() {
        roadMap.click();
    }
    public void clickOnTokenBtn() {
        token.click();
    }
    public void clickOnWhitePapersBtn() {
        whitePapers.click();
    }
    public void clickOnWhite_PapersBtn() {
        BrowserUtilities.explicitlyWaitVisible(white_PapersBtn);
        BrowserUtilities.staticWait(1);
        System.out.println("1111");
        white_PapersBtn.click();
    }

    public void clickOnFitlichLogo() {
        BrowserUtilities.explicitlyWaitVisible(fitlichLogo);
        BrowserUtilities.scrollAndClickButtonWithJS(fitlichLogo);
    }

    public void clickOnMelasoftLogo() {
        BrowserUtilities.scrollAndClickButtonWithJS(melasoftLogo);
    }

    public void clickOnSocialMediaIconOnFBUTE(String arg0) {
        String locator = "//i[@class='font-icon fab fa-" + arg0 + "']";
        WebElement element = Driver.get().findElement(By.xpath(locator));
        BrowserUtilities.scrollAndClickButtonWithJS(element);
    }


}
