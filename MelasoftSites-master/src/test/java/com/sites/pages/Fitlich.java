package com.sites.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fitlich extends BasePage{

    @FindBy(xpath = "//rs-loader[@class='spinner3 ']")
    public WebElement text_challengeYourselfAndYourFriends;

    @FindBy(xpath = "//rs-loader[@class='spinner3 ']")
    public WebElement appStoreButton;

    @FindBy(xpath = "//a[normalize-space()='Ok']")
    public WebElement okButtonOnBottom;

    @FindBy(xpath = "//div[@class='fusion-privacy-bar-main']")
    public WebElement cookiesBar;

//    @FindBy(xpath = "//p[contains(text(),'Melasoft built the Fitlich')]")
//    public WebElement text_privacyPolicy;

    @FindBy(xpath = "(//img)[12]")
    public WebElement appStoreButton2;

    @FindBy(xpath = "//h2[normalize-space()='Challenge your friends!']")
    public WebElement text_challengeYourFriends;

    @FindBy(xpath = "(//img)[7]")
    public WebElement googlePlayButton;

    @FindBy(xpath = "(//img)[13]")
    public WebElement googlePlayButton2;

    @FindBy(xpath = "//span[normalize-space()='Fitlich']")
    public WebElement text_fitlich;

    @FindBy(xpath = "//span[normalize-space()='FITLICH BLOG']")
    public WebElement fitlichBlogButton;

    @FindBy(xpath = "//h1[normalize-space()='Fitlich Blog']")
    public WebElement text_blog;

    @FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//p[contains(text(),'Melasoft built the Fitlich')]")
    public WebElement text_privacyPolicy;

    @FindBy(css = ".img-responsive.wp-image-1038.lazyautosizes.lazyloaded")
    public WebElement melasoftIcon;

    @FindBy(xpath = "//a[@aria-label='facebook']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//a[@aria-label='twitter']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//a[@aria-label='instagram']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//a[@aria-label='youtube']")
    public WebElement youtubeIcon;

    @FindBy(xpath = "//a[@aria-label='telegram']")
    public WebElement telegramIcon;

    @FindBy(xpath = "//a[@aria-label='discord']")
    public WebElement discordIcon;

    @FindBy(xpath = "//a[@aria-label='blogger']")
    public WebElement bloggerIcon;

    @FindBy(xpath = "//h1[normalize-space()='Fitlich']")
    public WebElement fitlichTitleOnFacebook;

    @FindBy(xpath = "(//span[normalize-space()='fitlichapp'])[4]")
    public WebElement fitlichTitleOnTwitter;

    @FindBy(xpath = "//h2[normalize-space()='fitlichapp']")
    public WebElement fitlichTitleOnInstagram;

    @FindBy(xpath = "//div[@id='inner-header-container']//yt-formatted-string[@id='text']")
    public WebElement fitlichTitleOnYoutube;

    @FindBy(xpath = "//span[@dir='auto']")
    public WebElement fitlichTitleOnTelegram;

    @FindBy(xpath = "//h3[normalize-space()='Fitlich']")
    public WebElement fitlichTitleOnDiscord;

    @FindBy(xpath = "//span[normalize-space()='Fitlich']")
    public WebElement fitlichTitleOnBlogger;

    @FindBy(xpath = "//a[normalize-space()='Wilhelm-Leuschner-Straße 10, 60329 Frankfurt am Main Deutschland']")
    public WebElement location;

    @FindBy(xpath = "//span[normalize-space()='Wilhelm-Leuschner-Straße 10']")
    public WebElement locationTextOfMaps;

}
