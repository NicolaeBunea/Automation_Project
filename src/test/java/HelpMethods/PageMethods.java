package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethods {

    public WebDriver Driver;

    public PageMethods(WebDriver driver) {
        Driver = driver;
    }

    public void validateTitlePage(String value){
        String actualpage = Driver.getTitle();
        Assert.assertTrue("The expected page was notDisplayed", value.equals(actualpage));
    }

    public void navigateToURL(String value){
        Driver.navigate().to(value);

    }
}
