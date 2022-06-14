package Tests;

import Base.BaseTest;
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

        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        String expectedPage = "Register";
        String actualpage = Driver.getTitle();
        Assert.assertTrue("The expected page was notDisplayed", expectedPage.equals(actualpage));


        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();
        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertButtons=Driver.findElements(By.cssSelector(".analystic"));
        alertButtons.get(0).click();
        WebElement alertOkElement=Driver.findElement(By.cssSelector("button[onclick='alertbox()']"));
        alertOkElement.click();
        Alert simpleAlert= Driver.switchTo().alert();
        simpleAlert.accept();

        alertButtons.get(1).click();
        WebElement alertCancelElement=Driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        alertCancelElement.click();
        Alert cancelAlert=Driver.switchTo().alert();
        cancelAlert.dismiss();

        WebElement messageValidElement=Driver.findElement(By.id("demo"));
        String expectedMess="You Pressed Cancel";
        String actualMess=messageValidElement.getText();
        Assert.assertEquals("The expected message was not displayed",expectedMess,actualMess);


        alertButtons.get(2).click();
        WebElement alertaTextElement= Driver.findElement(By.cssSelector("button[class='btn btn-info']"));
        alertaTextElement.click();
        Alert textAlert=Driver.switchTo().alert();
        String alertValue="Nicu";
        textAlert.sendKeys(alertValue);
        textAlert.accept();

        WebElement textBoxElement= Driver.findElement(By.id("demo1"));
        String expectValue="Hello "+alertValue+" How are you today";
        String actualValue=textBoxElement.getText();
        Assert.assertEquals(expectValue,actualValue);


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
