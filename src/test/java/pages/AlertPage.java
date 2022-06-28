package pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".analystic")
    private List<WebElement> alertOptions;
    @FindBy(css = "button[onclick='alertbox()']")
    private WebElement alertaOkButton;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement alertOkCancelButton;
    @FindBy(id = "demo")
    private WebElement alertOkCancelMessage;
    @FindBy(css = "button[class='btn btn-info']")
    private WebElement alertaTextButton;
    @FindBy(id = "demo1")
    private WebElement alertaTextMessage;

    public void dealAlertOk(){
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(alertaOkButton);
        alertMethods.acceptAlert();
    }

    public void dealAlertOkCancel(String value){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(alertOkCancelButton);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(alertOkCancelMessage,value);
    }

    public void dealAlertInput(String value){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(alertaTextButton);
        alertMethods.fillAcceptAlert(value);
        String expectValue="Hello "+value+" How are you today";
        elementMethods.validateElementText(alertaTextMessage,expectValue);
    }


}
