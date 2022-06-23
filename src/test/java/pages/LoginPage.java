package pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='E mail']")
    public WebElement emailElement;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordElement;
    @FindBy(id = "enterbtn")
    public WebElement enterElement;
    @FindBy(id = "errormsg")
    public WebElement errorMessageElement;

    public void loginInvalidProcess(String page, String email, String password, String error){
        pageMethods.validateTitlePage(page);
        elementMethods.fillElement(emailElement, email);
        elementMethods.fillElement(passwordElement, password);
        elementMethods.clickElement(enterElement);
        elementMethods.validateElementText(errorMessageElement, error);
    }
}
