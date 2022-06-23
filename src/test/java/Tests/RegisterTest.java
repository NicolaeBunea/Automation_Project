package Tests;

import Base.BaseTest;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest(){

        ElementMethods elementMethods=new ElementMethods(Driver);
        PageMethods pageMethods=new PageMethods(Driver);

        WebElement skipSignIn= Driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipSignIn);

        String expectedPage="Register";
        pageMethods.validateTitlePage(expectedPage);

        WebElement firsNameElement= Driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
        String nameValue="Bunea";
        elementMethods.fillElement(firsNameElement,nameValue);

        WebElement lastNameElement= Driver.findElement(By.xpath("//input[@ng-model='LastName']"));
        String lastValue="Nicolae";
        lastNameElement.sendKeys(lastValue);

        WebElement adressElement= Driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String addressValue="Baciu, Stradaa...";
        adressElement.sendKeys(addressValue);

        WebElement emailElement= Driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailValue="java@gmail.com";
        emailElement.sendKeys(emailValue);

        WebElement phoneElement= Driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phoneValue="0788 411 566";
        phoneElement.sendKeys(phoneValue);

        WebElement genderElement= Driver.findElement(By.cssSelector("input[value='Male']"));
        genderElement.click();

        WebElement hobbiesElement= Driver.findElement(By.id("checkbox1"));
        hobbiesElement.click();

        WebElement skillsElement= Driver.findElement(By.id("Skills"));
        Select skillsDropdown= new Select(skillsElement);
        skillsDropdown.selectByVisibleText("APIs");

        pageMethods.scrollDownPage(250);

        WebElement languageElement= Driver.findElement(By.id("msdd"));
        languageElement.click();

        List<WebElement> languageOptions= Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
        Integer index=0;
        while (index<languageOptions.size()){
            if (languageOptions.get(index).getText().equals("English")){
                languageOptions.get(index).click();
                break;
            }
            index++;
        }

        genderElement.click();

        WebElement countryElement =Driver.findElement(By.xpath("//span[@role='combobox']"));
        countryElement.click();

        WebElement m= Driver.findElement(By.xpath("//input[@role='textbox']"));
        m.sendKeys("Denmark");
        m.sendKeys(Keys.ENTER);


        WebElement yearElement = Driver.findElement(By.id("yearbox"));
        Select yaerDropown = new Select(yearElement);
        yaerDropown.selectByValue("1990");

        WebElement monthElement = Driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        elementMethods.selectTextElement(monthElement,"October");
        /*Select monthDropown = new Select(monthElement);
        monthDropown.selectByVisibleText("October");*/

        WebElement dayElement = Driver.findElement(By.id("daybox"));
        elementMethods.selectValueElement(dayElement,"19");
        /*Select dayDropown = new Select(dayElement);
        dayDropown.selectByValue("19");*/


        WebElement passwordElement=Driver.findElement(By.id("firstpassword"));
        String passwordValue="1234567890";
        passwordElement.sendKeys(passwordValue);


        WebElement confirmPasswordElement=Driver.findElement(By.id("secondpassword"));
        String confirmPasswordValue="1234567890";
        confirmPasswordElement.sendKeys(confirmPasswordValue);



        WebElement uploudElement=Driver.findElement(By.id("imagesrc"));
        uploudElement.sendKeys("C:\\Users\\nicol\\Desktop\\Capture.JPG");









    }
}
