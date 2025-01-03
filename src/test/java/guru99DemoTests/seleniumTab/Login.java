package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.LoginLink;


public class Login extends BaseTest {

    LoginLink log;

    @Test
    public void testLoginLink(){

        log = new LoginLink(driver);

        log.clickSeleniumTab();
        log.hoverAndClickLoginLink();
    }
}
