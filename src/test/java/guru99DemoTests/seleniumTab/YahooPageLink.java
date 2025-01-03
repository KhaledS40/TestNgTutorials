package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.YahooLink;

public class YahooPageLink extends BaseTest {

    YahooLink yahoo;

    @Test
    public void testYahooLinkPage(){

        yahoo = new YahooLink(driver);

        yahoo.clickSeleniumTab();
        yahoo.hoverAndClickYahooLink();
        yahoo.clickGamesHeader();
        yahoo.clickFacebookHeader();
        yahoo.clickSocialHeader();
        yahoo.clickMobileHeader();
        yahoo.clickAlwaysOnHeader();
        yahoo.clickAllInOneHeader();
        yahoo.clickBurstingWithFunHeader();
        yahoo.clickDownloadHeader();
    }
}
