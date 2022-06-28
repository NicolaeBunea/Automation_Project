package pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver){
        super(driver);

    }

    //elementele specifice acestei pagini
    @FindBy(id = "btn1")
    private WebElement signInElement;
    @FindBy(id = "btn2")
    private WebElement skipSignInElement;

    //metodele specifice acestei clase
    public void clickSignIn(){
        elementMethods.clickElement(signInElement);
    }

    public void clickSkipSignIn(){
        elementMethods.clickElement(skipSignInElement);
    }
}
