package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.SeleniumAutoITLink;

public class SeleniumAuto extends BaseTest {

    SeleniumAutoITLink seleniumAuto;

    @Test
    public void seleniumAutoTest(){

        seleniumAuto = new SeleniumAutoITLink(driver);

        seleniumAuto.clickSeleniumTab();
        seleniumAuto.hoverAndClickSeleniumAutoLink();
        seleniumAuto.enterUserName();
        seleniumAuto.enterEmail();
        seleniumAuto.uploadFile();
        seleniumAuto.enterText();
        seleniumAuto.clickSubmit();
    }
}
