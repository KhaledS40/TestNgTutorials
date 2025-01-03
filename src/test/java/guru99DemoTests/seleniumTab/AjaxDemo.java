package guru99DemoTests.seleniumTab;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.AjaxDemoLink;

public class AjaxDemo extends BaseTest {

    AjaxDemoLink ajax;

    @Test(testName = "AjaxLink")
    public void testAjaxDemoLink(){

        ajax = new AjaxDemoLink(driver);

        ajax.clickSeleniumTab();
        ajax.hoverAndClickAjaxDemo();
        ajax.clickYesBox();
        ajax.clickNoBox();
        ajax.clickCheckButton();
        ajax.clickResetButton();
    }
}
