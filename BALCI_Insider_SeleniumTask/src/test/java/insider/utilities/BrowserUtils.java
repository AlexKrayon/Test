package insider.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static WebElement elementByText(String text){
        return Driver.get().findElement(By.xpath("//*[.='"+text+"']"));
    }

    public static void selectByText(WebElement select, String text){
        Select dropdown = new Select(select);
        dropdown.selectByVisibleText(text);
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
