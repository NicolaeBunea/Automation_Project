package Tests;

import Base.BaseTest;
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

        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        String expectedPage = "Register";
        String actualpage = Driver.getTitle();
        Assert.assertTrue("The expected page was not Displayed", expectedPage.equals(actualpage));


        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver); //obiect fac cu mouse orice
        action.moveToElement(switchElement).build().perform();

        WebElement windowsElement = Driver.findElement(By.xpath("//a[text()='Windows']"));
        windowsElement.click();
        Driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsButtons=Driver.findElements(By.cssSelector(".analystic"));

        windowsButtons.get(0).click();
        WebElement clickTabElement=Driver.findElement(By.cssSelector("#Tabbed>a>button"));
        clickTabElement.click();

        List<String> tabList= new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(tabList.get(1)); // m-am mutat pe tab-ul 2
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(tabList.get(0)); // mergem pe primul tab

        windowsButtons.get(1).click();
        WebElement clickWindowElement=Driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        clickWindowElement.click();

        List<String> windowList=new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(windowList.get(1));
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(windowList.get(0));

        windowsButtons.get(2).click();
        WebElement multiWindElement=Driver.findElement(By.cssSelector("#Multiple>button"));
        multiWindElement.click();

        List<String> multipleTabList=new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(multipleTabList.get(2));
        System.out.println(Driver.getTitle());
        Driver.close();

        Driver.switchTo().window(multipleTabList.get(1));
        System.out.println(Driver.getTitle());
        Driver.close();

        Driver.switchTo().window(multipleTabList.get(0));
        System.out.println(Driver.getTitle());
        Driver.close();



    }
}
