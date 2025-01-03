package testNG.dependOnMethods;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.DeleteCustomerFormLink;
import pageFactory.SeleniumTab.InsideOutSideBlockLevelTag;
import pageFactory.SeleniumTab.TooltipLink;

public class DependOnMethods extends BaseTest {

    /*

    .   Dependencies or DependOn Method, used when a test depends on another test by using dependOn annotations
 */

    InsideOutSideBlockLevelTag inside;
    TooltipLink tool;
    DeleteCustomerFormLink customer;


    @Test()
    public void testInsideBlockLevel() {

        inside = new InsideOutSideBlockLevelTag(driver);
        inside.clickSeleniumTab();
        inside.hoverAndClickInsideOutsideBlockLink();
        inside.clickInsideBlockLevel();
        inside.clickOutsideBlockLevel();

    }

    @Test(dependsOnMethods = {"testInsideBlockLevel"})
    public void testTooltip() {

        tool = new TooltipLink(driver);
        tool.clickSeleniumTab();
        tool.hoverAndClickTooltipLink();
        tool.clickStandAloneText();

    }

    @Test()
    public void testCustomerForm() throws InterruptedException {

        customer = new DeleteCustomerFormLink(driver);
        customer.clickSeleniumTab();
        customer.hoverAndClickCustomerForm();
        customer.sendTextInCustomerField();
        customer.clickResetButton();
        customer.clickSubmitButton();

    }
}
