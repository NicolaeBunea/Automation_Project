package pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public IndexPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        //trebuie sa initializam elementele de pe pagina
        PageFactory.initElements(driver, this);
    }

    //elementele specifice acestei pagini
    @FindBy(id = "btn1")
    public WebElement signInElement;
    @FindBy(id = "btn2")
    public WebElement skipSignInElement;

    //metodele specifice acestei clase
    public void clickSignIn(){
        elementMethods.clickElement(signInElement);
    }

    public void clickSkipSignIn(){
        elementMethods.clickElement(skipSignInElement);
    }
}
