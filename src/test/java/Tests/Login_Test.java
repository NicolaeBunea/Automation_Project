package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

    //web driver
    //web element

    public WebDriver Driver;

    @Test
    public void metodaLogin(){

        //Setam driverul de chrome
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        //Deschidem un browser de chrome
        Driver=new ChromeDriver();
        //Accesam un URL
        Driver.get("http://demo.automationtesting.in/Index.html");

        //Identificam butonul "Sign In".. din inspect si luam ID-ul

        //ID, Class, Link, Value, XPATH, CSS
        //XPATH si CSS
        //XPATH=> //input[@placeholder='E mail']

        WebElement signInElement= Driver.findElement(By.id("btn1"));
        signInElement.click();

        //Identificam butonul de email

        WebElement emailElement= Driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        String emailValue="abc@yahoo.com";
        emailElement.sendKeys(emailValue);

        //Identificam butonul password

        WebElement passElement= Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String passValue="Parola123";
        passElement.sendKeys(passValue);

        //Click pe enter

        WebElement enterElement= Driver.findElement(By.id("enterbtn"));
        enterElement.click();



    }


}
