package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabMethods {

    public WebDriver Driver;

    public TabMethods(WebDriver driver) {
        Driver = driver;
    }

    public void switchSpecificTabWindow(Integer index){

        List<String> windowList=new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(windowList.get(index));
        System.out.println(Driver.getTitle());
    }

    public void closeCurrentTabWindow(){
        Driver.close();
    }
}
