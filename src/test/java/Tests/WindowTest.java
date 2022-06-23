package Tests;

import Base.BaseTest;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.TabMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends BaseTest {

    @Test
    public void windowTest(){

        ElementMethods elementMethods=new ElementMethods(Driver);
        PageMethods pageMethods=new PageMethods(Driver);
        TabMethods tabMethods=new TabMethods(Driver);

        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        String expectedPage = "Register";
        pageMethods.validateTitlePage(expectedPage);


        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));//obiect fac cu mouse orice
        elementMethods.hoverElement(switchElement);

        WebElement windowsElement = Driver.findElement(By.xpath("//a[text()='Windows']"));
        elementMethods.clickElement(windowsElement);
        pageMethods.navigateToURL("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsButtons=Driver.findElements(By.cssSelector(".analystic"));
        windowsButtons.get(0).click();
        WebElement clickTabElement=Driver.findElement(By.cssSelector("#Tabbed>a>button"));
        clickTabElement.click();

        tabMethods.switchSpecificTabWindow(1);
        tabMethods.closeCurrentTabWindow();
        tabMethods.switchSpecificTabWindow(0);


        windowsButtons.get(1).click();
        WebElement clickWindowElement=Driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        clickWindowElement.click();

        tabMethods.switchSpecificTabWindow(1);
        tabMethods.closeCurrentTabWindow();
        tabMethods.switchSpecificTabWindow(0);

        windowsButtons.get(2).click();
        WebElement multiWindElement=Driver.findElement(By.cssSelector("#Multiple>button"));
        multiWindElement.click();

        tabMethods.switchSpecificTabWindow(2);
        tabMethods.closeCurrentTabWindow();

        tabMethods.switchSpecificTabWindow(1);
        tabMethods.closeCurrentTabWindow();

        tabMethods.switchSpecificTabWindow(0);

    }
}
