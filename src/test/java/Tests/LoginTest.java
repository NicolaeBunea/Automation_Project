package Tests;

import Base.BaseTest;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.IndexPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    //web driver
    //web element


    @Test
    public void metodaLogin(){


        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();

        //Setam driverul de chrome
//        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
//        //Deschidem un browser de chrome
//        Driver=new ChromeDriver();
//        //Accesam un URL
//        Driver.get("http://demo.automationtesting.in/Index.html");

        //Maximize page

        /*Driver.manage().window().maximize();*/

        //Identificam butonul "Sign In".. din inspect si luam ID-ul

        //ID, Class, Link, Value, XPATH, CSS
        //XPATH si CSS
        //XPATH=> //input[@placeholder='E mail']

        //Validam pagina de login

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginInvalidProcess("SignIn","email@proba.com","Proba123#","Invalid User Name or PassWord");

    }


}
