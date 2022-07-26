package insider.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PositionPage extends BasePage{

    @FindBy(xpath = "//div[@class='posting-headline']/h2")
    public WebElement jobTitle;

    @FindBy(xpath = "//div[@class='posting-categories']/div[1]")
    public WebElement jobLocation;

    @FindBy(xpath = "//div[@class='posting-categories']/div[2]")
    public WebElement jobDepartment;

    @FindBy(xpath = "(//ul[@class='posting-requirements plain-list'])[1]")
    public WebElement jobDescription;

    @FindBy(xpath = "(//ul[@class='posting-requirements plain-list'])[2]")
    public WebElement jobRequirements;

    @FindBy(css = ".postings-btn.template-btn-submit.shamrock")
    public List<WebElement> applyButtonsList;

    @FindBy(xpath = "(//div[@class='section page-centered application-form']/h4)[1]")
    public WebElement formCaption;
}
