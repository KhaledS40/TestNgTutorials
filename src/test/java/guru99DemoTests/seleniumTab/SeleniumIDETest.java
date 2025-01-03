package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.SeleniumIDETestLink;

public class SeleniumIDETest extends BaseTest {

    SeleniumIDETestLink selenium;

    @Test
    public void testSeleniumIDETest(){

        selenium = new SeleniumIDETestLink(driver);

        selenium.clickSeleniumTab();
        selenium.hoverAndClickSeleniumIDELink();
    }
}
