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
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowPage;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends BaseTest {

    @Test
    public void windowTest(){
        IndexPage indexPage= new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.goToWindowPage();

        WindowPage windowPage=new WindowPage(getDriver());
        windowPage.dealWithTab(1);
        windowPage.dealWithWindow(1);
        windowPage.dealWithMultipleTab(2);
    }
}
