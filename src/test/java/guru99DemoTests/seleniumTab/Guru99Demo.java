package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.Guru99DemoPageLink;

public class Guru99Demo extends BaseTest {

    Guru99DemoPageLink guru99;

    @Test
    public void testGuru99Demo() throws InterruptedException {

        guru99 = new Guru99DemoPageLink(driver);

        guru99.clickSeleniumTab();
        guru99.hoverAndClickGuru99();
        //guru99.clickVideo();
        guru99.clickSAPMMLink();
        guru99.clickAccountingLink();
        guru99.clickLiveTestingLink();
        guru99.clickMobileTestingLink();
        guru99.clickEthicalLink();
        guru99.clickVBScriptLink();
        guru99.clickSeleniumLink();
        guru99.clickJAVALink();
        guru99.clickQTPlink();
        guru99.clickSAPBeginnerLink();
        guru99.clickLinuxLink();
        guru99.enterEmail();
        guru99.clickCourseSelection();
        guru99.clickSubmit();
    }
}
