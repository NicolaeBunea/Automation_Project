package pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);

    }

    @FindBy(xpath = "//input[@placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(id = "errormsg")
    private WebElement errorMessageElement;

    public void loginInvalidProcess(String page, String email, String password, String error){
        pageMethods.validateTitlePage(page);
        elementMethods.fillElement(emailElement, email);
        elementMethods.fillElement(passwordElement, password);
        elementMethods.clickElement(enterElement);
        elementMethods.validateElementText(errorMessageElement, error);
    }
}
