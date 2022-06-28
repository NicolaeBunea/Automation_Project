package Tests;

import Base.BaseTest;
import org.junit.Test;
import pages.AlertPage;
import pages.BasePage;
import pages.IndexPage;
import pages.RegisterPage;

public class AlertTest extends BaseTest {

    @Test
    public void registerTest() {
        IndexPage indexPage= new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.goToAlertPage();

        AlertPage alertPage=new AlertPage(getDriver());
        alertPage.dealAlertOk();
        String expectedMess="You Pressed Cancel";
        alertPage.dealAlertOkCancel(expectedMess);
        alertPage.dealAlertInput("Nicu");

    }
}
