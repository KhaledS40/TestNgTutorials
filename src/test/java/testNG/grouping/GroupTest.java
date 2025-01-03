package testNG.grouping;

import guru99DemoTests.mainTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.SeleniumTab.DeleteCustomerFormLink;
import pageFactory.SeleniumTab.InsideOutSideBlockLevelTag;
import pageFactory.SeleniumTab.TooltipLink;

public class GroupTest extends BaseTest {

/*

    .   Groups in TestNG denotes the process of grouping different tests together into a straightforward group
    .   and running these tests together by just running the group in a single command.
    .   It does not even matter if they belong to different classes.
 */

    InsideOutSideBlockLevelTag inside;
    TooltipLink tool;
    DeleteCustomerFormLink customer;


    @Test(groups = {"InsideBlockLevel"})
    public void testInsideBlockLevel() {

        inside = new InsideOutSideBlockLevelTag(driver);
        inside.clickSeleniumTab();
        inside.hoverAndClickInsideOutsideBlockLink();
        inside.clickInsideBlockLevel();
        inside.clickOutsideBlockLevel();

    }

    @Test(groups = {"toolTip"})
    public void testTooltip() {

        tool = new TooltipLink(driver);
        tool.clickSeleniumTab();
        tool.hoverAndClickTooltipLink();
        tool.clickStandAloneText();

    }

    @Test(priority = 2)
    public void testCustomerForm() throws InterruptedException {

        customer = new DeleteCustomerFormLink(driver);
        customer.clickSeleniumTab();
        customer.hoverAndClickCustomerForm();
        customer.sendTextInCustomerField();
        customer.clickResetButton();
        customer.clickSubmitButton();

    }
}