package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage{


    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".analystic")
    private List<WebElement> windowsButtons;
    @FindBy(css = "#Tabbed>a>button")
    private WebElement clickTabElement;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement clickWindowElement;
    @FindBy(css = "#Multiple>button")
    private WebElement clickTabsElement;


    public void dealWithTab(Integer tab){
        elementMethods.clickElement(windowsButtons.get(0));
        elementMethods.clickElement(clickTabElement);
        tabMethods.switchSpecificTabWindow(tab);
        tabMethods.closeCurrentTabWindow();
        tabMethods.switchSpecificTabWindow(tab-1);
    }

    public void dealWithWindow(Integer window){
        elementMethods.clickElement(windowsButtons.get(1));
        elementMethods.clickElement(clickWindowElement);
        tabMethods.switchSpecificTabWindow(window);
        tabMethods.closeCurrentTabWindow();
        tabMethods.switchSpecificTabWindow(window-1);
    }

    public void dealWithMultipleTab(Integer tabs){

        elementMethods.clickElement(windowsButtons.get(2));
        elementMethods.clickElement(clickTabsElement);
        tabMethods.switchSpecificTabWindow(tabs);
        tabMethods.closeCurrentTabWindow();
        tabMethods.switchSpecificTabWindow(tabs-1);
        tabMethods.closeCurrentTabWindow();
        tabMethods.switchSpecificTabWindow(tabs-2);
    }
}
