package pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver){
        super(driver);

    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement swithToElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertSubMeniu;
    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowSubmeniu;

    public void goToAlertPage(){
        elementMethods.hoverElement(swithToElement);
        elementMethods.clickElement(alertSubMeniu);
        pageMethods.navigateToURL("http://demo.automationtesting.in/Alerts.html");
    }

    public void goToWindowPage(){
        elementMethods.hoverElement(swithToElement);
        elementMethods.clickElement(windowSubmeniu);
        pageMethods.navigateToURL("http://demo.automationtesting.in/Windows.html");
    }


}
