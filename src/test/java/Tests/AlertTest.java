package Tests;

import Base.BaseTest;
import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AlertTest extends BaseTest {

    @Test
    public void registerTest() {

        ElementMethods elementMethods= new ElementMethods(Driver);
        AlertMethods alertMethods= new AlertMethods(Driver);
        PageMethods pageMethods=new PageMethods(Driver);

        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        String expectedPage = "Register";
        pageMethods.validateTitlePage(expectedPage);


        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethods.hoverElement(switchElement);

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();
        pageMethods.navigateToURL("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertButtons=Driver.findElements(By.cssSelector(".analystic"));
        alertButtons.get(0).click();
        WebElement alertOkElement=Driver.findElement(By.cssSelector("button[onclick='alertbox()']"));
        alertOkElement.click();
        alertMethods.acceptAlert();

        alertButtons.get(1).click();
        WebElement alertCancelElement=Driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        alertCancelElement.click();
        alertMethods.cancelAlert();

        WebElement messageValidElement=Driver.findElement(By.id("demo"));
        String expectedMess="You Pressed Cancel";
        elementMethods.validateElementText(messageValidElement,expectedMess);


        alertButtons.get(2).click();
        WebElement alertaTextElement= Driver.findElement(By.cssSelector("button[class='btn btn-info']"));
        alertaTextElement.click();
        String alertValue="Nicu";
        alertMethods.fillAcceptAlert(alertValue);

        WebElement textBoxElement= Driver.findElement(By.id("demo1"));
        String expectValue="Hello "+alertValue+" How are you today";
        elementMethods.validateElementText(textBoxElement,expectValue);


        /*String butonAlertValue="Alert with Textbox ";
        Integer index=0;
        while (index<alertButtons.size()){
            if (alertButtons.get(index).equals(butonAlertValue)){
                alertButtons.get(index).getText();
            }
            index++;
        }*/


    }
}
