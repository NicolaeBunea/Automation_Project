package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver Driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        Driver=new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return Driver;
    }

    /*@After
    public void cleaner(){
        Driver.quit();
    }*/
}
