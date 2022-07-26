package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "(//ul[@id='ubermenu-nav-main-17-top_nav'])[1]/li")
    public List<WebElement> topMenuItemsList;

}
