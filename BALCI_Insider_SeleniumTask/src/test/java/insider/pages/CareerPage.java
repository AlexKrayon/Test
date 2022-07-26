package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareerPage extends BasePage{

    @FindBy(xpath = "(//div[@class='col span_12 dark center'])[2]/div")
    public List<WebElement> blockList;

    @FindBy(xpath = "//select[@class='jobs-locations']")
    public WebElement locationsSelect;

    @FindBy(xpath = "//select[@class='jobs-teams']")
    public WebElement departmentsSelect;

    @FindBy(xpath = "//div[@class='jobs-list']/a")
    public List<WebElement> jobList;

    @FindBy(xpath = "//div[@class='jobs-list']/a/span[1]")
    public List<WebElement> positionList;

    @FindBy(xpath = "//div[@class='jobs-list']/a/span[2]")
    public List<WebElement> departmentList;

    @FindBy(xpath = "//div[@class='jobs-list']/a/span[3]")
    public List<WebElement> locationList;


}
