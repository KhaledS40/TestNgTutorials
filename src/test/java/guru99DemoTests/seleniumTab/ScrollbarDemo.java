package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.ScrollbarDemoLink;

public class ScrollbarDemo extends BaseTest {

    ScrollbarDemoLink scroll;

    @Test
    public void scrollbarDemoTest(){

        scroll =  new ScrollbarDemoLink(driver);

        scroll.clickSeleniumTab();
        scroll.hoverAndClickScrollBarDemo();
        scroll.clickSAPMMLink();
        scroll.clickAccountingLink();
        scroll.clickLiveTestingLink();
        scroll.clickMobileTestingLink();
        scroll.clickEthicalLink();
        scroll.clickVBScriptLink();
    }
}
