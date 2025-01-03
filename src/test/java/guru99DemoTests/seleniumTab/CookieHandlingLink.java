package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.CookieHandingDemoLink;

public class CookieHandlingLink extends BaseTest {

    CookieHandingDemoLink cookie;

    @Test(testName = "CookiesHandling")
    public void cookieHandlingTest(){

        cookie = new CookieHandingDemoLink(driver);

        cookie.clickSeleniumTab();
        cookie.clickCookieHandlingDemo();
        cookie.enterUsername("Hello");
        cookie.enterPassword("Baby123");
        cookie.clickLoginButton();
    }
}
