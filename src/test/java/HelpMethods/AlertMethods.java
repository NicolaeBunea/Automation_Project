package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {

    public WebDriver Driver;

    public AlertMethods(WebDriver driver) {
        Driver = driver;
    }

    public void acceptAlert(){
        Alert simpleAlert= Driver.switchTo().alert();
        simpleAlert.accept();
    }

    public void cancelAlert(){
        Alert cancelAlert=Driver.switchTo().alert();
        cancelAlert.dismiss();
    }

    public void fillAcceptAlert(String Value){
        Alert textAlert=Driver.switchTo().alert();
        textAlert.sendKeys(Value);
        textAlert.accept();
    }




}
